#Author: Prashanthi
Feature: Construct 365 Field App Crew Equipment  Feature

#scenario 1
   @smoke  @crewregression
  Scenario: As a User, I should be able to see crew equipment Screen
  
    
    When I click on equipment button
     #Then  I should see eq
   
   
    
    
     
    
    #scenario 2
     @smoke  @crewregression
    Scenario: As a user, I want to verify the today's date in equipment screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 4
    @smoke  @crewregression
    Scenario: As a user, I should see zero Total quantity on the crew screen
    
    Then I should see zero equipment on the crew screen
    
    #scenario 5
    
    Scenario: As a user, I should see no record on the screen for the first time in equipment screen
    
    Then I should see no record on the screen for the first time
    
     
    
     #scenario 7
     @smoke
    Scenario Outline: As A user, I should be able to add the crew equipment hours
    
    When I click on add equipment hours
    And I select the first equipment "<equipment>"
    And I click on select button
    When I expand the record
    
    
    
    Examples:
    
    |quantity|  equipment |
    |2|AUTO_111|
    
     
    #scenario 6
     @smoke
    Scenario Outline: As a user, I should be able to select the task code and project id in crew equipment screen
    
   
     When I click on select a project dropdown in crew expenses
    And I select the project id "<projectid>"
    Then I Click on select task code dropdown in crew expenses
    And I select the task code in expenses "<taskcode>"
     And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    #And I click on hour
    #And I select the hour "<hours>"
    #And I click on done button
    #Then Verify the total hours count "<hours>"
    Then Verify the total quantity count "<quantity>"
    Examples:
    
   |projectid| taskcode| quantity|  
    |AutomationPS1180|AutomationTask111 - Task|2|
    
    
    
     @crewregression
    Scenario: As a user, I should see the title as Equipments

When I click on add equipment hours
Then I should see the title as equipment hours

   @crewregression
Scenario: As a user, I should see the headers as Equipment id, Description and unit

Then I should see the headers as Equipment id and description and unit

   @crewregression
Scenario Outline: As a user, I should be able to search and select the  equipment

When I click on search bar on equipments
And I enter the equipment "<equipment>"
Then I should see the equipment "<equipment>"
And I select the first equipment "<equipment>"
And I click on select button

Examples:
|equipment|
|AUTO_111|


Scenario Outline: Verify the search for equipment with invalid data

When I click on search bar on equipments
And I enter the equipment "<equipment>"
Then I should not see the equipment "<equipment>"

Examples:
|equipment|
|equip123|

   @crewregression
Scenario: As a user, I should be able to cancel and go back to the equipment screen

When I click on add equipment hours
When I click on cancel button
#Then I should see the equipment screen


#scenario 6
     @crewregression
    Scenario Outline: As a user, I should be able to select the task code and project id in crew equipment screen
    
   And I click on equipment "<equipment>"
     When I click on select a project dropdown in crew expenses
    And I select the project id "<projectid>"
    Then I Click on select task code dropdown in crew expenses
    And I select the task code in expenses "<taskcode>"
    
    
    Examples:
    
   |projectid| taskcode| quantity|  equipment|
    |AutomationPS1180|AutomationTask111 - Task|2|AUTO_111|

   @crewregression
Scenario Outline: As a user, I should be able to edit the quantity in main equipment screen


And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    
    Examples:
    |quantity|equipment|
    |2|AUTO_111|

   @crewregression
Scenario Outline: As a user, I should see the unit as per the equipment

Then I should see the unit "<unit>"

Examples:

|unit|
|111A|

   @crewregression
Scenario Outline: As a user, I should be able to enter the quantity with decimals

And I click on quantity
And I click dot before decimal
    When I select quantity "<quantity>"
    And I select quantity "<quantity1>"
    And I click on done
    Then Verify the quantity in equipment "<quantity2>"
    
Examples:

|quantity|quantity1|quantity2|
|3|3|2.33|

   @crewregression
Scenario: As a user , I should see the title as Quantity

When I click on quantity
Then I should see the title as quantity

   @crewregression
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

When I clear the value
And I select quantity "<quantity>"
And I click on done
    Then Verify the total quantity count "<quantity>"

Examples:
|quantity|
|4|

   @crewregression
Scenario: As a user, I should be able to clear the quantity

When I click on quantity
And I clear the value
Then I should see zero equipment on quantity selection pad

   @crewregression
Scenario Outline: As a user, I should see zero total quantity if I make the quantity as zero

When I click on done
Then Verify the total quantity count "<quantity>"

Examples:
|quantity|
|0|

   @crewregression
Scenario Outline: Verify the total quantity count after adding two equipments

When I click on add equipment hours
When I click on search bar on equipments
And I enter the equipment "<equipment>"
    And I select the first equipment "<equipment>"
    And I click on select button
    When I expand the record
    And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    When I click on add equipment hours
    And I select the first equipment "<equipment1>"
    And I click on select button
    When I expand the record
    And I click on quantity
    And I select quantity "<quantity1>"
    And I click on done
    Then Verify the total quantity count "<quantity1>"
    
    Examples:
    
    |quantity|quantity1|equipment|equipment1|
    |2|3|100008|100001|
    
       @crewregression
Scenario Outline: As a user, I should be able to delete the equipment

When I click on delete equipment
And I click on yes button
When I click on delete equipment
And I click on yes button
When I click on delete equipment
And I click on yes button
Then I should not see the added equipment on the screen "<equipment>"

 Examples:
 |equipment|
|AUTO_111|
    
    
 

   @crewregression
Scenario Outline: Verify the total quantity count after deleting the equipment

Then Verify the total equipment "<equipment>"

Examples:
|equipment|
|0|
    
    
   
#scenario 7
         @crewregression
    Scenario Outline:  Add the equipment hours
    
    When I click on add equipment hours
    When I click on search bar on equipments
And I enter the equipment "<equipment>"
    And I select the first equipment "<equipment>"
    And I click on select button
    When I expand the record
     When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
   
   
    
    
    Examples:
    
    |quantity| equipment |projectid| taskcode |  
    |2|10000|AutomationPS1180|AutomationTask111 - Task|
    
    
    
   
    
    
   
    
    
    
    
    
    
    
    

 
 