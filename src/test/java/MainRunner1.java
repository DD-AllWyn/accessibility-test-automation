import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/retailTrainingCentre/Users.feature"
        , glue = {"stepDefinitions", "hooks"}
        , plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber_report.json"}
        , tags = ("@axe")
)
public class MainRunner1 {

}
