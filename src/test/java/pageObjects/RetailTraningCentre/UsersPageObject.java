package pageObjects.RetailTraningCentre;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class UsersPageObject {
    public static final String USERS_PAGE_TITLE = "Users";
    public static final String CREATENEWUSER_PAGE_TITLE = "Create new user";
    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//i[@class='fa fa-users']")
    public WebElementFacade lnkUsers;

    @FindBy(css = "a[href='/trainees/add/']")
    public WebElementFacade lnkCreateNewUser;
    @FindBy(xpath = "//input[@id='id_first_name']")
    public WebElementFacade inputFirstName;

    @FindBy(css = "(//td[contains(text(),'Retailer')])[1]")
    public WebElementFacade lnkRetailerName1;

    @FindBy(xpath = "//a[contains(text(),'Personal details & account')]")
    public WebElementFacade tabPersonalDetailsAndAccounts;
}
