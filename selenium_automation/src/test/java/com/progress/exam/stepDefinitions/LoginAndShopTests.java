package com.progress.exam.stepDefinitions;

import com.progress.exam.POMs.*;
import com.progress.exam.helpers.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LoginAndShopTests {
    private WebDriver driver;
    private Context context;
    private LoginPOM loginPOM;
    private PrimaryHeaderPOM primaryHeaderPOM;
    private MessagesPOM messagesPOM;
    private ProductDetailsPOM productDetailsPOM;
    private ProductsContainerPOM productsContainerPOM;
    private CartPOM cartPOM;

    public LoginAndShopTests() {
        this.driver = DriverHelper.getDriver();
        this.context = new Context();
        this.loginPOM = new LoginPOM(driver);
        this.primaryHeaderPOM = new PrimaryHeaderPOM(driver);
        this.messagesPOM = new MessagesPOM(driver);
        this.productDetailsPOM = new ProductDetailsPOM(driver);
        this.productsContainerPOM = new ProductsContainerPOM(driver);
        this.cartPOM = new CartPOM(driver);
    }

    @Given("there are a valid username {string} and password {string}")
    public void getUsernameAndPassword(String username, String password) {
        loginPOM.load();
        loginPOM.isLoaded();
        context.username = username;
        context.password = password;
    }

    @Given("the user is logged in with username {string} and password {string}")
    public void userIsLoggedIn(String username, String password) {
        context.username = username;
        context.password = password;
        LoginUserHelper loginUserHelper = new LoginUserHelper(driver);
        loginUserHelper.loginUser(context);

    }

    @When("the user fills the login form with appropriate data")
    public void fillLoginForm() {
        loginPOM.fillLoginForm(context.username, context.password);
    }

    @Then("the user is successfully logged in")
    public void successfulLogin() {
        Assert.assertTrue("The user is not logged in, because it's not able to see the products",
                ElementHelper.doesElementExist(driver, SelectorTypes.ID, "react-burger-menu-btn"));
    }

    @Given("there are invalid username {string} or password {string}")
    public void getInvalidLoginData(String username, String password) {
        loginPOM.load();
        loginPOM.isLoaded();
        context.username = username;
        context.password = password;
    }

    @When("the user tries to login")
    public void userLogin() {
        loginPOM.fillLoginForm(context.username, context.password);
    }

    @Then("the user gets an expected error message {string}")
    public void getAnErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = messagesPOM.getMessage();
        Assert.assertEquals("The error messages are different!", expectedErrorMessage, actualErrorMessage);
    }

    @When("the user adds item by navigating to the item page and get the price")
    public void navigateToItemAndGetPrice(DataTable dataTable) {
        Map<String, String> itemMap = dataTable.asMaps().get(0);
        for (String key : itemMap.keySet()) {
            String itemName = itemMap.get(key);
            productsContainerPOM.openProductDetails(itemName);
            productDetailsPOM.getPriceAndAddItem(context);
            productDetailsPOM.navigateBack();
        }

    }

    @Then("the items are added to the cart and the price is updated correctly")
    public void itemsAndPriceAreUpdatedCorrectly() {
        primaryHeaderPOM.navigateToCart();
        cartPOM.checkoutCart();
        cartPOM.fillInputForm();
        List<WebElement> cartItems = cartPOM.listOfCartItems();
        Assert.assertEquals("The number of products added to the cart is not correct",
                context.items.size(), cartItems.size());
        List<String> actualCartItems = new ArrayList<>();
        //getting the names of the items from the cart
        for (WebElement cartItem : cartItems) {
            actualCartItems.add(cartItem.findElement(By.className("inventory_item_name")).getText());
        }
        // checking if the expected items' names are contained in the cart items
        for (ItemDetails expectedItemNames : context.items) {
            Assert.assertTrue("The names are not equal", actualCartItems.contains(expectedItemNames.title));
        }
        Assert.assertEquals("The expected price is not correct", context.totalPrice, cartPOM.getSubtotalPrice(), 0.1);
    }

    @When("the user adds the following item to the cart from the container")
    public void addItemsFromContainer(DataTable dataTable) {
        Map<String, String> items = dataTable.asMaps().get(0);
        for (String key : items.keySet()) {
            String itemName = items.get(key);
            if (!itemName.trim().equals("")) {
                ItemDetails itemDetails = productsContainerPOM.addItemByNameAndGetPrice(itemName);
                context.items.add(itemDetails);
                context.totalPrice += itemDetails.price;
            }
        }
    }

    @When("the user click on the sorting container and selects option value {string}, the items are sorted")
    public void openSortingContainer(String value) {
        productsContainerPOM.sortItemsByName(context);
        Select select = new Select(driver.findElement(By.className("product_sort_container")));
        select.selectByVisibleText(value);
        context.actualSortedItemsByName.addAll(productsContainerPOM.collectSortedItems());
    }

    @Then("the products are sorted correctly")
    public void verifySortingOfProducts(DataTable dataTable) {
        Map<String, String> sorting = dataTable.asMaps().get(0);
        for (String key : sorting.keySet()) {
            String sortingValue = sorting.get(key);
            if (sortingValue.trim().equals("Name (Z to A)")) {
                for (int i = 0; i <context.actualSortedItemsByName.size() ; i++) {
                    Assert.assertEquals("The items are not sorted correctly",
                            context.expectedSortedItemsByName.get(i),context.actualSortedItemsByName.get(i));
                }


            }
        }
    }
}

