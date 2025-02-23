Feature: Manage Program - Delete Multiple Program

  Background: 
    Given Admin is on program page after reaching home

  Scenario: Verify Admin is able to select multiple programs
    Given Admin is on Program page
    When Admin selects more than one program by clicking on the checkbox
    Then Programs get selected

  Scenario: Verify Admin is able to delete Multiple programs
    Given Admin is on Program page
    When Admin clicks on the delete button on the left top of the program page
    Then Admin lands on Confirmation form
    
     Scenario: Verify Admin is able to click 'No'
    Given Admin is on Confirmation form
    When Admin clicks on "No" button
    Then Admin can see Programs are still selected and not deleted
    
    Scenario: Verify Admin is able to close the window with "X"
    Given Admin is on Program Confirm Deletion Page after selecting a program to delet
    When Admin Click on "X" button
    Then Admin can see Confirm Deletion form disappear
    

  Scenario: Verify Admin is able to click 'Yes'
    Given Admin is on Confirmation form for deleting
    When Admin clicks on "Yes" button
    Then Admin can see "Successful  program deleted" message

  Scenario: Verify Admin is able to deleted program
    Given Admin is on Program page
    When Admin Searches for "Deleted Program names"
    Then There should be zero results.

 
  