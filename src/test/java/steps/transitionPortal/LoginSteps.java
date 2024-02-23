package steps.transitionPortal;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import com.allwyn.framework.pageObjects.transitionPortal.LoginPageObject;
import com.allwyn.framework.pageObjects.transitionPortal.WelcomePageObject;
import steps.CommonAxeSteps;

public class LoginSteps extends CommonAxeSteps {

    @Steps
    WelcomePageObject WelcomePageObject;

    @Steps
    LoginPageObject loginPageObject;

    @Step("retailer {0} {1} logs in")
    public void login(String prmRetailerId, String prmPassword) {
        WelcomePageObject.btnLogin.click();
        uiTextBox.enterText(loginPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.enterText(loginPageObject.inputEmailAddress,
                Serenity.sessionVariableCalled("emailAddress"));
        uiTextBox.enterText(loginPageObject.inputPassword, prmPassword);
        loginPageObject.btnSubmit.click();
    }

    //////////////////////////UNUSED CODE///////////////////////////
    @Step("retailer selects login and enters login {0} {1} {3}")
    public void gotToLoginAndEnterLoginDetails(String prmRetailerId, String prmEmailAddress,
                                               String prmPassword) {
        WelcomePageObject.btnLogin.click();
        uiTextBox.enterText(loginPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.enterText(loginPageObject.inputEmailAddress, prmEmailAddress);
        uiTextBox.enterText(loginPageObject.inputPassword, prmPassword);
    }
}
