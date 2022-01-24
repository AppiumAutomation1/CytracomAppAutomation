package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class CrewEquipmentPage  extends DriverUtilities{

	
	public static By btnEquipment = MobileBy.AccessibilityId("AI_equipmentTab");
	public static By selectAProjectDropDown = By.xpath("");
	public static By btnAddEquipmentHours = MobileBy.AccessibilityId("AI_addEquipmentHours");
	public static By btnExpand = MobileBy.AccessibilityId("AI_tapSelectedEquipmentsListItem");
	public static By txtEquipmentTitle = By.xpath("");
	public static By txtEquipmentCount = By.xpath("");
	public static By dropDownTaskCode = By.xpath("");
	public static By txtTotalHours = By.xpath("");
	public static By dropdownSelectProject = By.xpath("");
	public static By checkBoxFirstEquipment = By.xpath("(//XCUIElementTypeButton[@name='AI_tapCheckBoxListItem'])[1]");
	public static By btnSelect = By.xpath("//XCUIElementTypeButton[@name='AI_tapSelect']");
	public static By btnHour = MobileBy.AccessibilityId("hr");
	public static By btnDone = By.xpath("");
	public static By txtTaskCode = By.xpath("");
	public static By btnQuantity = MobileBy.AccessibilityId("AI_tapQuantity");
	public static By txtTotalQuantity = MobileBy.AccessibilityId("AI_tapQuantity");

	
	
	 public static void clickEquipmentButton() throws Throwable {
		 try {
				click(btnEquipment);
				Reporter.addStepLog("Clicked on equipment button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 public static void clickSelectAProjectDropdown() throws Throwable {
		 try {
				click(selectAProjectDropDown);
				Reporter.addStepLog("Clicked on select a project dropdown");

			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 public static void clickAddEquipmentHoursButton() throws Throwable{
		 try {
				click(btnAddEquipmentHours);
				Reporter.addStepLog("Clicked on add equipment hours button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 public static void clickExpandRecord() throws Throwable{
		 try {
				click(btnExpand);
				Reporter.addStepLog("Clicked on expand button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	  public static String captureEquipmentTitle() throws Throwable{
		  String text = "";
			try {
				text = getText(txtEquipmentTitle);
				Reporter.addStepLog("Captured equipment  title text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		 }
	  
	  
	  public static String captureEquipmentCount(String arg) throws Throwable{
		  String text = "";
			try {
				text = getText(MobileBy.AccessibilityId(arg));
				Reporter.addStepLog("Captured equipmentcount");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		 }
	  
	  
	  public static String captureTaskCode() throws Throwable {
		  String text = "";
			try {
				text = getText(txtTaskCode);
				Reporter.addStepLog("Captured task code");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
	  }
	  public static void clickTaskCodeDropdown() throws Throwable{
		  try {
				click(dropDownTaskCode);
				Reporter.addStepLog("Clicked on task code dropdown");

			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
	  
	  public static void selectHour(String arg) {
		  try {
				selectHour(arg);
				Reporter.addStepLog("selected on hour");

			} catch (Exception e) {
				e.printStackTrace();
			}
	  }
	  public static String captureTotalHours() throws Throwable{
		  String text = "";
			try {
				text = getText(txtTotalHours);
				Reporter.addStepLog("Captured text total hours");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		 }
	  
	  public static String captureQuantityCount() throws Throwable{
		  String text = "";
			try {
				text = getText(txtTotalQuantity);
				Reporter.addStepLog("Captured quantity total text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		 }
	  public static void clickSelectProject() throws Throwable{
		  try {
				
				click(dropdownSelectProject);
				Reporter.addStepLog("Clicked on select project  dropdown");

			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
	  public static void selectTaskCode() throws Throwable {
		  try {
				click(dropDownTaskCode);
				Reporter.addStepLog("Clicked on expenses button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	  }
	  public static void clickFirstEquipment() throws Throwable {
		  try {
				click(checkBoxFirstEquipment);
				Reporter.addStepLog("Clicked on expenses button");

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
	  public static void clickOnHour() throws Throwable {
		  try {
				click(btnHour);
				Reporter.addStepLog("Clicked on hour button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	  }
	  
	  public static void clickOnQuantity() throws Throwable {
		  try {
				click(btnQuantity);
				Reporter.addStepLog("Clicked on quantity button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	  }
	  
	  public static void  clickDoneButton() throws Throwable {
		  try {
				click(btnDone);
				Reporter.addStepLog("Clicked on done button");

			} catch (Exception e) {
				e.printStackTrace();
			}
	  }
	
	

}
