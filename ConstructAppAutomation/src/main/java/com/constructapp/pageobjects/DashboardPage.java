package com.constructapp.pageobjects;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.constructapp.stepdefinitions.Hooks;
import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class DashboardPage extends DriverUtilities {

	public static By btnSkip = By.xpath("//XCUIElementTypeButton[@name='AI_tapSkip']");
	public static By btnLogin = By.xpath("//XCUIElementTypeButton[@name='AI_tapLogin']");
	public static By btnNo = By.xpath("//XCUIElementTypeButton[@name='No']");
	public static By btnContinue = By.xpath("//XCUIElementTypeButton[@name='Continue']");
	public static By inputEmailId = MobileBy.AccessibilityId("Email Address");
	public static By inputPassword = MobileBy.AccessibilityId("Password");

	public static By btnSignIn = By.xpath("//XCUIElementTypeButton[@name='Sign in']");
	public static By txtHome = By.xpath("//XCUIElementTypeStaticText[@name='Home']");
	public static By menuSyncData = MobileBy.AccessibilityId("Sync Data");
	public static By btnBeginSync = By.xpath("//XCUIElementTypeOther[@name='AI_tapBeginSync']");

	
	
	
	public static void clickSyncDataMenu() throws Throwable {

		try {
			
			click(menuSyncData);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public static void clickBeginSynchronization() throws Throwable {

		try {
			
			click(menuSyncData);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public static String captureSyncNumber(String arg) throws Throwable{
		String text = "";

		try {

			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Home text is captured " + txtHome);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return text;
	}
	

	public static void clickSkipButton() throws Throwable {

		try {
			click(btnSkip);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void clickLoginButton() throws Throwable {

		try {
			click(btnLogin);
			Reporter.addStepLog("Clicked on login button");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void clickNoButton() throws Throwable {

		try {
			click(btnNo);
			Reporter.addStepLog("Clicked on No  button");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void clickContinueButton() throws Throwable {

		try {
			click(btnContinue);
			Reporter.addStepLog("Clicked on Continue button");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void clickSignInButton() throws Throwable {

		try {
			click(btnSignIn);
			Reporter.addStepLog("Clicked on Signin button");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void enterEMailId(String text) throws Throwable {

		try {
			enterText(inputEmailId, text);
			Reporter.addStepLog("Entered email id" + text);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static void enterPassword(String text) throws Throwable {

		try {
			enterText(inputPassword, text);
			Reporter.addStepLog("Entered password" + text);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static boolean verifyHomePresence() throws Throwable {
		boolean isHomePresent = false;

		try {

			Thread.sleep(3000);
			isHomePresent = isElementDisplayed(txtHome);
			Reporter.addStepLog("Home page is launched " + isHomePresent);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return isHomePresent;
	}

	public static String captureHomeText() throws Throwable {
		String text = "";

		try {

			text = getText(txtHome);
			Reporter.addStepLog("Home text is captured " + txtHome);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return text;
	}

}
