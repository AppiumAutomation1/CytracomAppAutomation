package com.constructapp.stepdefinitions;

import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.WorkerEquipmentPage;
import com.constructapp.pageobjects.WorkerHoursPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class WorkerEquipmentStepDefinitions extends WorkerEquipmentPage{
	
	
	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();
	
	@When("^I click on equipment button$")
	    public void i_click_on_equipment_button() throws Throwable {
	        clickEquipmentButton();
	    }
	
	    /*@When("^I click on select a project dropdown$")
	    public void i_click_on_select_a_project_dropdown() throws Throwable {
	        clickSelectAProjectDropdown();
	    }*/
	
	    @When("^I click on add equipment hours$")
	    public void i_click_on_add_equipment_hours() throws Throwable {
	        clickAddEquipmentHoursButton();
	    }
	
	    @When("^I expand the record$")
	    public void i_expand_the_record() throws Throwable {
	        clickExpandRecord();
	    }
	
	    @Then("^ I should see equipment as title of the screen$")
	    public void i_should_see_equipment_as_title_of_the_screen() throws Throwable {
	        String expected = "";
			String actual = captureEquipmentTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Equipment title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }
	
	    @Then("^I should see zero equipment on the screen$")
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
	
	    /*@Then("^I Click on select task code dropdown$")
	    public void i_click_on_select_task_code_dropdown() throws Throwable {
	        clickTaskCodeDropdown();
	    }*/
	
	    @Then("^Verify the total hours count \"([^\"]*)\"$")
	    public void verify_the_total_hours_count(String arg1) throws Throwable {
	        String expected = arg1;
			String actual = captureTaskCode();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Task Code is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }
	    
	    @Then("^Verify the total quantity count \"([^\"]*)\"$")
	    public void verify_the_total_quantity_count(String arg1) throws Throwable {
	        String expected = arg1;
			String actual = captureQuantityCount();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Total quantity is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
	    }
	    
	    
	   /* @And("^I select the project \"([^\"]*)\"$")
	    public void i_select_the_project(String arg1) throws Throwable {
	        clickSelectProject();
	    }
	
	    @And("^I select the task code \"([^\"]*)\"$")
	    public void i_select_the_task_code( String arg1) throws Throwable {
	        selectTaskCode();
	    }*/
	
	    @And("^I select the first equipment \"([^\"]*)\"$")
	    public void i_select_the_first_equipment(String arg1) throws Throwable {
	        clickFirstEquipment(arg1);
	    }
	
	    @And("^I click on quantity$")
	    public void i_click_on_quantity() throws Throwable {
	    	Thread.sleep(2000);

	        clickOnQuantity();
	    }
	
	
	    @And("^I click on hour$")
	    public void i_click_on_hour() throws Throwable {
	        clickOnHour();
	    }
	
	    @And("^I select the hour \"([^\"]*)\"$")
	    public void i_select_the_hour(String arg1) throws Throwable {
	        selectHour(arg1);
	    }
	
	    @And("^I click on done button$")
	    public void i_click_on_done_button() throws Throwable {
	        clickDoneButton();
	    }
	    
	    @And("^I click on delete hour$")
	    public void i_click_on_delete_hour() throws Throwable {
	    	
	    	TouchAction action = new TouchAction(driver);
	    	
	    	//action.Press(191, 344).moveTo(48, 344).release().perform();
	    	
	        clickDeleteHour();
	    }
	    
	    
	    @And("^I click on delete equipment$")
	    public void i_click_on_delete_equipment() throws Throwable {
	    	
	    	TouchAction action = new TouchAction(driver);
	    	//action.longPress(191, 344).moveTo(48, 344).release().perform();
	    	
	        clickDeleteEquipment();
	    }
	    
	    @And("^I click minus on hour pad$")
	    public void i_click_on_minus_on_hour_pad() throws Throwable {
	        clickMinus();
	    }
	    
	    @And("^I click dot before decimal$")
	    public void i_click_dot_before_decimal() throws Throwable {
	        clickDot();
	    }
	    

@Then("^I should see the title as equipment hours$")
public void i_should_see_the_title_as_equipment_hours() throws Throwable {
    
     String expected = "EQUIPMENTS";
			String actual = captureEquipmentHoursTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Equipment hours title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
@When("^I click on search bar on equipments$")
public void i_click_on_search_bar_on_equipments() throws Throwable {
    clickSearchBar();
}

@Then("^I should see the headers as Equipment id and description and unit$")
public void i_should_see_the_headers_as_Equipment_id_and_description_and_unit() throws Throwable {
     String expected = "Equipment ID";
			String actual = captureEquipmentIdHeader();
			
			 String expected1 = "Description";
			String actual1 = captureDescriptionHeader();
			
			 String expected2 = "Unit";
			String actual2 = captureUnitHeader();
	
			if (expected.equals(actual)) {
	
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
	
				
				softassert.assertEquals(actual, expected, "Equipment id header is not matching");
			   softassert.assertEquals(actual1, expected1, "Description header is not matching");

				softassert.assertEquals(actual2, expected2, "Unit header is not matching");

	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    


@When("^I click on search bar in equipment$")
public void i_click_on_search_bar() throws Throwable {
    clickSearchBar();
    
}

@When("^I click on equipment \"([^\"]*)\"$")
public void i_click_on_equipment(String arg1) throws Throwable {
    click(MobileBy.AccessibilityId(arg1));
    
}

@When("^I enter the equipment \"([^\"]*)\"$")
public void i_enter_the_equipment(String arg1) throws Throwable {
    enterEquipment(arg1);
    
}

@Then("^I should see the equipment \"([^\"]*)\"$")
public void i_should_see_the_equipment(String arg1) throws Throwable {
     String expected = arg1;
			String actual = captureEquipmentSearchText(arg1);
	
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



@Then("^I should see the equipment screen$")
public void i_should_see_the_equipment_screen() throws Throwable {
    
            Thread.sleep(2000);
            
            String actual = getText(txtProject);
            String expected = "Project";
	
			if (actual.equals(expected)) {
	
				Reporter.addStepLog("Equipment screen is visible" + actual);
	
			} else {
				Reporter.addStepLog("Equipment screen is not visible" + actual);
				softassert.assertEquals(actual,expected,"Equipment screen is not visible");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    


@Then("^I should see the project$")
public void i_should_see_the_project() throws Throwable {
    
	Thread.sleep(2000);
			String actual = getText(txtProject);
			String expected = "Project";
	
			if (actual.equals(expected)) {
	
				Reporter.addStepLog("Project is present" + actual);
	
			} else {
				Reporter.addStepLog("Project is present" + actual);
				softassert.assertEquals(actual,expected,"Project is present");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }






@Then("^I should not see the equipment \"([^\"]*)\"$")
public void i_should_not_see_the_equipment(String arg1) throws Throwable {
    
			boolean actual = equipmentNamePresence(arg1);
	
			if (!actual) {
	
				Reporter.addStepLog("Equipment search text presence is " + actual);
	
			} else {
				Reporter.addStepLog("Equipment search text presence is " + actual);
				softassert.assertFalse(actual,"Equipment search text result is present");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    





@When("^I click on collapse on equipment screen$")
public void i_click_on_collapse() throws Throwable {
    clickOnCollapse();
    
}

@Then("^The equipment should be collapsed$")
public void the_equipment_should_be_collapsed() throws Throwable {
	boolean actual = projectPresence();
	
	if (!actual) {

		Reporter.addStepLog("Equipment is collapsed" + actual);

	} else {
		Reporter.addStepLog("Equipment is not collapsed" + actual);
		softassert.assertTrue(actual,"Equipment is not collapsed");

		hooks.addScreenshot();
		softassert.assertAll();
	}
    }
    
    




@Then("^I should see the selected equipment \"([^\"]*)\"$")
public void i_should_see_the_selected_equipment(String arg1) throws Throwable {
     String expected = arg1;
			String actual = captureEquipmentInMainScreen();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Equipment text is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    





@Then("^I should see the unit \"([^\"]*)\"$")
public void i_should_see_the_unit(String arg1) throws Throwable {
    
     String expected = arg1;
			String actual = captureEquipmentUnit(arg1);
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Expenses unit price is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    



@Then("^Verify the quantity in equipment \"([^\"]*)\"$")
public void verify_the_quantity(String arg1) throws Throwable {
    
     String expected = arg1;
			String actual = captureQuantity(arg1);
	
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
    









@Then("^I should see zero equipment on quantity selection pad$")
public void i_should_see_zero_equipment_on_quantity_selection_pad() throws Throwable {
     String expected = "0";
			String actual = captureQuantityOnSelectionPad(expected);
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Equipment quantity  is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    







@Then("^I should not see the added equipment on the screen \"([^\"]*)\"$")
public void i_should_not_see_the_added_equipment_on_the_screen(String arg1) throws Throwable {
			boolean actual = equipmentNamePresenceOnMainScreen(arg1);
	
			if (!actual) {
	
				Reporter.addStepLog("Actual text is " + actual);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				softassert.assertFalse(actual, "Equipment text  is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    

@Then("^Verify the total equipment \"([^\"]*)\"$")
public void verify_the_total_equipment(String arg1) throws Throwable {
    
     String expected = arg1;
			String actual = captureEquipmentCount();
	
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
    
}




