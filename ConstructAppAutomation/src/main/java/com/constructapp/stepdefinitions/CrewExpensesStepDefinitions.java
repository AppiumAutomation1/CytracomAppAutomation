package com.constructapp.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.CrewExpensesPage;
import com.constructapp.pageobjects.WorkerExpensesPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrewExpensesStepDefinitions extends CrewExpensesPage{
	
	
	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();
	
	//@When("^I click on select a project dropdown$")
    //public void i_click_on_select_a_project_dropdown() throws Throwable {
      //  clickSelectAProjectDropDown();
    //}
	
	@When("^I click on select a project dropdown in crew expenses$")
    public void i_click_on_select_a_project_dropdown_in_crew_expenses() throws Throwable {
        clickSelectAProjectDropDown();
    }
	
	@And("^Click on add button in expenses$")
    public void click_on_add_button_in_expenses() throws Throwable {
     
    	clickAddButton();
    }
	@Then("^I should see zero expenses on the crew expenses screen$")
    public void i_should_see_zero_expenses_on_the_screen() throws Throwable {
        
    	String expected = "0";
		String actual = captureNoExpenses();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "There are no zero expenses");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^ I should see expenses as title of the screen$")
    public void i_should_see_expenses_as_title_of_the_screen() throws Throwable {
        String expected = "Expenses";
		String actual = captureExpensesTitle();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Expenses title is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^I should see crew related workers on the screen \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_should_see_crew_related_workers_on_the_screen(String arg1, String arg2) throws Throwable {
        String expectedWorker1 = arg1;
		String actualWorker1= captureWorkerName1(arg1);
		
		String expectedWorker2 = arg2;
		String actualWorker2 = captureWorkerName2(arg2);
		

		if (expectedWorker1.equals(actualWorker1) && expectedWorker2.equals(actualWorker2) ) {

			Reporter.addStepLog("Actual text is " + actualWorker1);
			Reporter.addStepLog("Expected text is " + expectedWorker1);
			Reporter.addStepLog("Actual text is " + actualWorker2);
			Reporter.addStepLog("Expected text is " + expectedWorker2);

		} else {
			Reporter.addStepLog("Actual text is " + actualWorker1);
			Reporter.addStepLog("Expected text is " + expectedWorker1);
			Reporter.addStepLog("Actual text is " + actualWorker2);
			Reporter.addStepLog("Expected text is " + expectedWorker2);
			softassert.assertEquals(actualWorker1, expectedWorker1, "Workername1 is not matching");
			softassert.assertEquals(actualWorker2, expectedWorker2, "Workername2  is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    /*@Then("^I Click on select task code dropdown$")
    public void i_click_on_select_task_code_dropdown() throws Throwable {
        clickSelectATaskCodeDropdown();
    }*/
    
    @Then("^I should see zero hours on the screen for the first time$")
    public void i_should_see_zero_hours_on_the_screen_for_the_first_time() throws Throwable {
        
    	String expected = "0";
    	String actual = captureTotalAmount();
		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);			
			softassert.assertEquals(actual, expected, "total amount is not zero");

			hooks.addScreenshot();
		}
    }

	@Then("^I should see worker name on the screen on expenses page \"([^\"]*)\"$")
	public void i_should_see_worker_name_on_the_sexpenses_screen(String arg1) throws Throwable {

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
    @And("^I select the project id \"([^\"]*)\"$")
    public void i_select_the_project_id(String arg2) throws Throwable {
        selectProject(arg2);
    }
    
    @And("^I select the task code in expenses \"([^\"]*)\"$")
    public void i_select_the_task_code_in_expenses(String arg2) throws Throwable {
        selectTaskCode(arg2);
    }
    
    @Then("^I Click on select task code dropdown in crew expenses$")
    public void i_click_on_select_task_code_dropdown() throws Throwable {
        clickSelectTaskCodeDropDown();
    }

    @When("^I click on add crew expenses button$")
    public void i_click_on_add_crew_expenses_button() throws Throwable {
        clickAddCrewExpensesButton();
    }
    
    @Given("^I click on crew quantity on the main screen$")
    public void i_click_on_quantity_on_the_main_screen() throws Throwable {
        clickQuantityOnMainScreen();
        
    }
    
    @Then("^Verify the quantity on crew main screen \"([^\"]*)\"$")
    public void verify_the_quantity_on_main_screen(String arg1) throws Throwable {
        String expected = arg1;
    			String actual = captureQuantityOnCrewMainScreen();
    	
    			if (expected.equals(actual)) {
    	
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    	
    			} else {
    				Reporter.addStepLog("Actual text is " + actual);
    				Reporter.addStepLog("Expected text is " + expected);
    				softassert.assertEquals(actual, expected, "Quantity  is not matching");
    	
    				hooks.addScreenshot();
    				softassert.assertAll();
    			}
        }
    
    
	@Then("^Verify the total quantity count in crew expenses main screen \"([^\"]*)\" \"([^\"]*)\"$")
    public void verify_the_total_quantity_count_in_main_screen(String arg1, String arg2) throws Throwable {
      
        
        if(arg1.contains(".") && (arg2.contains("."))) {
        	
        	
        	double amount = Double.parseDouble(arg1)+Double.parseDouble(arg2);
        	
        	
        	String expected = String.valueOf(amount);
        	
        	if(expected.contains(".0")) {
        		expected = expected.replace(".0", "");
        	}
        	
    		String actual = captureTotalExpenses();

    		if (expected.equals(actual)) {

    			Reporter.addStepLog("Actual text is " + actual);
    			Reporter.addStepLog("Expected text is " + expected);

    		} else {
    			Reporter.addStepLog("Actual text is " + actual);
    			Reporter.addStepLog("Expected text is " + expected);
    			softassert.assertEquals(actual, expected, "total amount count is not matching");

    			hooks.addScreenshot();
    			softassert.assertAll();
    		}
        	}else if(!(arg1.contains(".")) && (arg2.contains("."))) {
            	
            	
            	double amount = Integer.parseInt(arg1)+Double.parseDouble(arg2);
            	String expected = String.valueOf(amount);
            	if(expected.contains(".0")) {
            		expected = expected.replace(".0", "");
            	}
        		String actual = captureTotalExpenses();

        		if (expected.equals(actual)) {

        			Reporter.addStepLog("Actual text is " + actual);
        			Reporter.addStepLog("Expected text is " + expected);

        		} else {
        			Reporter.addStepLog("Actual text is " + actual);
        			Reporter.addStepLog("Expected text is " + expected);
        			softassert.assertEquals(actual, expected, "total amount count is not matching");

        			hooks.addScreenshot();
        			softassert.assertAll();
        		}
            	}else if(arg1.contains(".") && !(arg2.contains("."))) {
                	
                	
                	double amount = Double.parseDouble(arg1)+Integer.parseInt(arg2);
                	String expected = String.valueOf(amount);
                	if(expected.contains(".0")) {
                		expected = expected.replace(".0", "");
                	}
                	
            		String actual = captureTotalExpenses();

            		if (expected.equals(actual)) {

            			Reporter.addStepLog("Actual text is " + actual);
            			Reporter.addStepLog("Expected text is " + expected);

            		} else {
            			Reporter.addStepLog("Actual text is " + actual);
            			Reporter.addStepLog("Expected text is " + expected);
            			softassert.assertEquals(actual, expected, "total amount count is not matching");

            			hooks.addScreenshot();
            			softassert.assertAll();
            		}
                	}else {
                    	
                    	
                    	double amount = Integer.parseInt(arg1)+Integer.parseInt(arg2);
                    	String expected = String.valueOf(amount);
                    	if(expected.contains(".0")) {
                    		expected = expected.replace(".0", "");
                    	}
                    	
                		String actual = captureTotalExpenses();

                		if (expected.equals(actual)) {

                			Reporter.addStepLog("Actual text is " + actual);
                			Reporter.addStepLog("Expected text is " + expected);

                		} else {
                			Reporter.addStepLog("Actual text is " + actual);
                			Reporter.addStepLog("Expected text is " + expected);
                			softassert.assertEquals(actual, expected, "total amount count is not matching");

                			hooks.addScreenshot();
                			softassert.assertAll();
                		}
                    	}
            
        
        
    }

    
	 @Then("^Verify the total amount count in crew expenses \"([^\"]*)\"$")
	    public void verify_the_total_amount_count(String arg1) throws Throwable {
	    	
	    	String unitPrice = WorkerExpensesPage.captureUnitPrice();
	    	
	    	if(unitPrice.contains(".")) {
	    		
	    		if(arg1.contains(".")) {
	    			
	    		double amount = Double.parseDouble(unitPrice)*Double.parseDouble(arg1);
	    		
	        	String expected = String.valueOf(amount);
	    		String actual = captureCrewTotalAmount();

	    		if (expected.equals(actual)) {

	    			Reporter.addStepLog("Actual text is " + actual);
	    			Reporter.addStepLog("Expected text is " + expected);

	    		} else {
	    			Reporter.addStepLog("Actual text is " + actual);
	    			Reporter.addStepLog("Expected text is " + expected);
	    			softassert.assertEquals(actual, expected, "total amount count is not matching");

	    			hooks.addScreenshot();
	    			softassert.assertAll();
	    		}
	    		}else {
	    			
	    			
	        			
	    	    		double amount = Double.parseDouble(unitPrice)*Integer.parseInt(arg1);
	    	    		
	    	        	String expected = String.valueOf(amount);
	    	    		String actual = captureTotalAmount();

	    	    		if (expected.equals(actual)) {

	    	    			Reporter.addStepLog("Actual text is " + actual);
	    	    			Reporter.addStepLog("Expected text is " + expected);

	    	    		} else {
	    	    			Reporter.addStepLog("Actual text is " + actual);
	    	    			Reporter.addStepLog("Expected text is " + expected);
	    	    			softassert.assertEquals(actual, expected, "total amount count is not matching");

	    	    			hooks.addScreenshot();
	    	    			softassert.assertAll();
	    	    		}
	    		}
	    		
	    	}else {
	    		
	    		if(arg1.contains(".")) {
	    		
	          Double amount = Integer.parseInt(unitPrice)*Double.parseDouble(arg1);
	    		
	        	String expected = String.valueOf(amount);
	    		String actual = captureTotalAmount();

	    		if (expected.equals(actual)) {

	    			Reporter.addStepLog("Actual text is " + actual);
	    			Reporter.addStepLog("Expected text is " + expected);

	    		} else {
	    			Reporter.addStepLog("Actual text is " + actual);
	    			Reporter.addStepLog("Expected text is " + expected);
	    			softassert.assertEquals(actual, expected, "total amount count is not matching");

	    			hooks.addScreenshot();
	    			softassert.assertAll();
	    		}
	    		}else {
	    			
	    			
	        			
	    	    		int amount = Integer.parseInt(unitPrice)*Integer.parseInt(arg1);
	    	    		
	    	        	String expected = String.valueOf(amount);
	    	    		String actual = captureTotalAmount();

	    	    		if (expected.equals(actual)) {

	    	    			Reporter.addStepLog("Actual text is " + actual);
	    	    			Reporter.addStepLog("Expected text is " + expected);

	    	    		} else {
	    	    			Reporter.addStepLog("Actual text is " + actual);
	    	    			Reporter.addStepLog("Expected text is " + expected);
	    	    			softassert.assertEquals(actual, expected, "total amount count is not matching");

	    	    			hooks.addScreenshot();
	    	    			softassert.assertAll();
	    	    		}
	    		}
	    		
	    		
	    	}
	    	
	    }
	    
    
    @Then("^I should see the title as Add Crew Expenses$")
    public void i_should_see_the_title_as_add_field_expenses() throws Throwable {
        String expected = "Add Crew Expenses";
			String actual = captureAddCrewExpensesTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Add Field expenses title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    
    
   
	@Then("^Verify the expenses screen \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void verify_the_expenses_screen(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
         String expectedWorker1 = arg1;
		String actualWorker1= captureWorkerName1(arg1);
		
		String expectedWorker2 = arg2;
		String actualWorker2 = captureWorkerName2(arg2);
		
		
		int total = Integer.parseInt(arg4)*Integer.parseInt(arg5);
		List<WebElement> items = (List<WebElement>) driver.findElements(txtTotalAmounts);
		
		int totalitems = total*items.size();
		String expectedTotalAmount = String.valueOf(totalitems);
		String actualTotalAmount = captureTotalAmount();
		

		
		if (expectedWorker1.equals(actualWorker1) && expectedWorker2.equals(actualWorker2)&& actualTotalAmount.equals(expectedTotalAmount) ) {

			Reporter.addStepLog("Actual text is " + actualWorker1);
			Reporter.addStepLog("Expected text is " + expectedWorker1);
			Reporter.addStepLog("Actual text is " + actualWorker2);
			Reporter.addStepLog("Expected text is " + expectedWorker2);
			Reporter.addStepLog("Actual text is " + actualTotalAmount);
			Reporter.addStepLog("Expected text is " + expectedTotalAmount);

		} else {
			Reporter.addStepLog("Actual text is " + actualWorker1);
			Reporter.addStepLog("Expected text is " + expectedWorker1);
			Reporter.addStepLog("Actual text is " + actualWorker2);
			Reporter.addStepLog("Expected text is " + expectedWorker2);
			Reporter.addStepLog("Actual text is " + actualTotalAmount);
			Reporter.addStepLog("Expected text is " + expectedTotalAmount);
			softassert.assertEquals(actualWorker1, expectedWorker1, "Workername1 is not matching");
			softassert.assertEquals(actualWorker2, expectedWorker2, "Workername2  is not matching");
						softassert.assertEquals(actualTotalAmount, expectedTotalAmount, "total amount  is not matching");


			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    /*@And("^I select the project \"([^\"]*)\"$")
    public void i_select_the_project(String projectid, String arg1) throws Throwable {
        selectProject();
    }

    @And("^I select the task code \"([^\"]*)\"$")
    public void i_select_the_task_code(String taskcode, String arg1) throws Throwable {
        selectTaskCode();
    }*/
}
