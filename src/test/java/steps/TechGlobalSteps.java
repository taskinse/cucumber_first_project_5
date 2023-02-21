package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalPaginationPage;
import utils.Driver;

public class TechGlobalSteps {
    WebDriver driver;

    TechGlobalBasePage techGlobalBasePage;
    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;
    TechGlobalPaginationPage techGlobalPaginationPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        techGlobalBasePage = new TechGlobalBasePage();
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalPaginationPage = new TechGlobalPaginationPage();
    }
    // TASK -1
    @And("user should see {string} heading")
    public void userShouldSeeHeading(String heading) {
        switch (heading) {
            case "Pagination":
                driver.get(driver.getCurrentUrl());
                Assert.assertEquals(techGlobalPaginationPage.mainHeading.getText(), heading);
                break;
            case "World City Populations 2022":
                Assert.assertEquals(techGlobalPaginationPage.subHeading.getText(), heading);
                break;
            default:
                throw new NotFoundException();
        }
    }
    @And("user should see {string} paragraph")
    public void userShouldSeeParagraph( String paragraph) {
            Assert.assertEquals(techGlobalPaginationPage.paragraph.getText(), paragraph);
        }
    // TASK-2
    @And("user should see {string} button is disabled")
    public void userShouldSeePreviousAndNextButtonIsDisabled(String button) {
    switch(button){
        case "Previous":
            Assert.assertTrue(techGlobalPaginationPage.previousButton.isDisplayed());
            break;
        case "Next":
            Assert.assertTrue(techGlobalPaginationPage.nextButton.isDisplayed());
            break;
        default:
            throw new NotFoundException();
    }
}
    @And("user should see {string} button is enabled")
    public void userShouldSeePreviousNextButtonIsEnabled(String button) {
        switch(button) {
            case "Previous":
                Assert.assertTrue(techGlobalPaginationPage.previousButton.isEnabled());
                break;
            case "Next":
                Assert.assertTrue(techGlobalPaginationPage.nextButton.isEnabled());
                break;
            default:
                throw new NotFoundException();
        }
    }
    @When("user clicks on {string} button")
    public void userClicksOnNextButton(String button) {
    techGlobalPaginationPage.nextButton.click();
    }
    @When("user clicks on {string} button till it becomes disabled")
    public void userClicksOnNextButtonTillItBecomesDisabled(String button) {
        while(techGlobalPaginationPage.nextButton.isEnabled()){
            techGlobalPaginationPage.nextButton.click();
        }
    }
    // TASK-3
    @And("user should see city with info below and an image")
    public void userShouldSeeCityWithInfoBelowAndAnImage(DataTable cities) {
        for (int i = 0; i < cities.asList().size(); i++) {
            Assert.assertEquals(techGlobalPaginationPage.cityInfo.get(i).getText(), cities.asList().get(i));
            System.out.println(techGlobalPaginationPage.cityInfo.get(i).getText());
        }
    techGlobalPaginationPage.nextButton.click();
    }
}