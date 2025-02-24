package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;	
import io.cucumber.java.en.Then;	
import org.testng.Assert;

import driverFactory.BasePage;
import hooks.applicationHooks;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

	public class ClassPageValidationSteps  {  // extends BasePage {

/*		private final BasePage base;

		public ClassPageValidationSteps(BasePage base) {
			this.driver = applicationHooks.getDriver();
			this.base = base;
		}   */
		 WebDriver driver;

	    @SuppressWarnings("deprecation")
		@Given("Admin is logged into the home page")
	    public void admin_is_logged_into_the_home_page() {
	        driver = new ChromeDriver();
	        driver.get("https://feb-ui-hackathon-bbfd38d67ea9.herokuapp.com/");
	        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);  
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("username")).sendKeys("sdetnumpyninja@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Feb@2025");
	        
	       // Click the dropdown
	        WebElement dropdown = driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c161-3']"));
	        dropdown.click();  
	        
	     // Select the 'Admin' option
	        WebElement adminOption = driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Admin']"));
	        adminOption.click();  

	        // Get the selected option text
	        WebElement selectedOption = driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));
	        String selectedText = selectedOption.getText();

	        // Assert that the selected option is 'Admin'
	        Assert.assertEquals(selectedText, "Admin", "Expected 'Admin' to be selected.");
	        driver.findElement(By.id("login")).click();
	    }

	    @When("Admin clicks on the {string} navigation bar")
	    public void admin_clicks_on_the_navigation_bar(String navigationBar) {
	        WebElement navigationBarElement = driver.findElement(By.xpath("//span[normalize-space()='Class']"));
	        navigationBarElement.click();
	    }
	

	    @Then("Admin should see {string} as the title")
	    public void admin_should_see_as_the_title(String title) {
	    	   WebElement titleElement = driver.findElement(By.xpath("//span[normalize-space()='LMS - Learning Management System']"));
	           String actualTitle = titleElement.getText();
	           assertEquals(actualTitle, title);    
	    }

	    @Then("Admin should see {string} as the page header")
	    public void admin_should_see_as_the_page_header(String header) {
	    	 WebElement headerElement = driver.findElement(By.xpath("//div[normalize-space()='Manage Class']"));
	         String actualHeader = headerElement.getText();
	         assertEquals(actualHeader, header);
	     
	    }

	    @Then("Admin should see the search bar")
	    public void admin_should_see_the_search_bar() {    	
	    	WebElement searchBarElement = driver.findElement(By.xpath("//input[@id='filterGlobal']")) ;
	        assertTrue(searchBarElement.isDisplayed());
	   
	    }

	    @Then("Admin should see the datatable heading like Batchname,class topic,class description,status,class Date,staff name,Edit\\/Delete")
	    public void admin_should_see_the_datatable_heading_like_batchname_class_topic_class_description_status_class_date_staff_name_edit_delete() {    	
	    	 String[] expectedHeaders = {
	    		        "Batch Name", "Class Topic", "Class Description", 
	    		        "Status", "Class Date", "Staff Name", "Edit/Delete"
	    		    };

	    		    for (String header : expectedHeaders) {
	    		        WebElement headerElement = driver.findElement(By.xpath("//th[text()='" + header + "']"));
	    		        assertTrue(headerElement.isDisplayed(), "Header '" + header + "' is not visible in the table.");
	    		    }
	    		}
	    
	    
	    @Then("Admin should see the Sort icon of all the field in the datatable.")
	    public void admin_should_see_the_sort_icon_of_all_the_field_in_the_datatable() {
	    	 String[] headersWithSortIcon = {
	    		        "Batch Name", "Class Topic", "Class Description", 
	    		        "Status", "Class Date", "Staff Name", "Edit/Delete"
	    		    };

	    		    for (String header : headersWithSortIcon) {
	    		        WebElement sortIcon = driver.findElement(By.xpath("//th[text()='" + header + "']/following-sibling::th//i[contains(@class, 'sort-icon')]"));
	    		        
	    		        assertTrue(sortIcon.isDisplayed(), "Sort icon for '" + header + "' is not visible.");
	    		    }
	    		}
	   

	    @Then("Admin should see Checkbox default state as unchecked beside Batch Name column header")
	    public void admin_should_see_checkbox_default_state_as_unchecked_beside_batch_name_column_header(String columnName) {
	        WebElement checkboxElement = driver.findElement(By.xpath("/html/body/app-root/app-session/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]"));
	        assertFalse(checkboxElement.isSelected());
	   
	    }

	    @Then("Admin should see Checkboxs default state as unchecked on the left side in all rows against Batch Name")
	    public void admin_should_see_checkboxs_default_state_as_unchecked_on_the_left_side_in_all_rows_against_batch_name(String columnName) {    	
	    	   List<WebElement> checkboxes = driver.findElements(By.xpath("//td[contains(text(),'" + columnName + "')]//preceding-sibling::td//input[@type='checkbox']"));
	           for (WebElement checkbox : checkboxes) 
	               assertFalse(checkbox.isSelected());
	      
	    }

	    @Then("Admin should see pagination controls \\(Previous, Next, Page Numbers)")
	    public void admin_should_see_pagination_controls_previous_next_page_numbers() {
	        WebElement prevButton = driver.findElement(By.id("")); //locator
	        WebElement nextButton = driver.findElement(By.id("")); //locator
	        WebElement pageNumbers = driver.findElement(By.id("")); //locator
	        
	        assertTrue(prevButton.isDisplayed());
	        assertTrue(nextButton.isDisplayed());
	        assertTrue(pageNumbers.isDisplayed());
	       
	    }
	    
	    @Then("Admin should see the text {string}")
	    public void admin_should_see_the_text(String text) {
	    	    WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]"));
	    	    
	    	    // Assert that the element is visible
	    	    assertTrue(element.isDisplayed(), "Text '" + text + "' is not visible on the page.");
	    	}
	     
	    @Then("enabled pagination controls under the data table")
	    public void enabled_pagination_controls_under_the_data_table() {
	    
	    	    WebElement paginationContainer = driver.findElement(By.xpath("//div[@class='pagination']"));
	    	    assertTrue(paginationContainer.isDisplayed(), "Pagination controls are not visible.");
	    	    
	    	    WebElement nextButton = driver.findElement(By.xpath("//button[contains(@class, 'next') and not(contains(@class, 'disabled'))]"));
	    	    assertTrue(nextButton.isEnabled(), "'Next' button is not enabled.");
	    	    
	    	    WebElement prevButton = driver.findElement(By.xpath(""));
	    	    assertTrue(prevButton.isEnabled(), "'Previous' button is not enabled.");
	    	    
	    	    List<WebElement> pageNumbers = driver.findElements(By.xpath("//div[@class='pagination']//a[contains(@class, 'page-number')]"));
	    	    assertTrue(pageNumbers.size() > 0, "Page numbers are not visible.");
	    	}


	    @Then("Admin should see {string} text at the bottom of the page")
	    public void admin_should_see_text_at_the_bottom_of_the_page(String text) {
	    	 WebElement textElement = driver.findElement(By.xpath("//div[contains(text(),'In total there are 17 classes." + text + "')]"));
	         assertTrue(textElement.isDisplayed());
	
	    }


	    @Then("Admin should see a DELETE button under the Manage Class page header")
	    public void admin_should_see_a_delete_button_undar_the_manage_class_page_header() {
	    	
	    	 WebElement deleteButton = driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']")); 
	         assertTrue(deleteButton.isDisplayed());
	     
	    }

	    @Then("Admin should see the total number of Classes below the data table")
	    public void admin_should_see_the_total_number_of_classes_below_the_data_table() {
	    	
	    	 WebElement totalClassesElement = driver.findElement(By.xpath("//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']"));
	         assertTrue(totalClassesElement.isDisplayed());
	
	    }

	}

	    



