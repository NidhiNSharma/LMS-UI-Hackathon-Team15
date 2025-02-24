@program
Feature: Program Page Validation

  Background: 
    Given Admin is logged in to LMS Portal

  #Navigation
  Scenario: Verify that Admin is able to navigate to Program page
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should be navigated to Program page
  
  

  




  
