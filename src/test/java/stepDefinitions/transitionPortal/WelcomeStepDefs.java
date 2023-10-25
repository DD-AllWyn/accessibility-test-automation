package stepDefinitions.transitionPortal;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.transitionPortal.WelcomeSteps;

public class WelcomeStepDefs {
    @Steps
    WelcomeSteps welcomeSteps;

    @Given("the retailer is on the NL Transition Portal")
    public void retailerIsOnTheNLTransitionPortal() {
        welcomeSteps.navigateToNationalLotteryTransitionPortal();
    }

    @When("the retailer chooses to register")
    public void retailerChoosesToRegistration() {
        welcomeSteps.goToRegistration();
    }

    @When("the retailer chooses to login")
    public void retailerChoosesToLogin() {
        welcomeSteps.gotToLogin();
    }

}
