package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="features", 
		glue={"stepDefinition"},
		plugin= {"pretty", "html:test-html-report"},
		monochrome = true,
		dryRun = false,
		tags = {"@SmokeTest", "~@RegressionTest"}
		)
public class TestRunner {

}

