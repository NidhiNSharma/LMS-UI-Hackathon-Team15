package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverFactory.BasePage;
import pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.PicoDInjection;

public class LoginSteps{
	
	    WebDriver driver; 
	    LoginPage loginPage;
	
	    public LoginSteps() {  // Constructor ensures correct driver usage
	        this.driver = BasePage.getDriver("chrome");
	        loginPage = new LoginPage(driver);
	    }

	@Given("Admin is on login Page")
	public void admin_is_on_login_page() {
	    
	}

	@Given("The browser is open")
	public void the_browser_is_open() {
	   
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() throws InterruptedException {
		
		loginPage= new LoginPage(driver);		
		loginPage.navigateToAppUrl();
		System.out.println("pass");
	}

	@Then("Admin should land on the login page")
	public void admin_should_land_on_the_login_page() {
	    
	}

	@When("Admin enter valid data in all field and clicks login button")
	public void admin_enter_valid_data_in_all_field_and_clicks_login_button() {
	    
	}

	@Then("Admin should land on home page")
	public void admin_should_land_on_home_page() {
	   
	}



}
