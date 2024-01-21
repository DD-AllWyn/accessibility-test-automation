package steps.transitionPortal;

import com.allwyn.framework.utilities.mailosaur.EmailClient;
import com.mailosaur.MailosaurException;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import com.allwyn.framework.pageObjects.transitionPortal.RegisterPageObject;
import com.allwyn.framework.pageObjects.transitionPortal.WelcomePageObject;
import steps.CommonAxeSteps;

import java.io.IOException;

public class RegisterSteps extends CommonAxeSteps {

    final String emailAddress = Serenity.sessionVariableCalled("emailAddress");
    @Steps
    WelcomePageObject welcomePageObject;

    @Steps
    RegisterPageObject registerPageObject;

    @Step("retailer {0} {1} enters registration details")
    public void goToRegistrationAndEnterDetails(String prmRetailerId, String prmPostcode) {
        uiMenu.clickOn(welcomePageObject.btnRegister);
        uiTextBox.TypeInto(registerPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(registerPageObject.inputEmailAddress, emailAddress);
        uiTextBox.TypeInto(registerPageObject.inputPostcode, prmPostcode);
        uiButton.clickOn(registerPageObject.btnSubmit);
    }

    @Step("retailer {0} {1} registers")
    public void register(String prmRetailerId, String prmPostcode, String prmLast3Digits)
            throws MailosaurException, IOException {
        // Register
        uiMenu.clickOn(welcomePageObject.btnRegister);

        // Retailer details
        uiTextBox.TypeInto(registerPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.TypeInto(registerPageObject.inputPostcode, prmPostcode);
        uiButton.clickOn(registerPageObject.btnSubmit);

        // Proprietor details
        uiTextBox.TypeInto(registerPageObject.inputLast3BankAccountDigits, prmLast3Digits);
        uiTextBox.TypeInto(registerPageObject.inputEmailAddress, emailAddress);
        uiTextBox.TypeInto(registerPageObject.inputEmailAddressConfirm, emailAddress);
        uiButton.clickOn(registerPageObject.btnSubmit);

        // Verification email link
        EmailClient emailClient = new EmailClient();
        WebDriverFacade webDriverFacade = (WebDriverFacade) Serenity.getDriver();
        webDriverFacade.get(emailClient.getTransitionPortalVerificationLink(emailAddress));

        // Password
        uiTextBox.TypeInto(registerPageObject.inputPassword, "Password1!");
        uiTextBox.TypeInto(registerPageObject.inputPasswordConfirm, "Password1!");
        uiButton.clickOn(registerPageObject.btnSubmit);
    }

}
