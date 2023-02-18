package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalFrontendTestingHomePage;
import utils.Driver;

public class TechGlobalSteps {
    WebDriver driver;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;


    @Before
    public void setup(){
        driver = Driver.getDriver();
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
    }

    @When("user moves to “Practices” header dropdown")
    public void userMovesToPracticesHeaderDropdown() {
        techGlobalFrontendTestingHomePage.headerDropdown.click();
    }

    @When("user clicks on “Frontend Testing” header dropdown option")
    public void userClicksOnFrontendTestingHeaderDropdownOption() {
        techGlobalFrontendTestingHomePage.headerDropdownOptions.get(19).click();
    }

    @Then("user should be navigated to {string}")
    public void userShouldBeNavigatedToHttpsTechglobalTrainingNetlifyAppFrontend() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://techglobal-training.netlify.app/frontend");
    }

    @Then("user clicks on “Pagination” card")
    public void user_clicks_on_Pagination_card() {
    }

    @Then("user should be navigated to “https:\\/\\/techglobal-training.netlify.app\\/frontend\\/pagination”")
    public void user_should_be_navigated_to_https_techglobal_training_netlify_app_frontend_pagination() {
    }

    @Then("user should see “Pagination” heading")
    public void user_should_see_Pagination_heading() {
    }

    @Then("user should see “World City Populations {int}” heading")
    public void user_should_see_World_City_Populations_heading(Integer int1) {

    }

    @Then("user should see “What are the most populated cities in the world? Here is a list of the top five most populated cities in the world:” paragraph")
    public void user_should_see_What_are_the_most_populated_cities_in_the_world_Here_is_a_list_of_the_top_five_most_populated_cities_in_the_world_paragraph() {

    }


}
