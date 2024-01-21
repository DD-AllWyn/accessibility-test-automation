package steps.RetailTrainingCentre;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import com.allwyn.framework.pageObjects.RetailTraningCentre.UsersPageObject;
import steps.CommonAxeSteps;

public class UserSteps extends CommonAxeSteps {

    @Steps
    UsersPageObject usersPageObject;

    @Step("Retailer selects 'Users' Menu")
    public void selectsUsersMenu() {
        //CANNOT CLICK USER MENU USING SELECTORS, HENCE THE TEMPORARY SOLUTION OF NAVIGATING TO THE USERS PAGE IS IMPLEMENTED
        Serenity.getDriver().navigate().to("https://allwyn-uat.boltspark.com/trainees/");
    }

    @Step("Admin Selects 'Create New User'")
    public void adminSelectCreateNewUser() {
        //CANNOT CLICK CREATE NEW USER MENU USING SELECTORS, HENCE THE TEMPORARY SOLUTION OF NAVIGATING TO THE USERS PAGE IS IMPLEMENTED
        //uiLink.clickLink(usersPgObj.lnkCreateNewUser);
        Serenity.getDriver().navigate().to("https://allwyn-uat.boltspark.com/trainees/add");
    }

    @Step("Admin Selects a Retailer")
    public void adminSelectARetailer() {
        try {
            //TODO CHANGE THE CODE WHEN THE APPLICATION IS STABLE
            //Thread.sleep(10000);
            //clickUsingJS(usersPgObj.lnkRetailerName1);
            //usersPgObj.lnkRetailerName1.click();
            //uiLink.clickLink(usersPgObj.lnkRetailerName1);
            //uiTab.getElementWhenReady(usersPgObj.tabPersonalDetailsAndAccounts);
            Serenity.getDriver().navigate().to("https://allwyn-uat.boltspark.com/trainees/18/");
        } catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

}
