#Author: Prashanthi
Feature: Construct 365 Field App Worker Expenses Feature

#scenario 1
   @smoke @workerregression @reg6
  Scenario: User should be able to see expenses Screen
  
    
    When I click on expenses button
     #Then  I should see expenses as title of the screen
   
   #scenario 2
    @smoke @workerregression
   Scenario Outline: As a User, I should be able to see the worker details in expenses screen
   
    Then I should see worker name on the screen on expenses page "<workername>"
    
    
    Examples:
    
    |workername| 
    |Prashanthi Sunkavalli|  
    
    #scenario 3
     @smoke @workerregression
    Scenario: As a user, I want to verify the today's date in expenses screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 5
    @smoke @workerregression
    Scenario: As a user, I should see zero Total amount on the screen
    
    Then I should see zero expenses on the screen
    
    #scenario 6
    
    Scenario Outline: As a user, I should see no record on the screen for the first time in expenses
    
    Then I should see no record on the screen for the first time
    
    Examples:
    
    ||
    ||
     
    
    #scenario 9
    @smoke @workerregression @reg6
    Scenario Outline: As a user, I should be able to select the task code and project id
    When I click on add field expenses button
    When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    
    Examples:
    
    |projectid| taskcode |
    |AutomationPS1180 - 1111 Pennsylvania Avenue|AutomationTask111 - Task|
    
    #scenario 10
     @smoke 
    Scenario Outline: As A user, I should be able to add the expenses
    
    When I click on expense category dropdown
    And I select the expense category "<expense>"
    And I click on quantity text field
    When I select quantity "<quantity>"
    And I click on done
    Then Verify the total amount count "<quantity>"
    And Click on add button
    Then Verify the expenses screen in worker "<expense>" "<projectid>" "<taskcode>" "<quantity>" "<unit>" "<unitprice>" "<Totalamount>"   
    Examples:
    
    |expense| quantity |projectid|taskcode|unit|unitprice|Totalamount|
    |Lifting|2|AutomationPS1180|AutomationTask111|EU005|33||
    
     
    
    @workerregression
    Scenario: As a user, I should see the title as Add Field Expenses
    
    When I click on add field expenses button
   Then I should see the title as Add Field Expenses
   
  @workerregression
Scenario: As a user, I should see the sub title as Select Project & Task Code

  Then I should see the sub title as select project & task code
  
  @workerregression
Scenario: As a user, I should see the sub title as Enter Field Expenses

Then I should see the sub title as enter field expenses


@workerregression
Scenario: As a user,  I should be able to go back to the expenses screen

When I click on back button
Then I should see the expenses screen

@workerregression
Scenario: As a user, I should be able to cancel and go back to the expenses screen

 When I click on add field expenses button
When I click on cancel button
Then I should see the expenses screen


@workerregression
Scenario Outline: As a user, I should see the right unit price for the selected expense

When I click on add field expenses button
And I click on expense category dropdown
And I select the expense category "<expense>"
Then I should see the expense unit price "<unitprice>"

Examples:

|expense|unitprice|
|Mileage|0.55|

@workerregression
Scenario: As a user, I should see the title as Unit Price in unit price pad

When I click on unit price
Then I should see the title as unit price

@workerregression
Scenario Outline: As a user, I should be able to edit the unit price

When I clear the value
When I enter the unit price "<unitprice>"
Then I should see the selected unit price in unit price pad "<unitprice>"
And I click on done button
Then I should see the expense unit price "<unitprice>"

Examples:

|unitprice|
|2|


@workerregression
Scenario Outline: As a user, I should be able to enter unit price with decimals

When I click on unit price
And I click dot before decimal
Then I enter the unit price "<unitprice>"
Then I enter the unit price "<unitprice1>"
And I click on done button
Then I should see the expense unit price "<unitprice2>"

Examples:
|unitprice|unitprice1|unitprice2|
|3|3|2.33|

@workerregression
Scenario Outline: As a user, I should be able to verify the total quantity if the unit price is in decimals

 And I click on quantity text field
 When I select quantity "<quantity>"
 And I click on done button
     Then Verify the total amount count "<quantity>"
 
 Examples:
 |quantity|
  |2|

@workerregression
Scenario Outline: As a user, I should be able to enter unit price with negative values

When I click on unit price
And I click minus on hour pad
And I click on done button
Then I should see the expense unit price "<unitprice2>"

Examples:
|unitprice|unitprice|unitprice2|
|3|3|-2.33|

@workerregression
Scenario Outline: As a user, I should be able to verify the total quantity if the unit price is in negative value 

      Then Verify the total amount count "<quantity>"
  
  
  Examples:
  
  |quantity|
  |2|

@workerregression
Scenario Outline: As a user, I should be able to clear the unit price

When I click on unit price
Then I clear the value
And I click on done button
Then I should see the expense unit price "<unitprice>"

Examples:
|unitprice|
|0|

@workerregression
Scenario: As a user , I should see the title as Quantity

When I click on quantity text field
Then I should see the title as quantity


@workerregression
Scenario Outline: As a user,  I should be able to enter quantity with decimals

When I clear the value
    When I select quantity "<quantity>"
    And I click dot before decimal
        When I select quantity "<quantity1>"
        When I select quantity "<quantity2>"
    
    And I click on done
    Then Verify the quantity "<quantity3>"
    
Examples:

|quantity|quantity1|quantity2|quantity3|
|3|4|4|3.44|

@workerregression
Scenario Outline: As a user, I should be able to verify the total quantity if the quantity  is in decimals

 When I click on unit price
And I enter the unit price "<unitprice>"
 And I click on done button
     Then Verify the total amount count "<quantity>"
 
 Examples:
 |unitprice|quantity|
  |2|3.44|

  @workerregression
  Scenario Outline: As a user, I should be able to enter negative quantity
  
When I click on quantity text field
And I click minus on hour pad
    And I click on done
    Then Verify the total amount count "<quantity3>"
    
Examples:

|quantity|quantity1|quantity2|quantity3|
|3|4|4|-3.44|

@workerregression
Scenario Outline: As a user, I should be able to verify the total quantity if the quantity  is in negative

 
     Then Verify the total amount count "<quantity>"
 
 Examples:
 |unitprice|quantity|
  |2|-3.44|


 @workerregression  
Scenario Outline: As a user, I should be able to clear the quantity


And I click on quantity text field
And I clear the value
And I click on done
Then Verify the total amount count "<quantity>"
    
Examples:

|quantity|
|0|

  #@workerregression
Scenario Outline: As a user, I should be able to verify the total quantity if two expenses are added

When I click on expense category dropdown
    And I select the expense category "<expense>"
    And I click on quantity text field
    And I clear the value
    When I select quantity "<quantity>"
    And I click on done
    And Click on add button
    And I click on add field expenses button
    When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    
    Examples:
    
    |expense| quantity |projectid|taskcode|unit|unitprice|
    |Lifting|2|AutomationPS1180|AutomationTask111|EU005|33|
        |Meal|3|AutomationPS1180|AutomationTask111|EU005|33|
    
    
 @workerregression    @reg6
Scenario Outline: As a user, I should be able to edit the quantity in main expenses screen

When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    When I click on expense category dropdown
    And I select the expense category "<expense>"
    And I click on quantity text field
    And I clear the value
    When I select quantity "<quantity>"
    And I click on done
    And Click on add button
And I click on quantity on the main screen "<expense>"
    When I select quantity "<quantity1>"
    And I click on done
    
    
Examples:

|expense| quantity |projectid|taskcode|unit|unitprice|quantity1|
    |Lifting|2|AutomationPS1180|AutomationTask111 - Task|EU005|33|3|
    
    
@workerregression @reg6
Scenario Outline: As a user , I should see the title as Quantity

When I click on quantity on the main screen "<expense>"
Then I should see the title as quantity

Examples:
|expense|
|Lifting|
 
 @workerregression    @reg6
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

When I clear the value
 When I select quantity "<quantity>"
    And I click on done
Then Verify the total quantity count in main screen "<quantity>" "<expense>"

Examples:
|quantity|expense|
|3|33|

@workerregression @reg6
Scenario Outline: As a user, I should be able to enter the quantity with decimals

And I click on quantity on the main screen "<expense>"
And I click dot before decimal
    When I select quantity "<quantity>"
    And I click on done
    Then Verify the quantity on main screen "<quantity1>" "<expense>"
    
Examples:

|quantity|quantity1|expense|
|4|3.4|Lifting|

@workerregression @reg6
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

Then Verify the total quantity count in main screen "<quantity>" "<expense>"

Examples:
|quantity|expense|
|3.4|33|


@workerregression @reg6
Scenario Outline: As a user, I should be able to clear the quantity


And I click on quantity on the main screen "<expense>"
And I clear the hours
Then Verify the quantity on quantity selection pad "<quantity>"
    
Examples:

|quantity|expense|
|0|Lifting|

@reg6
Scenario Outline: As a user, I should see zero total quantity if I make the quantity as zero

#And I click on quantity on the main screen
#And I clear the hours
    #When I select quantity "<quantity>"
    And I click on done
Then Verify the total quantity count in main screen "<quantity>" "<unitprice>"
    
Examples:

|quantity|unitprice|
|0|33|




 @workerregression @reg6
    Scenario Outline: As a user, I should be able to delete the added record
    
    When I click on delete expense
    And I click on yes button
    Then I should not see the added record for hours "<projectname>"
    
    Examples:
    
    |projectname|
    |AutomationPS1180|
    
    
    
    
     @workerregression   @reg6
Scenario Outline: Add the expenses 

And I click on add field expenses button
When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    And I click on expense category dropdown
    And I select the expense category "<expense>"
    And I click on quantity text field
    When I select quantity "<quantity>"
    And I click on done
    And Click on add button
 Then Verify the expenses screen in worker "<expense>" "<projectid>" "<taskcode1>" "<quantity>" "<unit>" "<unitprice>" "<Totalamount>"   
    
    
Examples:

|expense| quantity |projectid|taskcode|unit|unitprice|quantity1|taskcode1|
    |Lifting|2|AutomationPS1180|AutomationTask111 - Task |EU005|33|3|AutomationTask111|  
    
    
   
    
    
    
    
    
    
    
    

 