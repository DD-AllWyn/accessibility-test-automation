package pageObjects.transitionPortal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LoginPageObject extends PageObject {
    @FindBy(id = "retailer_id")
    public WebElementFacade inputRetailerId;
    @FindBy(id = "email")
    public WebElementFacade inputEmailAddress;
    @FindBy(id = "password")
    public WebElementFacade inputPassword;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElementFacade btnSubmit;
    @FindBy(xpath = "//button[text()='Reset Password']")
    public WebElementFacade btnResetPassword;
}
