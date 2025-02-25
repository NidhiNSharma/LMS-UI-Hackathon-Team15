package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class NoRecords {



@Given("Admin is on home page after Login")
public void admin_is_on_home_page_after_login() {
 System.out.println("Inside Step-Admin is on home page after Login" ); 
}

@When("Admin clicks {string} on the navigation bar")
public void admin_clicks_on_the_navigation_bar(String string) {
	System.out.println("Inside Step-Admin clicks {string} on the navigation bar" );
}

@Then("Admin should not see any pagination icons and message {string}")
public void admin_should_not_see_any_pagination_icons_and_message(String string) {
	System.out.println("Inside Step-Admin should not see any pagination icons and message {string}" );
}
}