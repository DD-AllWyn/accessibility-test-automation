package steps;

import com.allwyn.framework.utilities.axe.Accessibility;
import com.allwyn.framework.utilities.reports.SerenityReport;
import com.allwyn.framework.utilities.webElements.*;
import com.deque.html.axecore.results.Rule;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;

import java.util.List;

public class CommonAxeSteps extends PageObject {
    private static final List<String> tags = List.of("wcag2a");
    private static List<Rule> violations;
    private static String pageName;
    @Steps
    protected SerenityReport serenityReport;
    @Steps
    protected UIButton uiButton;
    @Steps
    protected UICheckBox uiCheckBox;
    @Steps
    protected UIDropDown uiDropDown;
    @Steps
    protected UIHeader uiHeader;
    @Steps
    protected UILabel uiLabel;
    @Steps
    protected UILink uiLink;
    @Steps
    protected UIList uiList;
    @Steps
    protected UIMenu uiMenu;
    @Steps
    protected UITab uiTab;
    @Steps
    protected UITextBox uiTextBox;
    @Steps
    protected UIRadioButton uiRadioButton;

    public void validatePageTitle(String prmPageName, String prmPageTitle) {
        String actualPageTitle = getDriver().getTitle().trim();
        serenityReport.logTestValidationReport("Title of " + prmPageName + " '" + prmPageTitle + "' is as expected", "Title of " + prmPageName + " does not match.", actualPageTitle.equalsIgnoreCase(prmPageTitle.trim()));
    }

    protected void clickUsingJS(WebElementFacade prmWebElementFacade) {
        evaluateJavascript("arguments[0].click()", prmWebElementFacade);
    }

    @Step("Perform a (WCAG) 2.0 AAA Axe accessibility scan")
    public void performAccessibilityScan(String prmPageName) {
        WebDriverFacade webDriverFacade = (WebDriverFacade) getDriver();
        // TODO: check accessibility scan works still
        violations = Accessibility.scanForViolations();
        System.out.println("VIOLATIONS SIZE " + violations.size());
        //violations = Accessibility.scanForViolations(tags, webDriverFacade);
        pageName = prmPageName;
    }

    @Step("Verify accessibility scan violations")
    public void verifyViolations() {
        // serenityReport.logAccessibilityValidationReport(pageName, violations);
        serenityReport.logAccessibilityViolations(pageName, violations);
    }
}
