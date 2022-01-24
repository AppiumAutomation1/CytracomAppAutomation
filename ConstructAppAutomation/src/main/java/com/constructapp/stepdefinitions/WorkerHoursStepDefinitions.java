package com.constructapp.stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.constructapp.pageobjects.WorkerExpensesPage;
import com.constructapp.pageobjects.WorkerHoursPage;
import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class WorkerHoursStepDefinitions extends WorkerHoursPage {

	SoftAssert softassert = new SoftAssert();
	DriverUtilities utils = new DriverUtilities();
	Hooks hooks = new Hooks();

	
	@When("^I click on hours button$")
    public void i_click_on_hours_button() throws Throwable {
		
		clickHoursButton();
    }

    @Then("^I should see Hours as title of the screen$")
    public void i_should_see_hours_as_title_of_the_screen() throws Throwable {
    	String expected = "Hours";
		String actual = captureHoursTitle();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Hours title is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    	
    }
	@When("^I click on add worker hours$")
    public void i_click_on_add_worker_hours() throws Throwable {
        
		clickAddWorkerHours();
    }

    @When("^I click on select task code$")
    public void i_click_on_select_task_code() throws Throwable {
        selectTaskCode();
    }
    
    @When("^I select any task \"([^\"]*)\"$")
    public void i_select_any_task(String arg1) throws Throwable {
        selectTask(arg1);
    }

    @When("^I click on regular hours$")
    public void i_click_on_regular_hours() throws Throwable {
    	Thread.sleep(2000);
        ClickRegular();
    }
    
    @When("^I click on overtime1 on hour pad$")
    public void i_click_on_overtime1_on_hour_pad() throws Throwable {
        clickOverTime1InHourPad();
    }
    @When("^I click on overtime2 on hour pad$")
    public void i_click_on_overtime2_on_hour_pad() throws Throwable {
        clickOverTime2InHourPad();
    }
    @When("^I click on regular on hour pad$")
    public void i_click_on_regular_on_hour_pad() throws Throwable {
        clickRegularInHourPad();
    }

    @When("^I click on Overtime1$")
    public void i_click_on_overtime1() throws Throwable {
    	clickOverTime1();
    }

    @When("^I click on Overtime2$")
    public void i_click_on_overtime2() throws Throwable {
        clickOverTime2();
    }

    @When("^I click on shift$")
    public void i_click_on_shift() throws Throwable {
        clickOnShift();
    }

    @When("^I click on add button$")
    public void i_click_on_add_button() throws Throwable {
        clickOnAddButton();
    }

    @Then("^I should see zero hours on the screen$")
    public void i_should_see_zero_hours_on_the_screen() throws Throwable {
        
    	String expected = "0";
		String actual = captureHours();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Worker hours is not matching");

			hooks.addScreenshot();
		}
    }

    @Then("^I should see no record on the screen for the first time$")
    public void i_should_see_no_record_on_the_screen_for_the_first_time() throws Throwable {
        
    	
		boolean emptyRecordPresence = isRecordEmpty();

		if (!emptyRecordPresence) {

			Reporter.addStepLog("Record is empty " + emptyRecordPresence);

		} else {
			Reporter.addStepLog("Record is not empty " + emptyRecordPresence);
			
			softassert.assertTrue(emptyRecordPresence, "Empty record is not present");

			hooks.addScreenshot();
		}
    }

    @Then("^I should see project and description which is selected in summary page \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_should_see_project_and_description_which_is_selected_in_summary_page(String arg1, String arg2) throws Throwable {
        
    	String expectedProject = arg1;
		String actualProject = captureProjectName();
		
		String expectedProjectDesc = arg2;
		String actualProjectDesc = captureProjectDesc();

		if (expectedProject.equals(actualProject) && expectedProjectDesc.equals(actualProjectDesc)) {

			Reporter.addStepLog("Actual Project name  is " + actualProject);
			Reporter.addStepLog("Expected project name is " + expectedProject);
			Reporter.addStepLog("Actual Project Description  is " + actualProjectDesc);
			Reporter.addStepLog("Expected project Description is " + expectedProjectDesc);

		} else {
			Reporter.addStepLog("Actual Project name  is " + actualProject);
			Reporter.addStepLog("Expected project name is " + expectedProject);
			Reporter.addStepLog("Actual Project Description  is " + actualProjectDesc);
			Reporter.addStepLog("Expected project Description is " + expectedProjectDesc);

			softassert.assertEquals(actualProject, expectedProject, "Project name is not matching");
			softassert.assertEquals(actualProjectDesc, expectedProjectDesc, "Project description is not matching");

			hooks.addScreenshot();
		}
    	
    }

    @Then("^Verify the task code and description in hours page \"([^\"]*)\" and \"([^\"]*)\"$")
    public void verify_the_task_code_and_description_in_hours_page(String arg1, String arg2) throws Throwable {
    	String expectedTaskCode = arg1;
		String actualTaskCode = captureTaskCode();
		
		String expectedTaskDescription = arg2;
		String actualTaskDescription = captureTaskDesc();

		if (expectedTaskCode.equals(actualTaskCode) && expectedTaskDescription.equals(actualTaskDescription)) {

			Reporter.addStepLog("Actual task code  is " + actualTaskCode);
			Reporter.addStepLog("Expected task code is " + expectedTaskCode);
			Reporter.addStepLog("Actual task Description  is " + actualTaskDescription);
			Reporter.addStepLog("Expected task Description is " + expectedTaskDescription);

		} else {
			Reporter.addStepLog("Actual task code  is " + actualTaskCode);
			Reporter.addStepLog("Expected task code is " + expectedTaskCode);
			Reporter.addStepLog("Actual task Description  is " + actualTaskDescription);
			Reporter.addStepLog("Expected task Description is " + expectedTaskDescription);

			softassert.assertEquals(actualTaskCode, expectedTaskCode, "Task code is not matching");
			softassert.assertEquals(actualTaskDescription, expectedTaskDescription, "Task description is not matching");

			hooks.addScreenshot();
		}
    }

    @Then("^I shoud see the selected hours \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_shoud_see_the_selected_hours(String arg1, String arg2, String arg3) throws Throwable {
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

    @Then("^I should see the selected shift \"([^\"]*)\"$")
    public void i_should_see_the_selected_shift(String arg1) throws Throwable {
    	String expected = arg1;
		String actual = captureSelectedShift();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual shift is " + actual);
			Reporter.addStepLog("Expected shif is " + expected);

		} else {
			Reporter.addStepLog("Actual shift is " + actual);
			Reporter.addStepLog("Expected shif is " + expected);
			softassert.assertEquals(actual, expected, "shift is not matching");

			hooks.addScreenshot();
		}
    }

    @Then("^I should see the details on the hours screen as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_details_on_the_hours_screen(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
    	String expectedRegularHours = arg3;
		String actualRegularHours = captureRegularHours();
		
		String expectedOverTime1 = arg4;
		String actualTOverTime1 = captureOvertime1Hours();
		
		String expectedOverTime2 = arg5;
		String actualTOverTime2 = captureOvertime2Hours();
		
		String expectedTaskCode = arg2;
		String actualTaskCode = WorkerExpensesPage.capturetaskcode(arg2);
		
		String expectedProject = arg1;
		String actualProject = WorkerExpensesPage.captureprojectid(arg1);

		if (expectedProject.equals(actualProject)&& expectedTaskCode.equals(actualTaskCode)&& expectedRegularHours.equals(actualRegularHours) && expectedOverTime1.equals(actualTOverTime1) && expectedOverTime2.equals(actualTOverTime2)) {

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

			softassert.assertEquals(actualTaskCode, expectedTaskCode, "Task code is not matching");
			softassert.assertEquals(actualProject, expectedProject, "Project name is not matching");
			softassert.assertEquals(actualRegularHours, expectedRegularHours, "Regular hours is not matching");
			softassert.assertEquals(actualTOverTime1, expectedOverTime1, "Overtime1 hours is not matching");
			softassert.assertEquals(actualTOverTime2, expectedOverTime2, "Overtime2 hours is not matching");

			hooks.addScreenshot();
		}
    }
    
    
    @Then("^I should see worker name in hours screen \"([^\"]*)\"$")
	public void i_should_see_worker_name_on_the_screen(String arg1) throws Throwable {

		String expected = arg1;
		System.out.println(arg1);
		String actual = captureWorkerName();
		System.out.println("actual is " + actual);

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			// test.log(Status.FAIL, "Assertion failed");
			softassert.assertEquals(actual, expected, "soft assert failed");

			hooks.addScreenshot();
			softassert.assertAll();
		}
	}
    @Then("^I should see the total hours as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours(String arg1, String arg2, String arg3) throws Throwable {
        
    	String actual = captureTotalHours();
    	

    	
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
    
    
    
    @Then("^I should see the total hours \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_as(String arg1) throws Throwable {
        
    	String actual = captureTotalHoursInAddWorkerHours();
    	
    	double actualTotalHours = 0.0;
    	double expectedTotalHours = 0.0;
    	
    	
    	
    	if(actual.contains(".")) {
    	 actualTotalHours = Double.parseDouble(actual);
    	 expectedTotalHours = Double.parseDouble(arg1);
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
    	else {
    		int actualTotalHours1 = Integer.parseInt(actual);
        	int expectedTotalHours1 = Integer.parseInt(arg1);
        	if (expectedTotalHours1 == actualTotalHours1) {

     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);

     		} else {
     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);
     			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

     			hooks.addScreenshot();
     		}
    	}
       
    	}
    
    @Then("^I should see the total hours in hours main screen \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_in_main_screen(String arg1) throws Throwable {
        
    	String actual = captureTotalHoursInMainScreen();
    	
    	double actualTotalHours = 0.0;
    	double expectedTotalHours = 0.0;
    	
    	
    	
    	if(actual.contains(".")) {
    	 actualTotalHours = Double.parseDouble(actual);
    	 expectedTotalHours = Double.parseDouble(arg1);
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
    	else {
    		int actualTotalHours1 = Integer.parseInt(actual);
        	int expectedTotalHours1 = Integer.parseInt(arg1);
        	if (expectedTotalHours1 == actualTotalHours1) {

     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);

     		} else {
     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);
     			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

     			hooks.addScreenshot();
     		}
    	}
       
    	}
   
    	
    
    @Then("^I should see the total hours \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_as(String arg1,String arg2) throws Throwable {
        
String actual = captureTotalHoursInAddWorkerHours();
    	
    	double actualTotalHours = 0.0;
    	double expectedTotalHours = 0.0;
    	
    	
    	
    	if(actual.contains(".")) {
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
     		}
    	}
       
    	}
    
    @Then("^I should see the total hours as \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours(String arg1,String arg2) throws Throwable {
        
String actual = captureTotalHours();
    	
    	double actualTotalHours = 0.0;
    	double expectedTotalHours = 0.0;
    	
    	
    	
    	if(actual.contains(".")) {
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
    
    
    @Then("^I should see the total hours in hours main screen \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_in_main_screen(String arg1,String arg2) throws Throwable {
        
String actual = captureTotalHoursInMainScreen();
    	
    	double actualTotalHours = 0.0;
    	double expectedTotalHours = 0.0;
    	
    	
    	
    	if(actual.contains(".")) {
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
    
    @Then("^I should see the total hours \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_as(String arg1,String arg2, String arg3) throws Throwable {
        
String actual = captureTotalHoursInAddWorkerHours();
    	
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
        	int expectedTotalHours1 = Integer.parseInt(arg1)+Integer.parseInt(arg2)+Integer.parseInt(arg2);
        	if (expectedTotalHours1 == actualTotalHours1) {

     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);

     		} else {
     			Reporter.addStepLog("Actual total hours is " + actualTotalHours1);
     			Reporter.addStepLog("Expected total hours is " + expectedTotalHours1);
     			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

     			hooks.addScreenshot();
     		}
    	}
       
    	}
    
    @Then("^I should see the total hours in hours main screen \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_in_main_screen(String arg1,String arg2, String arg3) throws Throwable {
        
String actual = captureTotalHoursInMainScreen();
    	
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
     			softassert.assertEquals(actualTotalHours, expectedTotalHours, "Total hours is not matching");

     			hooks.addScreenshot();
				softassert.assertAll();

     		}
    	}
       
    	}
   
   
    @Then("^I should see the total hours in sign hours \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_total_hours_in_sign_hours(String arg1, String arg2, String arg3) throws Throwable {
        
    	Thread.sleep(3000);
    	int expectedTotalHours = Integer.parseInt(arg1)+Integer.parseInt(arg2)+Integer.parseInt(arg3);

    	String arg4 = String.valueOf(expectedTotalHours);
    	String actual = driver.findElement(MobileBy.AccessibilityId(arg4)).getText();
    	int actualTotalHours = Integer.parseInt(actual);
   
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

    @And("^I select the task \"([^\"]*)\"$")
    public void i_select_the_task(String arg1) throws Throwable {
        
    	selectTask(arg1);
    }

    

    @And("^I select the hours \"([^\"]*)\"$")
    public void i_select_the_hours(String arg1) throws Throwable {
        
    	selectHours(arg1);
    }

    

    @And("^I select the shift \"([^\"]*)\"$")
    public void i_select_the_shift(String arg1) throws Throwable {
    	
    	
    	selectShift(arg1);
    }


    @When("^I click on cancel button in hour pad$")
    public void i_click_on_cancel_button_in_hour_pad() throws Throwable {
        clickCancelButtonInHourPad();
    }

  

    @Then("^I should see the title as select task$")
    public void i_should_see_the_title_as_select_task() throws Throwable {
        String expected = "All Task";
			String actual = captureSelectTaskTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "select task title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the subtitle as project tasks$")
    public void i_should_see_the_subtitle_as_project_tasks() throws Throwable {
        String expected = "Project Tasks";
			String actual = captureSubtitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "sub title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the search task place holder$")
    public void i_should_see_the_search_task_place_holder() throws Throwable {
        String expected = "";
			String actual = captureSearchTaskPlaceHolder();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "search task placeholder  is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    
    @When("^I click on search bar in select task$")
    public void i_click_on_search_bar_in_select_task() throws Throwable {
        clickSelectTaskSearchBar();
    }
    
    @When("^I enter task \"([^\"]*)\"$")
    public void i_enter_task(String arg1) throws Throwable {
    	enterTask(arg1);
    }
    @Then("^I should see the headers as task id and description$")
    public void i_should_see_the_headers_as_task_id_and_description() throws Throwable {
        String expected = "Task ID";
			String actual = captureTaskIdHeader();
			
			  String expected1 = "Description";
			String actual1 = captureTaskDescriptionHeader();
			
			 
	
			if (expected.equals(actual) && expected1.equals(actual1)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				
				Reporter.addStepLog("Actual text is " + actual1);
				Reporter.addStepLog("Expected text is " + expected1);
				
				
	
			} else {
					Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				
				Reporter.addStepLog("Actual text is " + actual1);
				Reporter.addStepLog("Expected text is " + expected1);
				
				softassert.assertEquals(actual, expected, "task id  title is not matching");
					softassert.assertEquals(actual1, expected1, "description title is not matching");
				
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

   

    @Then("^I should see hours screen$")
    public void i_should_see_hours_screen() throws Throwable {
        String expected = "";
			String actual = captureHoursTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "hours title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see add worker hours screen$")
    public void i_should_see_add_worker_hours_screen() throws Throwable {
        String expected = "Add Worker Hours";
			String actual = captureAddWorkerHoursTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "add worker hours title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    
    @When("^I click on back button in select task$")
    public void i_click_on_back_button_in_select_task() throws Throwable {
        clickBackButtonInSelectTask();
    }
    

    @And("^I click project id$")
    public void i_click_project_id() throws Throwable {
    	Thread.sleep(4000);
        clickProjectId();
    }

    
    @And("^I enter project details in hours search bar \"([^\"]*)\"$")
    public void i_enter_project_id_in_hours(String arg1) throws Throwable {
    	enterSearchText(arg1);
    }

    @When("^I click on job classification dropdown$")
    public void i_click_on_job_classification_dropdown() throws Throwable {
     
clickjobClassification();	 
    }

    @When("^I click on special pay dropdown$")
    public void i_click_on_special_pay_dropdown() throws Throwable {
        
		clickSpecialPay();
    }

    
    @Then("^I should see the hours screen$")
    public void i_should_see_the_hours_screen() throws Throwable {
        String expected = "AI_hoursTab";
			String actual = captureHoursTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Hours title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

   

    @Then("^I select job classification \"([^\"]*)\"$")
    public void i_select_job_classification(String arg1) throws Throwable {
        selectJob(arg1);
    }

    @Then("^I select special pay \"([^\"]*)\"$")
    public void i_select_special_pay(String arg1) throws Throwable {
        selectspecialPay(arg1);
    }

    
    @When("^I clear the hours$")
    public void i_clear_the_regular_hours() throws Throwable {
        clickClearButton();
    }

    @When("^I click on regular tab on hour pad$")
    public void i_click_on_regular_tab_on_hour_pad() throws Throwable {
        clickRegularOnHourPad();
    }
 
 
 @Then("^I should see the regular hours \"([^\"]*)\"$")
    public void i_should_see_the_regular_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureRegularHours();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Add worker hours title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the total hours in hour pad \"([^\"]*)\"$")
    public void i_should_see_the_total_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureTotalHoursInHourPad();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Total Hours in hour pad is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    @Then("^I should see the regular hours in hour pad \"([^\"]*)\"$")
    public void i_should_see_the_regular_hours_in_hour_pad(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureRegularHoursInHourPad();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Total Hours in hour pad is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    @Then("^I should see the overtime1 hours in hour pad \"([^\"]*)\"$")
    public void i_should_see_the_overtime1_hours_in_hour_pad(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureOvertime1HoursInHourPad();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Overtime1 Hours in hour pad is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    @Then("^I should see the overtime2 hours in hour pad \"([^\"]*)\"$")
    public void i_should_see_the_overtime2_hours_in_hour_pad(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureOvertime2HoursInHourPad();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Overtime2 Hours in hour pad is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the overtime1 hours \"([^\"]*)\"$")
    public void i_should_see_the_overtime1_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureOvertime1();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Overtime1 hours is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    
    @Then("^I should not see the added record for hours \"([^\"]*)\"$")
    public void i_should_not_see_the_added_record_for_hours(String arg1) throws Throwable {
        
			boolean actual = projectNamePresence(arg1);
	
			if (actual == false) {
	
				Reporter.addStepLog("Actual text is " + actual);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				softassert.assertFalse(actual, "Record is not deleted");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }


    

    @Then("^I should see the overtime2 hours \"([^\"]*)\"$")
    public void i_should_see_the_overtime2_hours(String arg1) throws Throwable {
        String expected = arg1;
			String actual = captureOvertime2();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Overtime2 hours is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

   

    @Then("^I should see the title as hours in hour pad$")
    public void i_should_see_the_title_as_hours_in_hour_pad() throws Throwable {
        String expected = "Hours";
			String actual = captureHoursTitleInHourPad();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Add worker hours title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    
    @Then("^I should see zero regular hours$")
    public void i_should_see_zero_regular_hours() throws Throwable {
        String expected = "0";
			String actual = captureRegularHoursInHourPad();
	
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

   
   

    @And("^I click remove text$")
    public void i_click_remove_text() throws Throwable {
        clickClearButton();
    }

}


