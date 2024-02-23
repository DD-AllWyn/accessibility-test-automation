package stepDefinitions.transitionPortal;

import com.mailosaur.MailosaurException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.transitionPortal.OnboardingSteps;
import steps.transitionPortal.RegisterSteps;

import java.io.IOException;

public class OnboardingStepDefs {
    @Steps
    RegisterSteps registerSteps;
    @Steps
    OnboardingSteps onboardingSteps;

    //////////////////////////UNUSED CODE///////////////////////////
    @When("the retailer completes onboarding")
    public void retailerEntersRegistrationDetails(DataTable argData) {
        onboardingSteps.completeOnboarding(argData);
    }

    @When("the retailer completes full onboarding")
    public void completeFullOnboarding(String argRetailerId, String argStorePostcode, String argLast3Digits)
            throws MailosaurException, IOException {
        registerSteps.register(argRetailerId, argStorePostcode, argLast3Digits);
    }
}
