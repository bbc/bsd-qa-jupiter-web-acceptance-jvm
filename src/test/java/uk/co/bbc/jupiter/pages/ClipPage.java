package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClipPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(id = "Description")
    private WebElement descriptionTab;

    @FindBy(id = "Rights")
    private WebElement rightsTab;

    @FindBy(css = ".components-preview-navigation__selected--3czuT")
    private WebElement keyframesTab;

    public ClipPage(WebDriver driver, WebDriverWait wait, WebElement descriptionTab, WebElement rightsTab, WebElement keyframesTab) {
        this.driver = driver;
        this.wait = wait;
        this.descriptionTab = descriptionTab;
        this.rightsTab = rightsTab;
        this.keyframesTab = keyframesTab;
    }

    public WebElement getDescriptionTab() {
        return descriptionTab;
    }

    public void setDescriptionTab(WebElement descriptionTab) {
        this.descriptionTab = descriptionTab;
    }

    public WebElement getRightsTab() {
        return rightsTab;
    }

    public void setRightsTab(WebElement rightsTab) {
        this.rightsTab = rightsTab;
    }

    public WebElement getKeyframesTab() {
        return keyframesTab;
    }

    public void setKeyframesTab(WebElement keyframesTab) {
        this.keyframesTab = keyframesTab;
    }
}
