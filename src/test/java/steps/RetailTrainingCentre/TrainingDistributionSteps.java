package steps.RetailTrainingCentre;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.RetailTraningCentre.TrainingDistributionPageObject;
import steps.CommonAxeSteps;

public class TrainingDistributionSteps extends CommonAxeSteps {

    @Steps
    TrainingDistributionPageObject trainingDistributionPageObject;

    @Step("Retailer selects Distribute Training")
    public void selectsDistributeTraining() {
        uiLink.clickLink(trainingDistributionPageObject.lnkDistributeTraining);

        boolean elementExist = uiDropDown.getElementWhenReady(trainingDistributionPageObject.ddwTypesOfUser);
        serenityReport.logTestValidationReport("Select Users Tab is displayed as expected", "Select Users Tab is not displayed", elementExist);
    }

    @Step("Retailer selects Training Items")
    public void selectsTrainingItems() {
        uiLink.clickLink(trainingDistributionPageObject.btnSelectTrainingItems);
        boolean elementExist = uiDropDown.getElementWhenReady(trainingDistributionPageObject.ddwWhichTraining);
        serenityReport.logTestValidationReport("Select Training Items Tab is displayed as expected", "Select Training Items Tab is not displayed", elementExist);
    }

    @Step("Retailer selects Configure Training Items")
    public void selectsConfigureTrainingItems() {
        uiLink.clickLink(trainingDistributionPageObject.btnConfigureTrainingItems);
        //TODO CONFIGURE TRAINING ITEMS TAB NOT CONFIGURED
       /* boolean elementExist = uiDropDown.getElementWhenReady(trainingDistributionPgObj.);
        serenityReport.logTestValidationReport("Configure Training Items Tab is displayed as expected", "Configure Training Items Tab is not displayed", elementExist);*/
    }

    @Step("Retailer selects Review")
    public void selectsReview() {
        uiLink.clickLink(trainingDistributionPageObject.btnReview);
        boolean elementExist = uiHeader.getElementWhenReady(trainingDistributionPageObject.hdrReview);
        serenityReport.logTestValidationReport("Review Tab is displayed as expected", "Review Tab is not displayed", elementExist);
    }
}
