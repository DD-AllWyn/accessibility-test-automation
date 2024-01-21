package stepDefinitions.RetailTraniningCentre;


import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.RetailTraningCentre.MyTrainingPageObject;
import steps.RetailTrainingCentre.MyTrainingSteps;

public class MyTrainingStepDefs {

    @Steps
    MyTrainingSteps myTrainingSteps;

    @Then("The My Training page should be Displayed")
    public void theMyTrainingPageShouldBeDisplayed() {
        myTrainingSteps.validatePageTitle("My Training Page", MyTrainingPageObject.MYTRAINING_PAGE_TITLE);
    }

}
