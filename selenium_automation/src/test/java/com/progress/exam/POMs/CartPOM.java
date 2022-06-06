package com.progress.exam.POMs;

import com.progress.exam.helpers.DataFormats;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPOM {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "checkout")
    private WebElement checkoutButton;

    @FindBy(how = How.ID, using = "first-name")
    private WebElement firstNameField;

    @FindBy(how = How.ID, using = "last-name")
    private WebElement lastNameField;

    @FindBy(how = How.ID, using = "postal-code")
    private WebElement postalCodeField;

    @FindBy(how = How.ID, using = "continue")
    private WebElement continueButton;

    @FindBy(how = How.CLASS_NAME, using = "summary_subtotal_label")
    private WebElement subtotalPrice;

    @FindBy(how = How.ID, using = "finish")
    private WebElement finishButton;

    @FindBy(how = How.CLASS_NAME, using = "cart_item")
    private List<WebElement> cartItems;

    public CartPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkoutCart() {
        checkoutButton.click();
    }

    public void fillInputForm() {
        firstNameField.sendKeys("Raya");
        lastNameField.sendKeys("Tsvetkova");
        postalCodeField.sendKeys("1234");
        continueButton.click();
    }

    public double getSubtotalPrice() {
        double totalPrice = 0d;
        String array[] = subtotalPrice.getText().split(":");
        totalPrice = Double.parseDouble(array[1].trim().substring(1).trim());
        return totalPrice;
    }

    public List<WebElement> listOfCartItems() {
        return cartItems;
    }

}
