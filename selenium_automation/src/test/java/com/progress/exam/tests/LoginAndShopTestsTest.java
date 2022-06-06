package com.progress.exam.tests;

import com.progress.exam.POMs.LoginPOM;

import com.progress.exam.helpers.DriverHelper;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginAndShopTestsTest {

    @Test
    public void loginTest(){
        WebDriver driver = DriverHelper.getDriver();
        LoginPOM loginPOM = new LoginPOM(driver);
        loginPOM.load();
    }
}
