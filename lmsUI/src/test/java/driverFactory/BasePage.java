package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasePage {

	
	
	private static final String headlessChrome = "headlessChrome";
	private static final String chrome = "Chrome";
	private static final String headlessFirefox = "headlessFirefox";
	private static final String firefox = "Firefox";
	protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	//return a Singleton WebDriver Instance
	
	public static WebDriver getDriver(String browser)
	{
	  if(driver.get()== null) // Ensure only one instance is created	
		{	
		switch(browser.toLowerCase()) {
		
		case headlessChrome:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver.set(new ChromeDriver(options));
			System.out.println("in getdriver method");
        	break;		
		case headlessFirefox:
			driver.set(new ChromeDriver());
			System.out.println("getting chrome driver ");
			break;
		case firefox:
			FirefoxOptions ffOptions = new FirefoxOptions();
			ffOptions.addArguments("headless");
			driver.set(new FirefoxDriver(ffOptions));
			System.out.println("getting chrome driver ");
			break;
			default:
				driver.set(new ChromeDriver());
		}
	}
		return driver.get();
}
	
	
    public static void quitDriver() {
		if(driver.get()!=null) {
    	driver.get().quit();
    	driver.remove();//Clear thread-local storage
		}
	}
}
