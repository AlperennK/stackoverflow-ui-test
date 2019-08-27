package com.stackoverflow.driver;
import com.stackoverflow.configuration.AppSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDriver {
    public static WebDriver driver;

    //What is this
    private MyDriver(){
    }
    public static WebDriver getDriver(){
        System.setProperty("webdriver.gecko.driver", "src/test/resource/geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("permissions.default.desktop-notification", 1);
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        driver = new FirefoxDriver(capabilities);
        driver.get(AppSettings.Instance.BaseUrl);
        return driver;
    }
}
