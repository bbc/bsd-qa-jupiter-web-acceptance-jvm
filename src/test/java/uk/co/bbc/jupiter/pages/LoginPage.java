package uk.co.bbc.jupiter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.bbc.jupiter.framework.BasePage;

public class LoginPage extends BasePage {

    private static final String JUPWEB_TEST_URL = "https://test.jupiter.bbc.co.uk";

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button.authButton")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void waitForElement2(By element){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void navigateToLoginPage() {
        getDriver().navigate().to(JUPWEB_TEST_URL);
    }

    public void enterEmailField(){
        this.waitForElement(emailField);
        emailField.sendKeys("ZZJupt30");
    }

    public void enterPasswordField(){
        this.waitForElement(passwordField);
        passwordField.sendKeys("password098");
    }

    public void submitLogin(){
        this.waitForElement(loginButton);
        loginButton.click();
    }

}
