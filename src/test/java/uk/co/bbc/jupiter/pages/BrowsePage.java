package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.bbc.jupiter.framework.BasePage;
import uk.co.bbc.jupiter.modules.ItemGrid;

import java.util.List;

public class BrowsePage extends BasePage {

    private static final String JUPWEB_TEST_URL = "https://test.jupiter.bbc.co.uk";

    @FindBy(id = "search-input")
    private WebElement searchInput;

    @FindBy(css = "button#submit-search")
    private  WebElement searchButton;

//    @FindBy(css = "li[class^='components-list-']")
    @FindBy(css = "li.components-list-thumb__item--2HWhN")
    private List<ItemGrid> itemGrids;

    public BrowsePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        isElementPresent(searchInput);
    }

    public void searchItem(String searchString){
        waitForElement(searchInput);
        searchInput.sendKeys(searchString);
    }

    public void countNumberItems() {
//        itemGrids = ItemGrid.
//        for(ItemGrid itemGrid : itemGrids){
//            System.out.println("found one!");
//        }
    }
}
