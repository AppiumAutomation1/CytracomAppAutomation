package com.constructapp.pageobjects;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class AllTimeSheetsPage extends DriverUtilities {

	public static By btnComplete = By.xpath("//XCUIElementTypeOther[@name='AI_tapComplete']");
	public static By btnSubmit = MobileBy.AccessibilityId("Submit");
	public static By txtSubmitted = MobileBy.AccessibilityId("Submitted");
	public static By txtCompleted = MobileBy.xpath("Completed");
	public static By btnYes = MobileBy.AccessibilityId("Yes");
	public static By btnNo = MobileBy.AccessibilityId("No");
	//public static By btnToday = MobileBy.AccessibilityId("TODAY");
    public static By txtCalendarRange = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapCalender']/following::XCUIElementTypeStaticText)[1]");
	public static By btnAllTimeSheets = MobileBy.AccessibilityId("All Timesheets");
	public static By btnEdit = By.xpath("//XCUIElementTypeButton[@name='AI_editTimesheet']");
	public static By txtAllAssignments = By.xpath("//XCUIElementTypeStaticText[@name='All Timesheets']");
	public static By btnToday = By.xpath("//XCUIElementTypeButton[@name='AI_tapDate']");
	public static By txtHome = By.xpath("//XCUIElementTypeStaticText[@name='Home']");
	public static By txtCrewForeman = By.xpath("//XCUIElementTypeStaticText[@name='Crew Foreman /Worker']");
	public static By txtDate = By.xpath("//XCUIElementTypeStaticText[@name='Date']");
	public static By txtCrewDesc = By.xpath("//XCUIElementTypeStaticText[@name='Crew Description']");
	public static By txtTotalHours = By.xpath("//XCUIElementTypeStaticText[@name='Total Hours']");
	public static By txtStatus = By.xpath("//XCUIElementTypeStaticText[@name='Status ']");
	public static By btnDelete = By.xpath("//XCUIElementTypeButton[@name='AI_deleteTimesheet']");
	public static By btnTimeSheetStatus = MobileBy.AccessibilityId("AI_selectTimesheetStatus");
	public static By overtime1Hours = By.xpath("((//XCUIElementTypeStaticText[@name='|'])[1]/following::XCUIElementTypeStaticText)[1]");
			
	public static By overtime2Hours=	By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[1]");

	public static By TotalHours = 	By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[2]");


	static SoftAssert sa = new SoftAssert();

	
	public String captureRegularHoursInAllTimeSheets(String arg) throws Throwable {
		String text = "";
		try {
			
			System.out.println("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[2]");
			By regularhours = By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[2]");
System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[3]")));
System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[4]")));
System.out.println(getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[5]")));

			text = getText(regularhours);
			Reporter.addStepLog("Captured regularhours txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	
	public String captureOvertime1HoursInAllTimeSheets() throws Throwable {
		String text = "";
		try {
			

			text = getText(overtime1Hours);
			Reporter.addStepLog("Captured overtime1 hours txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	public String captureOvertime2HoursInAllTimeSheets() throws Throwable {
		String text = "";
		try {
			

			text = getText(overtime2Hours);
			Reporter.addStepLog("Captured overtime2 hours txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	public String captureTotalHours() throws Throwable {
		String text = "";
		try {
			

			System.out.println(getText(By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[2]")));
			System.out.println(getText(By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[3]")));
			System.out.println(getText(By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[4]")));

			text = getText(TotalHours);
			Reporter.addStepLog("Captured total hours txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}

	
	
	public void clickOnAllTimeSheets() throws Throwable {

		try {
			click(btnAllTimeSheets);
			Reporter.addStepLog("Clicked on alltimesheets button");
		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");
		}

	}

/*public String captureErrorMessageOnAlert() {
	String text = "";
	try {
		text = getText(txtAllAssignments);
		Reporter.addStepLog("Captured submitted txt " + text);

	} catch (Exception e) {
		sa.assertTrue(false, "Unable to capture the text");

		e.printStackTrace();
	}
	return text;
	}*/
	
	public String captureCalendarRange() throws Throwable {
		
				
				String text = "";
				try {
					text = getText(txtCalendarRange);
					Reporter.addStepLog("Captured submitted txt " + text);

				} catch (Exception e) {
					sa.assertTrue(false, "Unable to capture the text");

					e.printStackTrace();
				}
				return text;
		
	}
	
	public void clickOnEdit() throws Throwable {
		try {
			click(btnEdit);
			Reporter.addStepLog("Clicked on edit button");
		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");
		}

	}

	public void ExpandTimesshet(String arg1) throws Throwable {
		Thread.sleep(2000);
		clickUsingAccessibilityId(arg1);

	}
	
public void clickDeleteButton() throws Throwable {
		
	try {
		click(btnDelete);
		Reporter.addStepLog("Clicked on delete button");
	} catch (Exception e) {
		sa.assertTrue(false, "Unable to click");
	}

	}
	
	
	
	public String captureStatusHeader() throws Throwable {
		String text = "";
		try {
			DriverUtilities.ExplicitWaitOnElementToBeVisible(txtStatus);
			text = getText(txtStatus);
			Reporter.addStepLog("Captured txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}



	public String captureTotalHoursHeader() throws Throwable {
		String text = "";
		try {
			DriverUtilities.ExplicitWaitOnElementToBeVisible(txtTotalHours);
			text = getText(txtHome);
			Reporter.addStepLog("Captured txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}



	public String captureCrewDesc() throws Throwable {
		String text = "";
		try {
			DriverUtilities.ExplicitWaitOnElementToBeVisible(txtCrewDesc);
			text = getText(txtCrewDesc);
			Reporter.addStepLog("Captured txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}



	public String captureDateHeader() throws Throwable {
		String text = "";
		try {
			DriverUtilities.ExplicitWaitOnElementToBeVisible(txtDate);
			text = getText(txtDate);
			Reporter.addStepLog("Captured txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}



	public String captureCrewForemanHeader() throws Throwable {
		String text = "";
		try {
			DriverUtilities.ExplicitWaitOnElementToBeVisible(txtCrewForeman);
			text = getText(txtCrewForeman);
			Reporter.addStepLog("Captured txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}



	
	public String captureHomeText() throws Throwable {
		String text = "";
		try {
			//DriverUtilities.ExplicitWaitOnElementToBeVisible(txtHome);
			Thread.sleep(2000);
			text = getText(txtHome);
			Reporter.addStepLog("Captured home txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}

	public String captureAllTimeSheetsText() throws Throwable {
		String text = "";
		try {
			//DriverUtilities.ExplicitWaitOnElementToBeVisible(txtAllAssignments);
			Thread.sleep(2000);
			text = getText(txtAllAssignments);
			Reporter.addStepLog("Captured submitted txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}

	public static void clickComplete() throws Throwable {

		try {
			click(btnComplete);
			Reporter.addStepLog("Clicked on complete button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");
			e.printStackTrace();
		}
	}

	public static void clickSubmit() throws Throwable {

		try {
			click(btnSubmit);
			Reporter.addStepLog("Clicked on submit button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");

			e.printStackTrace();
		}
	}

	public static void clickYesButton() throws Throwable {

		try {
			click(btnYes);
			Reporter.addStepLog("Clicked on yes button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");

			e.printStackTrace();
		}
	}

	public static String captureCompleted(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[2]"));

			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[6]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[4]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[3]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[2]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[1]")));
			Reporter.addStepLog("Captured completed text");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the completed text");

			e.printStackTrace();
		}
		return text;
	}

	public static String captureCompletedForCrew(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[2]"));

			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[6]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[4]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[3]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[2]")));
			Reporter.addStepLog(getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[1]")));
			Reporter.addStepLog("Captured completed text");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the completed text");

			e.printStackTrace();
		}
		return text;
	}
	
	public void clickTimeSheetStatus() throws Throwable {
		try {
			click(btnTimeSheetStatus);
			Reporter.addStepLog("Clicked on timesheet status button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");

			e.printStackTrace();
		}
		
	}
	

	public void selectStatus(String arg1) throws Throwable {
		
		try {
			click(MobileBy.AccessibilityId(arg1));
			Reporter.addStepLog("Clicked on timesheet status button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");

			e.printStackTrace();
		}
		
	}

	public static String captureSubmitted(String arg) throws Throwable {

		String text = "";
		try {
			text = getText(By.xpath(
					"(//XCUIElementTypeStaticText[@name='" + arg + "']/following::XCUIElementTypeStaticText)[4]"));
			Reporter.addStepLog("Captured submitted txt " + text);

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}

	public static void clickNo() throws Throwable {

		try {
			click(btnNo);
			Reporter.addStepLog("Clicked on no button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");

			e.printStackTrace();
		}

	}

	public static void clickToday() throws Throwable {
		try {
			click(btnToday);
			Reporter.addStepLog("Clicked on today button");

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click");

			e.printStackTrace();
		}
	}

}
