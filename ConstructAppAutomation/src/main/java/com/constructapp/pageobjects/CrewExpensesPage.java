package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;

public class CrewExpensesPage  extends DriverUtilities{

	
	public static By btnAdd = By.xpath("//XCUIElementTypeButton[@name='AI_tapAdd']");
	
	public static By dropDownSelectAProject = MobileBy.AccessibilityId("AI_selectProject_Container");
	public static By txtExpensesTitle = By.xpath("");
	public static By txtWorkerName1 = By.xpath("");
	public static By txtWorkerName2 = By.xpath("");
	public static By dropDownSelectATaskCode = MobileBy.AccessibilityId("AI_selectTask_Container");
	public static By txtTotalAmount = By.xpath("((//XCUIElementTypeStaticText[@name='Total Amount'])[1]/following::XCUIElementTypeStaticText)[1]");
	public static By txtTotalAmounts = By.xpath("(//XCUIElementTypeOther[@name='AI_tapExpenseMembersListItem'])");
	public static By txtName = MobileBy.AccessibilityId("AI_workerName");
	public static By txtQuantity = MobileBy.AccessibilityId("AI_tapQuantity");
	public static By txtProject;
	public static By txtTaskCode;
    public static By btnAddCrewExpenses = By.xpath("//XCUIElementTypeButton[@name='addcrewexpenses']");
    public static By dropDownTaskCode = MobileBy.AccessibilityId("AI_selectTask_Container");
    public static By  txtAddCrewExpensesTitle = By.xpath("//XCUIElementTypeStaticText[@name='Add Crew Expenses']");
    public static By txtCrewTotalAmount = By.xpath("(//XCUIElementTypeStaticText[@name='Total Amount']/following::XCUIElementTypeTextField)[1]");
    		
    
    public String captureCrewTotalAmount() throws Throwable {
		 String text = "";
			try {
				text = getText(txtCrewTotalAmount);
				Reporter.addStepLog("Captured crew total amount text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
	}
    public static By txtProject(String arg) {
		 txtProject = By.xpath("//XCUIElementTypeStaticText[contains(@name,'"+arg+"')]");

		 return txtProject;
	}
    
    public static By txtTaskCode(String arg) {
    	txtTaskCode = By.xpath("//XCUIElementTypeStaticText[@name='"+arg+"']");

		 return txtTaskCode;
	}
    
    public static By txtTotalAmount(String arg) {
    	txtTotalAmount = By.xpath("//XCUIElementTypeStaticText[@name='"+arg+"']");

		 return txtTotalAmount;
	}
    public static By txtZeroExpenses = MobileBy.AccessibilityId("AI_expenseTotal");
    
    public static void clickSelectTaskCodeDropDown() throws Throwable {
		try {
			click(dropDownTaskCode);
			Reporter.addStepLog("Selected task code dropdown");

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
    
    public static void clickAddButton() throws Throwable {
		try {
			click(btnAdd);
			Reporter.addStepLog("Clicked on add button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public static void selectProject(String arg1) throws Throwable {
		try {
			click(txtProject(arg1));
			Reporter.addStepLog("Selected on Project");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public static String captureWorkerName() throws Throwable {

		String text = "";
		try {
			text = getText(txtName);
			Reporter.addStepLog("Captured Worker Name "+text);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return text;
	}
	
	
	public static void clickAddCrewExpensesButton() throws Throwable {
		try {
			click(btnAddCrewExpenses);
			Reporter.addStepLog("Selected A project");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void clickQuantityOnMainScreen() throws Throwable {
		try {
			click(txtQuantity);
			Reporter.addStepLog("Clicked on quantity on main screen");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String captureQuantityOnCrewMainScreen() throws Throwable {
		 String text = "";
			try {
				text = getText(txtQuantity);
				Reporter.addStepLog("Captured crew quantity text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
	}

	 public String captureAddCrewExpensesTitle() throws Throwable {
		 String text = "";
			try {
				text = getText(txtAddCrewExpensesTitle);
				Reporter.addStepLog("Captured add crew expenses text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}

	
	public static String captureNoExpenses() throws Throwable{
		String text = "";
		try {
			text = getText(txtZeroExpenses);
			Reporter.addStepLog("Captured zero expenses text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureTotalExpenses() throws Throwable{
		String text = "";
		try {
			text = getText(txtZeroExpenses);
			Reporter.addStepLog("Captured total expenses text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureExpensesTitle()throws Throwable {
			String text = "";
			try {
				text = getText(txtExpensesTitle);
				Reporter.addStepLog("Captured expenses title text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
	public static String captureWorkerName1(String arg)throws Throwable {
			String text = "";
			try {
				Thread.sleep(2000);
				text = getText(MobileBy.AccessibilityId(arg));
				Reporter.addStepLog("Captured workername status");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
		public static String captureWorkerName2(String arg)throws Throwable {
			String text = "";
			try {
				text = getText(MobileBy.AccessibilityId(arg));
				Reporter.addStepLog("Captured workername status");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
	public static void clickSelectATaskCodeDropdown() throws Throwable {
			try {
				click(dropDownSelectATaskCode);
				Reporter.addStepLog("selected task code  dropdown");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	public static String captureTotalAmount()throws Throwable {
			String text = "";
			try {
				text = getText(txtTotalAmount);
				Reporter.addStepLog("Captured total amount text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
	
	
	
	public static void selectTaskCode(String arg1) throws Throwable {
			try {
				click(txtTaskCode(arg1));
				Reporter.addStepLog("Selected taske code");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	

}
