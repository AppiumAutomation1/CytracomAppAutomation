package com.constructapp.stepdefinitions;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.constructapp.pageobjects.CrewHoursPage;
import com.constructapp.pageobjects.WorkerHoursPage;
import com.constructapp.pageobjects.WorkerTimeSheetSummaryPage;
import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class CrewHoursStepDefinitions extends CrewHoursPage {

	SoftAssert softassert = new SoftAssert();
	DriverUtilities utils = new DriverUtilities();
	Hooks hooks = new Hooks();

	@When("^I click add crew hours$")
    public void i_click_on_add_crew_hours() throws Throwable {
        clickAddCrewHours();
    }
	
	
	@Then("^I should see Crew id on the add hours screen \"([^\"]*)\"$")
    public void i_should_see_crew_id_on_the_screen( String arg1) throws Throwable {
        String expected = arg1;
		String actual = captureCrewId(arg1);
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Crew id is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^I should see Crew description in add hours screen\"([^\"]*)\"$")
    public void i_should_see_crew_description( String arg1) throws Throwable {
        String expected = arg1;
		String actual = captureCrewDesc(arg1);
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Crew description is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }
    
    @Then("^I should see the regular hours in crew \"([^\"]*)\"$")
    public void i_should_see_the_regular_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureRegularHoursInCrewHours();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Regular hours is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    @Then("^I should see the overtime1 hours in crew \"([^\"]*)\"$")
    public void i_should_see_the_overtime1_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureOvertime1HoursInCrewHours();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "overtime1 hours is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    @Then("^I should see the overtime2 hours in crew \"([^\"]*)\"$")
    public void i_should_see_the_overtime2_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureOvertime2HoursInCrewHours();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "overtime2 hours is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

	

	@When("^I click on regular hours in crew$")
    public void i_click_on_regular_hours_in_crew() throws Throwable {
        ClickOnRegular();
    }
	
	@When("^I click on Overtime1 in Crew$")
    public void i_click_on_overtime1() throws Throwable {
    	clickOverTime1();
    }

    @When("^I click on Overtime2 in Crew$")
    public void i_click_on_overtime2() throws Throwable {
        clickOverTime2();
    }
    
    @When("^I click on summary tab in Crew$")
    public void i_click_on_summary_tab_in_crew() throws Throwable {
        clickSummaryTab();
    }
    
    @Then("^I shoud see the selected hours in crew \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_shoud_see_the_selected_hours_in_crew(String arg1, String arg2, String arg3) throws Throwable {
    	String expectedRegularHours = arg1;
		String actualRegularHours = captureRegularHours();
		
		String expectedOverTime1 = arg2;
		String actualTOverTime1 = captureOvertime1Hours();
		
		String expectedOverTime2 = arg3;
		String actualTOverTime2 = captureOvertime2Hours();

		if (expectedRegularHours.equals(actualRegularHours) && expectedOverTime1.equals(actualTOverTime1) && expectedOverTime2.equals(actualTOverTime2)) {

			Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
			Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
			Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);

		} else {
			Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
			Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
			Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);


			softassert.assertEquals(actualRegularHours, expectedRegularHours, "Regular hours is not matching");
			softassert.assertEquals(actualTOverTime1, expectedOverTime1, "Overtime1 hours is not matching");
			softassert.assertEquals(actualTOverTime2, expectedOverTime2, "Overtime2 hours is not matching");

			hooks.addScreenshot();
		}
    }
    
    @Then("^I should see the total hours in crew hours screen \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours(String arg1, String arg2, String arg3) throws Throwable {
        
    	String actual = captureTotalHours();
    	int actualTotalHours = Integer.parseInt(actual);
    	int expectedTotalHours = Integer.parseInt(arg1)+Integer.parseInt(arg2)+Integer.parseInt(arg3);
   
    	if (expectedTotalHours == actualTotalHours) {

			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);

		} else {
			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);
			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

			hooks.addScreenshot();
		}
    }
    
    @Then("^I should see summary and details tabs$")
    public void i_should_see_summary_and_details_tabs() throws Throwable {
    	String expected = "Summary";
		String actual = captureSummaryText();
		
		String expected1 = "Details";
		String actual1 = captureDetails();
		
		

		if (expected.equals(actual) && expected1.equals(actual1) ) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
			

			softassert.assertEquals(actual, expected, "Summary text is not matching");
			softassert.assertEquals(actual1, expected1, "Details text is not matching");

			hooks.addScreenshot();
		}
        
    }

    

	@Then("^I should see the headers of summary tab$")
    public void i_should_see_the_headers_of_summary_tab() throws Throwable {
    	String expected = "Crew Members";
		String actual = captureCrewMembersText();
		
		String expected1 = "Regular";
		String actual1 = captureRegularText();
		
		String expected2 = "Total Hours";
		String actual2 = captureTotalHoursText();

		
		

		if (expected.equals(actual) && expected1.equals(actual1) && expected2.equals(actual2)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
			Reporter.addStepLog("Actual text is " + actual2);
			Reporter.addStepLog("Expected text is " + expected2);
		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
			Reporter.addStepLog("Actual text is " + actual2);
			Reporter.addStepLog("Expected text is " + expected2);
			

			softassert.assertEquals(actual, expected, "Crewmembers text is not matching");
			softassert.assertEquals(actual1, expected1, "Regular text is not matching");
			softassert.assertEquals(actual2, expected2, "TotalHours text is not matching");

			hooks.addScreenshot();
		}
        
        
    }

   
	@When("^I click on details tab$")
    public void i_click_on_details_tab() throws Throwable {
        
        clickDetailsTab();
    }

    
	@Then("^I should see the headers of details tab$")
    public void i_should_see_the_headers_of_details_tab() throws Throwable {
        
    	String expected = "Worker";
		String actual = captureWorkerText();
		
		String expected1 = "Project";
		String actual1 = captureProjectText();
		
		String expected2 = "Task";
		String actual2 = captureTaskText();
		
		String expected3 = "Regular | OT1 | OT2";
		String actual3 = captureRegularText();
		
		String expected4 = "Hours";
		String actual4 = captureHoursText();
		
		

		if (expected.equals(actual) && expected1.equals(actual1) && 
				expected2.equals(actual2) && expected3.equals(actual3) &&
				expected4.equals(actual4)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
			Reporter.addStepLog("Actual text is " + actual2);
			Reporter.addStepLog("Expected text is " + expected2);
			Reporter.addStepLog("Actual text is " + actual3);
			Reporter.addStepLog("Expected text is " + expected3);
			Reporter.addStepLog("Actual text is " + actual4);
			Reporter.addStepLog("Expected text is " + expected4);
		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
			Reporter.addStepLog("Actual text is " + actual2);
			Reporter.addStepLog("Expected text is " + expected2);
			Reporter.addStepLog("Actual text is " + actual3);
			Reporter.addStepLog("Expected text is " + expected3);
			Reporter.addStepLog("Actual text is " + actual4);
			Reporter.addStepLog("Expected text is " + expected4);
			

			softassert.assertEquals(actual, expected, "Worker text is not matching");
			softassert.assertEquals(actual1, expected1, "Project text is not matching");
			softassert.assertEquals(actual2, expected2, "Task text is not matching");
			softassert.assertEquals(actual3, expected3, "Regular text is not matching");
			softassert.assertEquals(actual4, expected4, "Hours text is not matching");

			hooks.addScreenshot();
		}
        
    }

    

	@When("^I click on search worker bar in add crew hours$")
    public void i_click_on_search_worker_bar_in_add_crew_hours() throws Throwable {
        
        clickSearchWorkerBar();
    }

    


	@When("^I enter the search text in worker search bar \"([^\"]*)\"$")
    public void i_enter_the_search_text_in_worker_search_bar(String arg1) throws Throwable {
        enterSearchText(arg1);
        
    }

  

	@When("^I click on add worker button$")
    public void i_click_on_add_worker_button() throws Throwable {
        clickAddWorkerButton();
        
    }

	 @Then("^I should not see the deselected worker name \"([^\"]*)\"$")
	    public void i_should_see_the_deselected_workername(String arg1) throws Throwable {
	    	
			boolean actual = verifyDeselectedWorkerPresence(arg1);

			if (actual == false) {

				Reporter.addStepLog("Deselected worker is not displaying " + actual);
				

			} else {
				Reporter.addStepLog("Deselected worker is displaying " + actual);
				softassert.assertFalse(actual, "Displaying deselected worker");

				hooks.addScreenshot();
			}
	    }
	 
	 
	 @When("^I click on back button in crew select task$")
	    public void i_click_on_back_button_in_crew_select_task() throws Throwable {
	        clickBackBtnInSelectTask();
	    }
	    
	 @Then("^I should see the selected worker name \"([^\"]*)\"$")
	    public void i_should_see_the_selected_worker_name(String arg1) throws Throwable {
	    	
			boolean actual = verifyDeselectedWorkerPresence(arg1);

			if (actual) {

				Reporter.addStepLog("selected worker is not displaying " + actual);
				

			} else {
				Reporter.addStepLog("selected worker is not displaying " + actual);
				softassert.assertTrue(actual, "Displaying selected worker");

				hooks.addScreenshot();
			}
	    }



	@Then("^I should see selected worker in the list \"([^\"]*)\"$")
    public void i_should_see_selected_worker_in_the_list(String arg1) throws Throwable {
    	 String expected = arg1;
 		String actual = captureAddedCrewMember();
 		System.out.println("actual is " + actual);

 		if (expected.equals(actual)) {

 			Reporter.addStepLog("Actual text is " + actual);
 			Reporter.addStepLog("Expected text is " + expected);

 		} else {
 			Reporter.addStepLog("Actual text is " + actual);
 			Reporter.addStepLog("Expected text is " + expected);
 			softassert.assertEquals(actual, expected, "selected worker text is not matching");

 			hooks.addScreenshot();
 			softassert.assertAll();
 		}
        
    }

   
   

	


	@Then("^I should see the header titles as Worker Name and Personnel Number$")
    public void i_should_see_the_header_titles_as_Worker_Name_and_Personnel_Number() throws Throwable {
    	String expected = "Worker Name";
		String actual = captureWorkerNameHeader();
		
		String expected1 = "Personnel Number";
		String actual1 = capturePersonnelNumberHeader();
		
		

		if (expected.equals(actual) && expected1.equals(actual1) ) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			Reporter.addStepLog("Actual text is " + actual1);
			Reporter.addStepLog("Expected text is " + expected1);
			

			softassert.assertEquals(actual, expected, "workername text is not matching");
			softassert.assertEquals(actual1, expected1, "personnel number text is not matching");

			hooks.addScreenshot();
		}
        
    }

    


	@Then("^I should see the search workers text$")
    public void i_should_see_the_search_workers_text() throws Throwable {
    	 String expected = "Search Workers";
 		String actual = captureSearchWorkersText();
 		System.out.println("actual is " + actual);

 		if (expected.equals(actual)) {

 			Reporter.addStepLog("Actual text is " + actual);
 			Reporter.addStepLog("Expected text is " + expected);

 		} else {
 			Reporter.addStepLog("Actual text is " + actual);
 			Reporter.addStepLog("Expected text is " + expected);
 			softassert.assertEquals(actual, expected, "Search Workers text is not matching");

 			hooks.addScreenshot();
 			softassert.assertAll();
 		}
        
    }

	@When("^I click on summary tab in crew hours$")
    public void i_click_on_summary_tab() throws Throwable {
        clickSummaryTabInCrewHours();
    }
	
	@Then("^I should see the total hours in crew hours main screen \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_in_crew_hours_main_screen(String arg1,String arg2) throws Throwable {
        
		
String actual = WorkerHoursPage.captureTotalHoursInMainScreen();
    	
    	double actualTotalHours = 0.0;
    	double expectedTotalHours = 0.0;
    	
    	
    	
    	if(arg1.contains(".") && arg2.contains(".")) {
    	 actualTotalHours = Double.parseDouble(actual);
    	 
    	 expectedTotalHours = Double.parseDouble(arg1)+Double.parseDouble(arg2);
    	 if (expectedTotalHours == actualTotalHours) {

 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);

 		} else {
 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);
 			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");
            
 			hooks.addScreenshot();
			softassert.assertAll();

 		}
     }else if(arg1.contains(".") && !(arg2.contains("."))) {
    	 actualTotalHours = Double.parseDouble(actual);
    	 
    	 expectedTotalHours = Double.parseDouble(arg1)+Integer.parseInt(arg2);
    	 if (expectedTotalHours == actualTotalHours) {

 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);

 		} else {
 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);
 			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");
            
 			hooks.addScreenshot();
			softassert.assertAll();

 		}
     }else if(!(arg1.contains(".")) && (arg2.contains("."))) {
    	 actualTotalHours = Double.parseDouble(actual);
    	 
    	 expectedTotalHours = Integer.parseInt(arg1)+Double.parseDouble(arg2);
    	 if (expectedTotalHours == actualTotalHours) {

 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);

 		} else {
 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);
 			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");
            
 			hooks.addScreenshot();
			softassert.assertAll();

 		}
     }
    	else {
    		int actualTotalHours1 = Integer.parseInt(actual);
        	int expectedTotalHours1 = Integer.parseInt(arg1)+Integer.parseInt(arg2);
        	if (expectedTotalHours1 == actualTotalHours1) {

     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);

     		} else {
     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);
     			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

     			hooks.addScreenshot();
				softassert.assertAll();

     		}
    	}
       
     }

	 @Then("^I should see the total hours for the worker \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_should_see_the_total_hours_for_the_worker(String arg1, String arg2, String arg3,String arg4) throws Throwable {
	        
	    	String actual = captureTotalHoursOftheWorker(arg4);
	    	

	    	
	    	double actualTotalHours = 0.0;
	    	double expectedTotalHours = 0.0;
	    	
	    	
	    	
	    	if(actual.contains(".")) {
	    	 actualTotalHours = Double.parseDouble(actual);
	    	 expectedTotalHours = Double.parseDouble(arg1)+Double.parseDouble(arg2)+Double.parseDouble(arg3);
	    	 if (expectedTotalHours == actualTotalHours) {

	 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
	 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);

	 		} else {
	 			Reporter.addStepLog("Actual total hours is " + actualTotalHours);
	 			Reporter.addStepLog("Expected total hours is " + expectedTotalHours);
	 			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

	 			hooks.addScreenshot();
				softassert.assertAll();

	 		}
	     }
	    	else {
	    	int actualTotalHours1 = Integer.parseInt(actual);
	    	int expectedTotalHours1 = Integer.parseInt(arg1)+Integer.parseInt(arg2)+Integer.parseInt(arg3);
	   
	    	if (expectedTotalHours1 == actualTotalHours1) {

				Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
				Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);

			} else {
				Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
				Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);
				softassert.assertEquals(actualTotalHours1, expectedTotalHours1, "Total hours is not matching");

				hooks.addScreenshot();
				softassert.assertAll();

			}
	    	}
	    }
	 
	
	 
	 @And("^I click on delete crew hour \"([^\"]*)\" \"([^\"]*)\"$")
	    public void i_click_on_delete_crew_hour(String arg1, String arg2) throws Throwable {
	    	
	    	TouchAction action = new TouchAction(driver);
	    	
	    	//action.longPress(driver.findElement(MobileBy.AccessibilityId(arg2))).
	    	//moveTo(driver.findElement(MobileBy.AccessibilityId(arg1))).release().perform();
	        clickDeleteCrewHour();
	    }
	    

	@Then("^I should see the add crew hours screen$")
    public void i_should_see_add_crew_hours_screen() throws Throwable {
    	 String expected = "Worker Name";
    	 Thread.sleep(2000);
 		String actual = captureAddCrewHoursText();
 		System.out.println("actual is " + actual);

 		if (expected.equals(actual)) {

 			Reporter.addStepLog("Actual text is " + actual);
 			Reporter.addStepLog("Expected text is " + expected);

 		} else {
 			Reporter.addStepLog("Actual text is " + actual);
 			Reporter.addStepLog("Expected text is " + expected);
 			softassert.assertEquals(actual, expected, "Add crew hours text is not matching");

 			hooks.addScreenshot();
 			softassert.assertAll();
 		}
        
    }
	
	@And("^I expand the crew \"([^\"]*)\"$")
    public void I_expand_the_record(String arg1) throws Throwable {
        
    	expandCrew(arg1);
    }


	
	
	

	@Then("^I should see the details on the hours screen as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_details_on_the_hours_screen(String arg1, String arg2, String arg3, String arg4, String arg5,String arg6) throws Throwable {
    	String expectedRegularHours = arg4;
		String actualRegularHours = captureRegularHoursInCrew();
		
		String expectedOverTime1 = arg5;
		String actualTOverTime1 = captureOvertime1HoursInCrew();
		
		String expectedOverTime2 = arg6;
		String actualTOverTime2 = captureOvertime2HoursInCrew();
		
		String expectedTaskCode = arg3;
		String actualTaskCode = captureTaskCode(arg3);
		
		String expectedProject = arg2;
		String actualProject = captureProjectName(arg2);
		
		String expectedWorker = arg1;
		String actualWorker = captureWorkerName(arg1);

		if (expectedWorker.equals(actualWorker)&& expectedProject.equals(actualProject)&& expectedTaskCode.equals(actualTaskCode)&& expectedRegularHours.equals(actualRegularHours) && expectedOverTime1.equals(actualTOverTime1) && expectedOverTime2.equals(actualTOverTime2)) {

			Reporter.addStepLog("Actual Project name  is " + actualProject);
			Reporter.addStepLog("Expected project name is " + expectedProject);
			Reporter.addStepLog("Actual task code  is " + actualTaskCode);
			Reporter.addStepLog("Expected task code is " + expectedTaskCode);
			Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
			Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
			Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);
			Reporter.addStepLog("Actual worker name  is " + actualWorker);
			Reporter.addStepLog("Expected worker name is " + expectedWorker);

		} else {
			Reporter.addStepLog("Actual Project name  is " + actualProject);
			Reporter.addStepLog("Expected project name is " + expectedProject);
			Reporter.addStepLog("Actual task code  is " + actualTaskCode);
			Reporter.addStepLog("Expected task code is " + expectedTaskCode);
			Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
			Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
			Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);
			Reporter.addStepLog("Actual worker name  is " + actualWorker);
			Reporter.addStepLog("Expected worker name is " + expectedWorker);

			softassert.assertEquals(actualTaskCode, expectedTaskCode, "Task code is not matching");
			softassert.assertEquals(actualProject, expectedProject, "Project name is not matching");
			softassert.assertEquals(actualRegularHours, expectedRegularHours, "Regular hours is not matching");
			softassert.assertEquals(actualTOverTime1, expectedOverTime1, "Overtime1 hours is not matching");
			softassert.assertEquals(actualTOverTime2, expectedOverTime2, "Overtime2 hours is not matching");
			softassert.assertEquals(actualWorker, expectedWorker, "Worker name is not matching");


			hooks.addScreenshot();
		}
    }
	
	
	@Then("^I should see the details on the hours screen in summary tab \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_details_on_the_hours_screen(String arg1, String arg2, String arg3, String arg4) throws Throwable {
    	String expectedRegularHours = arg2;
		String actualRegularHours = captureRegularHoursInCrew();
		
		String expectedOverTime1 = arg3;
		String actualTOverTime1 = captureOvertime1HoursInCrew();
		
		String expectedOverTime2 = arg4;
		String actualTOverTime2 = captureOvertime2HoursInCrew();
		
		
		
		String expectedWorker = arg1;
		String actualWorker = captureWorkerName(arg1);

		if (expectedWorker.equals(actualWorker)&& expectedRegularHours.equals(actualRegularHours) && expectedOverTime1.equals(actualTOverTime1) && expectedOverTime2.equals(actualTOverTime2)) {

			
			Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
			Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
			Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);
			Reporter.addStepLog("Actual worker name  is " + actualWorker);
			Reporter.addStepLog("Expected worker name is " + expectedWorker);

		} else {
			
			Reporter.addStepLog("Actual Regular hours  is " + actualRegularHours);
			Reporter.addStepLog("Expected Regular hours is " + expectedRegularHours);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTOverTime1);
			Reporter.addStepLog("Expected Over time hours is " + expectedOverTime1);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualTOverTime2);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedOverTime2);
			Reporter.addStepLog("Actual worker name  is " + actualWorker);
			Reporter.addStepLog("Expected worker name is " + expectedWorker);

			softassert.assertEquals(actualRegularHours, expectedRegularHours, "Regular hours is not matching");
			softassert.assertEquals(actualTOverTime1, expectedOverTime1, "Overtime1 hours is not matching");
			softassert.assertEquals(actualTOverTime2, expectedOverTime2, "Overtime2 hours is not matching");
			softassert.assertEquals(actualWorker, expectedWorker, "Worker name is not matching");


			hooks.addScreenshot();
		}
    }
	
	@Then("^I should see the date as current date in hours screen$")
	public void i_should_see_the_date_as_current_date_in_hours_screen() throws Throwable {

		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		//get current date time with Date()
		Date date = new Date();

		// Now format the date
		String dateFormatted= dateFormat.format(date);
		String[] dates = dateFormatted.split("/");
		int month = Integer.valueOf(dates[0]);
		
		String year = dates[2].replace("20", "");
		String actualMonth = utils.getMonthForInt(month);
		
		int day = Integer.valueOf(dates[1]);
		String daytext = String.valueOf(day);;
		if(day <= 9) {
			 daytext = "0"+daytext;
			System.out.println("daytext is"+daytext);
		}
		String expectedDate = actualMonth.substring(0,3)+" "+daytext+","+Integer.valueOf(year);
		String actualDate = WorkerTimeSheetSummaryPage.captureDateInHoursScreen();

		if (expectedDate.equals(actualDate)) {

			Reporter.addStepLog("Actual text is " + actualDate);
			Reporter.addStepLog("Expected text is " + expectedDate);

		} else {
			Reporter.addStepLog("Actual text is " + actualDate);
			Reporter.addStepLog("Expected text is " + expectedDate);
			softassert.assertEquals(actualDate, expectedDate, "Current date is not matching");

			hooks.addScreenshot();
			softassert.assertAll();

		}
	}



}
