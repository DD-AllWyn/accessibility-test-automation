package stepDefinitions.transitionPortal;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.transitionPortal.LoginSteps;

public class LoginStepDefs {
    @Steps
    LoginSteps loginSteps;

    @When("the retailer {string} logs in")
    public void retailerEntersRegistrationDetails(String prmRetailerId) {
        loginSteps.login(prmRetailerId, "Password1!");
    }

    //////////////////////////UNUSED CODE///////////////////////////
    @When("the retailer logs in with {string} {string} {string}")
    public void retailerLogsIn(String prmRetailerId, String prmEmailAddress, String prmPassword) {
        loginSteps.gotToLoginAndEnterLoginDetails(prmRetailerId, prmEmailAddress, prmPassword);
    }
}
