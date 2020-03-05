package com.stackoverflow.steps;
import com.stackoverflow.driver.MyDriver;
import com.stackoverflow.page.HomePage;
import com.stackoverflow.page.LoginPage;
import com.stackoverflow.page.TopQuestions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStep {
    WebDriver driver = MyDriver.getDriver();
    HomePage homePage;
    LoginPage loginPage;
    TopQuestions topquestions;

    @Given("^User is in login page$")
    public void user_is_in_login_page(){
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        topquestions=new TopQuestions(driver);
    }

    @When("^User enters correct username and password$")
    public void user_enters_correct_username_and_password(){
        homePage.getLoginPage();
        loginPage.login();

    }

    @Then("^User will have Top Questions page displayed$")
    public void we_will_have_account_page(){
        Assert.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", driver.getTitle());
    }
    @Given("^User is on home pagee$")
    public void user_is_on_homepage(){
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        topquestions=new TopQuestions(driver);
    }

    @When("^User enters wrong username and password$")
    public void user_enters_wrong_username_and_password(){
        homePage.getLoginPage();

    }
    @Then("^Wrong username password combination error should displayed$")
    public void user_receieve_login_error_message(){
        String response= loginPage.missingPass();
        Assert.assertEquals("Password cannot be empty.", response);
    }


}
