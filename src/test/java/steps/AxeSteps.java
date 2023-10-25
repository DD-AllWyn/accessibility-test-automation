package steps;

import com.allwyn.framework.utilities.axe.Accessibility;
import com.allwyn.framework.utilities.reports.SerenityReport;
import com.deque.html.axecore.results.Rule;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;

import java.util.List;

import static net.serenitybdd.core.Serenity.getDriver;

public class AxeSteps {

    private static final List<String> tags = List.of("wcag2a");
    private static List<Rule> violations;
    private static String pageName;
    @Steps
    protected SerenityReport serenityReport;

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
        serenityReport.logAccessibilityValidationReport2(pageName, violations);

    }
}
