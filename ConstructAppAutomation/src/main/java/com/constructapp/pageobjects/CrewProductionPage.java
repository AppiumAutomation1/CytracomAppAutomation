package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class CrewProductionPage  extends DriverUtilities{

	
	public static By btnProduction = MobileBy.AccessibilityId("AI_productionTab");
	public static By dropDownSelectAProject = MobileBy.AccessibilityId("AI_selectProject_Container");
	public static By btnAddProductionHours = MobileBy.AccessibilityId("Add Production Hours");
	public static By txtProduction = By.xpath("");
	public static By txtEquipmentQuantity = By.xpath("");
	public static By dropDownTaskCode = MobileBy.AccessibilityId("AI_selectTask");
	public static By btnQuantity = MobileBy.AccessibilityId("AI_tapQuantity_Container");
	
	public static By checkBoxTask = By.xpath("");
	public static By checkBoxFirstProject = By.xpath("(//XCUIElementTypeButton[@name='AI_tapCheckBoxListItem'])[1]");
	public static By btnSelect = By.xpath("//XCUIElementTypeButton[@name='AI_tapSelect']");
public static By txtProject = By.xpath("");
	
	public static By btnExpandProduction = MobileBy.AccessibilityId("AI_productionListview");

public static void clickQuantity() throws Throwable {
	try {
		click(btnQuantity);
		Reporter.addStepLog("Clicked on quantity");

	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void clickExpandRecord() throws Throwable {
	try {
		click(btnExpandProduction);
		Reporter.addStepLog("Clicked on expand button");

	} catch (Exception e) {
		e.printStackTrace();
	}
}


	public static void clickProductionButton() throws Throwable {
		try {
			click(btnProduction);
			Reporter.addStepLog("Clicked on production button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickSelectAProjectDropDown() throws Throwable {
		try {
			click(dropDownSelectAProject);
			Reporter.addStepLog("Clicked on select a project dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickAddProductionHours() throws Throwable {
		try {
			click(btnAddProductionHours);
			Reporter.addStepLog("Clicked on production hours button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String captureProductionTitle() throws Throwable {
		String text = "";
		try {
			text = getText(txtProduction);
			Reporter.addStepLog("Captured production title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static String captureTotalQuantity() throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId("AI_productionTotal"));
			Reporter.addStepLog("Captured equipment quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static void clickSelectTaskCodeDropDown() throws Throwable {
		try {
			click(dropDownTaskCode);
			Reporter.addStepLog("Selected task code dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectProject(String arg) throws Throwable {
		try {
			click(By.xpath("//XCUIElementTypeStaticText[contains(@name,'"+arg+"')]"));
			Reporter.addStepLog("Selected on Project");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectTaskCode(String arg) throws Throwable {
		try {
			click(By.xpath("//XCUIElementTypeStaticText[@name='"+arg+"']"));
			Reporter.addStepLog("Clicked on task code ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectFirstProject() throws Throwable {
		try {
			click(checkBoxFirstProject);
			Reporter.addStepLog("Clicked on first project checkbox");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickSelectButton() throws Throwable {
		try {
			click(btnSelect);
			Reporter.addStepLog("Clicked on select button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
