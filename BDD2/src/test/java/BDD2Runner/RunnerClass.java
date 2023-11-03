package BDD2Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"src\\test\\resources\\FeatureFile\\Login.feature"},
		glue = {"StepDefinationBDD2"},	
		plugin= {"pretty", "html:target/cucumber-reports/CucumberHtmlReport.html",
				"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/rerun.txt"}
		)
		
public class RunnerClass extends AbstractTestNGCucumberTests {
	

}


