package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.bbc.jupiter.framework.BasePage;
import uk.co.bbc.jupiter.stepdefs.Hooks;

public class LoginPage extends BasePage {
    private final Hooks hooks;
    private static final By emailFieldSelector = By.id("email");
    private static final By passwordFieldSelector = By.id("password");
    private static final By loginButtonSelector = By.cssSelector("button.authButton");

    private static final String JUPWEB_TEST_URL = "https://test.jupiter.bbc.co.uk";

    public LoginPage(WebDriver driver, Hooks hooks) {
        super(driver);
        this.hooks = hooks;
    }

    public void waitForElement(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void navigateToLoginPage() {
        getDriver().navigate().to(JUPWEB_TEST_URL);
    }

    public void enterEmailField(){
        this.waitForElement(emailFieldSelector);
        WebElement emailField = getDriver().findElement(emailFieldSelector);
        emailField.sendKeys("ZZJupt30");
    }

    public void enterPasswordField(){
        this.waitForElement(passwordFieldSelector);
        WebElement passwordField = getDriver().findElement(passwordFieldSelector);
        passwordField.sendKeys("password098");
    }

    public void submitLogin(){
        WebElement loginButton = getDriver().findElement(loginButtonSelector);
        loginButton.click();
    }

}
