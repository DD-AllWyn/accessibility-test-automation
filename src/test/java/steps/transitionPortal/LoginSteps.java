package steps.transitionPortal;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import pageObjects.transitionPortal.LoginPageObject;
import pageObjects.transitionPortal.WelcomePageObject;
import steps.CommonAxeSteps;

public class LoginSteps extends CommonAxeSteps {

    @Steps
    WelcomePageObject WelcomePageObject;

    @Steps
    LoginPageObject loginPageObject;

    @Step("retailer {0} {1} logs in")
    public void login(String prmRetailerId, String prmPassword) {
        uiMenu.clickOn(WelcomePageObject.btnLogin);
        uiTextBox.TypeInto(loginPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(loginPageObject.inputEmailAddress,
                Serenity.sessionVariableCalled("emailAddress"));
        uiTextBox.TypeInto(loginPageObject.inputPassword, prmPassword);
        uiButton.clickOn(loginPageObject.btnSubmit);
    }

    //////////////////////////UNUSED CODE///////////////////////////
    @Step("retailer selects login and enters login {0} {1} {3}")
    public void gotToLoginAndEnterLoginDetails(String prmRetailerId, String prmEmailAddress,
                                               String prmPassword) {
        uiMenu.clickOn(WelcomePageObject.btnLogin);
        uiTextBox.TypeInto(loginPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(loginPageObject.inputEmailAddress, prmEmailAddress);
        uiTextBox.TypeInto(loginPageObject.inputPassword, prmPassword);
    }
}
