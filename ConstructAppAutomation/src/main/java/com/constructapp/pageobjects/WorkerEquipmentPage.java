package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class WorkerEquipmentPage extends DriverUtilities {

	public static By btnEquipment = MobileBy.AccessibilityId("AI_equipmentTab");
	public static By selectAProjectDropDown = By.xpath("");
	public static By btnAddEquipmentHours = MobileBy.AccessibilityId("AI_addEquipmentHours");
	public static By btnExpand = MobileBy.AccessibilityId("AI_tapSelectedEquipmentsListItem");
	public static By txtEquipmentTitle = By.xpath("");
	public static By txtEquipmentCount = MobileBy.AccessibilityId("AI_equipmentTotal");
	public static By dropDownTaskCode = By.xpath("");
	public static By txtTotalHours = By.xpath("");
	public static By dropdownSelectProject = By.xpath("");
	public static By checkBoxFirstEquipment = By.xpath("(//XCUIElementTypeButton[@name='AI_tapCheckBoxListItem'])[1]");
	public static By btnSelect = By.xpath("//XCUIElementTypeButton[@name='AI_tapSelect']");
	public static By btnHour = MobileBy.AccessibilityId("hr");
	public static By btnDone = By.xpath("//XCUIElementTypeOther[@name='AI_tapDone']");
	public static By btnMinus = By.xpath("//XCUIElementTypeButton[@name='AI_minusButton']");
	public static By btnDelete = MobileBy.AccessibilityId("AI_deleteWorker");
	public static By btnDeleteEquipment = MobileBy.AccessibilityId("AI_deleteEquipment");

	public static By txtQuantity = By.xpath("((//XCUIElementTypeOther[@name='AI_tapSelectedEquipmentsListItem'])[1]/following::XCUIElementTypeStaticText)[5]");
	public static By txtTaskCode = By.xpath("");
	public static By btnQuantity = MobileBy.AccessibilityId("AI_tapQuantity");
	public static By txtTotalQuantity = MobileBy.AccessibilityId("AI_tapQuantity");
	public static By productionView = MobileBy.AccessibilityId("AI_productionListview");
	public static By btnDot = By.xpath("//XCUIElementTypeButton[@name='AI_dotButton']");
	public static By btnCollapse = By.xpath("");
	public static By searchBar = By
			.xpath("(//XCUIElementTypeStaticText[@name='EQUIPMENTS']/following::XCUIElementTypeOther)[5]");
	public static By txtEquipmentHoursTitle = MobileBy.AccessibilityId("EQUIPMENTS");
	public static By txtEquipmentIdHeader = MobileBy.AccessibilityId("Equipment ID");
	public static By txtUnitHeader = MobileBy.AccessibilityId("Unit");
	public static By txtQuantityOnSelectionPad = By.xpath("");
	public static By txtEquipmentUnit = By.xpath("");
	public static By txtEquipmentResult = By.xpath("");
	public static By txtEquipment = By.xpath("");
	public static By txtDescriptionHeader = MobileBy.AccessibilityId("Description");
	public static By txtEquipmentNameOnMainScreen = By.xpath("");
	public static By txtEquipmentName = By.xpath("");
	public static By txtProject = MobileBy.AccessibilityId("Project");
	public static By btnOne = By.xpath("//XCUIElementTypeButton[@name='AI_oneButton']");
	public static By btnTwo = By.xpath("//XCUIElementTypeButton[@name='AI_twoButton']");
	public static By btnThree = By.xpath("//XCUIElementTypeButton[@name='AI_threeButton']");
	public static By btnFour = By.xpath("//XCUIElementTypeButton[@name='AI_fourButton']");
	public static By btnFive = By.xpath("//XCUIElementTypeButton[@name='AI_fiveButton']");
	public static By btnSix = By.xpath("//XCUIElementTypeButton[@name='AI_sixButton']");
	public static By btnSeven = By.xpath("//XCUIElementTypeButton[@name='AI_sevenButton']");
	public static By btnEight = By.xpath("//XCUIElementTypeButton[@name='AI_eightButton']");
	public static By btnNine = By.xpath("//XCUIElementTypeButton[@name='AI_nineButton']");
	public static By btnZero = By.xpath("//XCUIElementTypeButton[@name='AI_zeroButton']");
    
	// public static By searchBar =
	// By.xpath("(//XCUIElementTypeStaticText[@name='EQUIPMENTS']/following::XCUIElementTypeOther)[5]

	public static boolean equipmentNamePresence(String arg) throws Throwable {
		boolean result = true;

		try {

			result = isElementDisplayed(MobileBy.AccessibilityId(arg));
		} catch (Exception e) {

		}

		return result;
	}
	
	public boolean projectPresence() throws Throwable {
		boolean result = true;

		try {

			result = isElementDisplayed(txtProject);
		} catch (Exception e) {

		}
		return result;
	}
	
	


	public boolean addEquipmentHoursPresence() throws Throwable {

		boolean result = true;

		try {

			result = isElementDisplayed(btnAddEquipmentHours);
		} catch (Exception e) {

		}
		return result;
	}

	public static boolean equipmentNamePresenceOnMainScreen(String arg) throws Throwable {
		boolean result = true;

		try {

			result = isElementDisplayed(MobileBy.AccessibilityId(arg));
		} catch (Exception e) {

		}

		return result;
	}

	/*
	 * public static boolean equipmentNamePresence() throws Throwable { boolean
	 * result = true;
	 * 
	 * try {
	 * 
	 * result = isElementDisplayed(MobileBy.AccessibilityId(arg));
	 * 
	 * }catch(Exception e) {
	 * 
	 * }
	 * 
	 * return result; }
	 */

	public static boolean equipmentUnitPresence() throws Throwable {
		boolean result = true;

		try {

			result = isElementDisplayed(txtEquipmentUnit);
		} catch (Exception e) {

		}

		return result;
	}

	public static void enterEquipment(String arg) throws Throwable {
		try {
			enterText(searchBar, arg);
			Reporter.addStepLog("Clicked on collapse");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnCollapse() throws Throwable {
		try {
			click(btnCollapse);
			Reporter.addStepLog("Clicked on collapse");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickSearchBar() throws Throwable {
		try {
			click(searchBar);
			Reporter.addStepLog("Clicked on search bar");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String captureEquipmentHoursTitle() throws Throwable {
		String text = "";
		try {
			text = getText(txtEquipmentHoursTitle);
			Reporter.addStepLog("Captured equipment hours title");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureDescriptionHeader() throws Throwable {
		String text = "";
		try {
			text = getText(txtDescriptionHeader);
			Reporter.addStepLog("Captured description header text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureEquipmentIdHeader() throws Throwable {
		String text = "";
		try {
			text = getText(txtEquipmentIdHeader);
			Reporter.addStepLog("Captured equipment id  header");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureUnitHeader() throws Throwable {
		String text = "";
		try {
			text = getText(txtUnitHeader);
			Reporter.addStepLog("Captured  unit header text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureEquipmentSearchText(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured equipment search text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureEquipmentInMainScreen() throws Throwable {
		String text = "";
		try {
			text = getText(txtEquipment);
			Reporter.addStepLog("Captured equipment text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureEquipmentUnit(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured equipmet unit text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureQuantity(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	

	public static String captureQuantityOnSelectionPad(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured expense unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureEquipmentCount() throws Throwable {
		String text = "";
		try {
			text = getText(txtEquipmentCount);
			Reporter.addStepLog("Captured expense unit price text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

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

	public static void clickAddEquipmentHoursButton() throws Throwable {
		try {
			click(btnAddEquipmentHours);
			Reporter.addStepLog("Clicked on add equipment hours button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickExpandRecord() throws Throwable {
		try {
			click(btnExpand);
			Reporter.addStepLog("Clicked on expand button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String captureEquipmentTitle() throws Throwable {
		String text = "";
		try {
			text = getText(txtEquipmentTitle);
			Reporter.addStepLog("Captured equipment  title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureEquipmentCount(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(txtEquipmentCount);
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

	public static void clickTaskCodeDropdown() throws Throwable {
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

	public static String captureTotalHours() throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalHours);
			Reporter.addStepLog("Captured text total hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureQuantityCount() throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalQuantity);
			Reporter.addStepLog("Captured quantity total text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static void clickSelectProject() throws Throwable {
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
	
	

	public static void clickFirstEquipment(String arg) throws Throwable {
		try {
			click(MobileBy.AccessibilityId(arg));
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

	public static void clickDoneButton() throws Throwable {
		try {
			click(btnDone);
			Reporter.addStepLog("Clicked on done button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickDeleteHour() throws Throwable {
		try {
			click(btnDelete);
			Reporter.addStepLog("Clicked on delete button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickDeleteEquipment() throws Throwable {
		try {
			click(btnDeleteEquipment);
			Reporter.addStepLog("Clicked on delete button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickMinus() throws Throwable {
		try {
			click(btnMinus);
			Reporter.addStepLog("Clicked on minus button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickDot() throws Throwable {
		try {
			click(btnDot);
			Reporter.addStepLog("Clicked on dot button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectQuantity(String arg) throws Throwable {
		try {
			
			if(arg.equals("1")) {
				click(btnOne);
			}else if(arg.equals("2")) {
				click(btnTwo);
			}else if(arg.equals("3")) {
				click(btnThree);
			}else if(arg.equals("4")) {
				click(btnFour);
			}else if(arg.equals("5")) {
				click(btnFive);
			}else if(arg.equals("6")) {
				click(btnSix);
			}else if(arg.equals("7")) {
				click(btnSeven);
			}else if(arg.equals("8")) {
				click(btnEight);
			}else if(arg.equals("9")) {
				click(btnNine);
			}else if(arg.equals("0")) {
				click(btnZero);
			}
			//click(btnHours);
			Reporter.addStepLog("selected value");

		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	

}
