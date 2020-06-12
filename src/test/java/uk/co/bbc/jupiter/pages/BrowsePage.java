package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.bbc.jupiter.framework.BasePage;

public class BrowsePage extends BasePage {

    private static final String JUPWEB_TEST_URL = "https://test.jupiter.bbc.co.uk";

    @FindBy(id = "search-input")
    private WebElement searchInput;

    @FindBy(css = "button#submit-search")
    private  WebElement searchButton;

    public BrowsePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchItem(String searchString){
        this.waitForElement(searchInput);
        searchInput.sendKeys(searchString);
    }
}
