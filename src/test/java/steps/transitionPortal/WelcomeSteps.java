package steps.transitionPortal;

import com.allwyn.framework.SerenityScenario;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.transitionPortal.WelcomePageObject;
import steps.CommonAxeSteps;

public class WelcomeSteps extends CommonAxeSteps {
    @Steps
    WelcomePageObject welcomePageObject;

    @Step("retailer selects register")
    public void goToRegistration() {
        uiMenu.clickOn(welcomePageObject.btnRegister);
    }

    @Step("retailer selects login")
    public void gotToLogin() {
        uiMenu.clickOn(welcomePageObject.btnLogin);
    }

    @Step("Navigate to National Lottery Transition Portal")
    public void navigateToNationalLotteryTransitionPortal() {
        String transitionPortalURL = SerenityScenario.configProp.getProperty("transitionPortal.URL");
        getDriver().get(transitionPortalURL);
        serenityReport.logStandardSerenityReport("User navigated to the National Lottery Transition Portal Successfully");
        validatePageTitle("National Lottery Transition Portal", WelcomePageObject.NL_TRANSITIONAL_PORTAL_PAGE_TITLE);
    }
}

