#Author: your.email@your.domain.com
Feature: Guru99 Insurance page


  
  Scenario: User should be able to navigate to Insurance screen
  
    
    And I want to launch the application
    When I click on insurance link
    Then I should be able to navigate properly
    
    
    
    
    #Scenario 1
    Scenario Outline: User should be able to login into insurance
  
   
    When I will enter email id in insurance page"<emailId>"
    And I will enter password in insurance page"<password>"
    And I will click login button
    Then I validate the user is logged in properly in insurance
   
    
    
    
 Examples:
    |  emailId                           |   password  |
    |  prashanthi123@gmail.com         |     123456    |
    
    
    
    
    
    
    
    

 