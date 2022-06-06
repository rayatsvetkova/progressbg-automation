package com.progress.exam.helpers;

import com.progress.exam.POMs.LoginPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginUserHelper {
    public WebDriver driver;
    public LoginPOM loginPOM;
    public Context context;

    public LoginUserHelper(WebDriver driver){
        this.driver=driver;
        this.loginPOM= new LoginPOM(driver);
        PageFactory.initElements(driver,this);
    }

    public void loginUser(Context context) {
        loginPOM.load();
        loginPOM.isLoaded();
        loginPOM.fillLoginForm(context.username, context.password);
    }
}

