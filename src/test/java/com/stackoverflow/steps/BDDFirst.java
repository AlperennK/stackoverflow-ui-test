package com.stackoverflow.steps;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.stackoverflow.driver.MyDriver;
import com.stackoverflow.page.HomePage;
import com.stackoverflow.page.LoginPage;
import com.stackoverflow.page.TopQuestions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BDDFirst {
    WebDriver driver = MyDriver.getDriver();
    HomePage homePage;
    LoginPage loginPage;
    TopQuestions topquestions;

    @Given("^User is in login page$")
    public void user_is_in_login_page(){
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        topquestions=new TopQuestions(driver);
        System.out.println("User is in login page ");
    }

    @When("^When user enters correct username and password$")
    public void user_enters_correct_username_and_password(){
        homePage.getLoginPage();
        loginPage.login();

    }
    @Then("^User will have Top Questions page displayed$")
    public void we_will_have_account_page(){
        Assert.assertEquals("Top Questions", topquestions.getPageTitle());
        System.out.println("We will have account page");
    }

}
