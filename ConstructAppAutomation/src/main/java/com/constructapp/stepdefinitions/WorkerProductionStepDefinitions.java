package com.constructapp.stepdefinitions;

import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.WorkerEquipmentPage;
import com.constructapp.pageobjects.WorkerProductionPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;

public class WorkerProductionStepDefinitions extends WorkerProductionPage{
	
	
	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();
	

    @Then("^I should see zero quantity on the screen$")
    public void i_should_see_zero_quantity_on_the_screen() throws Throwable {
        String expected = "0";
		String actual = captureEquipmentQuantity();

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
    @And("^I click on delete production$")
    public void i_click_on_delete_equipment() throws Throwable {
    	
    	TouchAction action = new TouchAction(driver);
    	//action.longPress(191, 344).moveTo(48, 344).release().perform();
    	
        clickDeleteProduction();
    }
    
    @Then("^I should not see the added production unit on the screen \"([^\"]*)\"$")
    public void i_should_not_see_the_added_equipment_on_the_screen(String arg1) throws Throwable {
    			boolean actual = productionNamePresenceOnMainScreen(arg1);
    	
    			if (!actual) {
    	
    				Reporter.addStepLog("Actual text is " + actual);
    	
    			} else {
    				Reporter.addStepLog("Actual text is " + actual);
    				softassert.assertFalse(actual, "production text  is not matching");
    	
    				hooks.addScreenshot();
    				softassert.assertAll();
    			}
        }
    
    @When("^I click on production view$")
    public void i_expand_the_record() throws Throwable {
        clickProductionView();
    }
    
    @Then("^I should see the remaining quantity \"([^\"]*)\"$")
    public void i_should_see_the_remaining_quantity_something(String arg1) throws Throwable {
     
    	Thread.sleep(2000);
    	String BudgetQty = captureBudgetQuantity();
    	
    	if(arg1.contains(".") &&  BudgetQty.contains(".")) {
    	double expected = Double.parseDouble(BudgetQty)-Double.parseDouble(arg1);
		String remainingQty = captureRemainingQty();
		

		double actual = Double.parseDouble(remainingQty);
		if (expected==actual) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }else if(!(arg1.contains(".")) &&  (BudgetQty.contains("."))) {
    	double expected = Double.parseDouble(BudgetQty)-Integer.parseInt(arg1);
		String remainingQty = captureRemainingQty();

		double actual = Double.parseDouble(remainingQty);
		if (expected==actual) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}}
    
    
    else if((arg1.contains(".")) &&  !(BudgetQty.contains("."))) {
    	double expected = Integer.parseInt(BudgetQty)-Double.parseDouble(arg1);
		String remainingQty = captureRemainingQty();

		double actual = Double.parseDouble(remainingQty);
		if (expected==actual) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}}
    	
    	
    	else {
    	int expected = Integer.parseInt(BudgetQty)-Integer.parseInt(arg1);
		String remainingQty = captureRemainingQty();

		int actual = Integer.parseInt(remainingQty);
		if (expected==actual) {

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
    	
    	}
    
    
    @Then("^I should see the remaining quantity in worker \"([^\"]*)\"$")
    public void i_should_see_the_remaining_quantity_something_in_worker(String arg1) throws Throwable {
     
    	Thread.sleep(2000);
    	String BudgetQty = captureBudgetQuantityInWorker();
    	
    	if(arg1.contains(".") &&  BudgetQty.contains(".")) {
    	double expected = Double.parseDouble(BudgetQty)-Double.parseDouble(arg1);
		String remainingQty = captureRemainingQty();
		

		double actual = Double.parseDouble(remainingQty);
		if (expected==actual) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }else if(!(arg1.contains(".")) &&  (BudgetQty.contains("."))) {
    	double expected = Double.parseDouble(BudgetQty)-Integer.parseInt(arg1);
		String remainingQty = captureRemainingQty();

		double actual = Double.parseDouble(remainingQty);
		if (expected==actual) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}}
    
    
    else if((arg1.contains(".")) &&  !(BudgetQty.contains("."))) {
    	double expected = Integer.parseInt(BudgetQty)-Double.parseDouble(arg1);
		String remainingQty = captureRemainingQty();

		double actual = Double.parseDouble(remainingQty);
		if (expected==actual) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Equipment quantity is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}}
    	
    	
    	else {
    	int expected = Integer.parseInt(BudgetQty)-Integer.parseInt(arg1);
		String remainingQty = captureRemainingQty();

		int actual = Integer.parseInt(remainingQty);
		if (expected==actual) {

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
    	
    	}
    
    @Then("^I should see the title as Productions$")
    public void i_should_see_the_title_as_productions() throws Throwable {
        String expected = "PRODUCTIONS";
			String actual = captureProductionsTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Productions title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the header title as Project ID$")
    public void i_should_see_the_header_title_as_Project_id() throws Throwable {
        String expected = "Project ID";
			String actual = captureProjecIDTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Project Id title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
	
	@Then("^I should see the header title as Task Code$")
    public void i_should_see_the_header_title_as_Task_Code() throws Throwable {
        String expected = "Task Code";
			String actual = captureTaskCodeTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Task Code title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
	
	@Then("^I should see the header title as Production unit$")
    public void i_should_see_the_header_title_as_production_unit() throws Throwable {
        String expected = "Production Unit";
			String actual = captureProductionUnitTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Production unit title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the production tab$")
    public void i_should_see_the_production_tab() throws Throwable {
        String expected = "Project ID";
			String actual = captureProductionTab();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Production tab is not loaded");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the production unit \"([^\"]*)\"$")
    public void i_should_see_the_production(String arg1) throws Throwable {
         String expected = arg1;
    			String actual = captureProductionUnit(arg1);
    	
    			if (expected.equals(actual)) {
    	
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    	
    			} else {
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    				softassert.assertEquals(actual, expected, "Equipment name search text is not matching");
    	
    				hooks.addScreenshot();
    				softassert.assertAll();
    			}
        }

    @Then("^I should see the total production \"([^\"]*)\"$")
    public void i_should_see_the_total_production(String arg1) throws Throwable {
         String expected = arg1;
    			String actual = captureTotalProductionQuantity();
    	
    			if (expected.equals(actual)) {
    	
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    	
    			} else {
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    				softassert.assertEquals(actual, expected, "Total production quantity is not matching");
    	
    				hooks.addScreenshot();
    				softassert.assertAll();
    			}
        }
    
    @Then("^I should see the quantity \"([^\"]*)\"$")
    public void i_should_see_the_quantity(String arg1) throws Throwable {
         String expected = arg1;
    			String actual = captureQuantity();
    	
    			if (expected.equals(actual)) {
    	
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    	
    			} else {
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    				softassert.assertEquals(actual, expected, "Quantity is not matching");
    	
    				hooks.addScreenshot();
    				softassert.assertAll();
    			}
        }



    
}

