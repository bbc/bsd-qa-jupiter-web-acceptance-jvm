package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.co.bbc.jupiter.framework.BasePage;

public class BrowsePage extends BasePage {

    private static final String BROWSEURL = "https://test.jupiter.bbc.co.uk";
    private static final By board = By.id("#search-input");


    public BrowsePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToBrowsePage() {
        getDriver().navigate().to(BROWSEURL);
    }
}
