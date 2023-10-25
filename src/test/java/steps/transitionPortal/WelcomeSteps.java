package steps.transitionPortal;

import com.allwyn.framework.SerenityScenario;
import com.allwyn.framework.pageObjects.web.transitionPortal.WelcomePgObj;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.CommonSteps;

import static net.serenitybdd.core.Serenity.getDriver;

public class WelcomeSteps extends CommonSteps {
    @Steps
    WelcomePgObj welcomePgObj;

    @Step("retailer selects register")
    public void goToRegistration() {
        uiMenu.clickOn(welcomePgObj.btnRegister);
    }

    @Step("retailer selects login")
    public void gotToLogin() {
        uiMenu.clickOn(welcomePgObj.btnLogin);
    }

    @Step("Navigate to National Lottery Transition Portal")
    public void navigateToNationalLotteryTransitionPortal() {
        String transitionPortalURL = SerenityScenario.configProp.getProperty("transitionPortal.URL");
        getDriver().get(transitionPortalURL);
        serenityReport.logStandardSerenityReport("User navigated to the National Lottery Transition Portal Successfully");
        validatePageTitle("National Lottery Transition Portal", WelcomePgObj.NL_TRANSITIONAL_PORTAL_PAGE_TITLE);
    }
}

