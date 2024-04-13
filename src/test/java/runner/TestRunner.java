package runner;

import org.testng.annotations.DataProvider;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features",
				glue= {"stepdefinitions"},
				plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
		        monochrome = true,
		        publish = true,
		        dryRun=true)
				

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	 public Object[][] scenarios() {
        return super.scenarios();
    }

}
