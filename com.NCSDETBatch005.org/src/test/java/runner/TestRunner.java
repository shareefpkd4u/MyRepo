package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\91900\\eclipse-workspace\\com.NCSDETBatch005.org\\src\\test\\resources\\Features",
		glue = "stepDefinations",
		tags = "@Smoke or @Regression",
		plugin = {"pretty", "html:target/NCReports"}
		
	)

public class TestRunner {

}
