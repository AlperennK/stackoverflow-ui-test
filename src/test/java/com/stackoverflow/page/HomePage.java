package com.stackoverflow.page;

import com.stackoverflow.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    @FindBy(css = "[href='https://stackoverflow.com/users/login?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f']")
    private WebElement login;

    //@FindBy(className = "login-link s-btn s-btn__primary py8 btn-topbar-primary")
    //private WebElement signup;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void getLoginPage(){
        login.click();
    }
    public void getSignUpPage(){
        //signup.click();
    }
}
