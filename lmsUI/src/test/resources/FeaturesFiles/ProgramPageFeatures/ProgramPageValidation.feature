@Program
Feature: Program Page Validation

  Background: 
    Given Admin is logged in to LMS Portal

  #Navigation
  Scenario: Verify that Admin is able to navigate to Program page
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should be navigated to Program page
  
  #MenuBar
  Scenario: Verify Logout displayed in menu bar
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see Logout in menu bar
    
  #MenuBar  
  Scenario: Verify heading in menu bar
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the heading "LMS - Learning Management System"
  
  #MenuBar  
  Scenario: Verify other page's name displayed in menu bar
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the page names as in order "Home Program Batch Class "
  
  #MenuBar  
  Scenario: Verify sub menu displayed in program menu bar
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see sub menu in menu bar as "Add New Program"
    
  #Manage Program
  Scenario: Verify heading in manage program
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the heading "Manage Program"
    
  #Manage Program
  Scenario: Verify view details of programs
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should able to see Program name, description, and status for each program
    
  #Manage Program
  Scenario: Verify the Multiple Delete button state 
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a Delete button in left top is disabled
    
  #Manage Program
  Scenario: Verify the Search button  
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see Search bar with text as "Search..."
    
  #Manage Program
  Scenario: Verify column header name of data table  
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see data table with column header on the Manage Program Page as  Program Name, Program Description, Program Status, Edit/Delete

  #Manage Program
  Scenario: Verify checkbox default state beside Program Name column header
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see checkbox default state as unchecked beside Program Name column header 
  
  #Manage Program
  Scenario: Verify checkboxes default state beside each Program names in the data table   
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see check box default state as unchecked on the left side in all rows against program name 
  
  #Manage Program
  Scenario: Verify Sort icon in manage program  
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the sort arrow icon beside to each column header except Edit and Delete 
  
  #Manage Program
  Scenario: Verify edit and delete icon in manage program  
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the Edit and Delete buttons on each row of the data table
    
  #Manage Program
  Scenario: Verify pagination icons below data table in manage program  
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then "Admin should see the text as ""Showing x to y of z entries"" along with Pagination icon below the table. 

  #Manage Program
  Scenario: Verify footer message in manage program  
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then "Admin should see the footer as ""In total there are z programs"".







  
