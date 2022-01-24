#Author: Prashanthi
Feature: Construct 365 Field App Template TimeSheet Production Feature

#scenario 1 
   @smoke   @templateregression
  Scenario: As a User, I should be able to see production Screen
  
    
    When I click on production button
     #Then  I should see production as title of the screen
   
   
    
    
     
    
    #scenario 2
     
    Scenario: As a user, I want to verify the today's date in production screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 4
    
    Scenario: As a user, I should see zero Total quantity on the crew production screen 
    
    Then I should see zero quantity on the screen in crew production
    
    #scenario 5
    
    Scenario: As a user, I should see no record on the screen for the first time in production screen
    
    Then I should see no record on the screen for the first time
    
     
    
    
     #scenario 7
     @smoke
    Scenario Outline: As A user, I should be able to add the production quantity
    
    When I click on add production hours
    And I select the first project
    And I click on select button
    When I expand the record
    And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    #Then I verify the details on the production screen "<ProjectId>" "<TaskCode>" "<ProductionUnit> "<Quantity>"
    
    
    
    Examples:
    
   |projectid| taskcode |
    |AutomationPS1180 - 1111 Pennsylvania Avenue|AutomationTask111 - Task|
    
    
     
     
      #scenario 8
    @smoke
    Scenario Outline: As a user, I should be able to complete crew timesheet
    
    When I click on complete button
    And I click on yes button
    And I click on Today button
    Then I should see completed status for the crew timesheet "<WorkerName>"
    
    Examples:
    
    |WorkerName|
    |Prashanthi Sunkavalli|
    
    
     
   
      @templateregression
    Scenario: As a user, I should see the title as PRODUCTIONS

When I click on add production hours
Then I should see the title as Productions

   @templateregression
Scenario: As a user, I should see the header as Project ID

Then I should see the header title as Project ID

  @templateregression
Scenario: As a user, I should see the header as Task Code

Then I should see the header title as Task Code

  @templateregression
Scenario: As a user, I should see the header as Production unit

Then I should see the header title as Production unit

  @templateregression
Scenario: As a user, I should be able to cancel and go back to the production screen

When I click on cancel button
Then I should see the production tab

  @templateregression
Scenario Outline: As a user, I should be able to search for valid production unit

When I click on add production hours
And I click on search bar
And I enter "<Production Unit>"
Then I should see the production unit "<Production Unit>"
And I select the first equipment "<Production Unit>"
And I click on select button

Examples:

|Production Unit|
|AutomationPS1180|

Scenario Outline: As a user, I should not be able to search for invalid production unit

When I click on add production hours
And I click on search bar
And I enter "<Production Unit>"
Then I should see the production unit "<Production Unit>"

Examples:

||
||

Scenario Outline: As a user, I should be able to search with task code

When I click on add production hours
And I click on search bar
And I enter "<Task Code>"
Then I should see the production unit "<Task Code>"

Examples:

||
||

Scenario Outline: As a user, I should be able to search with production unit


And I click on search bar
And I enter search text as "<Production Unit>"
Then I should be able to see the result with "<Production Unit>"

Examples:

||
||

  @templateregression
Scenario Outline: As a user , I should see the title as Quantity

#When I click on cancel button
And I expand the record in production
And I click on quantity in production
 And I select quantity "<Quantity>"
Then I should see the title as quantity

Examples:

|Quantity|
|2|

  
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

When I clear the value
 And I select quantity "<Quantity>"
And I click on done button
Then I should see the total production "<Quantity>"

Examples:

|Quantity|
|3|

  @templateregression
Scenario Outline: As a user, I should be able to clear the quantity

When I click on quantity in production
Then I clear the value
And I click on done
Then I should see the quantity "<Quantity>"

Examples:

|Quantity|
|0|

  
Scenario Outline: As a user, I should see zero total quantity if I make the quantity as zero

Then I should see the total production "<Quantity>"

Examples:
|Quantity|
|0|

  @templateregression
Scenario Outline: As a user,  I should be able to enter quantity with decimals

When I click on quantity in production
And I select quantity "<quantity1>"
And I click dot before decimal
And I select quantity "<quantity2>"
And I click on done button
Then I should see the quantity "<quantity3>"

Examples:

|quantity|quantity1|quantity2|quantity3|
|0|2|3|2.3|

  
Scenario Outline: As a user, I should be able to verify the total quantity if the quantity is in decimals

Then I should see the total production "<quantity>"

Examples:
|quantity|
|2.3|

  
Scenario Outline: As a user, I should see change in remaining quantity if the quantity is in decimals
Then I should see the remaining quantity "<quantity>"

Examples:
|quantity|
|2.3|

  @templateregression
Scenario Outline: As a user, I should be able to enter negative quantity

When I click on quantity in production
And I clear the value
And I select quantity "<quantity>"
And I click minus on hour pad
And I click on done button
Then I should see the quantity "<quantity1>"

Examples:

|quantity|quantity1|
|4|-4|

  
Scenario Outline:As a user, I should be able to verify the total quantity if the quantity is in negative

Then I should see the total production "<quantity>"

Examples:
|quantity|
|-4|

  
Scenario Outline:As a user, I should see change in remaining quantity if the quantity is in negative

Then I should see the remaining quantity "<quantity>"

Examples:
|quantity|
|-4|

  @templateregression
Scenario Outline: As a user, I should be able to delete the production units from the main screen

When I click on delete production
And I click on yes button
Then I should not see the added production unit on the screen "<production unit>"

Examples:

|Production Unit|
|AutomationPS1180|

  
Scenario Outline: Verify the total quantity after removing the production unit from the screen

  Then I should see the total production "<quantity>" 
  #
  Examples:

|quantity|
|0|
  

     @smoke   @templateregression
    Scenario Outline: Add the production quantity
    
    When I click on add production hours
    And I select the first project
    And I click on select button
    And I click on quantity in production
     And I select quantity "<quantity>"
    And I click on done
    
    
    
    Examples:
    
     |projectid| taskcode |quantity|
    |AutomationPS1180 - 1111 Pennsylvania Avenue|AutomationTask111 - Task|23|
    
    #scenario 8
    @smoke   @templateregression
    Scenario Outline: As a user, I should be able to complete worker timesheet
    
    When I click on complete button
    And I click on yes button
    And I click on Today button
    #Then I should see completed status for the worker timesheet "<WorkerName>"
    
    Examples:
    
    |WorkerName|
    |Prashanthi Sunkavalli|
    
    
    
    
    #scenario 2
  @smoke
  Scenario: User should be able to logout from the app
  
    When I click on hamburger menu
    And I click on logout button
   
    
    
   
    
    
    
    
    
    
    
    

 