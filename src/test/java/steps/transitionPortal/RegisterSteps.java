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
        welcomePageObject.btnRegister.click();
        uiTextBox.enterText(registerPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.enterText(registerPageObject.inputEmailAddress, emailAddress);
        uiTextBox.enterText(registerPageObject.inputPostcode, prmPostcode);
        registerPageObject.btnSubmit.click();
    }

    @Step("retailer {0} {1} registers")
    public void register(String prmRetailerId, String prmPostcode, String prmLast3Digits)
            throws MailosaurException, IOException {
        // Register
        welcomePageObject.btnRegister.click();

        // Retailer details
        uiTextBox.enterText(registerPageObject.inputRetailerId, prmRetailerId);
        uiTextBox.enterText(registerPageObject.inputPostcode, prmPostcode);
       registerPageObject.btnSubmit.click();

        // Proprietor details
        uiTextBox.enterText(registerPageObject.inputLast3BankAccountDigits, prmLast3Digits);
        uiTextBox.enterText(registerPageObject.inputEmailAddress, emailAddress);
        uiTextBox.enterText(registerPageObject.inputEmailAddressConfirm, emailAddress);
        registerPageObject.btnSubmit.click();

        // Verification email link
        EmailClient emailClient = new EmailClient();
        WebDriverFacade webDriverFacade = (WebDriverFacade) Serenity.getDriver();
        webDriverFacade.get(emailClient.getTransitionPortalVerificationLink(emailAddress));

        // Password
        uiTextBox.enterText(registerPageObject.inputPassword, "Password1!");
        uiTextBox.enterText(registerPageObject.inputPasswordConfirm, "Password1!");
       registerPageObject.btnSubmit.click();
    }

}
