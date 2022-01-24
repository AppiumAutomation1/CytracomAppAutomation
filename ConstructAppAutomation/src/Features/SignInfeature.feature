#Author: your.email@your.domain.com
Feature: Guru99 Signin page


  
  #Scenario: User should be able to login with valid credentials
  
    #Given I am in edge browser
    #And I want to launch the application
    #When I will enter email id
    #And I will click submit button
    #Then I validate the user is logged in properly
    
    
    #Scenario 1
    Scenario Outline: User should be able to login with valid credentials using test data
  
    Given I am in edge browser
    And I want to launch the application
    When I will enter email id in text box "<emailId>"
    And I will click submit button
    Then I validate the user is logged in properly
    And Click on back button

    
    
    
 Examples:
    |  emailId                           |   
    |  prashanthi123@gmail.com         |
    |  prashanthi123456@gmail.com         |
    
    
    
    
    
    
    
    

 