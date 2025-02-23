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
}
