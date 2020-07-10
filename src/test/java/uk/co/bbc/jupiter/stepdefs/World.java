package uk.co.bbc.jupiter.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.bbc.jupiter.pages.BrowsePage;
import uk.co.bbc.jupiter.pages.LoginPage;

public class World {

     private static boolean initialized = false;
     private WebDriver driver;
     private WebDriverWait wait;
     private static final Integer timeoutInSeconds = 10;

     public LoginPage loginPage;
     public BrowsePage browsePage;

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
          initialized = false;
          driver.close();
          driver.quit();
     }



}
