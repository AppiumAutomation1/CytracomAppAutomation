#Author: Prashanthi
Feature: Construct Aapp Login Feature


  @smoke
  Scenario Outline: As a user, I should be able to login to the dashboard
  
    Given I am in app splash screen
    And I click on skip button
    And I want to click the login button
    And I click on continue button
    When I enter email id "<emailid>"
    And I enter password "<password>"
    
    When I click on signin button
    And I click on no for biometric
    #Then I should see home screen
    
    Examples:
    
    |emailid             |password|
    |psunkavalli@sisn.com|Ct@PS2021!|
    
    
   
    
    
    
    
    
    
    
    

 