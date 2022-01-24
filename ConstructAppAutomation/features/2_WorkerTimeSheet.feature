#Author: Prashanthi
Feature: Construct 365 Field pp Worker TimeSheet Summary Feature

#scenario 1
  @smoke @workerregression @reg6
  Scenario: User should be able to see WorkerTimeSheet Screen
  
    
    When I click on hamburger menu
    And I click on worker timesheet button on home screen
   
   
   #scenario 2
   @smoke @regression 
   Scenario Outline: As a User, I should be able to see the worker details
   
    Then I should see worker name on the screen "<workername>"
    Then I should see worker personnel number "<personnel number>"
    #Then I should see job classification "<jobclassification>"
    
    Examples:
    
    |workername             | personnel number | jobclassification |
    |Prashanthi Sunkavalli | 1004 | |
    
    #scenario 3
    @smoke @workerregression
    Scenario: As a user, I want to verify the today's date
    
    Then I should see the date as current date
    
    
    #scenario 4
    
    Scenario: As a user, I should see empty hours on the screen
    
    Then I should see no hours on the worker timesheet screen
    
    #scenario 5
    @smoke  @workerregression @reg6
    Scenario Outline: As a user, I should see the selected project on worker timesheet
    
    When I click on please select a project
    When I click on allow once button
    And I select any project "<project>"
    And I click on select button
    Then I should see the selected project on the workertimesheet screen "<project>"
    And I should see the selected project description "<project description>"
    
    Examples:
    
    |project| project description|customer|
    |AutomationPS1180|1111 Pennsylvania Avenue|prashanthi|
    
    #scenario 6
    @smoke @workerregression
    Scenario: As a user, I should see worker signature status as pending
    
    
    Then I should see the worker signature status as pending
    And I should see the customer signature as not signed
    
     #scenario 7
    Scenario: As a User, I should be able to logout from the app
    
    When I click on hamburger menu
    And I click on logout button
    
    @workerregression @smoke
   Scenario: As a user, I should see the place holder text in notes

   When I click on notes
   Then I should see place holder text in notes

    #scenario 8
    @smoke @workerregression
    Scenario Outline: As a user, I should be able to add notes in worker timesheet
    
    
    Then I should be able to add the notes "<note>"
    
    Examples:
    |note|
    |Adding worker timesheet|   
     
    @workerregression
    Scenario Outline: As a User, I  should be able to change the worker name
    
    When I click on change worker name
    And I select a worker "<workername>"
    And I click select button
    Then I should see worker name on the screen "<workername>"
    Then I should see worker personnel number "<personnel number>"
    
    Examples:
    
     |workername             | personnel number | 
    |John S Field | 0000000041 | 
    
    @workerregression
    Scenario: As a User,I should see the search workers label
    
    When I click on change worker name
    Then I should see search workers label
    
    @workerregression
    Scenario: As a User, I should see the Worker Name and Personnel number headers
    
    Then I should see worker name and personnel number headers
    
    
    Scenario Outline:As a User, I should be able to Search by worker name
    
    When I click on search bar in change worker
    And I enter "<workername>"
    Then I should see the search results with "<workername>"
    
    Examples:
    
    |workername|
    |Prashanthi Sunkavalli|
 
     
    Scenario Outline:As a User, I should be able to Search by personnel number
    
    When I click on search bar in change worker
    And I enter "<personnelnumber>"
    Then I should see the search results with "<personnelnumber>"
    
    Examples:
    
    |personnelnumber|
    |18907637|
    
    
    Scenario Outline:As a User, I should be not able to see the workers with invalid data
    
    When I click on search bar in change worker
    And I enter "<workername>"
    Then I should not see the search results with "<workername>"
    
    Examples:
    
   |workername|
    |xmlapitest|
    
    @workerregression
   Scenario: As a User, I should return to summary screen after clicking cancel button
    
    
    When I click on cancel button
    Then I should see worker timesheet summary screen
    
    
   @workerregression
    Scenario: As a user, I should see all projects label
    
    When I click on please select a project
     #Then I should see the label as Select project
     Then I should see the label as All projects
     
     @workerregression
     Scenario Outline: As a user, I should be able to search for a project by Project id
     
     When I click on search bar in select project screen
     And I enter project id "<projectid>"
     Then I should see the search results with "<projectid>"
     
     Examples:
     
     
    |projectid|
    |AutomationPS1180|
    
     
     Scenario Outline: As a user, I should be able to search for a project by Description
     
     When I click on search bar in select project screen
     And I enter project description "<projectdescription>"
     Then I should see the search results with "<projectdescription>"
     
     Examples:
     
     
    |projectdescription|
    |las angels empire|
    
    @workerregression
    Scenario: As a user, I should see location range 
     
    
     Then I should see location range details
     
    
      Scenario Outline: As a user, I should be not be able to search with invalid data
      
     When I click on search bar in select project screen
     And I enter project description "<invalid data>"
     Then I should not see the search results with "<invalid data>"
     
     Examples:
     
     
    |invalid data|
    |test xyz dara|
    
    
   Scenario: As a User, I should return to summary screen after clicking cancel button in search project
    
    
    When I click on cancel button
    Then I should see worker timesheet summary screen
    
    @workerregression
   Scenario: As a User, I should return to summary screen after clicking back button in search project
    
    When I click on please select a project
    When I click on back button
    Then I should see worker timesheet summary screen
    
    
    Scenario: As a user, I should be able to sync the data on select project
    
    
    When I click on sync button
    Then I should see the synced data
    
   
   Scenario Outline: As a User, I should be able to select the previous date
   
    When I click on back button
   When I click on calendar
   And I select the day "<day>"
   And I click on calendar
   Then I should see the selected date "<day>"
   
    Examples:
     
     
    |day|
    |1|
    
    @workerregression
     Scenario: As a User, I should be able to see todays date on clicking today
   
   When I click on today
   Then I should see the date as current date
   
   @workerregression
    Scenario Outline: As a user,I should be able to attach a file

When I click file attachment
And I click on picture
And I select the image "<image>"
Then I should see the file attached status

Examples:

|image|
|Photo, March 31, 2018, 12:44 AM|

@workerregression
Scenario: As a user,I should be able to see the attached file

When I click on attached file
#Then I should see the picture opened


@workerregression
Scenario Outline: As a user, I should be able to see the attached files count

When I close picture
When I click on picture
And I select the image "<image>"
Then I should see the attached files count "<filecount>"

Examples:

|filecount|image|
|2|Photo, August 09, 2012, 3:25 AM|

@workerregression
Scenario: As a user, I should be able to collapse the file attachment window

When I click on collapse
Then I should not see the picture attached

@workerregression
Scenario: As a user, I should be able to remove the attached file

When I click file attachment
When I click on remove button
When I click on remove button
Then I should not see the attached file



@workerregression
Scenario Outline: As a user, I should be able to clear the notes

When I click on notes
And I click clear button
Then I should not see the entered notes "<notes>"

Examples:

|notes|
|Adding worker timesheet |


@workerregression
  Scenario: As a user, I should be able to see sign hours page

When I click tap to sign tab
Then I should see sign hours as text

@workerregression
Scenario: As a user, I should see All tab , Not signed and signed tabs

Then I should see three different tabs in sign hours page

@workerregression
Scenario: As a user, I should see worker , customer signature and Foreman tabs

Then I should see worker customer signature and foreman tabs

@workerregression
Scenario: As a user, I should be able to cancel and return to summary page

When I click on cancel button
Then I should see worker timesheet summary screen

@workerregression
Scenario: As a user, I should be able to see the status as not signed for Foreman and customer signature

When I click tap to sign tab
Then I should see the status as not signed for foreman and customer signature

@workerregression
Scenario Outline: As a user, I should see total hours in foreman signature page

When I click on cancel button
And I click on hours button
When I click on add worker hours
When I click on select task code
And I select the task "<Task Code>"
And I click on select button
When I click on regular hours
And I select the hours "<Regular hours>"
And I click on done
When I click on Overtime1
And I select the hours "<Overtime1>"
And I click on done
When I click on Overtime2
And I select the hours "<Overtime2>"
And I click on done
When I click on shift
And I select the shift "<shift>"
When I click on add button
Then I click on summary tab
And I click tap to sign tab
Then I should see the total hours in sign hours "<Regular hours>" "<Overtime1>" "<Overtime2>"

Examples:
    
	 |Task Code| Task Description  |Regular hours| Overtime1 | Overtime2 |    shift|
    |AutomationTask111|Task|5|2|2|Automation|
    

@workerregression
Scenario: As a user, I should be able to go back and return to summary page

When I click on back button
Then I should see worker timesheet summary screen


@workerregression
Scenario Outline: As a user, I should see project, hours and task related info on expanding

#When I click on expand icon
And I click tap to sign tab
Then I should see worker name on the sign hours screen "<workername>"
Then I should see the details on the sign hours screen as "<Regular hours>" "<Overtime1>" "<Overtime2>"
#Then I should see the total hours as "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    Examples:
   |workername|Regular hours| Overtime1 | Overtime2 |
    |John S Field|5|2|2|
    
    @workerregression
    Scenario Outline: As a user, I should see worker name in worker signature page

When I click on worker not signed status button
Then I should see the worker name in worker summary expander page "<workername>"

Examples:

|workername|
|John S Field|

@workerregression
Scenario: As a user, I should see selected date in worker signature page


  Then I should see the date as current date in sign hours
  
  @workerregression
Scenario: As a user, I should be able to click close in worker signature and return to sign hours page

When I click on close popup
Then I should see the sign hours page

@workerregression
Scenario: As a user, I should see the disclaimer on worker signature page

When I click on worker not signed status button
Then I should see disclaimer text on the screen
    
 @workerregression   
Scenario Outline: As a user, I should see worker name in foreman signature page

When I click on close popup
And I click on foreman not signed status
Then I should see the worker name in foreman sign hours page "<workername>"

Examples:

|workername|
|Prashanthi Sunkavalli|

@workerregression
Scenario: As a user, I should see selected date in  foreman signature page


  Then I should see the date as current date in sign hours
  
  @workerregression 
Scenario: As a user, I should be able to click close in foreman page and return to sign hours page

When I click on close popup
Then I should see the sign hours page

@workerregression 
Scenario: As a user, I should see the disclaimer on foreman signature page

When I click on foreman not signed status
Then I should see disclaimer text on the screen

@workerregression 
Scenario Outline: As a user, I should see total hours in customer signature page

When I click on close popup
And I click on customer signature not signed status
Then I should see the total hours in sign hours "<Regular hours>" "<Overtime1>" "<Overtime2>"

Examples:
   |project code|Task Code|Regular hours| Overtime1 | Overtime2 |
    |AutomationPS1180|AutomationTask111|5|2|2|
    
@workerregression 
Scenario: As a user, I should see Hours summary as title in customer signature page

Then I should see hours summary as title


    
    
  @workerregression     
Scenario Outline: As a user, I should be able to  enter workername in customer signature page

When I enter worker name "<workername>"
Then I should see the entered workername "<workername>"

Examples:

|workername|
|shanthi s|


@workerregression 
Scenario: As a user, I should see selected date in signature page

Then I should see the date as current date in sign hours

@workerregression 
Scenario: As a user, I should be able to click close and return to sign hours page

When I click on close popup
Then I should see the sign hours page

@workerregression
Scenario: As a user, I should see the disclaimer on customer signature page

When I click on customer signature not signed status
Then I should see disclaimer text on the screen
When I click on close popup
When I click on back button


#As a user, I should return to summary screen after clicking accept button
#As a user, I should see selected date in foreman signature page
#As a user, I should see selected date in customer signature page

