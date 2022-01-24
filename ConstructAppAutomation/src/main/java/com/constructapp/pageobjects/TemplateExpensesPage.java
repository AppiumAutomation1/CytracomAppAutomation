package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class TemplateExpensesPage extends DriverUtilities{
	
	public static By dropDownSelectAProject = MobileBy.AccessibilityId("AI_selectProject_Container");
	public static By btnAddCrewExpenses = By.xpath("//XCUIElementTypeButton[@name='addcrwexpenses']");
	public static By txtWorkerName1 = By.xpath("");
	public static By txtWorkerName2 = By.xpath("");
	
	
	public void clickAddCrewExpensesButton() throws Throwable {
		try {
			click(btnAddCrewExpenses);
			Reporter.addStepLog("clicked add crew expenses button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
