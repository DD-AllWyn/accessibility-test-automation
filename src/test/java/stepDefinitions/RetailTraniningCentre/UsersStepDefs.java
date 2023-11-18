package stepDefinitions.RetailTraniningCentre;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pageObjects.RetailTraningCentre.UsersPageObject;
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
        userSteps.validatePageTitle("Users Page", UsersPageObject.USERS_PAGE_TITLE);
    }

    @Then("The Create New User page should be Displayed")
    public void createNewUsersPageShouldBeDisplayed() {
        userSteps.validatePageTitle("Create New Users Page", UsersPageObject.CREATENEWUSER_PAGE_TITLE);
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
