package com.stackoverflow.tests;
import com.stackoverflow.page.HomePage;
import com.stackoverflow.driver.MyDriver;
import com.stackoverflow.page.LoginPage;
import com.stackoverflow.page.TopQuestions;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.event.TextListener;

import static org.junit.Assert.*;

public class FirstStep {
    WebDriver driver = MyDriver.getDriver();
    HomePage homePage;
    LoginPage loginPage;
    TopQuestions topquestions;

    @Before
    public void setUp(){
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        topquestions=new TopQuestions(driver);
    }



    @After
    public void tearDown(){
        driver.close();
        driver.quit();

    }

}
