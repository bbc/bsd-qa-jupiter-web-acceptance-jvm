package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.bbc.jupiter.framework.BasePage;

public class BrowsePage extends BasePage {

    private static final String JUPWEB_TEST_URL = "https://test.jupiter.bbc.co.uk";
    private static final By searchInputField = By.id("#search-input");
    private static final By searchButtonField = By.cssSelector("button.submit-search");


    public BrowsePage(WebDriver driver) {
        super(driver);
    }

    public void waitForElement(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void navigateToBrowsePage() {
        getDriver().navigate().to(JUPWEB_TEST_URL);
    }

    public void searchItem(String searchString){
        this.waitForElement(searchInputField);
        WebElement searchInputBox = getDriver().findElement(searchInputField);
        WebElement searchInputButton = getDriver().findElement(searchButtonField);
        searchInputBox.sendKeys(searchString);
        searchInputButton.click();
    }
}
