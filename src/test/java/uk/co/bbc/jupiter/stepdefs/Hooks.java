package uk.co.bbc.jupiter.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    private static boolean initialized = false;
    private WebDriver driver;
    private WebDriverWait wait;
    private static final Integer timeoutInSeconds = 10;

    @Before
    public void setUp() throws Exception{
        if(!initialized){
            driver = new ChromeDriver();
            initialized = true;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUpWait() throws Exception {
        wait = new WebDriverWait(driver, timeoutInSeconds);
    }


    @After
    public void disposeWebDriver() throws Throwable {
        driver.close();
        driver.quit();
    }

}
