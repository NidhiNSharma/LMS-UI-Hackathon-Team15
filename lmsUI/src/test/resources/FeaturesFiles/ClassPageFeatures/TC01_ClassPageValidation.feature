Feature: Class Page Validation

  Background: 
    Given Admin is logged into the home page
    When Admin clicks on the "Class" navigation bar
    
  @ClassNavigation
  Scenario: Navigate to Manage Class Page and Verify title,header and Search Bar
    Then Admin should see "LMS - Learning Management System" as the title
    And Admin should see "Manage Class" as the page header
    And Admin should see the search bar

  @ClassPage
  Scenario Outline: Verify Data Table Headers,Their positions,and Sort Icons
    Then Admin should see correctly spelled "<header>" in the data table
    And Admin should see a sort icon for the "<sort icon>" column
      | header            | sort icon         | position |
      | Batch Name        | Batch Name        |        1 |
      | Class Topic       | Class Topic       |        2 |
      | Class Description | Class Description |        3 |
      | Status            | Status            |        4 |
      | Class Date        | Class Date        |        5 |
      | Staff Name        | Staff Name        |        6 |
      | Edit/Delete       | Edit/Delete       |        7 |

  @ClassCheckBoxes
  Scenario: Verify Checkboxs default state beside Batch Name column header and beside each Batch Name in the data table
    Then Admin should see Checkboxs default state as unchecked beside Batch Name column header
    And Admin should see Checkboxs default state as unchecked on the left side in all rows against Batch Name

  @ClassPagination
  Scenario: Verify Pagination Controls and Text
    Then Admin should see pagination controls (Previous, Next, Page Numbers)
    And Admin should see "Total Classes: <number>" text at the bottom of the page
    And Admin should see a message if no Classes are available, like "No data found"

  @ClassDelete
  Scenario: Verify DELETE Button and Total Classes Count
    Then Admin should see a DELETE button under the Manage Class page header
    And Admin should see the total number of Classes below the data table
