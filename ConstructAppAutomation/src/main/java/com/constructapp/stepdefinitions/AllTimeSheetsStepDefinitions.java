package com.constructapp.stepdefinitions;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.constructapp.pageobjects.AllTimeSheetsPage;
import com.constructapp.pageobjects.WorkerTimeSheetSummaryPage;
import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;

public class AllTimeSheetsStepDefinitions extends AllTimeSheetsPage {

	SoftAssert softassert = new SoftAssert();
	DriverUtilities utils = new DriverUtilities();
	Hooks hooks = new Hooks();
	
	
	
	@And("^I click on all timesheets$")
	public void i_click_on_all_timesheets() throws Throwable {

		clickOnAllTimeSheets();
	}


	
	@Then("^I click on complete button$")
	public void i_click_on_complete_button() throws Throwable {

		clickComplete();
	}

	@Then("^I click on Today button$")
	public void i_click_on_today_button() throws Throwable {

		clickToday();
	}

	@Then("^I click on submit button for timesheet$")
	public void i_click_on_submit_button_for_timesheet() throws Throwable {

		clickSubmit();
	}

	@Given("^I should see completed status for the worker timesheet \"([^\"]*)\"$")
	public void i_should_see_worker_timesheet_as_title_of_the_screen(String arg1) throws Throwable {

		String expected = "Completed";
		String actual = captureCompleted(arg1);


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}
	
	@Given("^I should see completed status for the crew timesheet \"([^\"]*)\"$")
	public void i_should_see_completed_status_for_the_crew_timesheet(String arg1) throws Throwable {

		String expected = "Completed";
		String actual = captureCompletedForCrew(arg1);


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}

	@Given("^I should see submitted status for the worker timesheet \"([^\"]*)\"$")
	public void i_should_see_submitted_status_for_the_worker_timesheet(String arg1) throws Throwable {

		String expected = "Submitted";
		String actual = captureSubmitted(arg1);


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}

	@When("^I click on yes button$")
	public void i_click_on_please_select_a_project() throws Throwable {

		clickYesButton();
	}

	@When("^I select on no button$")
	public void i_select_any_project() throws Throwable {

		clickNo();
	}
	
	
	

	@Then("^I should see all timesheets screen$")
	public void i_should_see_all_timesheets_screen() throws Throwable {
		String expected = "All Timesheets";
		String actual = captureAllTimeSheetsText();


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
		
	}

	

	/*@Then("^I should see the error message without adding any hours$")
	public void i_should_see_the_error_message_without_adding_any_hours() throws Throwable {
		String expected = "";
		String actual = captureErrorMessageOnAlert();


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}*/

	/*public String captureErrorMessageOnAlert() {
		
	}
	
public void clickWorkerTimesheetFromHome() {
		
		
	}

public void clickOkOnTheAlert() {
	
}*/





	


	@When("^I click on home button$")
	public void i_click_on_home_button() throws Throwable {
		clickUsingAccessibilityId("home");
	}

	

	public void clickOkOnTheHomeButton() {
		
		
	}



	@Then("^I should see the calendar range for days$")
	public void i_should_see_the_calendar_range_for_days() throws Throwable {
		
		String actualrange = captureCalendarRange();
		

				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

				// get current date time with Date()
				Date date = new Date();

				// Now format the date
				String dateFormatted = dateFormat.format(date);

				System.out.println(dateFormatted);

				String[] dates = dateFormatted.split("/");

				LocalDate newdate = LocalDate.now().minusDays(5);

				LocalDate newdate1 = LocalDate.now().minusDays(1);

				String newrange = String.valueOf(newdate);
				System.out.println(newdate);

				String[] datevalues = newrange.split("-");

				int day = Integer.valueOf(datevalues[2]);
				String daytext = String.valueOf(day);
				;
				if (day <= 9) {
					daytext = "0" + daytext;
					System.out.println("daytext is" + daytext);
				}

				int month = Integer.valueOf(datevalues[1]);

				String actualMonth = DriverUtilities.getMonthForInt(month);
				
				int year = Integer.valueOf(datevalues[0]);
				
				newrange = actualMonth +" "+daytext+", "+String.valueOf(year);
				
				

				String newrange1 = String.valueOf(newdate1);
				
				String[] datevalues1 = newrange1.split("-");

				int day1 = Integer.valueOf(datevalues1[2]);
				String daytext1 = String.valueOf(day1);
				
				if (day1 <= 9) {
					daytext1 = "0" + daytext1;
					System.out.println("daytext1 is" + daytext1);
				}

				int month1 = Integer.valueOf(datevalues1[1]);

				String actualMonth1 = DriverUtilities.getMonthForInt(month1);
				
				int year1 = Integer.valueOf(datevalues1[0]);
				
				newrange1 = actualMonth1 +" "+daytext1+", "+String.valueOf(year1);
				
				
				
				

				String expectedrange = newrange + " " + "- " + newrange1;

				System.out.println(expectedrange);
				
				
				if (expectedrange.equals(actualrange)) {

					Reporter.addStepLog("Actual text is " + actualrange);
					Reporter.addStepLog("Expected text is " + expectedrange);

				} else {
					Reporter.addStepLog("Actual text is " + actualrange);
					Reporter.addStepLog("Expected text is " + expectedrange);
					softassert.assertEquals(expectedrange, actualrange);

					hooks.addScreenshot();
					softassert.assertAll();
				}
				

			}
	
	
	@Then("^I should see the calendar range for one day$")
	public void i_should_see_the_calendar_range_for_one_day() throws Throwable {
		
		String actualrange = captureCalendarRange();
		

				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

				// get current date time with Date()
				Date date = new Date();

				// Now format the date
				String dateFormatted = dateFormat.format(date);

				System.out.println(dateFormatted);

				String[] dates = dateFormatted.split("/");

				int day = Integer.valueOf(dates[1]);
				String daytext = String.valueOf(day);
				;
				if (day <= 9) {
					daytext = "0" + daytext;
					System.out.println("daytext is" + daytext);
				}

				int month = Integer.valueOf(dates[0]);

				String actualMonth = DriverUtilities.getMonthForInt(month);
				
				int year = Integer.valueOf(dates[2]);
				
				String newrange = actualMonth +" "+daytext+", "+String.valueOf(year);
				
				

				String expectedrange = newrange + " " + "- " + newrange;

				System.out.println(expectedrange);
				
				
				if (expectedrange.equals(actualrange)) {

					Reporter.addStepLog("Actual text is " + actualrange);
					Reporter.addStepLog("Expected text is " + expectedrange);

				} else {
					Reporter.addStepLog("Actual text is " + actualrange);
					Reporter.addStepLog("Expected text is " + expectedrange);
					softassert.assertEquals(expectedrange, actualrange);

					hooks.addScreenshot();
					softassert.assertAll();
				}
				

			}
	
	 @When("^I click on today in alltimesheets$")
	    public void i_click_on_today() throws Throwable {
	     clickToday();   
	    }
	

	@Then("^I should see the home screen$")
	public void i_should_see_the_home_screen() throws Throwable {
		String expected = "Home";
		String actual = captureHomeText();


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}



	



	@Then("^I should see the filter as Timesheet Status$")
	public void i_should_see_the_filter_as_Timesheet_Status() throws Throwable {
		String expected = "Timesheet Status";
		String actual = DriverUtilities.captureTextByAccessibilityId(expected);


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}

	


	@Then("^I should see the filter as Timesheet Type$")
	public void i_should_see_the_filter_as_Timesheet_Type() throws Throwable {
		String expected = "Timesheet Type";
		String actual = DriverUtilities.captureTextByAccessibilityId(expected);


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}

	
	


	@Then("^I should see the table headers of all timesheets$")
	public void i_should_see_the_table_headers_of_all_timesheets() throws Throwable {
		String expected = "CrewForeman /Worker";
		String actual = captureCrewForemanHeader();
		
		String expected1 = "Date";
		String actual1 = captureDateHeader();
		
		String expected2 = "Crew Description";
		String actual2 = captureCrewDesc();
		
		String expected3 = "Total Hours";
		String actual3 = captureTotalHoursHeader();
		
		String expected4 = "Status";
		String actual4 = captureStatusHeader();


		if (expected.equals(actual) && expected1.equals(actual1) && expected2.equals(actual2) && expected3.equals(actual3)
				&& expected4.equals(actual4)) {

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
			softassert.assertEquals(expected, actual);
			softassert.assertEquals(expected1, actual1);
			softassert.assertEquals(expected2, actual2);
			softassert.assertEquals(expected3, actual3);
			softassert.assertEquals(expected4, actual4);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}

	

	
	
	@Then("^Verify the current date timesheets are displayed$")
	public void verify_the_current_date_timesheets_are_displayed() throws Throwable {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String expected = dateFormat.format(date);
		
		String actual = DriverUtilities.captureTextByAccessibilityId(expected);
		
		


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}

	
	@When("^I click on edit$")
	public void i_click_on_edit() throws Throwable {
	    clickOnEdit();
	}

	@Then("^I should see the regular hours for worker timesheet in all timesheet \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_should_see_the_regular_hours_for_worker_timesheet_in_all_timesheet(String arg1,String arg2) throws Throwable {
	    
		String expected = arg1;

		
		String actual = captureRegularHoursInAllTimeSheets(arg2);


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
		
		
	}
	
	



	@Then("^I should see the overtime1 hours for worker timesheet in all timesheet \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_should_see_the_overtime1_hours_for_worker_timesheet_in_all_timesheet(String arg1,String arg2) throws Throwable {
	    
		String expected = arg1;
		
		String actual = captureOvertime1HoursInAllTimeSheets();


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
		
		
	}
	
	


	@Then("^I should see the overtime2 hours for worker timesheet in all timesheet \"([^\"]*)\"$")
	public void i_should_see_the_overtime2_hours_for_worker_timesheet_in_all_timesheet(String arg1) throws Throwable {
	    
		String expected = arg1;
		
		String actual = captureOvertime2HoursInAllTimeSheets();


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
		
		
	}
	
	@Then("^I should see the total hours for worker timesheet in all timesheet \"([^\"]*)\"$")
	public void i_should_see_the_total_hours_for_worker_timesheet_in_all_timesheet(String arg1) throws Throwable {
	    
		String expected = arg1;
		
		String actual = captureTotalHours();


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
		
		
	}
	
	

	



	@Then("^I should see the regular hours for crew timesheet in all timesheet \"([^\"]*)\"$")
	public void i_should_see_the_regular_hours_for_crew_timesheet_in_all_timesheet(String arg1) throws Throwable {
	    
		
		
		
	}

	@Then("^I should see the total hours for crew timesheet in all timesheets \"([^\"]*)\"$")
	public void i_should_see_the_total_hours_for_crew_timesheet_in_all_timesheets(String arg1) throws Throwable {
	    
		
		
	}

	
	@Then("^I should see the overtime(\\d+) hours for crew timesheet in all timesheet \"([^\"]*)\"$")
	public void i_should_see_the_overtime_hours_for_crew_timesheet_in_all_timesheet(int arg1, String arg2) throws Throwable {
	    
	}

	

	@Then("^I expand the timesheet \"([^\"]*)\"$")
	public void i_expand_the_timesheet(String arg1) throws Throwable {
	    ExpandTimesshet(arg1);
	}

	



	@Then("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {
	    clickDeleteButton();
	}

	

	


	@Then("^I should see the summary screen of the timesheet$")
	public void i_should_see_the_summary_screen_of_timesheet() throws Throwable {
		
		String expected = "AI_summaryTab";
		String actual = captureTextByAccessibilityId(expected);
		


		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(expected, actual);

			hooks.addScreenshot();
			softassert.assertAll();
		}
		
	    
	}

	
		
	    
	

	@Then("^I click on submit$")
	public void i_click_on_submit() throws Throwable {
	    clickSubmit();
	}

	@Then("^I should see the status as submitted$")
	public void i_should_see_the_status_as_submitted() throws Throwable {
	    
	}
	
	@Then("^I click on Timesheet status$")
	public void i_click_on_timesheet_status() throws Throwable {
	    clickTimeSheetStatus();
	}
	
	



	@Then("^I should see timesheets with submitted status$")
	public void i_should_see_timesheets_with_submitted_status() throws Throwable {
		
		
		List<WebElement> submittedStatuses = (List<WebElement>) driver.findElements(MobileBy.AccessibilityId("Submitted"));
		
		for(WebElement s: submittedStatuses) {
			
			String submittedText = s.getText();
			
			if(submittedText.equals("Submitted")) {
				Reporter.addStepLog("Actual text is " + submittedText);
				Reporter.addStepLog("Expected text is " + "Submitted");

			} else {
				Reporter.addStepLog("Actual text is " + submittedText);
				Reporter.addStepLog("Expected text is " + "Submitted");
				softassert.assertEquals(submittedText, "Submitted");

				hooks.addScreenshot();
				softassert.assertAll();
				
			}
			
			
			
		}
		
	    
	}
	
	@And("^I select \"([^\"]*)\"$")
	public void i_select(String arg1) throws Throwable {
		
		selectStatus(arg1);
		
	    
	}




	
	



}

	/*@When("^I click on select button$")
	public void i_click_on_submit_button() throws Throwable {

		clickSelectButton();
	}*/

	
