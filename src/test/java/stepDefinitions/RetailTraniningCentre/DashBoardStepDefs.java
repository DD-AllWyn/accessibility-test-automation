package stepDefinitions.RetailTraniningCentre;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.RetailTraningCentre.DashBoardPageObject;
import steps.RetailTrainingCentre.DashBoardSteps;

public class DashBoardStepDefs {

    @Steps
    DashBoardSteps dashBoardSteps;

    @Then("The DashBoard Page should be displayed")
    public void theDashboardPageShouldBeDisplayed() {
        dashBoardSteps.validatePageTitle("DashBoard Page", DashBoardPageObject.DASHBOARD_PAGE_TITLE);
        //Continue with System Checker - System Checker Warning message appears only for Chrome
        //dashBoardSteps.performSystemChecker();
    }

    @When("The Retailer selects Passed Or Completed Modules")
    public void theRetailerNavigatesToPassedOrCompletedModules() {
        dashBoardSteps.selectsPassedOrCompletedModule();
    }

    @Then("The Retailer Selects My Own Training")
    public void theRetailerSelectsMyOwnTraining() {
        dashBoardSteps.selectsMyOwnTraining();
    }

    @Then("The Retailer Logs out of Retail Training Centre")
    public void theRetailerLogsOutOfRetailTrainingCentre() {
        dashBoardSteps.logOutOfRetailTrainingCentre();
    }
}
