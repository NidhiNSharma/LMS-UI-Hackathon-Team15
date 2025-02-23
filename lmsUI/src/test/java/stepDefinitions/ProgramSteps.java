package stepDefinitions;

import org.testng.Assert;

import driverFactory.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPage;
import util.LoggerLoad;
import util.PicoDInjection;

public class ProgramSteps {
	
	PicoDInjection picoObject;
    
	   public ProgramSteps(PicoDInjection picoObject){
	    	this.picoObject=picoObject;	 
	   }

	@Given("Admin is logged in to LMS Portal")
	public void admin_is_logged_in_to_lms_portal() {
	    LoggerLoad.info("Admin logged in to LMS Portal");
	}

	//-----#Navigation--------
	@Given("Admin is on home page after Login")
	public void admin_is_on_home_page_after_login() {
		
		picoObject.programPage= new ProgramPage( BasePage.getDriver());		
		LoggerLoad.info("Admin is on home page after login");
		
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String Program) {
	    picoObject.programPage.clickProgramButton();
	    LoggerLoad.info("Admin clicked on " + Program + "from navigation bar");
	}

	@Then("Admin should be navigated to Program page")
	public void admin_should_be_navigated_to_program_page() {
	    LoggerLoad.info("Admin got navigated to Program page");
	}
	
	//-----@Menubar------------
	//#1 logout
	@Then("Admin should see Logout in menu bar")
	public void admin_should_see_logout_in_menu_bar() {
		Assert.assertTrue(picoObject.programPage.logoutButtonPresence()); 
	}

	//#2 header
	@Then("Admin should see the heading {string}")
	public void admin_should_see_the_heading(String string) {
		Assert.assertEquals(picoObject.programPage.validateHeader(), " LMS - Learning Management System ");
		LoggerLoad.info("Admin see a heading with text " + picoObject.programPage.validateHeader() + " on the page");
	}

	//#3
	@Then("Admin should see the page names as in order {string}")
	public void admin_should_see_the_page_names_as_in_order(String string) {
	    
	}

	//#4 Add New Program
	@Then("Admin should see sub menu in menu bar as {string}")
	public void admin_should_see_sub_menu_in_menu_bar_as(String string) {
		Assert.assertEquals(picoObject.programPage.addProgramButtonValidation(), "A New Program");
		LoggerLoad.info("Admin should see sub menu " +picoObject.programPage.addProgramButtonValidation()+" on the program page under Program tab");
	}
	
	//#5 Manage program string
	@Then("Admin should see the heading as {string}")
	public void admin_should_see_the_heading_as(String string) {
	    Assert.assertEquals(picoObject.programPage.validateManageProgram()," Manage Program");
	    LoggerLoad.info("Admin should see the heading as "+ picoObject.programPage.validateManageProgram());
	}

	//#6 see Program name, description, and status
	@Then("Admin should able to see Program name, description, and status for each program")
	public void admin_should_able_to_see_program_name_description_and_status_for_each_program() {
	    
	}

	//#7 delete icon
	@Then("Admin should see a Delete button in left top is disabled")
	public void admin_should_see_a_delete_button_in_left_top_is_disabled() {
	    Assert.assertFalse(picoObject.programPage.deleteIconValidation());
	    LoggerLoad.info("Admin should see Delete button in left top is disabled");
	}

	//#8 search bar
	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String string) {
		Assert.assertEquals(picoObject.programPage.searchBoxValidation(), "Search...");
		LoggerLoad.info("Admin should see Search bar with text as " +picoObject.programPage.searchBoxValidation()+".");
	}

	//#9 
	@Then("Admin should see data table with column header on the Manage Program Page as  Program Name, Program Description, Program Status, Edit\\/Delete")
	public void admin_should_see_data_table_with_column_header_on_the_manage_program_page_as_program_name_program_description_program_status_edit_delete() {
	    
	}

	//#10
	@Then("Admin should see checkbox default state as unchecked beside Program Name column header")
	public void admin_should_see_checkbox_default_state_as_unchecked_beside_program_name_column_header() {
	    Assert.assertFalse(picoObject.programPage.checkBoxDefaultStatus());
	    LoggerLoad.info("Admin should see checkbox default state as unchecked beside Program Name column header");
	}

	//#11
	@Then("Admin should see check box default state as unchecked on the left side in all rows against program name")
	public void admin_should_see_check_box_default_state_as_unchecked_on_the_left_side_in_all_rows_against_program_name() {
		
	}

	//#12
	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	    
	}

	//#13
	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	
	}

	//#14 Showing x to x of y entries
	@Then("{string}{string}\" along with Pagination icon below the table.")
	public void along_with_pagination_icon_below_the_table(String string, String string2) {
		String rowsInfo =picoObject.programPage.numberOfRecordstextValidate();
		String[] items = rowsInfo.split(" "); // e.g. Showing 1 to 5 of 7 entries
	    Assert.assertTrue(items.length == 10 && items[0].equals("Showing")&& items[2].equals("to")&& items[4].equals("of")&& items[6].equals("entries"));
	    LoggerLoad.info("Admin should see the text as "+ picoObject.programPage.numberOfRecordstextValidate()+" along with Pagination icon below the table");
	}

	//#15 footer
	@Then("Admin should see the footer as \"\"In total there are z programs\"\".")
	public void admin_should_see_the_footer_as_in_total_there_are_z_programs() {
		LoggerLoad.info("Footer Message ------>"+picoObject.programPage.getFooterMessage());
		Assert.assertTrue(picoObject.programPage.getFooterMessage().startsWith("In total there are ") && picoObject.programPage.getFooterMessage().endsWith(" programs."));
	}
	
}
