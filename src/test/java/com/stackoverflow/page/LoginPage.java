package com.stackoverflow.page;

import com.stackoverflow.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    @FindBy(id = "email")
    private WebElement emailbox;

    @FindBy(id = "password")
    private WebElement passbox;

    @FindBy(id = "submit-button")
    private WebElement loginbut;
//
    @FindBy(css= "[class='grid--cell s-input-message js-error-message']")
    private WebElement wrongpass;
//
//    @FindBy(id ="notify-container")
//    private WebElement wrongpass;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void login(){
        emailbox.sendKeys("alperenkoksel@yandex.com");
        passbox.sendKeys("Ayben2008!");
        loginbut.click();
    }
    public String missingPass(){
        emailbox.sendKeys("testautomationframework@yandex.com");
        loginbut.click();
        String missingPassResponse= wrongpass.getText();
        return missingPassResponse;

    }
    public String missingEmail(){
        passbox.sendKeys("Tester123ewq");
        loginbut.click();
        return wrongpass.getText();
    }

}
