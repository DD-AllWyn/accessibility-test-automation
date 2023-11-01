package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.CommonAxeSteps;

public class CommonAxeStepDefs {
    @Steps
    CommonAxeSteps commonAxeSteps;

    @When("The {string} is scanned with Axe WCAG 2.2 AAA standards")
    public void performAxeAccessibilityScan(String pageName) {
        commonAxeSteps.performAccessibilityScan(pageName);
    }

    @Then("Verify for accessibility violations and record if any")
    public void recordAccessibilityViolations() {
        commonAxeSteps.verifyViolations();
    }

}
