package driverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.Scenario;

public class DriverManager {

	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	public WebDriver driver;
	public static Scenario scenario;

	public WebDriver intializeBrowser(String browser) throws Exception {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		threadDriver.set(driver);
		return threadDriver.get();
	}

	public void closeDriver() {
		if (threadDriver.get() != null) {
			threadDriver.get().quit();
			threadDriver.remove();
		}
	}

	public static synchronized WebDriver getDriver() {
		return threadDriver.get();
	}

}
