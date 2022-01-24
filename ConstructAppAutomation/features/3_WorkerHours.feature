#Author: Prashanthi
Feature: Construct 365 Field App Worker TimeSheet Hours Feature



 @workerregression
    Scenario Outline:As a User, I should be able to Search by worker name
    When I click on change worker name
     #When I click on search bar in change worker
    #And I enter "<workername>"
    And I select a worker "<workername>"
    And I click select button
    
    Examples:
    
    |workername|
    |Prashanthi Sunkavalli|
    
    
#scenario 1
   @smoke  @workerregression @reg6
  Scenario: User should be able to see Hours Screen
  
    
    When I click on hours button
   #Then  I should see Hours as title of the screen
   
    @regression @workerregression
    Scenario Outline: As a user, I should be able to delete the added record
    
    When I click on delete hour
    And I click on yes button
    Then I should not see the added record for hours "<projectname>"
    
    Examples:
    
    |projectname|
    |AutomationPS1180|
   
   #scenario 2
    @smoke  @workerregression
   Scenario Outline: As a User, I should be able to see the worker details
   
    Then I should see worker name in hours screen "<workername>"
    
    
    Examples:
    
    |workername             | 
    |Prashanthi Sunkavalli |  
    
    #scenario 3
     @smoke  @workerregression
    Scenario: As a user, I want to verify the today's date
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 4
    @smoke  @workerregression
    Scenario: As a user, I should see zero hours on the screen
    
    Then I should see zero hours on the screen
    
    #scenario 5
    
    Scenario: As a user, I should see no record on the screen for the first time
    
    Then I should see no record on the screen for the first time
    
    #scenario 6
     @smoke  @workerregression
    Scenario Outline: As A user, I should see selected project and description in hours pop up
    
    When I click on add worker hours
    #Then I should see project and description which is selected in summary page "<project>" and "<project description>"
    
     Examples:
    
    |project| project description|
    |P000100||
    
     #scenario 7
     @smoke  @workerregression
    Scenario Outline: As a user, I should be able to select the task code
    
    When I click on select task code
    And I select the task "<Task Code>"
    And I click on select button
    #Then Verify the task code and description in hours page "<Task Code>" and "<Task Description>"
    
    Examples:
    
    |Task Code| Task Description |
    |AutomationTask111|Task|
    
     #scenario 8
     @smoke 
    Scenario Outline: As A user, I should be able to select the hours
    
    When I click on regular hours
    And I select the hours "<Regular hours>"
    And I click on done
    When I click on Overtime1
    And I select the hours "<Overtime1>"
    And I click on done
    When I click on Overtime2
    And I select the hours "<Overtime2>"
    And I click on done
    Then I shoud see the selected hours "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    Examples:
    
    |Regular hours| Overtime1 | Overtime2 |
    |5|2|2|
    
    #scenario 9
     @smoke  @workerregression
    Scenario Outline: As a user, I should be able to select the shift
    
    When I click on shift
    And I select the shift "<shift>"
    Then I should see the selected shift "<shift>"
    
    
    Examples:
    
    |shift|
    |Automation|
    
    #scenario 10
     @smoke  
    Scenario Outline: As a user, I should see the selected data on the hours screen
    
    When I click on add button
    Then I should see the details on the hours screen as "<project code>" "<Task Code>" "<Regular hours>" "<Overtime1>" "<Overtime2>"
    Then I should see the total hours as "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    
    Examples:
   |project code|Task Code|Regular hours| Overtime1 | Overtime2 |
    |AutomationPS1180|AutomationTask111|5|2|2|
    
    
     @workerregression
    Scenario Outline: As a user, I should be able to change the project id

When I click on add worker hours
And I click project id
And I select any project "<projectid>"
And I click on select button

Examples:

|projectid|
|P000002|
    
      @workerregression
    Scenario: As a user, I should see all projects label
    
    And I click project id
     #Then I should see the label as Select project
     Then I should see the label as All projects
     
      
     Scenario Outline: As a user, I should be able to search for a project by Project id
     
     When I click on search bar in hours screen
     And I enter project details in hours search bar "<projectid>"
     Then I should see the search results with "<projectid>"
     And I select any project "<projectid>"
     
     Examples:
     
     
    |projectid|
    |AutomationPS1180|
    
     
     Scenario Outline: As a user, I should be able to search for a project by Description
     
     When I click on search bar in hours screen
     And I enter project details in hours search bar "<projectdescription>"
     Then I should see the search results with "<projectdescription>"
     
     Examples:
     
     
    |projectdescription|
    |1111 Pennsylvania Avenue|    
     @workerregression
    Scenario: As a user, I should see location range 
     
    
     Then I should see location range details
     
     
      Scenario Outline: As a user, I should be not be able to search with invalid data
      
     When I click on search bar in hours screen
     And I enter project details in hours search bar "<invalid data>"
     Then I should not see the search results with "<invalid data>"
     
     Examples:
     
     
    |invalid data|
    |test xyz dara|
    
    
     @workerregression
   Scenario: As a User, I should return to summary screen after clicking cancel button in search project
    
    
    When I click on cancel button
    Then I should see add worker hours screen
    
     @workerregression
Scenario: As a user ,  I should see the title as select task

When I click on select task code
Then I should see the title as select task

 
Scenario: As a user, I should see the subtitle as project tasks

Then I should see the subtitle as project tasks


Scenario: As a user, I should see the search a task place holder

Then I should see the search task place holder

 @workerregression
Scenario: As a user, I should see the task id and description headers

Then I should see the headers as task id and description

 @workerregression
Scenario Outline: As a user, I should be able to search the  task with task id

When I click on search bar in select task
And I enter task "<taskid>"
Then I should see the search results with "<taskid>"

Examples:

|taskid|
|AutomationTask111|


Scenario Outline: As a user, I should be able to search the task with task description

When I click on search bar in select task
And I enter task "<taskdescription>"
Then I should see the search results with "<taskdescription>"

Examples:

|taskdescription|
|Task|

Scenario Outline: As a user, I should be able  to search the task with invalid id

When I click on search bar in select project screen
And I enter "<invalidtaskid>"
Then I should not see the search results with "<invalidtaskid>"

Examples:

|invalidtaskid|
||

 @workerregression
Scenario: As a user, I should be able to go back to add worker hours screen

When I click on back button in select task
Then I should see add worker hours screen

 @workerregression
Scenario Outline: As a user, I should be able to cancel the select task screen

#When I click on add worker hours
When I click on select task code
And I select any task "<taskid>"
And I click on cancel button
Then I should see add worker hours screen

Examples:

|taskid|
|AutomationTask111|



    
  

 @workerregression
Scenario: As a user, I should be able to go back to hours screen

When I click on back button

Then I should see the hours screen

 @workerregression
Scenario Outline: As a user, I should see worker details

When I click on add worker hours
Then I should see worker name on the hours screen "<Workername>"
Then I should see worker personnel number on the hours screen "<personnelnumber>"

Examples:

|Workername|personnelnumber|
|Prashanthi Sunkavalli|1004|


 @workerregression
Scenario Outline: As a user, I should be able to select job classification

When I click on job classification dropdown
Then I select job classification "<jobclassification>"

Examples: 

|jobclassification|
|HR|

 @workerregression
Scenario Outline: As a user, I should be able to select special pay

When I click on special pay dropdown
Then I select special pay "<specialpay>"

Examples:


|specialpay|
|Transport|   
   
     @workerregression
    Scenario Outline:As a user, I should be able to add the regular hours with decimals

When I click on regular hours
And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the regular hours "<hours>"
Then I should see the total hours "<hours>"
Examples:

|hour|hour1|hour2|hours|
|1|2|5|1.25|



 @workerregression
Scenario Outline: As a user, I should see total hours when I add both regular and overtime1 hours


When I click on Overtime1
And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the overtime1 hours "<overtime1>"
Then I should see the total hours "<regularhours>" "<overtime1>"

Examples:

|regularhours|hour|hour1|hour2|overtime1|
|1.25|2|2|3|2.23|

 @workerregression
Scenario Outline: As a user, I should see total hours when I add both regular and overtime1 and overtime2 hours


When I click on Overtime2
And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the overtime2 hours "<overtime2>"
Then I should see the total hours "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|overtime1|regularhours|overtime2|hour|hour1|hour2|
|2.23|1.25|3.23|3|2|3|

 @workerregression
Scenario: As a user , I should be able to see the title as Hours

When I click on Overtime2
Then I should see the title as hours in hour pad




 @workerregression
Scenario Outline: As a user, I should see the selected hours on clicking hour pad again


Then I should see the regular hours in hour pad "<regular>"


Examples:

|regular|
|1.25|

 @workerregression
Scenario: As a user, I should be able to cancel the hour pad

When I click on cancel button in hour pad
Then I should see add worker hours screen


 @workerregression
Scenario: As a user, I should be able to clear the value from hour pad

When I click on regular hours
When I clear the hours
Then I should see zero regular hours


Scenario Outline: As a user, I should not be able to enter decimal values more than two digits


When I click on regular hours
And I select the hours "<hours>"
Then I should see the regular hours "<hours>"
Then I should see the total hours as "<hours>"
Examples:

|hours|
|1.253|

 @workerregression
Scenario Outline: As a user, I should be able to enter negative values

#When I click on regular hours
#When I click clear button

And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
When I click minus on hour pad
#And I click on done button
Then I should see the regular hours in hour pad "<regularhours>"
And I click on overtime1 on hour pad
And I clear the hours
And I click on overtime2 on hour pad
And I clear the hours
Then I should see the total hours in hour pad "<regularhours>"
Examples:

|regularhours|hour|hour1|hour2|
|-5.55|5|5|5|


     @workerregression
    Scenario Outline: As A user, I should be able to add the hours
    
    When I click on regular on hour pad
    And I clear the hours
    And I select the hours "<Regular hours>"
    When I click on overtime1 on hour pad
    And I select the hours "<Overtime1>"
    When I click on overtime2 on hour pad
    And I select the hours "<Overtime2>"
    And I click on done
    When I click on shift
    And I select the shift "<shift>"
    Then I should see the selected shift "<shift>"
    When I click on select task code
    And I select the task "<Task Code>"
    And I click on select button
    And I click on add button
   
    
    Examples:
    
    |Regular hours| Overtime1 | Overtime2 |shift|Task Code|
    |5|2|2|Automation|AutomationTask111|

    
    @workerregression
    Scenario Outline: As a user, I should be able to edit the regular hours from hours main screen
        
    
When I click on regular hours
And I clear the hours
And I select the hours "<regularhours>"
And I click on done button
Then I should see the regular hours "<regularhours>"
Then I should see the total hours as "<regularhours>" "<overtime1>" "<overtime2>"
Then I should see the total hours in hours main screen "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|regularhours|overtime1|overtime2|
|3|2|2|



 @workerregression
Scenario Outline: As a user, I should be able to edit the overtime1 hours from hours main screen

When I click on Overtime1
And I clear the hours
And I select the hours "<overtime1>"
And I click on done button
Then I should see the overtime1 hours "<overtime1>"
Then I should see the total hours as "<regularhours>" "<overtime1>" "<overtime2>"
Then I should see the total hours in hours main screen "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|overtime1|regularhours|overtime2|
|4|3|2|

 @workerregression
Scenario Outline: As a user, I should be able to edit the overtime2 hours from hours main screen


When I click on Overtime2
And I clear the hours
And I select the hours "<overtime2>"
And I click on done button
Then I should see the overtime2 hours "<overtime2>"
Then I should see the total hours as "<regularhours>" "<overtime1>" "<overtime2>"
Then I should see the total hours in hours main screen "<regularhours>" "<overtime1>" "<overtime2>"


Examples:

|overtime1|regularhours|overtime2|
|4|3|5|

 @workerregression
Scenario: As a user , I should be able to see the title as Hours

When I click on Overtime2
Then I should see the title as hours in hour pad




 @workerregression
Scenario Outline: As a user, I should see the selected hours on clicking hour pad again


Then I should see the regular hours in hour pad "<regular>"


Examples:

|regular|
|3|

 @workerregression @workerregression
Scenario: As a user, I should be able to cancel the hour pad

When I click on cancel button in hour pad
Then I should see add worker hours screen


 @workerregression @workerregression
Scenario: As a user, I should be able to clear the value from hour pad

When I click on regular hours
When I clear the hours
Then I should see zero regular hours

  @workerregression @workerregression
    Scenario Outline:As a user, I should be able to add the regular hours with decimals


And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the regular hours "<hours>"
Then I should see the total hours as "<hours>" "<overtime1>" "<overtime2>"
Then I should see the total hours in hours main screen "<hours>" "<overtime1>" "<overtime2>"

Examples:

|hour|hour1|hour2|hours|overtime1|overtime2|
|1|2|5|1.25|4|5|




 @workerregression
Scenario Outline: As a user, I should be able to enter negative values

When I click on regular hours
When I clear the hours

And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
When I click minus on hour pad
#And I click on done button
Then I should see the regular hours in hour pad "<regularhours>"
And I click on overtime1 on hour pad
And I clear the hours
And I click on overtime2 on hour pad
And I clear the hours
Then I should see the total hours in hour pad "<regularhours>"
And I click on done button
And I click on delete hour

Examples:

|regularhours|hour|hour1|hour2|
|-5.55|5|5|5|

    
     @workerregression @workerregression
    Scenario Outline: As a user, I should be able to delete the added record
    
    When I click on delete hour
    And I click on yes button
    Then I should not see the added record for hours "<projectname>"
    
    Examples:
    
    |project|
    |AutomationPS1180|
    
    
    
  @workerregression @reg6
    Scenario Outline: As A user, I should be able to add the hours
    
    When I click on add worker hours
When I click on regular hours
    And I select the hours "<Regular hours>"
    When I click on overtime1 on hour pad
    And I select the hours "<Overtime1>"
    When I click on overtime2 on hour pad
    And I select the hours "<Overtime2>"
    And I click on done
    When I click on shift
    And I select the shift "<shift>"
    Then I should see the selected shift "<shift>"
    When I click on select task code
    And I select the task "<Task Code>"
    And I click on select button
    And I click on add button
   
    
    Examples:
    
    |Regular hours| Overtime1 | Overtime2 |shift|Task Code|
    |5|2|2|Automation|AutomationTask111|