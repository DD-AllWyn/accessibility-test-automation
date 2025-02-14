package stepDefinitions.RetailTraniningCentre;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.RetailTraningCentre.TrainingDistributionPageObject;
import steps.RetailTrainingCentre.TrainingDistributionSteps;

public class TrainingDistributionStepDefs {

    @Steps
    TrainingDistributionSteps trainingDistributionSteps;

    @Then("The Training Distribution Page should be displayed")
    public void theTrainingDistributionPageShouldBeDisplayed() {
        trainingDistributionSteps.validatePageTitle("Training Distribution Page", TrainingDistributionPageObject.TRAININGDISTRIBUTION_PAGE_TITLE);
    }

    @When("The Retailer selects Distribute Training")
    public void theRetailerSelectsDistributeTraining() {
        trainingDistributionSteps.selectsDistributeTraining();
    }

    @When("The Retailer selects Training Items")
    public void theRetailerSelectsTrainingItems() {
        trainingDistributionSteps.selectsTrainingItems();
    }

    @When("The Retailer selects Configure Training Items")
    public void theRetailerSelectsConfigureTrainingItems() {
        trainingDistributionSteps.selectsConfigureTrainingItems();
    }

    @When("The Retailer selects Review")
    public void theRetailerSelectsReview() {
        trainingDistributionSteps.selectsReview();
    }

    @Then("The Distribute Training Page should be displayed")
    public void theDistributeTrainingPageShouldBeDisplayed() {
        trainingDistributionSteps.validatePageTitle("Distribute Training Page", TrainingDistributionPageObject.DISTRIBUTETRAINING_PAGE_TITLE);
    }
}
