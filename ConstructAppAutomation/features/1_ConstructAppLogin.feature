#Author: Prashanthi
Feature: Construct 365 Field App Login Feature

#scenario 1
  @smoke @workerregression 
  Scenario Outline: User should be able to login to the app
  
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
    
    
   #scenario 2
  @smoke @workerregression 
  Scenario: User should be able to synchronize the data
  
    When I click on hamburger menu
    And I click on sync data
    And I click on begin synchronization button
    Then I verify the synchronization should be completed
   
  
    
    
    
    
    
    
    
    

 