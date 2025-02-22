@Navigation
Feature: Navigation Validation from Manage Class to other Pages

  Background: 
    Given Admin is on home page after Login and clicks Class on the navigation bar

  Scenario: Class link on navigation bar
    Given Admin is on the Manage Class Page
    When Admin clicks on Class link on Manage Class page
    Then Admin is redirected to class page

  @Navigation
  Scenario: Class link to other page on navigation bar
    Given Admin is on the Manage Class Page
    When Admin clicks on any page link on Manage Class page
    Then Admin is redirected to which page link they clicked.

  @Navigation
  Scenario: Logout link on navigation bar
    Given Admin is on the Manage Class Page
    When Admin clicks on Logout link on Manage class page
    Then Admin is redirected to Login page
