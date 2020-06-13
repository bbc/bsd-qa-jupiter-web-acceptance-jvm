package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import uk.co.bbc.jupiter.framework.BasePage;

import java.util.List;

public class BrowsePage extends BasePage {

    private static final String JUPWEB_TEST_URL = "https://test.jupiter.bbc.co.uk";

    @FindBy(id = "search-input")
    private WebElement searchInput;

    @FindBy(css = "button#submit-search")
    private  WebElement searchButton;

    @FindBy(css = "header.components-header-style__item--3hTry")
    private WebElement header;

    @FindBy(css = "header.components-header-style__item--3hTry+div section div form+div")
    private WebElement numberOfResultsDisplayed;

    @FindBys
    (@FindBy(css = "li[class^='components-list-']"))
    private List<WebElement> itemGrids;

    public BrowsePage(WebDriver driver) {
        super(driver);
        this.itemGrids = itemGrids;
        PageFactory.initElements(driver, this);
        isElementPresent(searchInput);
    }

    public void searchItem(String searchString){
        waitForElement(searchInput);
        searchInput.sendKeys(searchString);
    }

    public int countNumberItems() {
        waitForElements(itemGrids);
        return itemGrids.size();
    }
}
