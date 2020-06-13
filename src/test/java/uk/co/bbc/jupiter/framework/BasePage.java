package uk.co.bbc.jupiter.framework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private static Boolean elementPresentFlag = false;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElements(List<WebElement> elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void forceWait(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementPresent(WebElement we)
    {
        try {
            we.getTagName();
        } catch (NoSuchElementException e) {
            elementPresentFlag = true;
        }
        return elementPresentFlag.booleanValue();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
