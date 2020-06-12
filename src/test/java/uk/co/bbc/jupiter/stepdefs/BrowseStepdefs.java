package uk.co.bbc.jupiter.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import uk.co.bbc.jupiter.pages.LoginPage;

public class BrowseStepdefs {
    private final Hooks hooks;
    private LoginPage loginPage;


    public BrowseStepdefs(Hooks hooks) {
        this.hooks = hooks;
    }

    @Given("I navigate to Jupiter Web Homepage")
    public void iNavigateToJupiterWebHomepage() throws Throwable {
        WebDriver driver = hooks.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enterEmailField();
        loginPage.enterPasswordField();
        loginPage.submitLogin();
        Thread.sleep(5000);
    }

    @Then("The {int} most recent clips from all sites are displayed in grid view by default")
    public void theMostRecentClipsFromAllSitesAreDisplayedInGridViewByDefault(int arg0) throws Throwable {

    }

    @And("Clip count should be displayed")
    public void clipCountShouldBeDisplayed() throws Throwable {
    }
}
