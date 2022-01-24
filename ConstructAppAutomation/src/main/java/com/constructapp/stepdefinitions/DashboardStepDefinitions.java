package com.constructapp.stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.constructapp.pageobjects.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;

public class DashboardStepDefinitions extends LoginPage {

	SoftAssert softassert = new SoftAssert();
	Scenario scenario;
	Hooks hooks = new Hooks();

	
    @Then("^I should see the four statuses on home screen$")
    public void i_should_see_the_four_statuses_on_home_screen() throws Throwable {
        
    }

    
    @Then("^I should see the expenses summary donut chart$")
    public void i_should_see_the_expenses_summary_donut_chart() throws Throwable {
        
    }

    @Then("^I should see the hours summary bar graphs$")
    public void i_should_see_the_hours_summary_bar_graphs() throws Throwable {
        
    }

    @Then("^I should be able to navigate to timesheets screen$")
    public void i_should_be_able_to_navigate_to_timesheets_screen() throws Throwable {
        
    }

    @Then("^I should be able to navigate to worker timesheet screen$")
    public void i_should_be_able_to_navigate_to_worker_timesheet_screen() throws Throwable {
        
    }

    @Then("^I should be able to navigate to crew timesheet screen$")
    public void i_should_be_able_to_navigate_to_crew_timesheet_screen() throws Throwable {
        
    }

    @Then("^I should be able to navigate to template timesheet screen$")
    public void i_should_be_able_to_navigate_to_template_timesheet_screen() throws Throwable {
        
    }

    @Then("^I should be able to navigate to my profile screen$")
    public void i_should_be_able_to_navigate_to_my_profile_screen() throws Throwable {
        
    }

    @And("^I should see the tabs to navigate to different timesheets$")
    public void i_should_see_the_tabs_to_navigate_to_different_timesheets() throws Throwable {
        
    }

}
