package com.progress.exam.POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM extends LoadableComponent {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "user-name")
    private WebElement usernameField;

    @FindBy(how=How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement loginButton;

    public LoginPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void fillLoginForm(String username, String password){
       usernameField.sendKeys(username);
       passwordField.sendKeys(password);
       loginButton.click();
    }

    @Override
    public void load() {
        driver.get("https://www.saucedemo.com/");
    }

    @Override
    public void isLoaded() throws Error {
        Wait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

    }
}
