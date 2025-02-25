package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassPage {
	
	WebDriver driver;
	public ClassPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
    @FindBy(id = "class")
    public static WebElement classButton;
    @FindBy(id = "logout")
    public static WebElement logoutButton; 
    @FindBy(xpath = "//span[normalize-space()='Class']")
    public static WebElement appHeader;
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
    
  //Add New Class  
    @FindBy(xpath = "//button[normalize-space()='Add New Class']")
    public static WebElement addNewClass ;
    @FindBy(xpath = "//input[@placeholder='Select a Batch Name']")
    public static WebElement classBatchName;
    @FindBy(id = "pr_id_4-label")
    public static WebElement addPopupBox;   
    @FindBy(xpath = "//span[@class='p-dropdown-trigger-icon ng-tns-c88-10 pi pi-chevron-down']")
    public static WebElement batchNameDropDown; 
    @FindBy(xpath = "//input[@id='classTopic']")
    public static WebElement classTopic;
    @FindBy(xpath = "//input[@id='classDescription']")
    public static WebElement classDescription ;
    @FindBy(xpath = "//input[@id='icon']")
    public static WebElement selectClassDates;
    @FindBy(id = "classNo")
    public static WebElement numberOfClasses;
    @FindBy( className = "p-dropdown-trigger-icon ng-tns-c88-18 pi pi-chevron-down")
    public static WebElement staffName;
    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    public static WebElement cancelButton;
    @FindBy(xpath = "//span[normalize-space()='Save']")
    public static WebElement saveButton;
    @FindBy(className = "p-dialog-header-close-icon ng-tns-c81-5 pi pi-times")
    public static WebElement closeClassDetails;   
    
	
	public void clickClassButton() {
		classButton.click();
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
	public boolean addNewC()	{
    	return appHeader.isDisplayed();
   	}
 
    
    //Add New Class
    
    public void addNewClass()  {
      	 addNewClass.click();
      } 
    public void batchNameDropDown()  {
   	 batchNameDropDown.click();
   } 
   public void classTopic()	{
   	 classTopic.click();
   }
   public void classDescription() {
   	classDescription.click();
   }
   public void classDates() {
   	selectClassDates.click();
   }
   public boolean validateAddPopupBox() {
	 return addPopupBox.isDisplayed();
    }
   public boolean validatePopupSaveButton() {
		 return addPopupBox.isDisplayed();
	    }
   public boolean validatePopupCloseButton() {
		 return addPopupBox.isDisplayed();
	    }
   public boolean validatePopupCancelButton() {
		 return addPopupBox.isDisplayed();
	    }

   //Search Box
   public void clickOnSearchTextBox() {
   	       searchBox.click();
   }
 

  

   }












