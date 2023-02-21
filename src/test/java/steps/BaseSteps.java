package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontendTestingHomePage;
import utils.Driver;
import utils.DropdownHandler;

public class BaseSteps {
    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        techGlobalBasePage = new TechGlobalBasePage();
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
    }

    @Given("user is on {string}")
    public void userIsOn(String url) {
        driver.get(url);
    }

    @When("user moves to Practices header dropdown")
    public void userMovesToHeaderDropdown() {
        techGlobalBasePage.headerDropdown.click();
    }

    @And("user clicks on {string} header dropdown option")
    public void userClicksOnHeaderDropdownOption(String option) {
        DropdownHandler.clickOnDropdownOption(techGlobalBasePage.headerDropdown,techGlobalBasePage.headerDropdownOptions, option);
    }

    @Then("user should be navigated to {string}")
    public void userShouldBeNavigatedTo(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @And("user clicks on {string} card")
    public void userClicksOnCard(String card) {
        techGlobalFrontendTestingHomePage.clickOnCard(card);
    }
}