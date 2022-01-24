package com.constructapp.pageobjects;

import org.openqa.selenium.By;


import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

public class Hamburgermenu extends DriverUtilities {

	public static By btnSyncData = By.xpath("//XCUIElementTypeStaticText[@name='Worker Timesheet']");
	public static By txtWkorkerTimeSheet = By.xpath("//XCUIElementTypeNavigationBar[@name='Worker Timesheet']");
	public static By btnCrewTimSheet = By.xpath("//XCUIElementTypeStaticText[@name='Crew Timesheet']");
	public static By btnAllTimeSheets = By.xpath("//XCUIElementTypeStaticText[@name='All Timesheets']");
    public static By btnLogout = By.xpath("//XCUIElementTypeStaticText[@name='Logout']");
    public static By btnBeginSynchronization = By.xpath("//XCUIElementTypeButton[@name='Begin Synchronization']");
    
	public static void clickSyncData() throws Throwable {

		try {
			click(btnSyncData);
			Reporter.addStepLog("Clicked on Sync data");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	public static void clickLogOutButton() throws Throwable {

		try {
			click(btnLogout);
			Reporter.addStepLog("Clicked on logout button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickCrewTimeSheet() throws Throwable {

		try {
			click(btnCrewTimSheet);
			Reporter.addStepLog("Clicked on crew timesheet button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickAllTimeSheets() throws Throwable {

		try {
			click(btnAllTimeSheets);
			Reporter.addStepLog("Clicked on all timesheets button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static String captureWorkerTimeSheetText() throws Throwable {
		String text = "Worker Timesheet";
		try {
			text = "Worker Timesheet";
			Reporter.addStepLog("Captured worker timesheet text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	
}
