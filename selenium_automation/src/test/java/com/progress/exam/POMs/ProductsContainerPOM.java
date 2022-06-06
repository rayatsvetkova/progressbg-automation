package com.progress.exam.POMs;

import com.progress.exam.helpers.Context;
import com.progress.exam.helpers.ItemDetails;
import net.progress.helpers.DataFormats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsContainerPOM {
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "inventory_item")
    private List<WebElement> inventoryItems;

    public ProductsContainerPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sortItemsByName(Context context) {
        List<String> expectedItemNames = new ArrayList<>();
        for (WebElement inventoryItem : inventoryItems) {
            WebElement inventoryItemName = inventoryItem.findElement(By.className("inventory_item_name"));
            expectedItemNames.add(inventoryItemName.getText());
            //not sure if the sort is working as expected
            Collections.sort(expectedItemNames);
        }
        context.expectedSortedItemsByName.addAll(expectedItemNames);
    }

    public List<String> collectSortedItems() {
        List<String> actualItemNames = new ArrayList<>();
        for (WebElement inventoryItem : inventoryItems) {
            WebElement inventoryItemName = inventoryItem.findElement(By.className("inventory_item_name"));
            actualItemNames.add(inventoryItemName.getText());
        }
        return actualItemNames;
    }

    public void openProductDetails(String name) {
        for (WebElement inventoryItem : inventoryItems) {
            WebElement inventoryItemName = inventoryItem.findElement(By.className("inventory_item_name"));
            if (inventoryItemName.getText().toLowerCase().equalsIgnoreCase(name)) {
                inventoryItemName.click();
                break;
            }
        }
    }

    public ItemDetails addItemByNameAndGetPrice(String name) {
        ItemDetails itemDetails = new ItemDetails("", 0);
        double price = 0d;
        for (WebElement inventoryItem : inventoryItems) {
            WebElement inventoryItemName = inventoryItem.findElement(By.className("inventory_item_name"));
            if (inventoryItemName.getText().toLowerCase().equalsIgnoreCase(name)) {
                inventoryItem.findElement(By.className("btn")).click();
                if (inventoryItem.findElement(By.className("inventory_item_price")).isDisplayed()) {
                    price = DataFormats.reformatPrice(inventoryItem.findElement(By.className("inventory_item_price")));
                    itemDetails.title = inventoryItemName.getText();
                    itemDetails.price = price;
                    break;
                }
            }
        }
        return itemDetails;
    }
}
