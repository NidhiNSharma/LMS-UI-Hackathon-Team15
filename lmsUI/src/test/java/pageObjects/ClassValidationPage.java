package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassValidationPage {
	
	WebDriver driver;
	public ClassValidationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
    @FindBy(id = "class")
    public static WebElement classBar;
    @FindBy(id = "logout")
    public static WebElement logoutButton; 
    @FindBy(xpath = "//span[normalize-space()='Class']")
    public static WebElement appHeader;
    @FindBy(xpath = "//button[normalize-space()='Add New Class']")
    public static WebElement addNewClass ;
    @FindBy(className = "p-button-icon pi pi-trash")
    public static WebElement deleteIcon;
    @FindBy(id = "filterGlobal")
    public static WebElement searchBox;
    @FindBy(xpath = "//div[normalize-space()='Manage Class']")
    public static WebElement manageClassText;
    @FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
    public static WebElement paginationMsg;
    @FindBy(xpath = "//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
    public static WebElement numberOfRecordsText;
    @FindBy(className = "p-checkbox-box")
    public static WebElement mainCheckBoxStatus;   
    @FindBy(className = "p-checkbox-box p-component")
    public static List<WebElement> rowCheckBox;
    
    public void clickClassBar()  {
    	   classBar.click();
    }
    public boolean logoutButtonPresence()  {
    	return logoutButton.isDisplayed();
    } 
   	public boolean validateHeader()	{
    	return appHeader.isDisplayed();
   	}
    public String addClassBarValidation() {
    	return addNewClass.getText();
    }
    public boolean deleteIconValidation() {
    	return deleteIcon.isEnabled();
    }
    public String searchBoxValidation() {
    	return searchBox.getText();
    }
    public String validateManageClass() {
		return manageClassText.getText(); 	
    }
    public String getPaginationMsg() {
  		return manageClassText.getText(); 	
      }
    public String numberOfRecordsTextValidate() {
  		return numberOfRecordsText.getText(); 	
      }
    public boolean checkBoxDefaultStatus() {
  		return mainCheckBoxStatus.isEnabled(); 	
      }  
    public List<WebElement> checkBoxStatusInRows() {
    	return rowCheckBox;
    }

}




