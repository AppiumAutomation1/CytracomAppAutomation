package com.constructapp.stepdefinitions;

import com.constructapp.pageobjects.TemplateExpensesPage;
import com.constructapp.pageobjects.TemplateHoursPage;

import cucumber.api.java.en.When;

public class TemplateExpensesStepDefinitions extends TemplateExpensesPage{
	
	 @When("^I click on add crew expenses button in template timesheet$")
	    public void i_click_on_add_crew_expenses_button() throws Throwable {
	        clickAddCrewExpensesButton();
	    }

	

	

}
