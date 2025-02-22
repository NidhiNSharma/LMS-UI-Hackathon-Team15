@SearchBox
Feature: Search box

  Background: 
    Given Admin Is on the Manage Class Page after login

  Scenario: Search class by Batch Name
    Given Admin is on the Manage Class Page
    When Admin enter the Batch Name in search textbox
    Then Admin should see Class details are searched by Batch Name

  @SearchBox
  Scenario: Search class by Class topic
    Given Admin is on the Manage Class Page
    When Admin enter the Class topic in search textbox
    Then Admin should see Class details are searched by Class topic

  @SearchBox
  Scenario: Search class by Staff Name
    Given Admin is on the Manage Class Page
    When Admin enter the Staff Name in search textbox
    Then Admin should see Class details are searched by Staff name
