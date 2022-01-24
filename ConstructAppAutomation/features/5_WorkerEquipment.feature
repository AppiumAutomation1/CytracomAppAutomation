#Author: Prashanthi
Feature: Construct 365 Field App Worker Equipment Feature

#scenario 1
   @smoke @workerregression
  Scenario: As a User, I should be able to see worker equipment Screen
  
    
    When I click on equipment button
     #Then  I should see equipment as title of the screen
   
   
    
    
     
    
    #scenario 2
     @smoke @workerregression
    Scenario: As a user, I want to verify the today's date in equipment screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 4
    @smoke @workerregression
    Scenario: As a user, I should see zero Total quantity on the screen
    
    Then I should see zero equipment on the screen
    
    #scenario 5
    
    Scenario: As a user, I should see no record on the screen for the first time in equipment screen
    
    Then I should see no record on the screen for the first time
    
    
    #scenario 7
     @smoke @workerregression
    Scenario Outline: As A user, I should be able to add the equipment hours
    
    When I click on add equipment hours
    When I click on search bar on equipments
And I enter the equipment "<equipment>"
    And I select the first equipment "<equipment>"
    And I click on select button
    When I expand the record
    And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    Then Verify the total quantity count "<quantity>"
    
    
    Examples:
    
    |quantity| equipment |
    |2|AUTO_111|
    
     
     #scenario 6
     @smoke @workerregression
    Scenario Outline: As a user, I should be able to select the task code and project id
    
    When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
    
    Examples:
    
     |projectid| taskcode |
    |AutomationPS1180|AutomationTask111 - Task|
    
    
    
    
    @workerregression
    Scenario: As a user, I should see the title as Equipments

When I click on add equipment hours
Then I should see the title as equipment hours

@workerregression
Scenario: As a user, I should see the headers as Equipment id, Description and unit

Then I should see the headers as Equipment id and description and unit
@workerregression
Scenario Outline: As a user, I should be able to search for equipment

When I click on search bar on equipments
And I enter the equipment "<equipment>"
Then I should see the equipment "<equipment>"

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

@workerregression
Scenario: As a user, I should be able to cancel and go back to the equipment screen

When I click on cancel button
Then I should see the equipment screen



@workerregression
Scenario Outline: As a user, I should see the selected equipment 

#When I expand the record
Then I should see the project

Examples:
|equipment|
|AUTO_111|

@workerregression
Scenario Outline: As a user, I should be able to collapse the equipment

When I click on equipment "<equipment>"
Then The equipment should be collapsed

Examples:
|equipment|
|AUTO_111|

@workerregression
Scenario Outline: As a user, I should be able to edit the quantity in main equipment screen

And I click on equipment "<equipment>"
And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    
    Examples:
    |quantity|equipment|
    |2|AUTO_111|

@workerregression
Scenario Outline: As a user, I should see the unit as per the equipment

Then I should see the unit "<unit>"

Examples:

|unit|
|111A|

@workerregression
Scenario Outline: As a user, I should be able to enter the quantity with decimals

And I click on quantity
And I click dot before decimal
    When I select quantity "<quantity>"
    And I select quantity "<quantity1>"
    And I click on done
    Then Verify the quantity in equipment "<quantity2>"
    
Examples:

|quantity|quantity1|quantity2|
|3|3|22.3|

@workerregression
Scenario: As a user , I should see the title as Quantity

When I click on quantity
Then I should see the title as quantity

@workerregression
Scenario Outline: As a user, I should see change in the total quantity if I edit the quantity from main screen

When I clear the value
And I select quantity "<quantity>"
And I click on done
    Then Verify the total quantity count "<quantity>"

Examples:
|quantity|
|4|

@workerregression
Scenario: As a user, I should be able to clear the quantity

When I click on quantity
And I clear the value
Then I should see zero equipment on quantity selection pad

@workerregression
Scenario Outline: As a user, I should see zero total quantity if I make the quantity as zero

When I click on done
Then Verify the total quantity count "<quantity>"

Examples:
|quantity|
|0|

@workerregression
Scenario Outline: Verify the total quantity count after adding two equipments

When I click on add equipment hours
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
    
  @workerregression  
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
    
    
 

@workerregression
Scenario Outline: Verify the total quantity count after deleting the equipment

Then Verify the total equipment "<equipment>"

Examples:
|equipment|
|0|
    
    
   
#scenario 7
      @workerregression
    Scenario Outline:  Add the equipment hours
    
    When I click on add equipment hours
    And I select the first equipment "<equipment>"
    And I click on select button
    When I expand the record
    And I click on quantity
    And I select quantity "<quantity>"
    And I click on done
    When I click on select a project dropdown
    And I select the project "<projectid>"
    Then I Click on select task code dropdown
    And I select the task code "<taskcode>"
   
    
    
    Examples:
    
    |quantity| equipment |projectid| taskcode |  
    |2|AUTO_111|AutomationPS1180|AutomationTask111 - Task|
    
     
    
    
        
    
   
    
    
    
    
    
    
    
    

 