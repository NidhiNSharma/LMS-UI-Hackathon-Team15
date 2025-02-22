package stepDefinitions;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewClassSteps {
	
	WebDriver driver;

	@Given("Admin Is on the Manage Class Page after login")
	public void admin_is_on_the_manage_class_page_after_login() {
		
		driver = new ChromeDriver();
        driver.get("https://feb-ui-hackathon-bbfd38d67ea9.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(null);
        driver.manage().window().maximize();
        driver.findElement(null).click();// Locator
	}

	/*@Given("Admin is on the Manage Class Page")
	public void admin_is_on_the_manage_class_page() {
	  
	} */

	@When("Admin clicks a add new class under the class menu bar")
	public void admin_clicks_a_add_new_class_under_the_class_menu_bar1() {
		 WebElement addNewClassButton = driver.findElement(By.id(""));  //Add New Class Locator
		    addNewClassButton.click();
	}

	@Then("Admin should see a popup open for class details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_class_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
	   
		// Verify the popup is displayed
	    WebElement popup = driver.findElement(By.id("")); // popup locator
	    assertTrue(popup.isDisplayed());

	    // Verify the presence of the SAVE button
	    WebElement saveButton = driver.findElement(By.id("")); // save button locator
	    assertTrue(saveButton.isDisplayed());

	    // Verify the presence of the CANCEL button
	    WebElement cancelButton = driver.findElement(By.id("")); // cancel button locator
	    assertTrue(cancelButton.isDisplayed());

	    // Verify the presence of the Close(X) icon
	    WebElement closeIcon = driver.findElement(By.id("")); // close icon locator
	    assertTrue(closeIcon.isDisplayed());
	}

	/*@When("Admin clicks a add new Class under the Class menu bar")
	public void a_admin_clicks_a_add_new_class_under_the_class_menu_bar() {
	
	}*/

	@Then("Admin should see few input fields and their respective text boxes in the class details window")
	public void admin_should_see_few_input_fields_and_their_respective_text_boxes_in_the_class_details_window() {
		WebElement batchNameField = driver.findElement(By.id("")); // Batch Name (drop down button) locator
		WebElement classTopicField = driver.findElement(By.id("")); // Class Topic locator
	    WebElement classDescriptionField = driver.findElement(By.id("")); // Class Description locator
	    WebElement selectClassDatesField = driver.findElement(By.id("")); // Select Class Dates(calander) locator
	    WebElement noOfClassesField = driver.findElement(By.id("")); // No of Classes locator
	    WebElement staffNameField = driver.findElement(By.id("")); // Staff Name locator
	    WebElement cancelButtonField = driver.findElement(By.id("")); // Cancel Button locator
	    WebElement saveButtonField = driver.findElement(By.id("")); // Save Button locator
	    assertTrue(batchNameField.isDisplayed());
	    assertTrue(classTopicField.isDisplayed());
	    assertTrue(classDescriptionField.isDisplayed());
	    assertTrue(selectClassDatesField.isDisplayed());
	    assertTrue(noOfClassesField.isDisplayed());
	    assertTrue(staffNameField.isDisplayed());
	    assertTrue(cancelButtonField.isDisplayed());
	    assertTrue(saveButtonField.isDisplayed());
	}

	@Given("Admin is on the Class Popup window")
	public void admin_is_on_the_class_popup_window() {
	  
	}

	@When("Admin enters mandatory fields in the form and clicks on save button")
	public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_save_button() {
	
		 WebElement batchNameField = driver.findElement(By.id("")); // locator
		    WebElement classTopicField = driver.findElement(By.id("")); // locator
		    WebElement  selectClassDatesField = driver.findElement(By.id("")); // locator
		    WebElement noOfClassesField = driver.findElement(By.id("")); // locator
		    WebElement staffNameField = driver.findElement(By.id("")); // locator
		    WebElement cancelButtonField = driver.findElement(By.id("")); // locator
		    WebElement saveButtonField = driver.findElement(By.id("")); // locator
		    
		    batchNameField.sendKeys(""); // locator
		    classTopicField.sendKeys(""); // locator 
		    selectClassDatesField.sendKeys(""); // locator
		    noOfClassesField.sendKeys(""); // locator
		    staffNameField.sendKeys(""); // locator
		    cancelButtonField.sendKeys(""); // locator
		    saveButtonField.sendKeys(""); // locator
		    
		    // Click the save button
		    WebElement saveButton = driver.findElement(By.id("")); // Save Button locator
		    saveButton.click();
	}

	@Then("Admin gets message Class added Successfully")
	public void admin_gets_message_class_added_successfully() {
		WebElement successMessage = driver.findElement(By.id("")); // Msg Box locator
	    assertTrue(successMessage.getText().contains("Class added Successfully"));
	 
	}

	@When("Admin selects Class Date in date picker")
	public void admin_selects_class_date_in_date_picker() {
		 WebElement classDateField = driver.findElement(By.id("")); // Class Date locator
		    classDateField.click();

		    WebElement selectedDate = driver.findElement(By.xpath("")); // Select Date Locator
		    selectedDate.click();
	}

	@Then("Admin should see number of Class value is added automatically")
	public void admin_should_see_number_of_class_value_is_added_automatically() {
		 WebElement classValueField = driver.findElement(By.id("")); // locator
		    assertTrue(!classValueField.getText().isEmpty());
	}

	@When("Admin clicks date picker")
	public void admin_clicks_date_picker() {
		WebElement classDateField = driver.findElement(By.id("")); // Date Picker locator
	    classDateField.click();
	
	}

	@Then("Admin should see weekends dates are disabled to select")
	public void admin_should_see_weekends_dates_are_disabled_to_select() {
		
		WebElement saturdayDate = driver.findElement(By.xpath("")); // Locator
	    WebElement sundayDate = driver.findElement(By.xpath("")); // Locator

	    assertTrue(saturdayDate.isDisplayed());
	    assertTrue(sundayDate.isDisplayed());

	}

	@When("Admin skips to add value in mandatory field and enter only the optional field")
	public void admin_skips_to_add_value_in_mandatory_field_and_enter_only_the_optional_field() {
		 WebElement classDescriptionField = driver.findElement(By.id("")); // locator
		    classDescriptionField.sendKeys("");

		    // Click the save button
		    WebElement saveButton = driver.findElement(By.id("")); // locator
		    saveButton.click();

	}

	@Then("Admin should see error message below the test field and the field will be highlighted in red color")
	public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighted_in_red_color() {
		WebElement errorMessage = driver.findElement(By.id("")); // locator
	    assertTrue(errorMessage.isDisplayed());

	    // Verify the field is highlighted
	    WebElement classNameField = driver.findElement(By.id("")); // locator
	    assertTrue(classNameField.getCssValue("border-color").equals("red"));
	 
	}

	@When("Admin enters invalid data in all of the  fields in the form and clicks on save button")
	public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_save_button() {
		
		WebElement classNameField = driver.findElement(By.id("")); //  locator
	    WebElement classDateField = driver.findElement(By.id("")); // locator
	    classNameField.sendKeys("1234");  // Invalid class name
	    classDateField.sendKeys("InvalidDate");  // Invalid date format

	    // Click the save button
	    WebElement saveButton = driver.findElement(By.id("")); // locator
	    saveButton.click();

	}

	@Then("Admin gets error message and class is not created")
	public void admin_gets_error_message_and_class_is_not_created() {
		WebElement errorMessage = driver.findElement(By.id("")); // locator
	    assertTrue(errorMessage.isDisplayed());

	    // Verify that the class is not created or check if class is still listed or not
	    WebElement newClass = driver.findElement(By.xpath("")); // locator
	    assertFalse(newClass.isDisplayed());
	
	}

	@When("Admin clicks on save button without entering data")
	public void admin_clicks_on_save_button_without_entering_data() {
		WebElement saveButton = driver.findElement(By.id("")); // locator
	    saveButton.click();
	   
	}

	@Then("Class will not  created and Admin gets error message")
	public void class_will_not_created_and_admin_gets_error_message() {
		
	    WebElement errorMessage = driver.findElement(By.id("")); // locator
	    assertTrue(errorMessage.isDisplayed());
	}

	@When("Admin clicks Cancel\\/Close\\(X) Icon on Admin Details form")
	public void admin_clicks_cancel_close_x_icon_on_admin_details_form() {
	
	}

	@Then("Class Details popup window should be closed without saving")
	public void class_details_popup_window_should_be_closed_without_saving() {
	 
	}

	@When("Admin clicks save button")
	public void admin_clicks_save_button() {
	  
	}

	@Then("Admin can see the class details popup closed and adding new class")
	public void admin_can_see_the_class_details_popup_closed_and_adding_new_class() {
	
	}



}
