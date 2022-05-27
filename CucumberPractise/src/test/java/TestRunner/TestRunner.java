package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = {"pretty","com.epam.reportportal.cucumber.ScenarioReporter"},
//		plugin = { "pretty", "json:target/Cucumber.json", "html:target/cucumber-html-report",
//		"usage:target/cucumber-usage.json",
//		"junit:target/cucumber-results.xml"
	
               glue = "stepdefinition",
               features = "src/test/resources/features")
public class TestRunner {
}
