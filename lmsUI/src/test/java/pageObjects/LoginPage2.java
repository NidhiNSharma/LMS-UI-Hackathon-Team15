package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import driverFactory.DriverManager;
import Utilities.ConfigReader;

//import DriverFactory.BasePage;

public class LoginPage2
{		

	public WebDriver driver = DriverManager.getDriver();

	public By loginusername = By.cssSelector("#username");
	public By loginpwd = By.cssSelector("#password");
	public By selectPlaceholder = By.cssSelector("mat-select");
	public By selectList = By.cssSelector("[role=\"listbox\"] mat-option");
	public By lnkSignout = By.linkText("Sign out");
	public By btnLogin = By.cssSelector("#login");

	public void sendUserName(String uname) {
		driver.findElement(loginusername).sendKeys(uname);
	}

	public void sendPwdName(String password) {
		driver.findElement(loginpwd).sendKeys(password);
	}

	//Clicking Logging Button
	public void clickLogin() {
		driver.findElement(btnLogin).click();

	}
	public void clickLogout() { 
		driver.findElement(lnkSignout).click(); 
	}	

	public void loginIntoTheAppWithValidCredentials() throws InterruptedException {
		String userName = ConfigReader.getUserName();
		String password = ConfigReader.getPassword();

		sendUserName(userName);
		sendPwdName(password);
		driver.findElement(selectPlaceholder).click();
		driver.findElement(selectList).click();
		clickLogin();
	}
	
	public void openUrl() {
		driver.get(ConfigReader.getUrl());
	}

}

