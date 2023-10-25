package steps.RetailTrainingCentre;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import pageObjects.UsersPgObj;
import steps.CommonSteps;

public class UserSteps extends CommonSteps {

    @Steps
    UsersPgObj usersPgObj;

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

}
