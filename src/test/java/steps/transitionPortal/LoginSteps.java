package steps.transitionPortal;


import com.allwyn.framework.pageObjects.web.transitionPortal.LoginPgObj;
import com.allwyn.framework.pageObjects.web.transitionPortal.WelcomePgObj;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import steps.CommonAxeSteps;

public class LoginSteps extends CommonAxeSteps {

    @Steps
    WelcomePgObj welcomePgObj;

    @Steps
    LoginPgObj loginPgObj;

    @Step("retailer {0} {1} logs in")
    public void login(String prmRetailerId, String prmPassword) {
        uiMenu.clickOn(welcomePgObj.btnLogin);
        uiTextBox.TypeInto(loginPgObj.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(loginPgObj.inputEmailAddress,
                Serenity.sessionVariableCalled("emailAddress"));
        uiTextBox.TypeInto(loginPgObj.inputPassword, prmPassword);
        uiButton.clickOn(loginPgObj.btnSubmit);
    }

    //////////////////////////UNUSED CODE///////////////////////////
    @Step("retailer selects login and enters login {0} {1} {3}")
    public void gotToLoginAndEnterLoginDetails(String prmRetailerId, String prmEmailAddress,
                                               String prmPassword) {
        uiMenu.clickOn(welcomePgObj.btnLogin);
        uiTextBox.TypeInto(loginPgObj.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(loginPgObj.inputEmailAddress, prmEmailAddress);
        uiTextBox.TypeInto(loginPgObj.inputPassword, prmPassword);
    }
}
