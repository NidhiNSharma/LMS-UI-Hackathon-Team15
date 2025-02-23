package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.ProgramPagePart2;

public class DeleteProgramStep {
	public ProgramPagePart2 pp = new ProgramPagePart2();

	@Given("Admin is on program page after reaching home")
	public void admin_is_on_program_page_after_reaching_home() {
		pp.clickOnProgramPageLink();		
		System.out.println("Inside Step-Admin is on program page after reaching home");
	}

	@Given("Admin is on Program page")
	public void admin_is_on_program_page() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.programPageTitle));
		Assert.assertEquals(pp.getTextForElement(pp.programPageTitle), "Manage Program");
		System.out.println("Inside Step-Admin is on Program page");
	}

	@When("Admin clicks on delete button for a program")
	public void admin_clicks_on_delete_button_for_a_program() {
		pp.clickElement(pp.deleteButtons);
		System.out.println("Inside Step-Admin clicks on delete button for a program");
	}

	@Then("Admin will get confirm deletion popup")
	public void admin_will_get_confirm_deletion_popup() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.confirmationDialogBox));
		Assert.assertTrue(pp.validateElementDisplayed(pp.deleteModelInfoIcon));
		Assert.assertEquals(pp.getTextForElement(pp.dialogBoxTitle),"Confirm");
		// Assert.assertEquals(pp.getTextForElement(pp.dialogwarningMessage),"Are you sure you want to delete PhythonPlayWright");
		System.out.println("Inside Step-Admin will get confirm deletion popup");
	}

	@Given("Admin is on Confirm deletion form")
	public void admin_is_on_confirm_deletion_form() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.confirmationDialogBox));
		Assert.assertTrue(pp.validateElementDisplayed(pp.deleteModelInfoIcon));
		Assert.assertEquals(pp.getTextForElement(pp.dialogBoxTitle),"Confirm");
		// Assert.assertEquals(pp.getTextForElement(pp.dialogwarningMessage),"Are you sure you want to delete PhythonPlayWright");
		System.out.println("Inside Step-Admin is on Confirm deletion form");
	}

	@When("Admin clicks on {string} button")
	public void admin_clicks_on_button(String string) {

		if(string == "yes") {
			pp.clickElement(pp.dialogBoxYesButton);
		}
		else if(string =="no") {
			pp.clickElement(pp.dialogBoxNoButton);
		}
		else if(string =="X") {
			pp.clickElement(pp.dialogBoxclose);
		}
		else {
			System.err.println("Button name is not defined " + string);
		}
		System.out.println("Inside Step-Admin clicks on {string} button");
	}

	@Then("Admin can see {string} message")
	public void admin_can_see_message(String string) {
		Assert.assertTrue(pp.validateElementDisplayed(pp.successAlert));
		System.out.println("Inside Step-Admin can see {string} message");
	}

	@When("Admin Searches for {string}")
	public void admin_searches_for(String programName) {
		pp.searchProgram(programName);
		System.out.println("Inside Step-Admin Searches for {string}");
	}

	@Then("There should be zero results.")
	public void there_should_be_zero_results() {
		Assert.assertFalse(pp.validateElementDisplayed(pp.programTableRows));
		Assert.assertEquals(pp.getTextForElement(pp.totalNumberOfPrograms)," showing 0 to 0 of 0 entries"); 
		System.out.println("Inside Step-There should be zero results.");
	}

	@Given("Admin is on Program Confirm Deletion Page after selecting a program to delete")
	public void admin_is_on_program_confirm_deletion_page_after_selecting_a_program_to_delete() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.successAlert));
		System.out.println("Inside Step-Admin is on Program Confirm Deletion Page after selecting a program to delete");
	}

	@Then("Admin can see Confirmation form disappears")
	public void admin_can_see_confirmation_form_disappears() {
		Assert.assertFalse(pp.validateElementDisplayed(pp.successAlert));
		System.out.println("Inside Step-Admin can see Confirmation form disappears");
	}

}