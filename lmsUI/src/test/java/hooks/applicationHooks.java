package hooks;

import org.apache.logging.log4j.LogManager;
import driverFactory.DriverManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import Utilities.ConfigReader;

public class applicationHooks {

	static DriverManager driverManager = new DriverManager();
	public static WebDriver driver;
	public static String browser;
	public static Scenario scenario;

	private static Logger logger = LogManager.getLogger(); // Log4j library class for logging purpose

	@BeforeAll
	public static void launchBrowser() throws Throwable {
		// Get browser Type from config file
		ConfigReader.loadConfig();
		browser = ConfigReader.getBrowserType();
		driver = driverManager.intializeBrowser(browser);
	}

	@AfterAll
	public static void closeDriver() {
		driverManager.closeDriver();
	}
	
	@After(order = 0)
	public void clearCookies() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.sessionStorage.clear();");
        logger.info("======================  Test Execution is completed!! ======================");
	}

	@After(order = 2)
	public void takeScreenshot(Scenario scenario) throws InterruptedException {

		if (scenario.isFailed()) {
			logger.error("======================  TEST CASE FAILED !! ======================", browser, scenario);
			;
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
			logger.info("======================  Screenshot is captured  ======================");
		}
	}

	@After(order = 1)
	public void logTheMessages() {
		logger.info("======================  Test Execution is completed!! ======================");
	}

}
