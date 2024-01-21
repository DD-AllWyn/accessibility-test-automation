package com.allwyn.framework.pageObjects.RetailTraningCentre;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInPageObject extends PageObject {

    public static final String SIGNIN_PAGE_TITLE = "Sign in | Allwyn UAT (Spark)";

    @FindBy(id = "id_login_form-username")
    public WebElementFacade inputEmailAddress;

    @FindBy(id = "id_login_form-password")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button[@data-submitting='Signing in']")
    public WebElementFacade btnSignIn;
}
