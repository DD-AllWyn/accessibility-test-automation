package stepDefinitions.RetailTraniningCentre;

import com.allwyn.framework.pageObjects.web.RetailTraningCentre.MyTrainingPgObj;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import steps.RetailTrainingCentre.MyTrainingSteps;

public class MyTrainingStepDefs {

    @Steps
    MyTrainingSteps myTrainingSteps;

    @Then("The My Training page should be Displayed")
    public void theMyTrainingPageShouldBeDisplayed() {
        myTrainingSteps.validatePageTitle("My Training Page", MyTrainingPgObj.MYTRAINING_PAGE_TITLE);
    }

}
