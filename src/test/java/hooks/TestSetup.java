package hooks;

import com.allwyn.framework.SerenityScenario;
import com.allwyn.framework.utilities.data.DataGenerator;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class TestSetup {
    static {
        SerenityScenario.readConfigurations();
        System.setProperty("fileCount", "1");
    }
    @Steps
    DataGenerator dataGenerator;
    @Steps
    SerenityScenario serenityScenario;

    @Before(order = 0)
    public void configureWebTest(Scenario prmScenario) {
        serenityScenario.initialiseScenario(prmScenario.getId());
    }

    @Before(value = "@AccessibilityTestScenarios")
    public void initialiseTestData(Scenario prmScenario) {
        //TODO Session Variable is used in Transition Portal. Refactor the code when we work on Accessibility Test Scenarios
        String emailAddress = dataGenerator.getRandomEmailAddressForMailosaur(
                dataGenerator.generateFirstName(),
                dataGenerator.generateLastName()
        );
        Serenity.setSessionVariable("emailAddress").to(emailAddress);
        serenityScenario.initialiseScenario(prmScenario.getId());
    }
}
