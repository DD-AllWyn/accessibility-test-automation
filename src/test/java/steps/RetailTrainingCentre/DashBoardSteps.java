package steps.RetailTrainingCentre;

import com.allwyn.framework.pageObjects.web.RetailTraningCentre.DashBoardPgObj;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.CommonAxeSteps;

public class DashBoardSteps extends CommonAxeSteps {
    @Steps
    DashBoardPgObj dashBoardPgObj;

    @Step("Complete System Checker")
    public void performSystemChecker() {
        try {
            uiLink.clickLink(dashBoardPgObj.lnkSystemChecker);
            Thread.sleep(5000);
            uiLink.clickLink(dashBoardPgObj.btnCloseSystemChecker);
            Thread.sleep(5000);
            uiLink.getElementWhenReady(dashBoardPgObj.lnkMyOwnTraining);
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    @Step("Retailer selects My Own Training")
    public void selectsMyOwnTraining() {
        uiLink.clickLink(dashBoardPgObj.lnkMyOwnTraining);
    }

    @Step("Retailer selects Passed or Completed Modules")
    public void selectsPassedOrCompletedModule() {
        uiLink.clickLink(dashBoardPgObj.lnkModulesPassed);
    }

    @Step("Retailer Logs Out")
    public void logOutOfRetailTrainingCentre() {
        uiLink.clickLink(dashBoardPgObj.lnkUser);
        uiLink.clickLink(dashBoardPgObj.lnkSignOut);
    }
}
