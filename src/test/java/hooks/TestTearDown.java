package hooks;

import com.allwyn.framework.SerenityScenario;
import com.allwyn.framework.utilities.file.ScenarioList;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.StepEventBus;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.thucydides.model.domain.TestOutcome;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestTearDown {
    @Steps
    SerenityScenario serenityScenario;

    @After(order = 0)
    public void updateScenarioExecutionStatus(Scenario argScenario) {
        serenityScenario.logScenarioStatus(argScenario);
    }

    @After(value = "@AccessibilityTest", order = 1)
    public void updateScenarioStatus(Scenario prmScenario) {
        TestOutcome testOutcome = StepEventBus.getEventBus().getBaseStepListener().getCurrentTestOutcome();
        if (testOutcome.isSuccess()) {
            ScenarioList.updateScenarioStatusInScenariosListFiles(prmScenario,3);
            setTestNameInSauceLabs(prmScenario);
        }
    }

    public void setTestNameInSauceLabs(Scenario prmScenario) {
        WebDriverFacade webDriverFacade = (WebDriverFacade) Serenity.getDriver();
        System.out.println(webDriverFacade.getCapabilities().getBrowserName());
        String webDriverName = webDriverFacade.getDriverClass().getSimpleName();
        if (webDriverName.equalsIgnoreCase("RemoteWebDriver")) {
            RemoteWebDriver remoteWebDriver = (RemoteWebDriver) webDriverFacade.getProxiedDriver();
            updateTestNameInSauceLabs(remoteWebDriver, prmScenario.getName());
            updateTestOutcomeInSauceLabs(remoteWebDriver);
        }
    }

    public void updateTestNameInSauceLabs(RemoteWebDriver prmRemoteWebDriver, String prmScenarioName) {
        ((JavascriptExecutor) prmRemoteWebDriver).executeScript("sauce:job-name=" + prmScenarioName);
    }

    public void updateTestOutcomeInSauceLabs(RemoteWebDriver prmRemoteWebDriver) {

        TestOutcome testOutcome = StepEventBus.getEventBus().getBaseStepListener().getCurrentTestOutcome();

        String testStatus = "";
        if (testOutcome.isSuccess()) {
            testStatus = "passed";
        } else if (testOutcome.isFailure()) {
            testStatus = "failed";
        } else {
            testStatus = "compromised";
        }
        ((JavascriptExecutor) prmRemoteWebDriver).executeScript("sauce:job-result=" + testStatus);
    }
}
