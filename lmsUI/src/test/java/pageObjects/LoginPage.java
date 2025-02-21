package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.BasePage;

public class LoginPage extends BasePage

{		
    WebDriver driver1;
	
	public LoginPage(WebDriver driver) {
		this.driver1 = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "id_username")	
	public WebElement loginusername;
	
	@FindBy(id = "id_password")
	public WebElement loginpwd;
	
	@FindBy(linkText = "Sign out") 
	public WebElement lnkSignout;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement btnLogin;
	
	public void sendUserName(String uname) {
		loginusername.sendKeys(uname);
	}
	public void sendPwdName(String password) {
		loginpwd.sendKeys(password);
	}
	
	//Clicking Logging Button
		public void navigateToAppUrl() throws InterruptedException {
			
			driver1.get("https://feb-ui-hackathon-bbfd38d67ea9.herokuapp.com/login");
			Thread.sleep(5000);
		}
	//Clicking Logging Button
	public void clickLogin() {
		btnLogin.click();
		
	}
	  public void clickLogout() 
	  { lnkSignout.click(); 
	  }	  

}

