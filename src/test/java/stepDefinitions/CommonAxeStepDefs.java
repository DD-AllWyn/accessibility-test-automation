package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.AxeSteps;

public class CommonAxeStepDefs {
    @Steps
    AxeSteps axeSteps;

    @When("The {string} is scanned with Axe WCAG 2.2 AAA standards")
    public void performAxeAccessibilityScan(String pageName) {
        axeSteps.performAccessibilityScan(pageName);
    }

    @Then("Verify for accessibility violations and record if any")
    public void recordAccessibilityViolations() {
        axeSteps.verifyViolations();
    }

}
