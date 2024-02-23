package stepDefinitions.transitionPortal;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.transitionPortal.LoginSteps;

public class LoginStepDefs {
    @Steps
    LoginSteps loginSteps;

    @When("the retailer {string} logs in")
    public void retailerEntersRegistrationDetails(String argRetailerId) {
        loginSteps.login(argRetailerId, "Password1!");
    }

    //////////////////////////UNUSED CODE///////////////////////////
    @When("the retailer logs in with {string} {string} {string}")
    public void retailerLogsIn(String argRetailerId, String argEmailAddress, String argPassword) {
        loginSteps.gotToLoginAndEnterLoginDetails(argRetailerId, argEmailAddress, argPassword);
    }
}
