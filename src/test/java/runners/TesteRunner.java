package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features"
		,glue= {"stepdefinitions"}
		,tags = {"@TesteCompras"}
		,plugin = {"pretty", "html:target/cucumber-reports"}
	//	,plugin = {"usage"}
		,monochrome = true
		,dryRun = false
		)

public class TesteRunner {

}
