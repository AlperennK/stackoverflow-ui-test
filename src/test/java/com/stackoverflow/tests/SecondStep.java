package com.stackoverflow.tests;

import com.stackoverflow.driver.MyDriver;
import com.stackoverflow.page.HomePage;
import com.stackoverflow.page.LoginPage;
import com.stackoverflow.page.TopQuestions;
import org.apache.commons.logging.Log;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SecondStep {
    WebDriver driver = MyDriver.getDriver();
    HomePage homePage;
    LoginPage loginPage;

    @Before
    public void setUp(){
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);

    }
    @Test
    public void passwordMissing(){
        homePage.getLoginPage();
        String response= loginPage.missingPass();
        Assert.assertEquals("Password cannot be empty.", response);
    }

    @After
    public void tearDown(){
        driver.close();

    }

}
