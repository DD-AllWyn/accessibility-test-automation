package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashBoard2PgObj extends PageObject {

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//i[@class='fa fa-dashboard']")
    public WebElementFacade lnkDashboard;
    @FindBy(xpath = "//a[@href='/distribution/?type_modules.module=on&status_modules.module=passed']")
    public WebElementFacade lnkModulesPassed;
    @FindBy(xpath = "//a[@href='/frontend/checker/']")
    public WebElementFacade lnkSystemChecker;
    @FindBy(xpath = "//div[@id='system-checker-modal']//button[contains(text(),'Close')]")
    public WebElementFacade btnCloseSystemChecker;
}
