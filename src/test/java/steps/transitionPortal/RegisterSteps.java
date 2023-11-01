package steps.transitionPortal;

import com.allwyn.framework.pageObjects.web.transitionPortal.RegisterPgObj;
import com.allwyn.framework.pageObjects.web.transitionPortal.WelcomePgObj;
import com.allwyn.framework.utilities.mailosaur.EmailClient;
import com.mailosaur.MailosaurException;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import steps.CommonAxeSteps;

import java.io.IOException;

public class RegisterSteps extends CommonAxeSteps {

    final String emailAddress = Serenity.sessionVariableCalled("emailAddress");
    @Steps
    WelcomePgObj welcomePgObj;

    @Steps
    RegisterPgObj registerPgObj;

    @Step("retailer {0} {1} enters registration details")
    public void goToRegistrationAndEnterDetails(String prmRetailerId, String prmPostcode) {
        uiMenu.clickOn(welcomePgObj.btnRegister);
        uiTextBox.TypeInto(registerPgObj.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(registerPgObj.inputEmailAddress, emailAddress);
        uiTextBox.TypeInto(registerPgObj.inputPostcode, prmPostcode);
        uiButton.clickOn(registerPgObj.btnSubmit);
    }

    @Step("retailer {0} {1} registers")
    public void register(String prmRetailerId, String prmPostcode, String prmLast3Digits)
            throws MailosaurException, IOException {
        // Register
        uiMenu.clickOn(welcomePgObj.btnRegister);

        // Retailer details
        uiTextBox.TypeInto(registerPgObj.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(registerPgObj.inputPostcode, prmPostcode);
        uiButton.clickOn(registerPgObj.btnSubmit);

        // Proprietor details
        uiTextBox.TypeInto(registerPgObj.inputLast3BankAccountDigits, prmLast3Digits);
        uiTextBox.TypeInto(registerPgObj.inputEmailAddress, emailAddress);
        uiTextBox.TypeInto(registerPgObj.inputEmailAddressConfirm, emailAddress);
        uiButton.clickOn(registerPgObj.btnSubmit);

        // Verification email link
        EmailClient emailClient = new EmailClient();
        WebDriverFacade webDriverFacade = (WebDriverFacade) Serenity.getDriver();
        webDriverFacade.get(emailClient.getTransitionPortalVerificationLink(emailAddress));

        // Password
        uiTextBox.TypeInto(registerPgObj.inputPassword, "Password1!");
        uiTextBox.TypeInto(registerPgObj.inputPasswordConfirm, "Password1!");
        uiButton.clickOn(registerPgObj.btnSubmit);
    }

}
