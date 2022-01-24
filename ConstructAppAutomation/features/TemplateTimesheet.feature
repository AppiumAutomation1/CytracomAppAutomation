#Author: Prashanthi
Feature: Construct 365 Field App Template TimeSheet Summary Feature


   
  #scenario 1 
  @smoke @crew   @templateregression
  Scenario: User should be able to see CrewTimeSheet Screen
  
    
    When I click on hamburger menu
    And I click on Template timesheet button on home screen
   #Then  I should see Crew timesheet as title of the screen
   
   #scenario 2
   @smoke @crew   @templateregression
   Scenario Outline: As a User, I should be able to see the Crew details
   
    When I click please select a crew
    And I select a crew "<Crewname>"
    Then I click select button
    #Then I should see Crew id on the screen "<Crewname>"
    #Then I should see Crew description "<crewdescription>"
    
    
    Examples:
    
    |Crewname             | crewdescription | 
    |Crew119Automation | Automation Crew | 
    
    #scenario 3
    @smoke @crew  @templateregression
    Scenario: As a user, I want to verify the today's date in Crew timesheet screen
    
    Then I should see the date as current date
    
    
    
    
    #scenario 6
    @smoke @crew  @templateregression
    Scenario: As a user, I should see Crew signature status as pending
    
    
    Then I should see the Crew signature status as pending
    And I should see the customer signature as not signed
    
     
    @smoke @crew  @templateregression
    Scenario Outline: As a user, I should be able to add notes
    
    When I click on notes
    Then I should be able to add the notes "<note>"
    
    Examples:
    |note|
    |Adding crew timesheet| 
    
    
    
    
     @crew  @templateregression
     Scenario: As a User, I should be able to see todays date on clicking today
   
   When I click on today
   Then I should see the date as current date
   
    @templateregression
  Scenario: As a user, I should be navigated back to crew screen when I click on back
  
    When I click please select a crew
    And I click on back button
    Then I should see crew timesheet summary screen
   
    @templateregression
   Scenario: As a user, I should be navigated back to crew screen when I click on cancel
   
   When I click please select a crew
   And I click on cancel button
   Then I should see crew timesheet summary screen
   
    @templateregression
   Scenario: Verify the title of the screen
   
   When I click please select a crew
   Then I should see select crew as title of the screen
   
    @templateregression
    Scenario: Verify the header titles for the My crews
    
    Then I should see the header titles as Crew ID and Crew Description
    
     
   
    @templateregression
   Scenario Outline: As a user, I should see the details of my crew when I select the crew
   When I click on search bar in crew
   And I enter the search text in search bar "<Crew Id>"
   And I select a crew "<Crew Id>"
   Then I should see the crew details "<Crew Id>" "<Description>" 
   Then I should see crew worker details "<Workername1>" "<Workername2>" "<Personnel number1>" "<Personnel number2>"
   
   
   Examples:
   
   |Crew Id|Description|Crew Foreman|Workername1|Workername2|Personnel number1|Personnel number2|
   |Crew119Automation|Automation Crew|Prashanthi|AutomationWorker1 skvl|AutomationWorker2 worker|12345|12312|
   
    @templateregression
      Scenario: Verify the crew members title
      
      Then I should see the title as crew members
   
    @templateregression
      Scenario Outline: As a user, I should see the crew foreman details
   
   Then I should see the crew foreman name "<Crew Foreman>" 
   
   Examples:
   
   |Crew Foreman|
   |Prashanthi|
    
   
    @templateregression
   Scenario Outline: As a user, I should be able to search for the crew in My crews
   
   When I click on search bar in crew
   And I enter the search text in search bar "<searchText>"
   And I select a crew "<Crewname>"
    Then I click select button
    Then I should see Crew id on the screen "<Crewname>"
    
    Examples:
    
    |Crewname|searchText|
    |Crew119Automation|Crew119Automation|
   
    @templateregression
   Scenario Outline: As a user, I should be able to search for the crew in All crews
   
   When I click please select a crew
   When I click on all crews
    And I enter the search text in search bar "<searchText>"
   And I select a crew "<Crewname>"
    Then I click select button
    
    Examples:
    
   |Crewname|searchText|
    |Crew119Automation|Crew119Automation|
   
    @crew  @templateregression
    Scenario Outline: As a user,I should be able to attach a file

When I click file attachment
And I click on picture
And I select the image "<image>"
Then I should see the file attached status

Examples:

|image|
|Photo, March 31, 2018, 12:44 AM|

 @crew  @templateregression
Scenario: As a user,I should be able to see the attached file

When I click on attached file
#Then I should see the picture opened


 @crew  @templateregression
Scenario Outline: As a user, I should be able to see the attached files count

When I close picture
When I click on picture
And I select the image "<image>"
Then I should see the attached files count "<filecount>"

Examples:

|filecount|image|
|2|Photo, August 09, 2012, 3:25 AM|

 @crew  @templateregression
Scenario: As a user, I should be able to collapse the file attachment window

When I click on collapse in crew summary
Then I should not see the picture attached

 @crew  @templateregression
Scenario: As a user, I should be able to remove the attached file

When I click file attachment
When I click on remove button
When I click on remove button
Then I should not see the attached file



 @crew  @templateregression
Scenario Outline: As a user, I should be able to clear the notes

When I click on notes
And I click clear button
Then I should not see the entered notes "<notes>"

Examples:

|notes|
|Adding worker timesheet |

   

  @templateregression
Scenario: As a user, I should see worker , customer signature and Foreman tabs

When I click tap to sign tab
Then I should see crew customer signature and foreman tabs

  @templateregression
Scenario: As a user, I should be able to cancel and return to summary page

When I click on cancel button
Then I should see crew timesheet summary screen

  @templateregression
Scenario: As a user, I should be able to see the status as not signed for Foreman and customer signature

When I click tap to sign tab
Then I should see the status as not signed for crew foreman and customer signature

  @templateregression
Scenario Outline: As a user, I should see total hours in foreman signature page

When I click on cancel button
And I click on hours button
And I select the first worker in template timesheet

    When I click on regular hours for worker1
    And I select the hours "<Regular hours>"
    And I click on done
    When I click on overtime1 hours for worker1
    And I select the hours "<Overtime1>"
    And I click on done
    When I click on overtime2 hours for worker1
    And I select the hours "<Overtime2>"
    And I click on done
    
Then I click on summary tab
And I click tap to sign tab
Then I should see the total hours in sign hours "<Regular hours>" "<Overtime1>" "<Overtime2>"

Examples:
    
	 |Task Code|  Regular hours| Overtime1 | Overtime2 |shift|
    |AutomationTask111|5|2|2|Night|
    

  @templateregression
Scenario: As a user, I should be able to go back and return to summary page

When I click on back button
Then I should see crew timesheet summary screen


 @templateregression
Scenario Outline: As a user, I should see project, hours and task related info on expanding

#When I click on expand icon
And I click tap to sign tab
Then I should see crew name on the sign hours screen "<crewname>"
Then I should see the details on the sign hours screen as "<Regular hours>" "<Overtime1>" "<Overtime2>"
#Then I should see the total hours as "<Regular hours>" "<Overtime1>" "<Overtime2>"
    
    Examples:
   |crewname|Regular hours| Overtime1 | Overtime2 |
    |AS|5|2|2|
    
     @templateregression
    Scenario Outline: As a user, I should see crew name in worker signature page

When I click on crew worker not signed status button "<crewworker>"
Then I should see the worker name in worker summary expander page "<crewworker>"

Examples:

|crewworker|
|AutomationWorker1 skvl|

 @templateregression
Scenario: As a user, I should see selected date in worker signature page


  Then I should see the date as current date in sign hours
  
   @templateregression
Scenario: As a user, I should be able to click close in worker signature and return to sign hours page

When I click on close popup
Then I should see the sign hours page

 @templateregression
Scenario: As a user, I should see the disclaimer on crew worker signature page

When I click on crew worker not signed status button "AutomationWorker1 skvl"
Then I should see disclaimer text on the screen
    
     @templateregression
Scenario Outline: As a user, I should see worker name in crew foreman signature page

When I click on close popup
And I click on crew foreman not signed status
Then I should see crew name on the sign hours screen "<workername>"

Examples:

|workername|
|AS|

 @templateregression
Scenario: As a user, I should see selected date in  crew foreman signature page


  Then I should see the date as current date in sign hours
  
    @templateregression
Scenario: As a user, I should be able to click close in foreman page and return to sign hours page

When I click on close popup
Then I should see the sign hours page

  @templateregression
Scenario: As a user, I should see the disclaimer on foreman signature page

When I click on foreman not signed status
Then I should see disclaimer text on the screen

 @templateregression
Scenario Outline: As a user, I should see total hours in customer signature page

When I click on close popup
And I click on customer signature not signed status
Then I should see the total hours in sign hours "<Regular hours>" "<Overtime1>" "<Overtime2>"

Examples:
   |project code|Task Code|Regular hours| Overtime1 | Overtime2 |
    |AutomationPS1180|AutomationTask111|5|2|2|
    
  @templateregression
Scenario: As a user, I should see Hours summary as title in customer signature page

Then I should see hours summary as title


    
    
       @templateregression 
Scenario Outline: As a user, I should be able to  enter workername in customer signature page

When I enter worker name "<workername>"
Then I should see the entered workername "<workername>"

Examples:

|workername|
|shanthi s|


  @templateregression
Scenario: As a user, I should see selected date in signature page

Then I should see the date as current date in sign hours

  @templateregression
Scenario: As a user, I should be able to click close and return to sign hours page

When I click on close popup
Then I should see the sign hours page

 @templateregression
Scenario: As a user, I should see the disclaimer on customer signature page

When I click on customer signature not signed status
Then I should see disclaimer text on the screen
When I click on close popup
When I click on back button
   
    
    
    
    
    
    
    
    

 