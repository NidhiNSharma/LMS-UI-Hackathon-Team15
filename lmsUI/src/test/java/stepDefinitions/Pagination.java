package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPagePart2;
public class Pagination {

	public ProgramPagePart2 pp = new ProgramPagePart2();

	@When("Admin clicks Next page link on the program table")
	public void admin_clicks_next_page_link_on_the_program_table() {
		pp.clickElement(pp.nextButton);
		System.out.println("Inside Step-Admin clicks Next page link on the program table"); 
	}

	@Then("Admin should see the Pagination has {string} active link")
	public void admin_should_see_the_pagination_has_active_link(String string) {
		// String activeLink = pp.getActivePaginationLink();
		// Assert.assertEquals("Active link doesn't match", expectedActiveLink, activeLink);
		System.out.println("Inside Step-Admin should see the Pagination has {string} active link"); 
	}

	@When("Admin clicks Last page link")
	public void admin_clicks_last_page_link() {
		System.out.println("Inside Step-Admin clicks Last page link"); 
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
		System.out.println("Inside Step-Admin should see the last page record on the table with Next page link are disabled"); 
	}

	@Given("Admin is on last page of Program page table")
	public void admin_is_on_last_page_of_program_page_table() {
		System.out.println("Inside Step-Admin is on last page of Program page table"); 
	}

	@When("Admin clicks Previous page link")
	public void admin_clicks_previous_page_link() {
		System.out.println("Inside Step-Admin clicks Previous page link"); 
	}

	@Then("Admin should see the previous page record on the table with pagination has previous page link")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
		System.out.println("Inside Step-Admin should see the previous page record on the table with pagination has previous page link"); 
	}

	@When("Admin clicks First page link")
	public void admin_clicks_first_page_link() {
		System.out.println("Inside Step-Admin clicks First page link"); 
	}

	@Then("Admin should see the very first page record on the table with Previous page link are disabled")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
		System.out.println("Inside Step-Admin should see the very first page record on the table with Previous page link are disabled"); 
	}


}