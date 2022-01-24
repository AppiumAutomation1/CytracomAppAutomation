package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

public class WorkerExpensesPage  extends DriverUtilities{

	
	public static By btnExpenses = MobileBy.AccessibilityId("AI_expenseTab");
	public static By btnAddExpensesBtn = By.xpath("//XCUIElementTypeButton[@name='addexpense']");
	public static By dropdownSelectAProject = By.xpath("");
	public static By dropDownExpenseCategory = MobileBy.AccessibilityId("AI_selectExpenseCategory");
	public static By txtQuantity = MobileBy.AccessibilityId("AI_quantityEntry");
	public static By txtExpensesTitle = By.xpath("");
	public static By txtZeroExpenses = MobileBy.AccessibilityId("AI_expenseTotal");
	public static By txtProjectID = By.xpath("");
	public static By dropDownSelectTaskCode = By.xpath("");
	public static By txtUnitPrice = By.xpath("//XCUIElementTypeStaticText[@name='AI_unitEntry']");
	public static By txtTotalAmount = By.xpath("//XCUIElementTypeTextField[@name='AI_unitEntry']");
	
	public static By txtExpense = By.xpath("");
	public static By txtTotalAmounts = By.name("AI_tapExpenseMembersListItem");
	public static By txtProjectId = By.xpath("");
	public static By txtUnit = By.xpath("");
	public static By txtAddFieldExpenses = By.xpath("//XCUIElementTypeStaticText[@name='Add Field Expenses']");
	public static By txtEnterFieldExpenses = MobileBy.AccessibilityId("Enter Field Expenses");
	public static By txtExpensesTab = MobileBy.AccessibilityId("AI_expenseTab");
	public static By txtSelectProject = MobileBy.AccessibilityId("Select Project & TaskCode");
	
	public static By txtSelectTaskCode = By.xpath("");
	public static By txtExpenseCategory = MobileBy.AccessibilityId("AI_selectExpenseCategory Dropdown Button");
	public static By txtPerdiem = By.xpath("//XCUIElementTypeStaticText[@name='Perdiem']");
	public static By txtMi = By.xpath("//XCUIElementTypeStaticText[@name='Mi']");
	public static By txtMeal = By.xpath("//XCUIElementTypeStaticText[@name='Meal']");
	public static By btnDone = By.xpath("//XCUIElementTypeButton[@name='AI_tapDone']");
	public static By btnAdd = By.xpath("//XCUIElementTypeButton[@name='AI_tapAdd']");
	public static By txtTaskCode = By.xpath("");
	public static By txtSelectedCategory = By.xpath("//XCUIElementTypeOther[@name='AI_selectExpenseCategory']/XCUIElementTypeTextField");
	public static By btnDelete = MobileBy.AccessibilityId("AI_deleteExpense");


public static By dropDownSelectQuantity = By.xpath("");
public static By dropDownQuantity = MobileBy.AccessibilityId("AI_quantityEntry");
//public static By dropDownExpenseCategory = By.xpath("");
public static By txtQuantityOnMainScreen = By.xpath("//XCUIElementTypeTextField");
public static By txtUnitPriceInMainScreen = By.xpath("(//XCUIElementTypeTextField/following::XCUIElementTypeStaticText)[2]");
public static By txtExpenseUnitPrice = By.xpath("//XCUIElementTypeStaticText[@name='AI_unitEntry']");
public static By txtUnitPriceTitle = By.xpath("(//XCUIElementTypeStaticText[@name='Unit Price'])[1]");
public static By txtQuantityInSelectionPad = By.xpath("(//XCUIElementTypeStaticText[@name='Quantity'])[2]/following::XCUIElementTypeStaticText[2]");
//public static By txtQuantity = By.xpath("");
public static By txtQuantityTitle = By.xpath("(//XCUIElementTypeStaticText[@name='Quantity'])[1]");
public static By txtUnitPriceInPricePad = By.xpath("");


public static  void enterUnitPrice(String arg1) throws Throwable {
		try {
			enterText(btnAdd, arg1);
			Reporter.addStepLog("Entered unit price");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void selectQuantity() throws Throwable {
		try {
			click(dropDownSelectQuantity);
			Reporter.addStepLog("Clicked on quantity  dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static  void clickQuantity() throws Throwable {
		try {
			click(dropDownQuantity);
			Reporter.addStepLog("Clicked on quantity");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static void clickDeleteExpense() throws Throwable {
	try {
		click(btnDelete);
		Reporter.addStepLog("Clicked on delete button");

	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	public static  void clickExpenseCategory() throws Throwable {
		try {
			click(dropDownExpenseCategory);
			Reporter.addStepLog("Clicked on expense category");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void clickUnitPrice() throws Throwable {
		try {
			click(txtUnitPrice);
			Reporter.addStepLog("Clicked on unit price");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static  void clickQuantityOnMainScreen(String expense) throws Throwable {
		try {
			
			click(By.xpath("(//XCUIElementTypeStaticText[@name='"+expense+"']/following::XCUIElementTypeStaticText)[3]"));
			//click(txtQuantityOnMainScreen);
			Reporter.addStepLog("Clicked on quantity on main screen");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static  void clickUnitPriceOnMainScreen() throws Throwable {
		try {
			click(txtUnitPriceInMainScreen);
			Reporter.addStepLog("Clicked on unit price in main screen");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static String captureExpenseUnitPrice() throws Throwable {
		String text = "";
		try {
			text = getText(txtExpenseUnitPrice);
			Reporter.addStepLog("Captured expense unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static String captureUnitPriceTitle() throws Throwable {
		String text = "";
		try {
			text = getText(txtUnitPriceTitle);
			Reporter.addStepLog("Captured unit price title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureUnitPriceInPricePad(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured unit price in price pad");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureQuantityTitle() throws Throwable {
		String text = "";
		try {
			text = getText(txtQuantityTitle);
			Reporter.addStepLog("Captured quantity title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureQuantity() throws Throwable {
		String text = "";
		try {
			text = getText(txtQuantity);
			Reporter.addStepLog("Captured qunatity");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureQuantityOnMainScreen(String expense) throws Throwable {
		String text = "";
		try {
			text = getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+expense+"']/following::XCUIElementTypeStaticText)[3]"));
			Reporter.addStepLog("Captured qunatity");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureQuantityInSelectionPad() throws Throwable {
		String text = "";
		try {
			text = getText(txtQuantityInSelectionPad);
			System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Quantity'])[2]/following::XCUIElementTypeStaticText[1]")));
			System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Quantity'])[2]/following::XCUIElementTypeStaticText[2]")));
			System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Quantity'])[2]/following::XCUIElementTypeStaticText[3]")));
			System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Quantity'])[2]/following::XCUIElementTypeStaticText[4]")));

			Reporter.addStepLog("Captured quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureUnitPriceInMainScreen() throws Throwable {
		String text = "";
		try {
			text = getText(txtUnitPriceInMainScreen);
			Reporter.addStepLog("Captured unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	
	public static  void clickExpensesButton() throws Throwable {
		try {
			click(btnExpenses);
			Reporter.addStepLog("Clicked on expenses button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void clickAddFiedExpensesButton() throws Throwable {
		try {
			click(btnAddExpensesBtn);
			Reporter.addStepLog("Clicked on add expenses button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void clickSelectAProjectDropdown() throws Throwable {
		try {
			click(dropdownSelectAProject);
			Reporter.addStepLog("Clicked on select a project dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void clickExpenseCategoryDropdown() throws Throwable {
		try {
			click(dropDownExpenseCategory);
			Reporter.addStepLog("Clicked on logout button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectQuantity(String arg) throws Throwable {
		try {
			
			if(arg.equals("1")) {
				click(WorkerHoursPage.btnOne);
			}else if(arg.equals("2")) {
				click(WorkerHoursPage.btnTwo);
			}else if(arg.equals("3")) {
				click(WorkerHoursPage.btnThree);
			}else if(arg.equals("4")) {
				click(WorkerHoursPage.btnFour);
			}else if(arg.equals("5")) {
				click(WorkerHoursPage.btnFive);
			}else if(arg.equals("6")) {
				click(WorkerHoursPage.btnSix);
			}else if(arg.equals("7")) {
				click(WorkerHoursPage.btnSeven);
			}else if(arg.equals("8")) {
				click(WorkerHoursPage.btnEight);
			}else if(arg.equals("9")) {
				click(WorkerHoursPage.btnNine);
			}else if(arg.equals("0")) {
				click(WorkerHoursPage.btnZero);
			}
			Reporter.addStepLog("selected value");

		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static String captureNoExpenses() throws Throwable {
		String text = "";
		try {
			text = getText(txtZeroExpenses);
			Reporter.addStepLog("Captured zero expenses text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureProjectID() throws Throwable {
		String text = "";
		try {
			text = getText(txtProjectID);
			Reporter.addStepLog("Captured Project ID text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureTaskCode() throws Throwable {
		String text = "";
		try {
			text = getText(txtTaskCode);
			Reporter.addStepLog("Captured task  code text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static  void clickSelectTaskCodeDropdown() throws Throwable {
		try {
			click(dropDownSelectTaskCode);
			Reporter.addStepLog("Clicked on select task code dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String captureUnitPrice() throws Throwable {
		String text = "";
		try {
			text = getText(txtUnitPrice);
			Reporter.addStepLog("Captured unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureUnitPrice(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureTotalAmount() throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalAmount);
			Reporter.addStepLog("Captured Total amount text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureTotalAmount(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Total amount text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureExpense(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured expense text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String capturequantity() throws Throwable {
		String text = "";
		try {
			text = getText(txtQuantity);
			Reporter.addStepLog("Captured Quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String capturequantity(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(By.xpath(""));
			Reporter.addStepLog("Captured Quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureUnit(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureAddFieldExpensesTitle()throws Throwable {
		String text = "";
		try {
			text = getText(txtAddFieldExpenses);
			Reporter.addStepLog("Captured add field expenses title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureSelectProjectSubTitle()throws Throwable {
		String text = "";
		try {
			text = getText(txtSelectProject);
			Reporter.addStepLog("Captured select project subtitle text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static String captureExpensesTitle()throws Throwable {
		String text = "";
		try {
			text = getText(txtExpensesTab);
			Reporter.addStepLog("Captured expenses title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureEnterFieldExpensesTitle()throws Throwable {
		String text = "";
		try {
			text = getText(txtEnterFieldExpenses);
			Reporter.addStepLog("Captured field expenses  text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureprojectid(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured project id text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String capturetaskcode(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured task  code text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureunit(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Unit text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureunitprice(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureTotalamount(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Total amount text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static  void selectProject(String arg1) throws Throwable {
		try {
			click(txtSelectProject);
			Reporter.addStepLog("Clicked on select project dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void selectTaskCode(String arg1) throws Throwable {
		try {
			click(txtSelectTaskCode);
			Reporter.addStepLog("Clicked on task code dropdown");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void selectExpenseCategory(String arg) throws Throwable {
		try {
			
			
			click(MobileBy.AccessibilityId(arg));
			
			Reporter.addStepLog("selected expense category");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void clickQuantityTextField() throws Throwable {
		try {
			click(txtQuantity);
			Reporter.addStepLog("clicked on quantity text field");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void clickDone() throws Throwable {
		try {
			click(btnDone);
			Reporter.addStepLog("Clicked on done button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static  void clickAddButton() throws Throwable {
		try {
			click(btnAdd);
			Reporter.addStepLog("Clicked on add button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
