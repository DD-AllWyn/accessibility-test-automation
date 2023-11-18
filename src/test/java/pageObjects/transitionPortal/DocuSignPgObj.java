package pageObjects.transitionPortal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DocuSignPgObj extends PageObject {
    public static final String DOCUSIGN_PAGE_TITLE = "Review and sign document(s)";
    @FindBy(id = "disclosureAccepted")
    public WebElementFacade chkDisclosureAccepted;
    @FindBy(id = "action-bar-btn-continue")
    public WebElementFacade btnContinue;
    @FindBy(id = "navigate-btn")
    public WebElementFacade btnStart;
    @FindBy(xpath = "//button[contains(@data-qa, 'signature-tab-required')]")
    public WebElementFacade btnSign;
    @FindBy(xpath = "//button[@data-qa='adopt-submit']")
    public WebElementFacade btnAdoptAndSign;
    @FindBy(xpath = "//button[text()='Finish']")
    public WebElementFacade btnFinish;
}
