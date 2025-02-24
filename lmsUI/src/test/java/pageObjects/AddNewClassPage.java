package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewClassPage {
	WebDriver driver;
	public AddNewClassPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
   
    @FindBy(xpath = "//input[@placeholder='Select a Batch Name']")
    public static WebElement classBatchName;
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





