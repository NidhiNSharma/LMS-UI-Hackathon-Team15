
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.BasePage;
import util.ElementUtil;

public class HomePage extends BasePage {

	 public WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
	
	@FindBy(xpath = "//mat-toolbar/span[text()=' LMS - Learning Management System ']") 
	public WebElement hometoolbartitle;
	@FindBy(id="dashboard")
	public static WebElement homeButton;
	@FindBy(id="program")
	public static WebElement programButton;
	@FindBy(xpath="//button/span[text()='Batch']")
	WebElement btn_homepage_batch;
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean isHomePageToolBarPresent() {
		
		ElementUtil.implicitPageWait(driver);
		System.out.println("home page URL in POM: " + driver.getCurrentUrl());
		return ElementUtil.waitForElementVisibility(driver, hometoolbartitle, 30L).isDisplayed();
		
   }
	
   public void clickOnHome() {
	   homeButton.click();
   }
	
   public void clickOnProgram() {
	   programButton.click();
   }
   public void Click_batch_btn()
	{
		btn_homepage_batch.click();
	
	}
   public BatchPage UseronBatchPage() {
		
	 //when ever user redirected to new page that method shld return new page object.	   
	   BatchPage  batchPage = new BatchPage(driver);//this driver has a reference home page driver
	 	   return batchPage;
	 	}
   
   
}
