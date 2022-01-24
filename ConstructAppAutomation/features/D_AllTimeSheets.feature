Feature: All Timesheets


 @alltimesheets
  Scenario Outline: User should be able to add worker timesheet
  
    
    When I click on hamburger menu
    And I click on worker timesheet button on home screen
    When I click on please select a project
    When I click on allow once button
    And I select any project "<project>"
    And I click on select button
    And I click on change worker name
    And I select a worker "<workername>"
    And I click on select button
    And I click on hours button
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
    And I click on complete button
    And I click on yes button
    
   
    
    
    
    Examples:
    
    |project| customer|Regular hours| Overtime1 | Overtime2 |shift|Task Code|workername|
    |P0000000|prashanthi|5|2|2|Automation|102000|John S Field|    
    
    
   

@alltimesheets
Scenario: As a user, I should see the All timesheets screen


Then I should see all timesheets screen


Scenario: As a user, I should see the calendar range for five days

Then I should see the calendar range for days

@alltimesheets
Scenario: As a user, I should see the filters of the page

Then  I should see the filter as Timesheet Status
Then I should see the filter as Timesheet Type

@alltimesheets
Scenario: As a user, I should be navigated to home screen on clicking home

When I click on home button
Then I should see the home screen


Scenario: As a user, I should see the table headers

And I click on hamburger menu
And I click on all timesheets
Then I should see the table headers of all timesheets


@alltimesheets
Scenario: Verify the date range after clicking today
And I click on hamburger menu
And I click on all timesheets
When I click on today in alltimesheets
Then I should see the calendar range for one day



@alltimesheets
Scenario Outline: As a user, I should see the timesheet summary when I click edit


When I expand the timesheet "<timesheet>"
And I click on edit
Then I should see the summary screen of the timesheet

Examples:

|timesheet|
|John S Field|

@alltimesheets
Scenario Outline: As a user, I should be able to edit the regular hours from timesheet from all timesheets
   
   When I click on hours button
 And I expand the crew "<project>"   
When I click on regular hours
And I clear the hours
And I select the hours "<regularhours>"
And I click on done button
And I click on complete button
And I click on yes button
And I expand the timesheet "<worker>"
#Then I should see the regular hours for worker timesheet in all timesheet "<regularhours>" "<project>"
Then I should see the total hours for worker timesheet in all timesheet "<Total hours>"

Examples:

|regularhours|overtime1|overtime2|project|worker1hours|worker2hours|Total hours|worker|
|4|2|2|P0000000|7|9|8|John S Field|

@alltimesheets
Scenario Outline: As a user, I should be able to edit the overtime1 hours from timesheet from all timesheets
   
   When I click on edit
   When I click on hours button  
When I click on Overtime1
And I clear the hours
And I select the hours "<overtime1>"
And I click on done button
And I click on complete button
And I click on yes button
And I expand the timesheet "<worker>"
Then I should see the overtime1 hours for worker timesheet in all timesheet "<overtime1>" "<project>"
Then I should see the total hours for crew timesheet in all timesheets "<Total hours>"

Examples:

|regularhours|overtime1|overtime2|worker|worker1hours|worker2hours|Total hours|project|
|4|3|2|John S Field|7|9|9|P0000000|

@alltimesheets
Scenario Outline: As a user, I should be able to edit the overtime2 hours from timesheet from all timesheets
   
   When I click on edit
   When I click on hours button
 And I expand the crew "<project>"   
When I click on Overtime2
And I clear the hours
And I select the hours "<overtime2>"
And I click on done button
And I click on complete button
And I click on yes button
And I expand the timesheet "<worker>"
Then I should see the overtime2 hours for worker timesheet in all timesheet "<overtime2>"
Then I should see the total hours for crew timesheet in all timesheets "<Total hours>"
And I click on delete button
And I click on yes button

Examples:

|regularhours|overtime1|overtime2|worker|worker1hours|worker2hours|Total hours|project|
|4|3|4|John S Field|7|9|11|P0000000|



@alltimesheets
  Scenario Outline: User should be able to add crew timesheet
  
    
    When I click on hamburger menu
    And I click on Crew timesheet button on home screen
    When I click on please select a project
    When I click on allow once button
    And I select any project "<project>"
    And I click on select button
    When I click please select a crew
    
   And I select a crew "<Crew Id>"
    Then I click select button
    And I click on hours button
     And I click add crew hours
    When I click on regular hours in crew
    And I select the hours "<Regular hours>"
    And I click on done
    When I click on Overtime1 in Crew
    And I select the hours "<Overtime1>"
    And I click on done
    When I click on Overtime2 in Crew
    And I select the hours "<Overtime2>"
    And I click on done
    When I click on shift
    And I select the shift "<shift>"
    Then I should see the selected shift "<shift>"
    When I click on select task code
    And I select the task "<Task Code>"
    And I click on select button
    And I click on add button
    And I click on complete button
    And I click on yes button
    
   
    
    
    
    Examples:
    
    |project| Crew Id|Regular hours| Overtime1 | Overtime2 |shift|Task Code|
    |P0000000|Crew119Automation|5|2|2|Automation|102000|

@alltimesheets
Scenario Outline: As a user, I should be able to edit the regular hours from timesheet from all timesheets
 When I expand the crew "<Crew Id>"
 And I click on edit
 And I click on hours button
 When I expand the crew "<worker1>"   
When I click on regular hours
And I clear the hours
And I select the hours "<regularhours>"
And I click on done button
And I click on complete button
And I click on yes button
When I expand the crew "<Crew Id>"
#Then I should see the regular hours for worker timesheet in all timesheet "<regular1hours>" "<project>"
#Then I should see the total hours for crew timesheet in all timesheets "<Total hours>"

Examples:

|regularhours|overtime1|overtime2|Crew Id|worker1|regular1hours|worker2hours|Total hours|project|
|4|2|2|Crew119Automation|AutomationWorker1 skvl|9|9|17|P0000000|



@alltimesheets
Scenario Outline: As a user, I should be able to edit the overtime1 hours from timesheet from all timesheets
   
  
 And I click on edit
 And I click on hours button
  When I expand the crew "<worker1>"   
When I click on Overtime1
And I clear the hours
And I select the hours "<overtime1>"
And I click on done button
And I click on complete button
And I click on yes button
When I expand the crew "<Crew Id>"
#Then I should see the overtime1 hours for worker timesheet in all timesheet "<overtime1hours>" "<project>"
#Then I should see the total hours for crew timesheet in all timesheets "<Total hours>"

Examples:

|regularhours|overtime1|overtime2|Crew Id|worker1|overtime1hours|worker2hours|Total hours|project|
|4|3|2|Crew119Automation|AutomationWorker1 skvl|5|9|19|P0000000|


@alltimesheets
Scenario Outline: As a user, I should be able to edit the overtime2 hours from timesheet from all timesheets
   
  
 And I click on edit
 And I click on hours button
  When I expand the crew "<worker1>"   
When I click on Overtime2
And I clear the hours
And I select the hours "<overtime2>"
And I click on done button
And I click on complete button
And I click on yes button
When I expand the crew "<Crew Id>"
#Then I should see the overtime2 hours for worker timesheet in all timesheet "<overtime2hours>"
#Then I should see the total hours for crew timesheet in all timesheets "<Total hours>"
And I click on delete button
And I click on yes button

Examples:

|regularhours|overtime1|overtime2|Crew Id|worker1|overtime2hours|worker2hours|Total hours|project|
|4|3|3|Crew119Automation|AutomationWorker1 skvl|5|9|20|P0000000|


Scenario Outline: As a user, I should see the submit status for the timesheet

When I expand the crew "<Crew Id>"  
Then I click on submit
And I click on yes button
Then I should see submitted status for the worker timesheet "<Crew Id>"
When I expand the crew "<Crew Id>"
And I click on delete button
And I click on yes button

Examples:

|Crew Id|
|Crew119Automation|














