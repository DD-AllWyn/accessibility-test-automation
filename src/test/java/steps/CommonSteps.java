package steps;

import com.allwyn.framework.utilities.reports.SerenityReport;
import com.allwyn.framework.utilities.webElements.*;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CommonSteps extends PageObject {
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

    /*
        @Step("Navigate to National Lottery Web Page")
        public void navigateToNationalLotteryHomePage() {
            String nationalLotteryURL = SerenityScenario.configProp.getProperty("nationalLottery.URL");
            getDriver().get(nationalLotteryURL);
            serenityReport.logStandardSerenityReport("User navigated to the National Lottery Website Successfully");
            validatePageTitle("National Lottery Home Page", NavigationPageObject.NLHOMEPAGETITLE);
        }
    */
    public void validatePageTitle(String prmPageName, String prmPageTitle) {
        String actualPageTitle = getDriver().getTitle().trim();
        serenityReport.logTestValidationReport("Title of " + prmPageName + " '" + prmPageTitle + "' is as expected", "Title of " + prmPageName + " does not match.", actualPageTitle.equalsIgnoreCase(prmPageTitle.trim()));
    }

    protected void clickUsingJS(WebElementFacade prmWebElementFacade) {
        evaluateJavascript("arguments[0].click()", prmWebElementFacade);
    }
}
