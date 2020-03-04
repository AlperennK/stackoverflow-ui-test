package com.stackoverflow.page;

import com.stackoverflow.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopQuestions extends PageBase {

    @FindBy(xpath= "[//*[@id=\"mainbar\"]/div[1]/h1]")
    private WebElement topQuestions;

    public TopQuestions(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle(){
        return topQuestions.getText();
    }

}
