package com.allwyn.framework.pageObjects.RetailTraningCentre;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashBoardPageObject extends PageObject {

    public static final String DASHBOARD_PAGE_TITLE = "Dashboard";

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//a[@href='/frontend/training/']")
    public WebElementFacade lnkMyOwnTraining;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right account-menu']//i[@class='fa fa-user']")
    public WebElementFacade lnkUser;
    @FindBy(xpath = "//a[@href='/accounts/logout/']")
    public WebElementFacade lnkSignOut;
    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//i[@class='fa fa-dashboard']")
    public WebElementFacade lnkDashboard;
    @FindBy(xpath = "//a[@href='/distribution/?type_modules.module=on&status_modules.module=passed']")
    public WebElementFacade lnkModulesPassed;
    @FindBy(xpath = "//a[@href='/frontend/checker/']")
    public WebElementFacade lnkSystemChecker;
    @FindBy(xpath = "//div[@id='system-checker-modal']//button[contains(text(),'Close')]")
    public WebElementFacade btnCloseSystemChecker;
}
