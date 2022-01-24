#Author: Prashanthi
Feature: Construct 365 Field App Worker Production Feature

#scenario 1
   @smoke @workerregression
  Scenario: As a User, I should be able to see production Screen
  
    
    When I click on production button
    
     
    
    #scenario 2
     @smoke @workerregression
    Scenario: As a user, I want to verify the today's date in production screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 3
    @smoke @workerregression
    Scenario: As a user, I should see zero Total quantity on the production screen 
    
    Then I should see zero quantity on the screen
    
    #scenario 4
    
    Scenario: As a user, I should see no record on the screen for the first time in production screen
    
    Then I should see no record on the screen for the first time
    
     
    
    #scenario 7
    @smoke @workerregression
    Scenario Outline: As A user, I should be able to add the production quantity
    
    When I click on add production hours
    And I select the first project
    And I click on select button
    When I click on production view
    And I click on quantity
    #Then I verify the details on the production screen "<ProjectId>" "<TaskCode>" "<ProductionUnit>" "<BudgetQuantity>" "<Quantity>"
    
    
    
    Examples:
    
     |projectid| taskcode |quantity|
    |AutomationPS1180 - 1111 Pennsylvania Avenue|AutomationTask111 - Task|23|
    
    
    
    #scenario 7
    
    Scenario Outline: As a user, I should be able to see remaining Quantity
    
    When I clear the value
    And I select quantity "<Quantity>"
    And I click on done
    Then I should see the remaining quantity "<Quantity>"
    
    Examples:
    
    |Quantity|
    |2|
    
    
    Scenario: As a user, I should see the title as PRODUCTIONS

When I click on add production hours
Then I should see the title as Productions

@workerregression
Scenario: As a user, I should see the header as Project ID

Then I should see the header title as Project ID

@workerregression
Scenario: As a user, I should see the header as Task Code

Then I should see the header title as Task Code

@workerregression
Scenario: As a user, I should see the header as Production unit

Then I should see the header title as Production unit


Scenario: As a user, I should be able to cancel and go back to the production screen

When I click on cancel button
Then I should see the production tab


Scenario Outline: As a user, I should be able to search for valid production unit

When I click on add production hours
And I click on search bar
And I enter "<Production Unit>"
Then I should see the production unit "<Production Unit>"

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




@workerregression
Scenario Outline: As a user , I should see the title as Quantity

#When I click on cancel button
And I expand the record
And I click on quantity in production
 And I select quantity "<Quantity>"
Then I should see the title as quantity

Examples:

|Quantity|
|2|

@workerregression
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

When I clear the value
 And I select quantity "<Quantity>"
And I click on done button
Then I should see the total production "<Quantity>"

Examples:

|Quantity|
|3|

@workerregression
Scenario Outline: As a user, I should be able to clear the quantity

When I click on quantity in production
Then I clear the value
And I click on done
Then I should see the quantity "<Quantity>"

Examples:

|Quantity|
|0|

@workerregression
Scenario Outline: As a user, I should see zero total quantity if I make the quantity as zero

Then I should see the total production "<Quantity>"

Examples:
|Quantity|
|0|

@workerregression
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

@workerregression
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

@workerregression
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

@workerregression
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

@workerregression
Scenario Outline: As a user, I should be able to delete the production units from the main screen

When I click on delete production
And I click on yes button
Then I should not see the added production unit on the screen "<production unit>"

Examples:

|Production Unit|
|AutomationPS1180|

@workerregression
Scenario Outline: Verify the total quantity after removing the production unit from the screen

  Then I should see the total production "<quantity>" 
  
  Examples:

|quantity|
|0|
  

     @smoke @workerregression
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
    
    Scenario Outline: As a user, I should be able to complete worker timesheet
    
    When I click on complete button
    And I click on yes button
    And I click on Today button
    #Then I should see completed status for the worker timesheet "<WorkerName>"
    
    Examples:
    
    |WorkerName|
    |Prashanthi Sunkavalli|
    
    
    
    
    
     
    
    
    
    
    
    
    
   
    
    
   
    
    
    
    
    
    
    
    

 