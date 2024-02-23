package stepDefinitions.transitionPortal;

import com.mailosaur.MailosaurException;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.transitionPortal.RegisterSteps;

import java.io.IOException;

public class RegisterStepDefs {
    @Steps
    RegisterSteps registerSteps;

    @When("the retailer {string} {string} {string} registers")
    public void retailerRegisters(String argRetailerId, String argStorePostcode, String argLast3Digits)
            throws MailosaurException, IOException {
        registerSteps.register(argRetailerId, argStorePostcode, argLast3Digits);
    }

    ////////////////////////UNUSED STEP DEFINITION//////////////////
    @When("the retailer {string} {string} enters registration details")
    public void retailerEntersRegistrationDetails(String argRetailerId, String argStorePostcode) {
        registerSteps.goToRegistrationAndEnterDetails(argRetailerId, argStorePostcode);
    }

}
