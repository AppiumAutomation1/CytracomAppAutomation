package com.constructapp.stepdefinitions;

import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.CrewProductionPage;
import com.constructapp.pageobjects.WorkerEquipmentPage;
import com.constructapp.pageobjects.WorkerProductionPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrewProductionStepDefinitions extends CrewProductionPage{
	
	
	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();
	
	@When("^I click on production button$")
    public void i_click_on_production_button() throws Throwable {
        clickProductionButton();
    }

    @When("^I click on select a project dropdown$")
    public void i_click_on_select_a_project_dropdown() throws Throwable {
        clickSelectAProjectDropDown();
    }
    
    @When("^I click on quantity in production$")
    public void i_click_on_quantity() throws Throwable {
        clickQuantity();
    }
    
    @When("^I expand the record in production$")
    public void i_expand_the_record() throws Throwable {
        clickExpandRecord();
    }


    @When("^I click on add production hours$")
    public void i_click_on_add_production_hours() throws Throwable {
        clickAddProductionHours();
    }
    
    @Then("^I verify the details on the production screen \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_shoud_see_the_details_on_the_production_screen(String arg1, String arg2, String arg3, String arg4
    		,String arg5) throws Throwable {
    	String expectedProjectID = arg1;
		String actualProjectID = WorkerProductionPage.captureProjectID();
		
		String expectedTaskCode = arg2;
		String actualTaskCode = WorkerProductionPage.captureTaskId();
		
		String expectedProductionUnit = arg3;
		String actualProductionUnit = WorkerProductionPage.captureProductionUnit(arg3);
		
		String expectedQuantity = arg4;
		String actualQuantity = WorkerProductionPage.captureQuantity();
		
		String expectedBudgetQuantity = arg5;
		String actualBudgetQuantity = WorkerProductionPage.captureBudgetQuantity();


		if (expectedProjectID.equals(actualProjectID) && expectedTaskCode.equals(actualTaskCode) 
				&& expectedProductionUnit.equals(actualProductionUnit)&& expectedQuantity.equals(actualQuantity)
				&& expectedBudgetQuantity.equals(actualBudgetQuantity)) {

			Reporter.addStepLog("Actual Project ID  is " + actualProjectID);
			Reporter.addStepLog("Expected Regular hours is " + expectedProjectID);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTaskCode);
			Reporter.addStepLog("Expected Over time hours is " + expectedTaskCode);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualProductionUnit);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedProductionUnit);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualQuantity);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedQuantity);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualBudgetQuantity);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedBudgetQuantity);

		} else {
			Reporter.addStepLog("Actual Project ID  is " + actualProjectID);
			Reporter.addStepLog("Expected Regular hours is " + expectedProjectID);
			Reporter.addStepLog("Actual Overtime hours  is " + actualTaskCode);
			Reporter.addStepLog("Expected Over time hours is " + expectedTaskCode);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualProductionUnit);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedProductionUnit);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualQuantity);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedQuantity);
			Reporter.addStepLog("Actual overtime2 hours  is " + actualBudgetQuantity);
			Reporter.addStepLog("Expected overtime2 hours is " + expectedBudgetQuantity);


			softassert.assertEquals(actualProjectID, expectedProjectID, "Project Id is not matching");
			softassert.assertEquals(actualTaskCode, expectedTaskCode, "Task COde is not matching");
			softassert.assertEquals(actualProductionUnit, expectedProductionUnit, "Production Unit is not matching");
			softassert.assertEquals(actualQuantity, expectedQuantity, "Quantity  is not matching");
			softassert.assertEquals(actualBudgetQuantity, expectedBudgetQuantity, "Budget Quantity is not matching");

			hooks.addScreenshot();
		}
    }


   
	@Then("^ I should see production as title of the screen$")
    public void i_should_see_production_as_title_of_the_screen() throws Throwable {
        String expected = "";
		String actual = captureProductionTitle();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "production title is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^I should see zero quantity on the screen in crew production$")
    public void i_should_see_zero_quantity_on_the_screen() throws Throwable {
        String expected = "0";
		String actual = captureTotalQuantity();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    /*@Then("^I verify the details on the production screen \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_the_details_on_the_hours_screen(String arg1, String arg2, String arg3, String arg4) throws Throwable {
    	String expectedRegularHours = arg2;
		String actualRegularHours = captureTaskCode(arg2);
		
		String expectedOverTime1 = arg3;
		String actualTOverTime1 = captureOvertime1HoursInCrew();
		
		String expectedOverTime2 = arg4;
		String actualTOverTime2 = captureOvertime2HoursInCrew();
		
		
		
		String expectedWorker = arg1;
		String actualWorker = captureProjectName(arg1);

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
    }*/
    @Then("^I Click on select task code dropdown$")
    public void i_click_on_select_task_code_dropdown() throws Throwable {
        clickSelectTaskCodeDropDown();
    }

    @And("^I select the project \"([^\"]*)\"$")
    public void i_select_the_project(String arg1) throws Throwable {
        selectProject(arg1);
    }

    @And("^I select the task code \"([^\"]*)\"$")
    public void i_select_the_task_code(String arg1) throws Throwable {
        selectTaskCode(arg1);
    }

    @And("^I select the first project$")
    public void i_select_the_first_project() throws Throwable {
        selectFirstProject();
    }

    @And("^I click on select button$")
    public void i_click_on_select_button() throws Throwable {
        clickSelectButton();
    }
}

