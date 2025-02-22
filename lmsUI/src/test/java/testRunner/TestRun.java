package testRunner;

import io.cucumber.testng.CucumberOptions;

public class TestRun {
	@CucumberOptions(
			features = { ".\\src\\test\\resources\\FeaturesFiles\\" }, 
			glue = { "stepDefinitions", "applicationHook" },
			plugin = { "pretty", "html:reports/myreport.html", "rerun:target/rerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
			dryRun = false, // checks mapping between scenario steps and step definition methods
			monochrome = true, // to avoid junk characters in output
			publish = true // to publish report in cucumber server
			//tags = "@Login"
	)
	public class Runner {

	}

}
