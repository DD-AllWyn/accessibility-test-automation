package steps.RetailTrainingCentre;

import com.allwyn.framework.pageObjects.web.RetailTraningCentre.DashBoardPgObj;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import pageObjects.DashBoard2PgObj;
import steps.CommonSteps;

public class DashBoardSteps extends CommonSteps {
    @Steps
    DashBoard2PgObj dashBoard2PgObj;
    @Steps
    DashBoardPgObj dashBoardPgObj;

    @Step("Complete System Checker")
    public void performSystemChecker() {
        try {
            uiLink.clickLink(dashBoard2PgObj.lnkSystemChecker);
            Thread.sleep(5000);
            uiLink.clickLink(dashBoard2PgObj.btnCloseSystemChecker);
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
        uiLink.clickLink(dashBoard2PgObj.lnkModulesPassed);
    }

    @Step("Retailer Logs Out")
    public void logOutOfRetailTrainingCentre() {
        uiLink.clickLink(dashBoardPgObj.lnkUser);
        uiLink.clickLink(dashBoardPgObj.lnkSignOut);
    }
}
