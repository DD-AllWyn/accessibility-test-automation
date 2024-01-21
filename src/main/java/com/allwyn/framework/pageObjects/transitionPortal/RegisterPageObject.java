package com.allwyn.framework.pageObjects.transitionPortal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class RegisterPageObject extends PageObject {
    public static final String NL_TRANSITIONAL_PORTAL_PAGE_TITLE = "TNL Partners";

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElementFacade btnSubmit;
    @FindBy(id = "retailer_id")
    public WebElementFacade inputRetailerId;
    @FindBy(id = "postcode")
    public WebElementFacade inputPostcode;
    @FindBy(id = "account")
    public WebElementFacade inputLast3BankAccountDigits;
    @FindBy(id = "email")
    public WebElementFacade inputEmailAddress;
    @FindBy(id = "email_confirmation")
    public WebElementFacade inputEmailAddressConfirm;
    @FindBy(id = "password")
    public WebElementFacade inputPassword;
    @FindBy(id = "password_confirmation")
    public WebElementFacade inputPasswordConfirm;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElementFacade btnLogin;
}
