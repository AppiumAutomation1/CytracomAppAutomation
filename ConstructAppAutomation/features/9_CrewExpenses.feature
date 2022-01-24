#Author: Prashanthi
Feature: Construct 365 Field App Crew Expenses Feature

#scenario 1
   @smoke @crewregression
  Scenario: User should be able to see crew expenses Screen
  
    
    When I click on expenses button
     #Then  I should see expenses as title of the screen
   
   #scenario 2
   @crewregression
   Scenario Outline: As a User, I should be able to see the Crew workers in expenses screen
   
   
    Then I should see crew related workers on the screen "<workername1>" "<workername2>"
   
    
    
    Examples:
    
    |workername1             | workername2 | 
    |John S Field | AutomationWorker2 worker|   
    
    #scenario 3
     @smoke @crewregression
    Scenario: As a user, I want to verify the today's date in  crew expenses screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 4
    @smoke @crewregression
    Scenario: As a user, I should see zero Total amount on the crew expenses screen
    
    Then I should see zero expenses on the crew expenses screen
    
    
    
     
    
    #scenario 8
    @smoke
    Scenario Outline: As a user,I should be able to select the task code and project id
    
    When I click on add crew expenses button
    When I click on select a project dropdown in crew expenses
    And I select the project id "<projectid>"
    Then I Click on select task code dropdown in crew expenses
    And I select the task code in expenses "<taskcode>"
    
    Examples:
    
    |projectid| taskcode|
    |AutomationPS1180|AutomationTask111 - Task|
    
    
   
     #scenario 10
     @smoke
    Scenario Outline: As A user, I should be able to add the expenses
    
    When I click on expense category dropdown
    And I select the expense category "<expense>"
    And I click on quantity text field
    When I select quantity "<quantity>"
    And I click on done
    #Then Verify the total amount count "<quantity>"
    And Click on add button in expenses
    Then Verify the expenses screen "<workername1>" "<workername2>" "<Totalamount>" "<quantity>" "<unitprice>"
    Examples:
    
    |expense| quantity |workername1|workername2|unitprice|Totalamount|
    |Lifting|2|AutomationWorker1 skvl| AutomationWorker2 worker|33||
    
     
    
    
    
      @crewregression
    Scenario: As a user, I should see the title as Add Field Expenses
    
    When I click on add crew expenses button
   Then I should see the title as Add Crew Expenses
   
   #scenario 2
     @smoke
   Scenario Outline: As a User, I should be able to see the Crew workers in expenses screen
   
   
    Then I should see crew related workers on the screen "<workername1>" "<workername2>"
   
    
    
    Examples:
    
    |workername1             | workername2 | 
    |AutomationWorker1 skvl| AutomationWorker2 worker|   
    
     @crewregression
   Scenario Outline: As a User, I should be able to see the Crew workers in expenses screen for regression
   
   
    Then I should see crew related workers on the screen "<workername1>" "<workername2>"
   
    
    
    Examples:
    
    |workername1             | workername2 | 
    |John S Field | AutomationWorker2 worker|
   
   @crewregression
Scenario: As a user, I should see the sub title as Select Project & Task Code

  Then I should see the sub title as select project & task code
  
   @crewregression
Scenario: As a user, I should see the sub title as Enter Field Expenses

Then I should see the sub title as enter field expenses


 @crewregression
Scenario: As a user,  I should be able to go back to the expenses screen

When I click on back button
Then I should see the expenses screen

 @crewregression
Scenario: As a user, I should be able to cancel and go back to the expenses screen

 When I click on add crew expenses button
When I click on cancel button
Then I should see the expenses screen


 @crewregression
Scenario Outline: As a user, I should see the right unit price for the selected expense

When I click on add crew expenses button
And I click on expense category dropdown
And I select the expense category "<expense>"
Then I should see the expense unit price "<unitprice>"

Examples:

|expense|unitprice|
#|Mileage|0.55|
|Lifting|33|

 @crewregression
Scenario: As a user, I should see the title as Unit Price in unit price pad

When I click on unit price
Then I should see the title as unit price

 @crewregression
Scenario Outline: As a user, I should be able to edit the unit price

When I clear the value
When I enter the unit price "<unitprice>"
Then I should see the selected unit price in unit price pad "<unitprice>"
And I click on done button
Then I should see the expense unit price "<unitprice>"

Examples:

|unitprice|
|2|


 @crewregression
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

 @crewregression
Scenario Outline: As a user, I should be able to verify the total quantity if the unit price is in decimals

 And I click on quantity text field
 When I select quantity "<quantity>"
 And I click on done button
     #Then Verify the total amount count in crew expenses "<quantity>"
 
 Examples:
 |quantity|
  |2|

 @crewregression
Scenario Outline: As a user, I should be able to enter unit price with negative values

When I click on unit price
And I click minus on hour pad
And I click on done button
Then I should see the expense unit price "<unitprice2>"

Examples:
|unitprice|unitprice|unitprice2|
|3|3|-2.33|

 #@crewregression
Scenario Outline: As a user, I should be able to verify the total quantity if the unit price is in negative value 

      Then Verify the total amount count in crew expenses "<quantity>"
  
  
  Examples:
  
  |quantity|
  |2|

 @crewregression
Scenario Outline: As a user, I should be able to clear the unit price

When I click on unit price
Then I clear the value
And I click on done button
Then I should see the expense unit price "<unitprice>"

Examples:
|unitprice|
|0|

 @crewregression
Scenario: As a user , I should see the title as Quantity

When I click on quantity text field
Then I should see the title as quantity


 @crewregression
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

 @crewregression
Scenario Outline: As a user, I should be able to verify the total quantity if the quantity  is in decimals

 When I click on unit price
And I enter the unit price "<unitprice>"
 And I click on done button
     #Then Verify the total amount count in crew expenses "<quantity>"
 
 Examples:
 |unitprice|quantity|
  |2|3.44|

   @crewregression
  Scenario Outline: As a user, I should be able to enter negative quantity
  
When I click on quantity text field
And I click minus on hour pad
    And I click on done
    #Then Verify the total amount count in crew expenses "<quantity3>"
    
Examples:

|quantity|quantity1|quantity2|quantity3|
|3|4|4|-3.44|

 #@crewregression
Scenario Outline: As a user, I should be able to verify the total quantity if the quantity  is in negative

 
     Then Verify the total amount count in crew expenses "<quantity>"
 
 Examples:
 |unitprice|quantity|
  |2|-3.44|


    @crewregression
Scenario Outline: As a user, I should be able to clear the quantity


And I click on quantity text field
And I clear the value
And I click on done
#Then Verify the total amount count in crew expenses "<quantity>"
    
Examples:

|quantity|
|0|

  #@regression3
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
    
    
      @crewregression
Scenario Outline: As a user, I should be able to edit the quantity in main expenses screen

When I click on back button
And I click on add crew expenses button
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
    #And I expand the crew "<worker1>"
And I click on quantity on the main screen
    When I select quantity "<quantity1>"
    And I click on done
    
    
Examples:

|expense| quantity |projectid|taskcode|unit|unitprice|quantity1|worker1|
    |Lifting|2|AutomationPS1180|AutomationTask111 - Task|EU005|33|3|AutomationWorker2 worker|
    
    
   @crewregression
Scenario: As a user , I should see the title as Quantity

When I click on crew quantity on the main screen
Then I should see the title as quantity
 
      @crewregression
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

When I clear the value
 When I select quantity "<quantity>"
    And I click on done
Then Verify the total quantity count in crew expenses main screen "<quantity1>" "<quantity2>"

Examples:
|quantity1|quantity2|quantity|
|99|66|3|

  @crewregression
Scenario Outline: As a user, I should be able to enter the quantity with decimals

And I click on crew quantity on the main screen
And I click dot before decimal
    When I select quantity "<quantity>"
    And I click on done
    Then Verify the quantity on crew main screen "<quantity1>"
    
Examples:

|quantity|quantity1|
|4|3.4|

@crewregression 
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

Then Verify the total quantity count in crew expenses main screen "<quantity1>" "<quantity2>"

Examples:
|quantity1|quantity2|
|112.2|66|


@crewregression 
Scenario Outline: As a user, I should be able to clear the quantity


And I click on crew quantity on the main screen
And I clear the hours
#Then Verify the quantity on quantity selection pad "<quantity>"
    
Examples:

|quantity|
|0|

@crewregression 
Scenario Outline: As a user, I should see zero total quantity if I make the quantity as zero

#And I click on quantity on the main screen
#And I clear the hours
    #When I select quantity "<quantity>"
    And I click on done
Then Verify the total quantity count in crew expenses main screen "<quantity1>" "<quantity2>"
    
Examples:

|quantity1|quantity2|
|0|66|





          @crewregression
Scenario Outline: As a user, I should be able to deselect the worker from the list

When I click on add crew expenses button
And I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    When I click on expense category dropdown
    And I select the expense category "<expense>"
    And I click on quantity text field
    And I clear the value
    When I select quantity "<quantity>"
    And I click on done
    And I select a crew "<worker1>"
    And Click on add button
    Then I should not see the deselected worker name "<worker1>"

    
    
Examples:

|expense| quantity |projectid|taskcode|unit|unitprice|quantity1|worker1|
    |Lifting|2|AutomationPS1180|AutomationTask111 - Task|EU005|33|3|AutomationWorker2 worker|
    
    
     
    
    
    
   
    
    
   
    
    
    
    
    
    
    
    

 