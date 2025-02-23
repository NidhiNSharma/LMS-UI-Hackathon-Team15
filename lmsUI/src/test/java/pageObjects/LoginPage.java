package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import util.ElementUtil;

import driverFactory.BasePage;
import util.ConfigReader;

public class LoginPage extends BasePage

{		
    WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "username")	
	public WebElement loginusername;
	
	@FindBy(id = "password")
	public WebElement loginpwd;
	
	@FindBy(xpath = "//mat-select[@role='combobox']")
	public WebElement loginrole;
		
	@FindBy(xpath = "//mat-option/span[text()=' Admin ']")
	public WebElement loginrolevalue;	
	
	@FindBy(id="login")
	public WebElement loginBtn;
	
	@FindBy(id = "logout") 
	public WebElement homelogout;
	
	
	
	public void navigateToAppUrl() throws InterruptedException {
		
		String url = ConfigReader.getPropObject().getProperty("appUrl");
		driver.get(url);
		ElementUtil.implicitPageWait(driver);
		System.out.println("Application URL in POM: " + url);
		
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		//Thread.sleep(5000);
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void sendUserName(String uname) {
		ElementUtil.sendKeysIntoInput(driver, loginusername, uname, 20L);
	}
	public void sendPwdName(String password) {
		ElementUtil.sendKeysIntoInput(driver, loginpwd, password, 20L);
	}
	
	public void sendRoleAsAdmin() {
		
		ElementUtil.waitForElementClickablity(driver, loginrole, 20L).click();;
		ElementUtil.waitForElementClickablity(driver, loginrolevalue, 20L).click();
	}
		
	public void clickLogin() {
		
		ElementUtil.waitForElementClickablity(driver, loginBtn, 10L).click();
		//btnLogin.click();
	}
	public void clickLogout() 
	  { 
		ElementUtil.waitForElementClickablity(driver, homelogout, 10L).click();
	  }	
	
	
	public HomePage getHomePageObject() {
		
//when ever user redirected to new page that method shld return new page object.	   
	   HomePage  homePage = new HomePage(driver);//this driver has a reference home page driver
	   return homePage;
	}
	
	
			
}

