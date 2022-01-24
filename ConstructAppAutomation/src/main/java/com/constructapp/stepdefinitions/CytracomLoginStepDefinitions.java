package com.constructapp.stepdefinitions;

import org.testng.asserts.SoftAssert;

import com.constructapp.base.DriverFactory;
import com.constructapp.pageobjects.CytracomLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;

public class CytracomLoginStepDefinitions extends DriverFactory{

	
	
	
	SoftAssert sa = new SoftAssert();
	public static CytracomLoginPage loginpage;

	@Given("^User enters valid username \"([^\"]*)\"$")
	public void user_enters_valid_username(String arg1) throws Throwable {
		
		loginpage=new CytracomLoginPage(driver);
		Thread.sleep(2000);
		loginpage.enterEmail(arg1);
		

	}
	
	@Given("^User enters valid password \"([^\"]*)\"$")
	public void user_enters_valid_password(String arg1) throws Throwable {
		loginpage.enterPassword(arg1);
		

	}
	
	
	@Given("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		loginpage.clickOutside();
		loginpage.clickLoginButton();
		Thread.sleep(5000);
		loginpage.clickContinueButton();
		Thread.sleep(2000);

				
				
				
		

	}
	
	@Then("validate user lands on the homepage")
	public void validate_user_lands_on_the_homepage() {
		
		sa.assertEquals(loginpage.verifyRequiredPermissionMessage(), true);
		System.out.println("Thanks message verified");
		
		sa.assertAll();
		
	}
	
}
