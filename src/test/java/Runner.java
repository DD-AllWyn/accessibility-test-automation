import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/transitionPortal"
        , glue = {"stepDefinitions", "hooks"}
        , plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber_report.json"}
        //, tags = ("@APITestScenarios and @Regression")
        //, tags = ("@APITestScenarios")
        //, tags = ("@AccessibilityTestScenarios")
        , tags = ("@AccessibilityTestScenarios and @TESTSET_TQP-156")
)

public class Runner {

}
