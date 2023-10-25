package steps.transitionPortal;

import com.allwyn.framework.pageObjects.web.transitionPortal.OnboardingPgObj;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.AxeSteps;
import steps.CommonSteps;

import java.util.Map;

public class OnboardingSteps extends CommonSteps {

    @Steps
    AxeSteps axeSteps;
    @Steps
    OnboardingPgObj onboardingPgObj;

    //////////////////////////UNUSED CODE///////////////////////////
    @Step("retailer completes onboarding")
    public void completeOnboarding(DataTable prmDataTable) {
        Map<String, String> dataMap = prmDataTable.asMap();
        // Now you can get values by key
        String retailerNumber = dataMap.get("retailer_number");
        String postcode = dataMap.get("postcode");

        String proprietorDob = dataMap.get("proprietor_dob");
        String proprietorEmail = dataMap.get("proprietor_email");
        String proprietorPhone = dataMap.get("proprietor_phone");
        String proprietorAccountNum = dataMap.get("proprietor_account_num");
        String storeFasciaName = dataMap.get("store_fascia_name");
        String storeAddress1 = dataMap.get("store_address_1");
        String storeAddress2 = dataMap.get("store_address_2");
        String storeAddress3 = dataMap.get("store_address_3");
        String storeAddressTown = dataMap.get("store_address_town");
        String storeAddressPostcode = dataMap.get("store_address_postcode");

        uiButton.clickOn(onboardingPgObj.btnContinue);
    }

}
