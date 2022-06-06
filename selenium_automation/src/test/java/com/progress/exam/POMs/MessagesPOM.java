package com.progress.exam.POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MessagesPOM {
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "error-message-container")
    private WebElement errorMessage;

    public MessagesPOM(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public String getMessage(){
        return errorMessage.getText();
    }
}
