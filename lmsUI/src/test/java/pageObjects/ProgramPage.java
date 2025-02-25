package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.LoggerLoad;

public class ProgramPage {

	WebDriver driver;
	public ProgramPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="program")
	public static WebElement programButton;
	@FindBy(id="logout")
	public static WebElement logoutButton;
	@FindBy(xpath = "//*[text()=\" LMS - Learning Management System \"]")
	public static WebElement appHeader;
    @FindBy(xpath = "//*[text()=\"Add New Program\"]")	
    public static WebElement addNewProgram;
    @FindBy(xpath = "//*[@class=\"p-button-icon pi pi-trash\"]")
    public static WebElement deleteIcon;
    @FindBy(id="filterGlobal")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@class=\"box\"][1]")
    public static WebElement manageProgramText;
    @FindBy(xpath = "//*[@class=\"p-datatable-footer ng-star-inserted\"]/div")
    public static WebElement footerMessage;
    @FindBy(xpath = "//*[@class=\"p-paginator-current ng-star-inserted\"]")
    public static WebElement numberOfRecordstext;
    @FindBy(xpath = "//*[@class=\"p-datatable-thead\"]//th[1]")
    public static WebElement checkBoxStatus;
    @FindBy(xpath = "//*[@class=\"p-datatable-tbody\"]//td[1]")
    public static List<WebElement> rowCheckBox;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]")
	WebElement programNameHeader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]")
	WebElement programDescriptionHeader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[4]")
	WebElement programStatusHeader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[5]")
	WebElement editDeleteHeader;
	
    
    //Add new program
    @FindBy(xpath = "//button[@class=\"mat-focus-indicator mat-menu-item ng-tns-c230-0\"]")
    WebElement addProgram;
    //sort arrows
    @FindBy(xpath="/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[2]/p-sorticon/i")
	WebElement programNameArrowIcon;
    
    @FindBy(xpath="/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[3]/p-sorticon/i")
	WebElement programDescriptionArrowIcon;
	
	@FindBy(xpath="/html/body/app-root/app-program/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[4]/p-sorticon")
	WebElement programStatusArrowIcon;
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement checkBox;

	
	public void clickProgramButton() {
		programButton.click();
	}
	public boolean logoutButtonPresence() {
		return logoutButton.isDisplayed();
	}
	public boolean validateHeader() {
		return appHeader.isDisplayed();
	}
	public String addProgramButtonValidation() {
		return addNewProgram.getText();
	}
	public boolean deleteIconValidation() {
		return deleteIcon.isEnabled();
	}
	public String searchBoxValidation() {
		return searchBox.getText();
	}
	public String validateManageProgram() {
		return manageProgramText.getText();
	}
	public String getFooterMessage() {
		return footerMessage.getText();
	}
	public String numberOfRecordstextValidate() {
		return numberOfRecordstext.getText();
	}
	public boolean checkBoxDefaultStatus() {
		return checkBoxStatus.isEnabled();
	}
	
	public List<WebElement> checkBoxStatusInRows() {
		return rowCheckBox;
	}
	public Object programNameHeaderValidation() {
		return programNameHeader.getText();
	}
	public Object programDescriptionHeaderValidation() {
		return programDescriptionHeader.getText();
	}
	public Object programStatusHeaderValidation() {
		return programStatusHeader.getText();
	}
	public Object editDeleteHeaderValidation() {
		return editDeleteHeader.getText();
	}
	public CharSequence programNameArrowIconValidation() {
		return programNameArrowIcon.getText();
	}
	public CharSequence programDescriptionArrowIconValidation() {
		return programDescriptionArrowIcon.getText();
	}
	public CharSequence programStatusArrowIconValidation() {
		return programStatusArrowIcon.getText();
	}
}
