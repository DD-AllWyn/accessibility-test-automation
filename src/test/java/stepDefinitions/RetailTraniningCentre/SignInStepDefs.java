package stepDefinitions.RetailTraniningCentre;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.RetailTrainingCentre.SignInSteps;

public class SignInStepDefs {

    @Steps
    SignInSteps signInSteps;

    @Given("The Retailer navigates to Retail Training Centre Sign-In Page")
    public void theRetailerNavigateToRetailTrainingCentre() {
        signInSteps.retailerNavigatesToRetailTrainingCentreSignInPage();
    }

    @When("The Retailer logs into Retail Training Centre")
    public void theRetailerLogsIntoRetailTrainingCentre() {
        signInSteps.retailerSignsIn();
    }

}
