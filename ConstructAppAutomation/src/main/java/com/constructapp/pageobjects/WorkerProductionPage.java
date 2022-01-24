package com.constructapp.pageobjects;

import org.openqa.selenium.By;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class WorkerProductionPage  extends DriverUtilities{

	
	public static By btnProduction = By.xpath("AI_productionTab");
	public static By dropDownSelectAProject = MobileBy.AccessibilityId("AI_selectProject_Container");
	public static By btnAddProductionHours = By.xpath("Add Production Hours");
	public static By txtProduction = By.xpath("");
	public static By txtTotalProduction = MobileBy.AccessibilityId("AI_productionTotal");
	public static By txtQuantity = MobileBy.AccessibilityId("AI_tapQuantity");
	public static By dropDownTaskCode = By.xpath("");
    public static By productionView = MobileBy.AccessibilityId("AI_productionListview");
	public static By btnDeleteProd = MobileBy.AccessibilityId("AI_deleteProduction");

    public static By budgetQty=By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[2]");
    public static By budgetQtyInWorker=By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[8]");

    public static By txtremaingQty=By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[1]");
    		public static By checkBoxTask = By.xpath("");
	public static By checkBoxFirstProject = By.xpath("");
	public static By btnSelect = By.xpath("//XCUIElementTypeButton[@name='AI_tapSelect']");
public static By txtProject = By.xpath("");
public static By txtProductionsTitle = MobileBy.AccessibilityId("PRODUCTIONS");
public static By txtProjectIDTitle = MobileBy.AccessibilityId("Project ID");
public static By txtTaskCode = MobileBy.AccessibilityId("Task Code");
public static By txtProductionUnit = MobileBy.AccessibilityId("Production Unit");
public static By txtProductionTab = MobileBy.AccessibilityId("Project ID");

public static String captureBudgetQuantityInWorker() throws Throwable{
	String text = "";
	try {
		text = getText(budgetQtyInWorker);
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[1]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[2]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[3]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[4]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[5]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[6]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[7]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[8]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[9]")));


		Reporter.addStepLog("Captured budget quantity text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}
	
public static String captureBudgetQuantity() throws Throwable{
	String text = "";
	try {
		text = getText(budgetQty);
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[1]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[2]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[3]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[4]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[5]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[6]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[7]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[8]")));
		Reporter.addStepLog(getText(By.xpath("(//XCUIElementTypeOther[@name='AI_productionListview']/following::XCUIElementTypeStaticText)[9]")));


		Reporter.addStepLog("Captured budget quantity text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}

public static boolean productionNamePresenceOnMainScreen(String arg) throws Throwable {
	boolean result = true;

	try {

		result = isElementDisplayed(MobileBy.AccessibilityId(arg));
	} catch (Exception e) {

	}

	return result;
}
public static void clickDeleteProduction() throws Throwable {
	try {
		click(btnDeleteProd);
		Reporter.addStepLog("Clicked on delete button");

	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static String captureProductionsTitle()throws Throwable {
	String text = "";
	try {
		text = getText(txtProductionsTitle);
		Reporter.addStepLog("Captured productions title text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}

public static String captureProjecIDTitle()throws Throwable {
	String text = "";
	try {
		text = getText(txtProjectIDTitle);
		Reporter.addStepLog("Captured projectId text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}


public static String captureTaskCodeTitle()throws Throwable {
	String text = "";
	try {
		text = getText(txtTaskCode);
		Reporter.addStepLog("Captured taskcode text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}
public static String captureProductionUnitTitle()throws Throwable {
	String text = "";
	try {
		text = getText(txtProductionUnit);
		Reporter.addStepLog("Captured production unit  text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}

public static String captureProductionTab()throws Throwable {
	String text = "";
	try {
		text = getText(txtProjectIDTitle);
		Reporter.addStepLog("Captured productiontab text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}




public static String captureQuantity() throws Throwable {
	String text = "";
	try {
		text = getText(txtQuantity);
		Reporter.addStepLog("Captured quantity text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}

public  static String captureProductionUnit(String arg) throws Throwable {
	String text = "";
	try {
		text = getText(MobileBy.AccessibilityId(arg));
		Reporter.addStepLog("Captured production title text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
	
}

public static String captureTaskId() {
	// TODO Auto-generated method stub
	return null;
}

public static String captureProjectID() {
	// TODO Auto-generated method stub
	return null;
}

public static String captureRemainingQty() throws Throwable {
	String text = "";
	try {
		text = getText(txtremaingQty);
	    //By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[1]");

		System.out.println("Rem quantity"+getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[1]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[2]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[3]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[4]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[5]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[6]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[7]")));
		System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='Remaining QTY']/following::XCUIElementTypeStaticText)[8]")));

		Reporter.addStepLog("Captured production title text");

	} catch (Exception e) {
		e.printStackTrace();
	}
	return text;
}

    public static void clickProductionView() throws Throwable {
    	try {
			click(productionView);
			Reporter.addStepLog("Clicked on production view button");

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
	public static String captureEquipmentQuantity() throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalProduction);
			Reporter.addStepLog("Captured equipment quantity text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return text;
	}
	
	public static String captureTotalProductionQuantity() throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalProduction);
			Reporter.addStepLog("Captured total production quantity text");

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
	public static void selectProject(String arg1) throws Throwable {
		try {
			click(txtProject);
			Reporter.addStepLog("Selected on Project");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectTaskCode(String arg1) throws Throwable {
		try {
			click(checkBoxTask);
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
