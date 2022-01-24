package com.constructapp.stepdefinitions;

import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.WorkerEquipmentPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrewEquipmentStepDefinitions extends WorkerEquipmentPage{
	
	
	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();
	
	
	
	    @Then("^I should see zero equipment on the crew screen$")
	    public void i_should_see_zero_equipment_on_the_screen() throws Throwable {
	        String expected = "0";
			String actual = captureEquipmentCount(expected);
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Equipment count is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }
	    
	    @Then("^I should see the crew equipment screen$")
	    public void i_should_see_the_equipment_screen() throws Throwable {
	        
	                Thread.sleep(2000);
	                
	                String actual = getText(btnAddEquipmentHours);
	                String expected = "AI_addEquipmentHours";
	    	
	    			if (actual.equals(expected)) {
	    	
	    				Reporter.addStepLog("Equipment screen is visible" + actual);
	    	
	    			} else {
	    				Reporter.addStepLog("Equipment screen is not visible" + actual);
	    				softassert.assertEquals(actual,expected,"Equipment screen is not visible");
	    	
	    				hooks.addScreenshot();
	    				softassert.assertAll();
	    			}
	        }
	
	    /*@Then("^I Click on select task code dropdown$")
	    public void i_click_on_select_task_code_dropdown() throws Throwable {
	        clickTaskCodeDropdown();
	    }*/
	
	    
}

