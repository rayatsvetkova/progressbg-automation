package com.progress.exam.POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SecondaryHeaderPOM {
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "select_container")// dali trqbva da se polzva class Select
    private Select sortContainer;

    public SecondaryHeaderPOM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

//    public void selectFilter(){
//        sortContainer.;

}
