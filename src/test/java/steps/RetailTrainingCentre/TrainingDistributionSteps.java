package steps.RetailTrainingCentre;

import com.allwyn.framework.pageObjects.web.RetailTraningCentre.TrainingDistributionPgObj;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.CommonAxeSteps;

public class TrainingDistributionSteps extends CommonAxeSteps {

    @Steps
    TrainingDistributionPgObj trainingDistributionPgObj;

    @Step("Retailer selects Distribute Training")
    public void selectsDistributeTraining() {
        uiLink.clickLink(trainingDistributionPgObj.lnkDistributeTraining);
        boolean elementExist = uiDropDown.getElementWhenReady(trainingDistributionPgObj.ddwTypesOfUser);
        serenityReport.logTestValidationReport("Select Users Tab is displayed as expected", "Select Users Tab is not displayed", elementExist);
    }

    @Step("Retailer selects Training Items")
    public void selectsTrainingItems() {
        uiLink.clickLink(trainingDistributionPgObj.btnSelectTrainingItems);
        boolean elementExist = uiDropDown.getElementWhenReady(trainingDistributionPgObj.ddwWhichTraining);
        serenityReport.logTestValidationReport("Select Training Items Tab is displayed as expected", "Select Training Items Tab is not displayed", elementExist);
    }

    @Step("Retailer selects Configure Training Items")
    public void selectsConfigureTrainingItems() {
        uiLink.clickLink(trainingDistributionPgObj.btnConfigureTrainingItems);
        //TODO CONFIGURE TRAINING ITEMS TAB NOT CONFIGURED
       /* boolean elementExist = uiDropDown.getElementWhenReady(trainingDistributionPgObj.);
        serenityReport.logTestValidationReport("Configure Training Items Tab is displayed as expected", "Configure Training Items Tab is not displayed", elementExist);*/
    }

    @Step("Retailer selects Review")
    public void selectsReview() {
        uiLink.clickLink(trainingDistributionPgObj.btnReview);
        boolean elementExist = uiHeader.getElementWhenReady(trainingDistributionPgObj.hdrReview);
        serenityReport.logTestValidationReport("Review Tab is displayed as expected", "Review Tab is not displayed", elementExist);
    }
}
