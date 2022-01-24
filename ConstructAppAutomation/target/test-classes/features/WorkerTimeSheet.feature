#Author: Prashanthi
Feature: Construct App Worker TimeSheet Feature


  @smoke
  Scenario Outline: As a user, I should be able to see WorkerTimeSheet Screen
  
    
    When I click on hamburger menu
    And I click on worker timesheet button on home screen
   Then  I should see worker timesheet as title of the screen
    Then I should see worker name on the screen "<workername>"
    
    Examples:
    
    |workername             |
    |Prashanthi Sunkavall |
    
    
   
    
    
    
    
    
    
    
    

 