package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "/Users/hardiynsh/git/seleniumJava/src/test/resources/Features",
	monochrome = true,
	plugin = {
			"pretty", "junit:target.JUnitReports/report.xml",
			"json:target/JSONReports/report.json",
			"html:target/HtmlReports",
	},
	glue = {"StepDefinitions"}
	
)

public class TestRunner {

}
