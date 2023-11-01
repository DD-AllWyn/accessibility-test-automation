package stepDefinitions.RetailTraniningCentre;

import com.allwyn.framework.pageObjects.web.RetailTraningCentre.UsersPgObj;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.RetailTrainingCentre.UserSteps;

public class UsersStepDefs {

    @Steps
    UserSteps userSteps;

    @When("The Retailer Select Users Menu")
    public void theRetailerSelectUsersMenu() {
        userSteps.selectsUsersMenu();
    }

    @Then("The Users page should be Displayed")
    public void theUsersPageShouldBeDisplayed() {
        userSteps.validatePageTitle("Users Page", UsersPgObj.USERS_PAGE_TITLE);
    }

    @Then("The Create New User page should be Displayed")
    public void createNewUsersPageShouldBeDisplayed() {
        userSteps.validatePageTitle("Create New Users Page", UsersPgObj.CREATENEWUSER_PAGE_TITLE);
    }

    @When("The Admin Selects Create New User")
    public void adminSelectCreateNewUser() {
        userSteps.adminSelectCreateNewUser();
    }

    @When("The Admin Selects Retailer From Users Table")
    public void adminSelectsRetailerFromUsersTable() {
        userSteps.adminSelectARetailer();
    }

}
