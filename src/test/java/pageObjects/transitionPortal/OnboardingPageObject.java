package pageObjects.transitionPortal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class OnboardingPageObject extends PageObject {
    public static final String NL_TRANSITIONAL_PORTAL_PAGE_TITLE = "TNL Partners";

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElementFacade btnContinue;
    @FindBy(id = "proprietorName")
    public WebElementFacade inputProprietorName;
    @FindBy(id = "storeAddressLine1")
    public WebElementFacade inputStoreAddressLine1;
    @FindBy(id = "storeAddressLine2")
    public WebElementFacade inputStoreAddressLine2;
    @FindBy(id = "storeAddressLine3")
    public WebElementFacade inputStoreAddressLine3;
    @FindBy(id = "proprietorDob")
    public WebElementFacade inputProprietorDob;
    @FindBy(id = "proprietorPhone")
    public WebElementFacade inputProprietorPhoneNumber;
    @FindBy(id = "storeFascia")
    public WebElementFacade inputStoreFascia;
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElementFacade btnYes;
    @FindBy(xpath = "//button[text()='Edit']")
    public WebElementFacade btnEdit;
    @FindBy(xpath = "//button[text()='Upload']")
    public WebElementFacade btnUpload;
    @FindBy(id = "file")
    public WebElementFacade inputFile;
    @FindBy(xpath = "//img[@alt='Tick'][0]")
    public WebElementFacade chkDirectDebitMandateTransferLetter;
    @FindBy(xpath = "//img[@alt='Tick'][1]")
    public WebElementFacade chkSummaryOfChanges;
    @FindBy(xpath = "//button[text()='Sign now']")
    public WebElementFacade btnSignNow;
}
