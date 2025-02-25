package hooks;

import org.openqa.selenium.WebDriver;
import driverFactory.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Scenario;
import util.ConfigReader;

import org.apache.logging.log4j.LogManager;
import driverFactory.DriverManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

	private WebDriver driver;
		
	@Before
	public void setUp() {
	driver = driverManager(ConfigReader.getPropObject().getProperty("browser"));
	
  }
	
	@After
	public void tearDownNScreenShot(Scenario scenario) {	
	System.out.println("in tear down hooks");
	if(scenario.isFailed()) {
		
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Failed Scenario Screenshot");
		System.out.println("Screenshot attached for failed scenario: " + scenario.getName());
	}	
	
	quitDriver();
  }

}

