package uk.co.bbc.jupiter.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import uk.co.bbc.jupiter.pages.BrowsePage;
import uk.co.bbc.jupiter.pages.LoginPage;

public class BrowseStepdefs {
    private final Hooks hooks;
    private LoginPage loginPage;
    private BrowsePage browsePage;
    private final WebDriver driver;


    public BrowseStepdefs(Hooks hooks) {
        this.hooks = hooks;
        this.driver = hooks.getDriver();
    }

    @Given("I navigate to Jupiter Web Homepage")
    public void iNavigateToJupiterWebHomepage() throws Throwable {
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enterEmailField();
        loginPage.enterPasswordField();
        loginPage.submitLogin();
    }

    @Then("The {int} most recent clips from all sites are displayed in grid view by default")
    public void theMostRecentClipsFromAllSitesAreDisplayedInGridViewByDefault(int arg0) throws Throwable {
        browsePage = new BrowsePage(driver);
        browsePage.countNumberItems();
        Thread.sleep(5000);
    }

    @And("Clip count should be displayed")
    public void clipCountShouldBeDisplayed() throws Throwable {
    }
}
