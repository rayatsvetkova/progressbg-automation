package com.progress.exam.POMs;

import com.progress.exam.helpers.Context;
import com.progress.exam.helpers.DataFormats;
import com.progress.exam.helpers.ItemDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPOM {
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "btn_inventory")
    private WebElement addButton;

    @FindBy(how = How.ID, using = "back-to-products")
    private WebElement backToProductsButton;

    @FindBy(how = How.CLASS_NAME, using = "inventory_details_price")
    private WebElement priceDetails;

    @FindBy(how = How.CLASS_NAME, using = "inventory_details_name")
    private WebElement inventoryDetailsName;

    public ProductDetailsPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public double getPriceAndAddItem(Context context) {
        double price = 0d;
        price = DataFormats.reformatPrice(priceDetails);
        context.totalPrice +=price;
        addButton.click();
        context.items.add(new ItemDetails(inventoryDetailsName.getText(),price));
        return price;
    }


    public void navigateBack() {
        backToProductsButton.click();
    }
}
