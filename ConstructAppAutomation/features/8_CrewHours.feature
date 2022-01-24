#Author: Prashanthi
Feature: Construct 365 Field App crew TimeSheet Hours Feature

#scenario 1
@smoke  @crewregression
  Scenario: User should be able to see crew Hours Screen
  
    
    When I click on hours button
    
        @crewregression
    Scenario Outline: As a user, I should be able to delete the added record
    
   
    When I click on delete crew hour "<workername>" "<Task>"
    And I click on yes button
    
    
    Examples:
    
    |workername|Task|
    |AutomationWorker1 skvl|AutomationTask111|
    |AutomationWorker2 worker|AutomationTask111|
    
   
   
   #scenario 2
   @smoke  @crewregression
   Scenario Outline: As a User, I should be able to see the crew details
   
    Then I should see Crew id on the screen "<Crewname>"
    Then I should see Crew description "<crewdescription>"
    
    
  
    Examples:
    
    |Crewname             | crewdescription | 
    |Crew119Automation | Automation Crew | 
 
    
    #scenario 3 
    @smoke  @crewregression
    Scenario: As a user, I want to verify the today's date in crew hours screen
    
    Then I should see the date as current date in hours screen
    
    
    #scenario 4 
    @smoke  @crewregression
    Scenario: As a user, I should see zero hours on the  crew screen
    
    Then I should see zero hours on the screen
    
    
    
    #scenario 5
    Scenario: As a user, I should see no record on the screen for the first time
    
    Then I should see no record on the screen for the first time
    
   
     
    Scenario: Verify the summary headers
    
    When I click on summary tab in crew hours
    Then I should see the headers of summary tab
    
    @crewregression
    Scenario: Verify the summary headers
    
    When I click on details tab
    Then I should see the headers of details tab
    
    
    #scenario 6
    @smoke  @crewregression
   Scenario Outline: As a User, I should be able to see the crew details in add crew hours screen
   
   And I click add crew hours
    Then I should see Crew id on the add hours screen "<Crewname>"
    Then I should see Crew description in add hours "<crewdescription>"
    

    
    Examples:
    
   |Crewname             | crewdescription | 
    |Crew119Automation | Automation Crew | 
    
     @crewregression
   Scenario Outline: As a user, I should see the crew foreman details
   
   Then I should see the crew foreman name "<Crew Foreman>" 
   
   Examples:
   
   |Crew Foreman|
   |Prashanthi|
   
    
  
    
   Scenario: Verify the title of the screen
   
   
   Then I should see the add crew hours screen
   
    @crewregression
    Scenario: Verify the header titles for the search workers
    
    Then I should see the header titles as Worker Name and Personnel Number
    
    
   
   
    
  
     #scenario 6
    Scenario Outline: As A user, I should see selected project and description in hours pop up
    
    
    Then I should see project and description which is selected in summary page "<project>" and "<project description>"
     Examples:
    
    |project| project description|
    |||
    

    Scenario Outline: As a user, I should be able to change the project id

#When I click on add worker hours
When I click project id
And I select any project "<projectid>"
And I click on select button

Examples:

|projectid|
|P000002|
    
     @crewregression
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
    
     
       
    @crewregression
    Scenario: As a user, I should see location range 
     
    
     Then I should see location range details
     
     
    
    
    @crewregression
   Scenario: As a User, I should return to summary screen after clicking cancel button in search project
    
    
    When I click on cancel button
    Then I should see the add crew hours screen
    
    @crewregression
Scenario: As a user ,  I should see the title as select task

When I click on select task code
Then I should see the title as select task


Scenario: As a user, I should see the subtitle as project tasks

Then I should see the subtitle as project tasks


Scenario: As a user, I should see the search a task place holder

Then I should see the search task place holder

  @crewregression
Scenario: As a user, I should see the task id and description headers

Then I should see the headers as task id and description

  @crewregression
Scenario Outline: As a user, I should be able to search the  task with task id

When I click on search bar in select task
And I enter task "<taskid>"
Then I should see the search results with "<taskid>"

Examples:

|taskid|
|AutomationTask111|




  @crewregression
Scenario: As a user, I should be able to go back to add crew hours screen

When I click on back button in crew select task
Then I should see the add crew hours screen

  @crewregression
Scenario Outline: As a user, I should be able to cancel the select task screen

#When I click on add worker hours
When I click on select task code
And I select any task "<taskid>"
And I click on cancel button
Then I should see the add crew hours screen

Examples:

|taskid|
|AutomationTask111|



    
  

  @crewregression
Scenario: As a user, I should be able to go back to add crew hours screen

When I click on select task code
When I click on back button in crew select task
Then I should see the add crew hours screen
    
    
     #scenario 7
     @smoke @crewregression
    Scenario Outline: As a user, I should be able to select the task code
    
    When I click on select task code
    And I select the task "<Task Code>"
    And I click on select button
    #Then Verify the task code and description in hours page "<Task Code>" and "<Task Description>"
    
    Examples:
    
    |Task Code| 
    |AutomationTask111|
    
    
   
    #scenario 8
     @smoke
    Scenario Outline: As A user, I should be able to select the hours in add crew hours
    
    When I click on regular hours in crew
    And I select the hours "<Regular hours>"
    And I click on done
    When I click on Overtime1 in Crew
    And I select the hours "<Overtime1>"
    And I click on done
    When I click on Overtime2 in Crew
    And I select the hours "<Overtime2>"
    And I click on done
    Then I shoud see the selected hours in crew "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    Examples:
    
    |Regular hours| Overtime1 | Overtime2 |
    |5|2|2|
    
    
     #scenario 9
      @smoke
    Scenario Outline: As a user, I should be able to select the shift in crew
    
    When I click on shift
    And I select the shift "<shift>"
    Then I should see the selected shift "<shift>"
    
    
    Examples:
    
    |shift|
    |Night|
    
     #scenario 10
     @smoke
    Scenario Outline: As a user,I should see the selected data on the crew hours screen
    
    When I click on add button
    Then I should see the details on the hours screen as "<worker>" "<project>" "<Task>" "<Regular hours>" "<Overtime1>" "<Overtime2>"
    Then I should see the total hours in crew hours screen "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    Examples:
   |worker|project|Task |Regular hours| Overtime1 | Overtime2 |
    |AutomationWorker1 skvl|AutomationPS1180|AutomationTask111|5|2|2|
    
    #scenario 11
     @smoke
    Scenario Outline: As a user,I should see the selected data on the summary tab in crew hours screen
    
    When I click on summary tab in Crew
    Then I should see the details on the hours screen in summary tab "<worker>" "<Regular hours>" "<Overtime1>" "<Overtime2>"
    Then I should see the total hours in crew hours screen "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    Examples:
   |worker|Regular hours| Overtime1 | Overtime2 |
    |AutomationWorker1 skvl|5|2|2|
    
    
    
   @crewregression
    Scenario Outline:As a user, I should be able to add the regular hours with decimals

When I click on regular hours in crew
And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the regular hours in crew "<hours>"
Then I should see the total hours "<hours>"
Examples:

|hour|hour1|hour2|hours|
|1|2|5|1.25|



@crewregression
Scenario Outline: As a user, I should see total hours when I add both regular and overtime1 hours


When I click on Overtime1 in Crew
And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the overtime1 hours in crew "<overtime1>"
Then I should see the total hours "<regularhours>" "<overtime1>"

Examples:

|regularhours|hour|hour1|hour2|overtime1|
|1.25|2|2|3|2.23|

@crewregression
Scenario Outline: As a user, I should see total hours when I add both regular and overtime1 and overtime2 hours


When I click on Overtime2 in Crew
And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the overtime2 hours in crew "<overtime2>"
Then I should see the total hours "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|overtime1|regularhours|overtime2|hour|hour1|hour2|
|2.23|1.25|3.23|3|2|3|

@crewregression
Scenario: As a user , I should be able to see the title as Hours

When I click on Overtime2 in Crew
Then I should see the title as hours in hour pad




@crewregression
Scenario Outline: As a user, I should see the selected hours on clicking hour pad again


Then I should see the regular hours in hour pad "<regular>"


Examples:

|regular|
|1.25|

@crewregression
Scenario: As a user, I should be able to cancel the hour pad

When I click on cancel button in hour pad
Then I should see the add crew hours screen


@crewregression
Scenario: As a user, I should be able to clear the value from hour pad

When I click on regular hours in crew
When I clear the hours
Then I should see zero regular hours




@crewregression
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


    @crewregression
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
    
      
   

    
   @crewregression
    Scenario Outline: As a user, I should be able to edit the regular hours from hours main screen
        
 When I expand the crew "<workername>"   
When I click on regular hours
And I clear the hours
And I select the hours "<regularhours>"
And I click on done button
Then I should see the regular hours "<regularhours>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"

Examples:

|regularhours|overtime1|overtime2|workername|worker1hours|worker2hours|
|3|2|2|AutomationWorker1 skvl|7|9|



@crewregression
Scenario Outline: As a user, I should be able to edit the overtime1 hours from hours main screen


When I click on Overtime1
And I clear the hours
And I select the hours "<overtime1>"
And I click on done button
Then I should see the overtime1 hours "<overtime1>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"

Examples:

|overtime1|regularhours|overtime2|workername|worker1hours|worker2hours|
|4|3|2|AutomationWorker1 skvl|9|9|

@crewregression
Scenario Outline: As a user, I should be able to edit the overtime2 hours from hours main screen


When I click on Overtime2
And I clear the hours
And I select the hours "<overtime2>"
And I click on done button
Then I should see the overtime2 hours "<overtime2>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"



Examples:

|overtime1|regularhours|overtime2|workername|worker1hours|worker2hours|
|4|3|5|AutomationWorker1 skvl|12|9|

@crewregression
Scenario: As a user , I should be able to see the title as Hours

When I click on Overtime2
Then I should see the title as hours in hour pad




@crewregression
Scenario Outline: As a user, I should see the selected hours on clicking hour pad again


Then I should see the regular hours in hour pad "<regular>"


Examples:

|regular|
|3|

   @crewregression
Scenario: As a user, I should be able to cancel the hour pad

When I click on cancel button in hour pad



  @crewregression
Scenario: As a user, I should be able to clear the value from hour pad

When I click on regular hours
When I clear the hours
Then I should see zero regular hours

    @crewregression
    Scenario Outline:As a user, I should be able to add the regular hours with decimals


And I select the hours "<hour>"
And I click dot before decimal
And I select the hours "<hour1>"
And I select the hours "<hour2>"
And I click on done button
Then I should see the regular hours "<regularhours>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"

Examples:

|hour|hour1|hour2|regularhours|overtime1|overtime2|workername|worker1hours|worker2hours|
|1|2|5|1.25|4|5|AutomationWorker1 skvl|10.25|9|




  @crewregression
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


Examples:

|regularhours|hour|hour1|hour2|
|-5.55|5|5|5|

@crewregression
Scenario Outline: As a user, I should be able to select job classification

When I click on job classification dropdown
Then I select job classification "<jobclassification>"


Examples: 

|jobclassification|
|AA|

@crewregression
Scenario Outline: As a user, I should be able to select special pay

When I click on special pay dropdown
Then I select special pay "<specialpay>"


Examples:


|specialpay|
|Transport|   

    
       @crewregression
    Scenario Outline: As a user, I should be able to delete the added record
    
    When I expand the crew "<workername>"
    When I click on delete crew hour "<workername>" "<Task>"
    And I click on yes button
    Then I should not see the added record for hours "<Task>"
    
    Examples:
    
   |workername|Task|
    |AutomationWorker1 skvl|AutomationTask111|
    |AutomationWorker2 worker|AutomationTask111|
    
    
    
    
    @crewregression
     Scenario Outline: As a user, I should be able to search for the worker in add crew hours
   
   When I click add crew hours
   When I click on search worker bar in add crew hours
   And I enter the search text in worker search bar "<searchText>"
   And I select a worker "<workername>"
   And I click on add worker button
    Then I should see selected worker in the list "<workername>"
    
    Examples:
    
    |workername|searchText|
    |John S Field|John S Field|
    
   @crewregression
    Scenario Outline: As a user, I should be able to deselect the worker from crew
    
    When I select a worker "<workername>"
    
    Examples:
    
    |workername|
    |AutomationWorker1 skvl|
    
    
   @reg6 @crewregression
    Scenario Outline: As A user, I should be able to add the hours
    
   
When I click on regular hours in crew
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
    
   @crewregression
     Scenario Outline: As a user, I should not be able to see the worker name when it is deslected
    
    Then I should not see the deselected worker name "<workername>"
    
    Examples:
    
    |workername|
    |AutomationWorker1 skvl|
    
   @crewregression
     Scenario Outline: As a user, I should  be able to see the worker name when it is selected
    
    Then I should see the selected worker name "<workername>"
    
    Examples:
    
    |workername|
    |John S Field|
    
    
   @crewregression
    Scenario Outline: As a user, I should be able to edit the regular hours from hours main screen
        
 When I expand the crew "<workername>"   
When I click on regular hours
And I clear the hours
And I select the hours "<regularhours>"
And I click on done button
Then I should see the regular hours "<regularhours>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"

Examples:

|regularhours|overtime1|overtime2|workername|worker1hours|worker2hours|
|5|2|2|AutomationWorker2 worker|9|9|



@crewregression
Scenario Outline: As a user, I should be able to edit the overtime1 hours from hours main screen


When I click on Overtime1
And I clear the hours
And I select the hours "<overtime1>"
And I click on done button
Then I should see the overtime1 hours "<overtime1>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"

Examples:

|overtime1|regularhours|overtime2|workername|worker1hours|worker2hours|
|4|5|2|AutomationWorker2 worker|11|9|

@crewregression
Scenario Outline: As a user, I should be able to edit the overtime2 hours from hours main screen


When I click on Overtime2
And I clear the hours
And I select the hours "<overtime2>"
And I click on done button
Then I should see the overtime2 hours "<overtime2>"
Then I should see the total hours for the worker "<regularhours>" "<overtime1>" "<overtime2>" "<workername>"
Then I should see the total hours in crew hours main screen "<worker1hours>" "<worker2hours>"



Examples:

|overtime1|regularhours|overtime2|workername|worker1hours|worker2hours|
|4|5|6|AutomationWorker2 worker|15|9|
   
    
    
  
 
    
    
    
    
    
    
    
    
    
    

 