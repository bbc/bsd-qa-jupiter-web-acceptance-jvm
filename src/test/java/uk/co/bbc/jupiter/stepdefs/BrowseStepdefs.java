package uk.co.bbc.jupiter.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import uk.co.bbc.jupiter.pages.BrowsePage;

public class BrowseStepdefs {
    private final Hooks hooks;
    private BrowsePage browsePage;

    public BrowseStepdefs(Hooks hooks) {
        this.hooks = hooks;
    }

    @Given("I navigate to Jupiter Web Homepage")
    public void iNavigateToJupiterWebHomepage() throws Throwable {
        WebDriver driver = hooks.getDriver();
        browsePage = new BrowsePage(driver);
        browsePage.navigateToBrowsePage();
        Thread.sleep(5000);
    }

    @Then("The {int} most recent clips from all sites are displayed in grid view by default")
    public void theMostRecentClipsFromAllSitesAreDisplayedInGridViewByDefault(int arg0) throws Throwable {
        System.out.println("2 " + arg0);
    }

    @And("Clip count should be displayed")
    public void clipCountShouldBeDisplayed() throws Throwable {
        System.out.println("4");
    }
}
