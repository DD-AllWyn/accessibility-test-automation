package steps.RetailTrainingCentre;

import com.allwyn.framework.SerenityScenario;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import com.allwyn.framework.pageObjects.RetailTraningCentre.SignInPageObject;
import steps.CommonAxeSteps;

public class SignInSteps extends CommonAxeSteps {
    @Steps
    SignInPageObject signInPageObject;

    @Step("Retailer Navigates to Retail Training Centre Sign-In Page")
    public void retailerNavigatesToRetailTrainingCentreSignInPage() {
        String retailTrainingCentreURL = SerenityScenario.configProp.getProperty("retailTrainingCentre.URL");
        getDriver().get(retailTrainingCentreURL);
        validatePageTitle("Retail Training Centre Sign-In Page", SignInPageObject.SIGNIN_PAGE_TITLE);
        serenityReport.logStandardSerenityReport("Retailer navigated to the Retail Training Centre Sign-In Page Successfully");

    }

    @Step("Retailer signs in with EmailAddress and Password")
    public void retailerSignsIn() {
        uiTextBox.typeInto(signInPageObject.inputEmailAddress, SerenityScenario.configProp.getProperty("retailTrainingCentre.UserName"));
        uiTextBox.typeInto(signInPageObject.inputPassword, SerenityScenario.configProp.getProperty("retailTrainingCentre.Password"));
        uiButton.clickButton(signInPageObject.btnSignIn);
    }
}
