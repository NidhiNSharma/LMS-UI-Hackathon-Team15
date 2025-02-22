package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

	public class ClassPageValidationSteps {

	    WebDriver driver; 
	    
	    @Given("Admin is logged into the home page")
	    public void admin_is_logged_into_the_home_page() {
	    	driver = new ChromeDriver();
	        driver.get("https://feb-ui-hackathon-bbfd38d67ea9.herokuapp.com/");
	        driver.manage().timeouts().implicitlyWait(null);
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("sdetnumpyninja@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Feb@2025"); 
	        WebElement dropdown = driver.findElement(By.xpath("/html[1]/body[1]")); //
	        Select select = new Select(dropdown);
	        select.selectByVisibleText("Admin");
	        String selectedOption = select.getFirstSelectedOption().getText();
	        Assert.assertEquals(selectedOption, "Admin", "Expected 'Admin' to be selected.");
	        driver.findElement(By.id("login")).click();
	    }
	   

	    @When("Admin clicks on the {string} navigation bar")
	    public void admin_clicks_on_the_navigation_bar(String string) {  	 
	    	  // WebElement navigationBarElement = driver.findElement(By.linkText(navigationBar));// locator
	          // navigationBarElement.click();
	    	
	    	driver.findElement(By.xpath("/html/body/app-root/app-header/mat-toolbar/div/button[4]/span[1]")).click();
	    }


	    @Then("Admin should see {string} as the title")
	    public void admin_should_see_as_the_title(String title) {
	    	   WebElement titleElement = driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
	           String actualTitle = titleElement.getText();
	           assertEquals(actualTitle, title);
	       
	    }

	    @Then("Admin should see {string} as the page header")
	    public void admin_should_see_as_the_page_header(String header) {
	    	 WebElement headerElement = driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
	         String actualHeader = headerElement.getText();
	         assertEquals(actualHeader, header);
	     
	    }

	    @Then("Admin should see the search bar")
	    public void admin_should_see_the_search_bar() {    	
	    	WebElement searchBarElement = driver.findElement(By.xpath("//*[@id=\"filterGlobal\"]"));
	        assertTrue(searchBarElement.isDisplayed());
	   
	    }

	    @Then("Admin should see correctly spelled {string} in the data table")
	    public void admin_should_see_correctly_spelled_in_the_data_table(String header) {
	    	
	    	 WebElement headerElement = driver.findElement(By.xpath("//th[text()='" + header + "']"));
	         assertTrue(headerElement.isDisplayed());
	      
	    }

	    @Then("Admin should see a sort icon for the Data Table column")
	    public void admin_should_see_a_sort_icon_for_the_column(String string, io.cucumber.datatable.DataTable dataTable) {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	        throw new io.cucumber.java.PendingException();
	    }

	    @Then("Admin should see Checkboxs default state as unchecked beside Batch Name column header")
	    public void admin_should_see_checkboxs_default_state_as_unchecked_beside_batch_name_column_header(String columnName) {
	        WebElement checkboxElement = driver.findElement(By.xpath("//th[text()='" + columnName + "']//input[@type='checkbox']"));
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

	    @Then("Admin should see {string} text at the bottom of the page")
	    public void admin_should_see_text_at_the_bottom_of_the_page(String text) {
	    	 WebElement textElement = driver.findElement(By.xpath("//div[contains(text(),'" + text + "')]"));
	         assertTrue(textElement.isDisplayed());
	
	    }

	    @Then("Admin should see a message if no Classes are available, like {string}")
	    public void admin_should_see_a_message_if_no_classes_are_available_like(String message) {
	    	   WebElement noClassesMessage = driver.findElement(By.xpath("//div[contains(text(),'" + message + "')]"));
	           assertTrue(noClassesMessage.isDisplayed());
	 
	    }

	    @Then("Admin should see a DELETE button under the Manage Class page header")
	    public void admin_should_see_a_delete_button_undar_the_manage_class_page_header() {
	    	
	    	 WebElement deleteButton = driver.findElement(By.xpath("/html/body/app-root/app-session/div/mat-card/mat-card-title/div[2]/div[1]/button/span[1]")); 
	         assertTrue(deleteButton.isDisplayed());
	     
	    }

	    @Then("Admin should see the total number of Classes below the data table")
	    public void admin_should_see_the_total_number_of_classes_below_the_data_table() {
	    	
	    	 WebElement totalClassesElement = driver.findElement(By.xpath("/html/body/app-root/app-session/div/mat-card/mat-card-content/p-table/div/div[2]/div"));
	         assertTrue(totalClassesElement.isDisplayed());
	
	    }

	}

	    



