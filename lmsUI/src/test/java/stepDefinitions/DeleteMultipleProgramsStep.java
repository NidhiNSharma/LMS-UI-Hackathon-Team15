package stepDefinitions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import pageObjects.ProgramPagePart2;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteMultipleProgramsStep {
	public ProgramPagePart2 pp = new ProgramPagePart2();
	
	@Given("Admin creates multiple programs with name containing {string}")
	public void create_multiple_programs_on_program_page(String programName) throws InterruptedException {
		pp.createProgram(programName+pp.getRandomString(5));
		pp.createProgram(programName+pp.getRandomString(5));
		System.out.println("Create program on program page");
	}


	@When("Admin selects more than one program by clicking on the checkbox")
	public void admin_selects_more_than_one_program_by_clicking_on_the_checkbox() {
		pp.clickOncheckBoxes(2);
	}
	

	@Then("Programs get selected")
	public void programs_get_selected() {
		Assert.assertTrue(pp.areMultipleProgramsSelected());
	}

	@When("Admin clicks on the delete button on the left top of the program page")
	public void admin_clicks_on_the_delete_button_on_the_left_top_of_the_program_page() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.multiDeleteButton));
		pp.clickElement(pp.multiDeleteButton); 
		System.out.println("Inside Step-Admin clicks on the delete button on the left top of the program page");
	}

	@Then("Admin lands on Confirmation form")
	public void admin_lands_on_confirmation_form() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.confirmationDialogBox));
		System.out.println("Inside Step-Admin lands on Confirmation form");
	}

	@Given("Admin is on Confirmation form")
	public void admin_is_on_confirmation_form() {
		Assert.assertTrue(pp.validateElementDisplayed(pp.confirmationDialogBox));
		Assert.assertTrue(pp.validateElementDisplayed(pp.deleteModelInfoIcon));
		Assert.assertEquals(pp.getTextForElement(pp.dialogBoxTitle),"Confirm");
		Assert.assertEquals(pp.getTextForElement(pp.dialogwarningMessage),"Are you sure you want to delete the selected programs?");
				System.out.println("Inside Step-Admin is on Confirmation form");
	}
	
	@Given("Admin is on Confirmation form for deleting")
	public void admin_is_on_confirmation_form_for_deleting() {
		pp.clickElement(pp.multiDeleteButton);
		Assert.assertTrue(pp.validateElementDisplayed(pp.confirmationDialogBox));
		Assert.assertTrue(pp.validateElementDisplayed(pp.deleteModelInfoIcon));
		Assert.assertEquals(pp.getTextForElement(pp.dialogBoxTitle),"Confirm");
		Assert.assertEquals(pp.getTextForElement(pp.dialogwarningMessage),"Are you sure you want to delete the selected programs?");
				System.out.println("Inside Step-Admin is on Confirmation form for deleting");
	}

	@Then("Admin can see Programs are still selected and not deleted")
	public void admin_can_see_programs_are_still_selected_and_not_deleted() {
		Assert.assertTrue(pp.areMultipleProgramsSelected());
		System.out.println("Inside Step-Admin can see Programs are still selected and not deleted");
	}

	@Given("Admin is on Program Confirm Deletion Page after selecting a program to delet")
	public void admin_is_on_program_confirm_deletion_page_after_selecting_a_program_to_delet() {
		pp.clickElement(pp.multiDeleteButton);
		Assert.assertTrue(pp.validateElementDisplayed(pp.confirmationDialogBox));
		Assert.assertTrue(pp.validateElementDisplayed(pp.deleteModelInfoIcon));
		Assert.assertEquals(pp.getTextForElement(pp.dialogBoxTitle),"Confirm");
		Assert.assertEquals(pp.getTextForElement(pp.dialogwarningMessage),"Are you sure you want to delete the selected programs?");		
		System.out.println("Inside Step-Admin is on Program Confirm Deletion Page after selecting a program to delet");
	}




























}




