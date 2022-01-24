#Author: Prashanthi
Feature: Construct 365 Field App Dashboard Feature

#scenario 1
  
 Scenario: User should be able to see the tabs on home screen
  
    Given I am in app splash screen
    And I should see the tabs to navigate to different timesheets
    
    
    
    
   #scenario 2
  
  Scenario: User should be able to see different timesheet statuses in home screen
  
    Then I should see the four statuses on home screen
    
    
   Scenario Outline: As a User, I should be able to see the worker details
   
    Then I should see worker name on the screen "<workername>"
   
    
    Examples:
    
    |workername             | 
    |Prashanthi Sunkavalli | 
    
    
   Scenario: As A User, I should see the expenses summary
   
   Then I should see the expenses summary donut chart
   
   Scenario: As as user, I should see the hours summary
   
   Then I should see the hours summary bar graphs
   
   Scenario: As a user, I should navigate to all timesheets from home screen
   
   Then I should be able to navigate to timesheets screen
   
   Scenario: As a user, I should navigate to worker timesheet from home screen
   
   Then I should be able to navigate to worker timesheet screen
   
   Scenario: As a user, I should navigate to crew timesheet from home screen
   
   Then I should be able to navigate to crew timesheet screen
   
   Scenario: As a user, I should navigate to Template timesheet from home screen
   
   Then I should be able to navigate to template timesheet screen
   
   Scenario: As a user, I should navigate to my profile from home screen
   
   Then I should be able to navigate to my profile screen
   
   
  
    
    
    
    
    
    
    
    

 