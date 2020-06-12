package uk.co.bbc.jupiter.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class ItemGrid implements WebElement {
    private static final By clipnameField = By.cssSelector("h3[class*='_clipname-']");


    @Override
    public void click() {

    }
}
