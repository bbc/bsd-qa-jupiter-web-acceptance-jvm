package uk.co.bbc.jupiter.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import uk.co.bbc.jupiter.pages.BrowsePage;
import uk.co.bbc.jupiter.pages.LoginPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BrowseStepdefs {
    private final WebDriver driver;
    private World world;


    public BrowseStepdefs(World world) {
        this.world = world;
        this.driver = world.getDriver();
        world.loginPage = new LoginPage(driver);
        world.browsePage = new BrowsePage(driver);
    }

    @Given("I navigate to Jupiter Web Homepage")
    public void iNavigateToJupiterWebHomepage() throws Throwable {
        world.loginPage.navigateToLoginPage();
        world.loginPage.enterEmailField();
        world.loginPage.enterPasswordField();
        world.loginPage.submitLogin();
    }

    @Then("The {int} most recent clips from all sites are displayed in grid view by default")
    public void theMostRecentClipsFromAllSitesAreDisplayedInGridViewByDefault(int arg0) throws Throwable {
        assertEquals(arg0,world.browsePage.countNumberItems());
    }

    @And("Clip count should be displayed")
    public void clipCountShouldBeDisplayed() throws Throwable {
        assertTrue(world.browsePage.getResultsStats().contains("50 of "));
    }
}
