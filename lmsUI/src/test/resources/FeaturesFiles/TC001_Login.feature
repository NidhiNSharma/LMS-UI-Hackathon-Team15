Feature: Login  Page Verification 

Background:
        Given Admin is on login Page
    
  Scenario: Verify Admin is able to land on login page
  		Given The browser is open
  		When Admin gives the correct LMS portal URL
  		Then Admin should land on the login page
  
  Scenario: Validate login with valid data in all field	
  		Given Admin is on login Page
  		When Admin enter valid data in all field and clicks login button 
  		Then Admin should land on home page 