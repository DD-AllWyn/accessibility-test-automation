import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/"
        , glue = {"stepDefinitions", "hooks"}
        , plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class RunnerToGenerateScenarioList {

}
