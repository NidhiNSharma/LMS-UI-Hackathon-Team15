package TestRunners;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features"}, // location of feature files
glue= {"StepDefinitions", "Hooks"},
monochrome = false,
plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/htmlReport/report.html" }) // location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.loadConfig();
		ConfigReader.setBrowserType(browser);
		System.out.println(" in runner " + browser);
	}

}