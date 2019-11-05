package com.stackoverflow.tests;

import com.stackoverflow.driver.MyDriver;
import com.stackoverflow.page.HomePage;
import com.stackoverflow.page.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ThirdStep {
    WebDriver driver = MyDriver.getDriver();
    HomePage homePage;
    LoginPage loginPage;

    @Before
    public void setUp(){
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);

    }
    @Test
    public void emailMissing(){
        homePage.getLoginPage();
        String result= loginPage.missingEmail();
        Assert.assertEquals("Email cannot be empty.", result);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
