package com.progress.exam.POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrimaryHeaderPOM {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    private WebElement burgerMenuButton;

    @FindBy(how = How.CLASS_NAME,using = "shopping_cart_link")
    private WebElement shoppingCartButton;

    public PrimaryHeaderPOM(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void openBurgerMenu(){
        burgerMenuButton.click();
    }

    public void navigateToCart(){
        shoppingCartButton.click();
    }

}
