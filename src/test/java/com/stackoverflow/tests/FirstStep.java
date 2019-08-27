package com.stackoverflow.tests;
import com.stackoverflow.page.HomePage;
import com.stackoverflow.driver.MyDriver;
import com.stackoverflow.page.LoginPage;
import com.stackoverflow.page.TopQuestions;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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


    @Test
    public void pageTitle(){
        homePage.getLoginPage();
        loginPage.login();
        Assert.assertEquals("Top Questions", topquestions.getPageTitle());

    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();

    }
}
