package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {"pretty","com.epam.reportportal.cucumber.ScenarioReporter"},
        glue = "spotifySteps",
        features = "src/test/resources/features"
)
public class TestRunner {
}
