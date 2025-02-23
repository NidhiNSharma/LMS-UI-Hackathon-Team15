package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.ProgramPagePart2;
public class Searchbar {
	public ProgramPagePart2 pp = new ProgramPagePart2();

@When("Admin enter the program to search By program name")
public void admin_enter_the_program_to_search_by_program_name() {
	pp.searchProgram("XYZ");
	
	System.out.println("Inside Step-Admin enter the program to search By program name");
}

@Then("Admin should able to see Program name, description, and status for searched program name")
public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_name() {
	Assert.assertEquals(pp.getTextForElement(pp.programNameCells),"teamthreetribew");
	Assert.assertEquals(pp.getTextForElement(pp.programDescriptionCells),"Advanced level SAP");
	Assert.assertEquals(pp.getTextForElement(pp.programStatusCells),"Active");
	System.out.println("Inside Step-Admin should able to see Program name, description, and status for searched program name");
}

@When("Admin enter the program to search By program description")
public void admin_enter_the_program_to_search_by_program_description() {
	pp.searchProgram("XYZ");

	System.out.println("Inside Step-Admin enter the program to search By program description");
}

@Then("Admin should able to see Program name, description, and status for searched program description")
public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_description() {
	Assert.assertEquals(pp.getTextForElement(pp.programNameCells),"teamthreetribew");
	Assert.assertEquals(pp.getTextForElement(pp.programDescriptionCells),"Advanced level SAP");
	Assert.assertEquals(pp.getTextForElement(pp.programStatusCells),"Active");
	System.out.println("Inside Step-Admin should able to see Program name, description, and status for searched program description");
}

@When("Admin enter the program to search By program namethat does not exist")
public void admin_enter_the_program_to_search_by_program_namethat_does_not_exist() {
	pp.searchProgram("XYZ");
System.out.println("Inside Step-Admin enter the program to search By program namethat does not exist");
}

@When("Admin enter the program to search By partial name of program")
public void admin_enter_the_program_to_search_by_partial_name_of_program() {
	pp.searchProgram("XYZ");
System.out.println("Inside Step-Admin enter the program to search By partial name of program");
}

}

