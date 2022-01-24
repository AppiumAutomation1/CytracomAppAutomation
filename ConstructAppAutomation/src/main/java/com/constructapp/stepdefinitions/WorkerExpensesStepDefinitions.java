package com.constructapp.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.WorkerEquipmentPage;
import com.constructapp.pageobjects.WorkerExpensesPage;
import com.constructapp.pageobjects.WorkerHoursPage;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class WorkerExpensesStepDefinitions extends WorkerExpensesPage{
	
	
	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();
	
	@When("^I click on expenses button$")
    public void i_click_on_expenses_button() throws Throwable {
        
		clickExpensesButton();
    }

    @When("^I click on add field expenses button$")
    public void i_click_on_add_field_expenses_button() throws Throwable {
        clickAddFiedExpensesButton();
    }

    

    @When("^I click on expense category dropdown$")
    public void i_click_on_expense_category_dropdown() throws Throwable {
        clickExpenseCategoryDropdown();
    }

    @When("^I select quantity \"([^\"]*)\"$")
    public void i_select_quantity(String arg1) throws Throwable {
    	WorkerEquipmentPage.selectQuantity(arg1);
    	
    	
    }

    @Then("^ I should see expenses as title of the screen in worker$")
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

    @Then("^I should see zero expenses on the screen$")
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

    @Then("^I should see project id in the project id dropdown \"([^\"]*)\"$")
    public void i_should_see_project_id_in_the_project_id_dropdown(String arg1) throws Throwable {
    	String expected = arg1;
		String actual = captureProjectID();

		if (expected.equals(actual)) {

			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);

		} else {
			Reporter.addStepLog("Actual text is " + actual);
			Reporter.addStepLog("Expected text is " + expected);
			softassert.assertEquals(actual, expected, "Project id is not matching");

			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    @Then("^I should see task code in the task code dropdown \"([^\"]*)\"$")
    public void i_should_see_task_code_in_the_task_code_dropdown(String arg1) throws Throwable {
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

    @Then("^I Click on select task code dropdown in worker expenses$")
    public void i_click_on_select_task_code_dropdown() throws Throwable {
        clickSelectTaskCodeDropdown();
    }

    @Then("^Verify the total amount count \"([^\"]*)\"$")
    public void verify_the_total_amount_count(String arg1) throws Throwable {
    	
    	String unitPrice = captureUnitPrice();
    	
    	if(unitPrice.contains(".")) {
    		
    		if(arg1.contains(".")) {
    			
    		double amount = Double.parseDouble(unitPrice)*Double.parseDouble(arg1);
    		
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
    
    @And("^I click on delete expense$")
    public void i_click_on_delete_hour() throws Throwable {
    	
    	TouchAction action = new TouchAction(driver);
    	//action.longPress(191, 344).moveTo(48, 344).release().perform();
    	
        clickDeleteExpense();
    }
    
    
    @Then("^Verify the expenses screen in worker \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void verify_the_expenses_screen_in_Worker(String arg1,String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
         String expectedExpense = arg1;
		String actualExpense= captureExpense(arg1);
		
		String expectedProject = arg2;
		String actualProject = captureprojectid(arg2);
		
		String expectedTask = arg3;
		String actualTask = capturetaskcode(arg3);
		
		//String expectedQuantity = arg4;
		//String actualQuantity = capturequantity(arg4);
		
		String expectedUnit = arg5;
		String actualUnit = captureUnit(arg5);
		
		String expectedUnitPrice = arg6;
		String actualUnitPrice = captureUnitPrice(arg6);
		
		
		
		int totalAmount = Integer.parseInt(arg4)*Integer.parseInt(arg6);
		
		
		String expectedTotalAmount = String.valueOf(totalAmount);
		String actualTotalAmount = captureTotalAmount(expectedTotalAmount);
		

		
		if (expectedExpense.equals(actualExpense) && expectedProject.equals(actualProject)&& expectedTask.equals(actualTask)
				 && expectedUnit.equals(actualUnit) && 
				expectedUnitPrice.equals(actualUnitPrice)) {

			Reporter.addStepLog("Actual text is " + actualExpense);
			Reporter.addStepLog("Expected text is " + expectedExpense);
			Reporter.addStepLog("Actual text is " + actualProject);
			Reporter.addStepLog("Expected text is " + expectedProject);
			
			Reporter.addStepLog("Actual text is " + actualUnit);
			Reporter.addStepLog("Expected text is " + expectedUnit);
			Reporter.addStepLog("Actual text is " + actualUnitPrice);
			Reporter.addStepLog("Expected text is " + expectedUnitPrice);
			//Reporter.addStepLog("Actual text is " + actualQuantity);
			//Reporter.addStepLog("Expected text is " + expectedQuantity);
			Reporter.addStepLog("Actual text is " + actualTask);
			Reporter.addStepLog("Expected text is " + expectedTask);

		} else {
			Reporter.addStepLog("Actual text is " + actualExpense);
			Reporter.addStepLog("Expected text is " + expectedExpense);
			Reporter.addStepLog("Actual text is " + actualProject);
			Reporter.addStepLog("Expected text is " + expectedProject);
			
			Reporter.addStepLog("Actual text is " + actualUnit);
			Reporter.addStepLog("Expected text is " + expectedUnit);
			Reporter.addStepLog("Actual text is " + actualUnitPrice);
			Reporter.addStepLog("Expected text is " + expectedUnitPrice);
			//Reporter.addStepLog("Actual text is " + actualQuantity);
			//Reporter.addStepLog("Expected text is " + expectedQuantity);
			Reporter.addStepLog("Actual text is " + actualTask);
			Reporter.addStepLog("Expected text is " + expectedTask);
			softassert.assertEquals(actualExpense, expectedExpense, "Expense is not matching");
			softassert.assertEquals(actualProject, expectedProject, "Project  is not matching");
			
			softassert.assertEquals(actualUnit, expectedUnit, "Unit  is not matching");
			softassert.assertEquals(actualUnitPrice, expectedUnitPrice, "UnitPrice  is not matching");
			softassert.assertEquals(actualTask, expectedTask, "Task  is not matching");


			hooks.addScreenshot();
			softassert.assertAll();
		}
    }

    //@And("^I select the project \"([^\"]*)\"$")
    //public void i_select_the_project( String arg1) throws Throwable {
        
    	//selectProject(arg1);
    //}

    //@And("^I select the task code \"([^\"]*)\"$")
    //public void i_select_the_task_code( String arg1) throws Throwable {
      //  selectTaskCode(arg1);
    //}

    @And("^I select the expense category \"([^\"]*)\"$")
    public void i_select_the_expense_category( String arg1) throws Throwable {
        selectExpenseCategory(arg1);
    }

  

    @And("^I click on done$")
    public void i_click_on_done() throws Throwable {
        clickDone();
    }

    @And("^Click on add button$")
    public void click_on_add_button() throws Throwable {
     
    	clickAddButton();
    }
    
    @Then("^I should see the title as Add Field Expenses$")
    public void i_should_see_the_title_as_add_field_expenses() throws Throwable {
        String expected = "Add Field Expenses";
			String actual = captureAddFieldExpensesTitle();
	
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

    @Then("^I should see the sub title as select project & task code$")
    public void i_should_see_the_sub_title_as_select_project_and_task_code() throws Throwable {
        String expected = "Select Project & TaskCode";
			String actual = captureSelectProjectSubTitle();
	
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

    @Then("^I should see the sub title as enter field expenses$")
    public void i_should_see_the_sub_title_as_enter_field_expenses() throws Throwable {
        String expected = "Enter Field Expenses";
			String actual = captureEnterFieldExpensesTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Enter FIeld expenses title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }

    @Then("^I should see the expenses screen$")
    public void i_should_see_the_expenses_screen() throws Throwable {
        String expected = "AI_expenseTab";
			String actual = captureExpensesTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Expenses screen is not launched");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    


@Then("^I should see the expense unit price \"([^\"]*)\"$")
public void i_should_see_the_expense_unit_price(String arg1) throws Throwable {
    String expected = arg1;
			String actual = captureExpenseUnitPrice();
	
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
    


@When("^I click on unit price$")
public void i_click_on_unit_price() throws Throwable {
    
    clickUnitPrice();
}

@Then("^I should see the title as unit price$")
public void i_should_see_the_title_as_unit_price() throws Throwable {
    
    String expected = "Unit Price";
			String actual = captureUnitPriceTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Unitprice title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }




@Then("^I should see the selected unit price in unit price pad \"([^\"]*)\"$")
public void i_should_see_the_selected_unit_price_in_unit_price_pad(String arg1) throws Throwable {
    String expected = arg1;
			String actual = captureUnitPriceInPricePad(arg1);
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Unitprice  is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    
}


@Then("^I enter the unit price \"([^\"]*)\"$")
public void i_enter_the_unit_price(String arg1) throws Throwable {
   WorkerHoursPage.selectHours(arg1); 
    
}




@When("^I click on quantity text field$")
public void i_click_on_quantity_text_field() throws Throwable {
    
    clickQuantity();
}

@Then("^I should see the title as quantity$")
public void i_should_see_the_title_as_quantity() throws Throwable {
    String expected = "Quantity";
			String actual = captureQuantityTitle();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Quantity title is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
    











@Given("^I click on quantity on the main screen \"([^\"]*)\"$")
public void i_click_on_quantity_on_the_main_screen(String arg1) throws Throwable {
    clickQuantityOnMainScreen(arg1);
    
}

@Then("^Verify the quantity \"([^\"]*)\"$")
public void verify_the_quantity(String arg1) throws Throwable {
    String expected = arg1;
			String actual = captureQuantity();
	
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
    
@Then("^Verify the quantity on main screen \"([^\"]*)\" \"([^\"]*)\"$")
public void verify_the_quantity_on_main_screen(String arg1,String arg2) throws Throwable {
    String expected = arg1;
			String actual = captureQuantityOnMainScreen(arg2);
	
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
    



@Then("^Verify the total quantity count in main screen \"([^\"]*)\" \"([^\"]*)\"$")
public void verify_the_total_quantity_count_in_main_screen(String arg1, String arg2) throws Throwable {
    String unitPrice = arg2;
    String quantity = arg1;
    String total = "";
    
    if(unitPrice.contains(".")) {
    	
    	if(quantity.contains(".")) {
    	double amount = Double.parseDouble(unitPrice)*Double.parseDouble(quantity);
    	String expected = String.valueOf(amount);
    	total = expected;
		String actual = captureTotalAmount(total);

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
    		double amount = Double.parseDouble(unitPrice)*Integer.parseInt(quantity);
        	String expected = String.valueOf(amount);
        	total = expected;
    		String actual = captureTotalAmount(total);

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
    	
    	if(quantity.contains(".")) {
    	double amount = Integer.parseInt(unitPrice)*Double.parseDouble(quantity);
    	String expected = String.valueOf(amount);
    	total = expected;
		String actual = captureTotalAmount(total);

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
    		int amount = Integer.parseInt(unitPrice)*Integer.parseInt(quantity);
        	String expected = String.valueOf(amount);
        	total = expected;
    		String actual = captureTotalAmount(total);

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

@Then("^Verify the quantity on quantity selection pad \"([^\"]*)\"$")
public void verify_the_quantity_on_quantity_selection_pad(String arg1) throws Throwable {
    
    String expected = arg1;
			String actual = captureQuantityInSelectionPad();
	
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


@When("^I click on unit price on main screen$")
public void i_click_on_unit_price_on_main_screen() throws Throwable {
    
    clickUnitPriceOnMainScreen();
}

@When("^I clear the value$")
public void i_clear_the_value() throws Throwable {
    
     WorkerHoursPage.clickClearButton();
}

@Then("^I should see the expense unit price in main screen \"([^\"]*)\"$")
public void i_should_see_the_expense_unit_price_in_main_screen(String arg1) throws Throwable {
    
    String expected = arg1;
			String actual = captureUnitPriceInMainScreen();
	
			if (expected.equals(actual)) {
	
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
	
			} else {
				Reporter.addStepLog("Actual text is " + actual);
				Reporter.addStepLog("Expected text is " + expected);
				softassert.assertEquals(actual, expected, "Unitprice  is not matching");
	
				hooks.addScreenshot();
				softassert.assertAll();
			}
    }
}




   


