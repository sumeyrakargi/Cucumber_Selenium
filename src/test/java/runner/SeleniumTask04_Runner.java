package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={ "src/test/resources/features/04_SeleniumTask.feature"},
        glue ="stepdefinitions"
)
public class SeleniumTask04_Runner {
}
