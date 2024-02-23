package steps.RetailTrainingCentre;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.RetailTraningCentre.DashBoardPageObject;
import steps.CommonAxeSteps;

public class DashBoardSteps extends CommonAxeSteps {
    @Steps
    DashBoardPageObject dashBoardPageObject;

    @Step("Complete System Checker")
    public void performSystemChecker() {
        try {
         dashBoardPageObject.lnkSystemChecker.click();
            Thread.sleep(5000);
           dashBoardPageObject.btnCloseSystemChecker.click();
            Thread.sleep(5000);
            uiLink.getElementWhenReady(dashBoardPageObject.lnkMyOwnTraining);
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    @Step("Retailer selects My Own Training")
    public void selectsMyOwnTraining() {
        dashBoardPageObject.lnkMyOwnTraining.click();
    }

    @Step("Retailer selects Passed or Completed Modules")
    public void selectsPassedOrCompletedModule() {
        dashBoardPageObject.lnkModulesPassed.click();
    }

    @Step("Retailer Logs Out")
    public void logOutOfRetailTrainingCentre() {
       dashBoardPageObject.lnkUser.click();
        dashBoardPageObject.lnkSignOut.click();
    }
}
