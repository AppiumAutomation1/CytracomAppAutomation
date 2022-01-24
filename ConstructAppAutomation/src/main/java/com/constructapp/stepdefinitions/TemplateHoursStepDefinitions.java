package com.constructapp.stepdefinitions;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.constructapp.pageobjects.CrewHoursPage;
import com.constructapp.pageobjects.TemplateHoursPage;
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

public class TemplateHoursStepDefinitions extends TemplateHoursPage {

	SoftAssert softassert = new SoftAssert();
	DriverUtilities utils = new DriverUtilities();
	Hooks hooks = new Hooks();

	@When("^I click on regular hours for worker1$")
    public void i_click_on_regular_hours_for_worker1() throws Throwable {
        clickRegularHoursForWorker1();
    }
	
	
	
	
	@When("^I click on overtime1 hours for worker1$")
    public void i_click_on_add_overtime1_hours_for_worker1() throws Throwable {
        clickOvertime1HoursForWorker1();
    }
	
	

	



	@When("^I click on overtime2 hours for worker1$")
    public void i_click_on_add_overtime2_hours_for_worker1() throws Throwable {
        clickOvertime2HoursForWorker1();
    }

    
	
	
	@When("^I select the first worker in template timesheet$")
    public void i_select_the_first_worker_in_template_timesheet() throws Throwable {
        selectFirstWorkerInTemplateTimesheet();
    }


	

}
