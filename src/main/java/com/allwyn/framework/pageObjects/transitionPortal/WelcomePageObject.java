package com.allwyn.framework.pageObjects.transitionPortal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WelcomePageObject extends PageObject {
    public static final String NL_TRANSITIONAL_PORTAL_PAGE_TITLE = "TNL Partners";
    @FindBy(xpath = "//a[text()='Register']")
    public WebElementFacade btnRegister;
    @FindBy(xpath = "//a[text()='Login']")
    public WebElementFacade btnLogin;
}
