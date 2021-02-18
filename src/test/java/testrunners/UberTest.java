package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Uber.feature"},
		glue = {"stepdefinitions", "MyHooks"},
		tags = "@All",
		plugin = {"pretty", "json:target/MyReports/report.jason",
		        "junit:target/MyReports/report.xml"		
		},
		monochrome = true,
		dryRun = false
		//strict = false//(any change in feature fine will not be highlited)
		//publish = true
		
		)
public class UberTest {

}
