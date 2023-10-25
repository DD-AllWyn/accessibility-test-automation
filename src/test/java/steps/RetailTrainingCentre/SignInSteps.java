package steps.RetailTrainingCentre;

import com.allwyn.framework.SerenityScenario;
import com.allwyn.framework.pageObjects.web.RetailTraningCentre.SignInPgObj;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.CommonSteps;

import static net.serenitybdd.core.Serenity.getDriver;

public class SignInSteps extends CommonSteps {
    @Steps
    SignInPgObj signInPgObj;

    @Step("Retailer Navigates to Retail Training Centre Sign-In Page")
    public void retailerNavigatesToRetailTrainingCentreSignInPage() {
        String retailTrainingCentreURL = SerenityScenario.configProp.getProperty("retailTrainingCentre.URL");
        getDriver().get(retailTrainingCentreURL);
        validatePageTitle("Retail Training Centre Sign-In Page", SignInPgObj.SIGNIN_PAGE_TITLE);
        serenityReport.logStandardSerenityReport("Retailer navigated to the Retail Training Centre Sign-In Page Successfully");

    }

    @Step("Retailer signs in with EmailAddress and Password")
    public void retailerSignsIn() {
        uiTextBox.typeInto(signInPgObj.inputEmailAddress, SerenityScenario.configProp.getProperty("retailTrainingCentre.UserName"));
        uiTextBox.typeInto(signInPgObj.inputPassword, SerenityScenario.configProp.getProperty("retailTrainingCentre.Password"));
        uiButton.clickButton(signInPgObj.btnSignIn);
    }
}
