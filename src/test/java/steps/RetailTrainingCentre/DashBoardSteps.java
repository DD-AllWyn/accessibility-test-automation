package steps.RetailTrainingCentre;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import pageObjects.RetailTraningCentre.DashBoardPageObject;
import steps.CommonAxeSteps;

public class DashBoardSteps extends CommonAxeSteps {
    @Steps
    DashBoardPageObject dashBoardPageObject;

    @Step("Complete System Checker")
    public void performSystemChecker() {
        try {
            uiLink.clickLink(dashBoardPageObject.lnkSystemChecker);
            Thread.sleep(5000);
            uiLink.clickLink(dashBoardPageObject.btnCloseSystemChecker);
            Thread.sleep(5000);
            uiLink.getElementWhenReady(dashBoardPageObject.lnkMyOwnTraining);
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    @Step("Retailer selects My Own Training")
    public void selectsMyOwnTraining() {
        uiLink.clickLink(dashBoardPageObject.lnkMyOwnTraining);
    }

    @Step("Retailer selects Passed or Completed Modules")
    public void selectsPassedOrCompletedModule() {
        uiLink.clickLink(dashBoardPageObject.lnkModulesPassed);
    }

    @Step("Retailer Logs Out")
    public void logOutOfRetailTrainingCentre() {
        uiLink.clickLink(dashBoardPageObject.lnkUser);
        uiLink.clickLink(dashBoardPageObject.lnkSignOut);
    }
}
