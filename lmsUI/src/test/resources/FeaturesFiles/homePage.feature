Feature: Home Page Validations for LMS

  Background: Admin logs into the LMS portal
    Given Admin gives the correct LMS portal URL
    And Admin is on the login page
    When Admin enters valid data in all fields
    And Admin clicks the login button

  Scenario: Verify LMS title is displayed correctly
    Then Admin should see "LMS - Learning Management System" as the title

  Scenario: Verify LMS title alignment
    Then LMS title should be on the top left corner of the page

  Scenario: Validate navigation bar text
    Then Admin should see correct spelling in the navigation bar text

  Scenario: Validate LMS title spelling and spacing
    Then Admin should see correct spelling and spacing in LMS title

  Scenario: Validate navigation bar alignment
    Then Admin should see the navigation bar text on the top right side

  Scenario: Validate navigation bar order - Home is 1st
    Then Admin should see "Home" in the 1st place

  Scenario: Validate navigation bar order - Program is 2nd
    Then Admin should see "Program" in the 2nd place
