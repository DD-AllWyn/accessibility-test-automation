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
    public void retailerEntersRegistrationDetails(DataTable prmData) {
        onboardingSteps.completeOnboarding(prmData);
    }

    @When("the retailer completes full onboarding")
    public void completeFullOnboarding(String prmRetailerId, String prmStorePostcode, String prmLast3Digits)
            throws MailosaurException, IOException {
        registerSteps.register(prmRetailerId, prmStorePostcode, prmLast3Digits);
    }
}
