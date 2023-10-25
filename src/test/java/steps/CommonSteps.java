package steps;

import com.allwyn.framework.utilities.reports.SerenityReport;
import com.allwyn.framework.utilities.webElements.*;
import net.serenitybdd.annotations.Steps;

import static net.serenitybdd.core.Serenity.getDriver;

public class CommonSteps {
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
        System.out.println("TITLE FOLLOWS");
        System.out.println(getDriver().getTitle());
        String actualPageTitle = getDriver().getTitle().trim();
        serenityReport.logTestValidationReport("Title of " + prmPageName + " '" + prmPageTitle + "' is as expected", "Title of " + prmPageName + " does not match.", actualPageTitle.equalsIgnoreCase(prmPageTitle.trim()));
    }

}
