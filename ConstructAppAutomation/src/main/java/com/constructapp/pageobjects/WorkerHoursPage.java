package com.constructapp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class WorkerHoursPage extends DriverUtilities {

	
	public static By checkBoxTask = By.xpath("");
	public static By btnSelect = By.xpath("");
	public static By btnHours = MobileBy.AccessibilityId("AI_hoursTab");
	public static By btnDone = By.xpath("//XCUIElementTypeButton[@name='AI_tapDone']");
	public static By btnShift = MobileBy.AccessibilityId("Select Shift");
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
    public static By btnCancelInHourPad = By.xpath("(//XCUIElementTypeOther[@name='AI_tapCancel'])[2]");

	public static By txtTotalHours = MobileBy.AccessibilityId("AI_totalHours");
	public static By txtTotalHoursInAddWorkerHours = By.xpath("(//XCUIElementTypeStaticText[@name='Total Hours']/following::XCUIElementTypeStaticText)[1]");
	public static By txtRegularHours = By.xpath("");
	public static By txtOverTime1Hours = By.xpath("");
	public static By txtOverTime2Hours = By.xpath("");
	public static By txtTaskCode = By.xpath("");
	public static By txtProjectName = By.xpath("");
	public static By txtSelectedShift = By.xpath("//XCUIElementTypeOther[@name='AI_selectShift']/XCUIElementTypeTextField");

	public static By txtTaskDescription = By.xpath("");
	public static By txtProjectDescription = By.xpath("");
	public static By emptyRecord = MobileBy.AccessibilityId("AI_tapCrewMembersListItem");
	public static By txtHours = MobileBy.AccessibilityId("AI_totalHours");
	public static By btnAdd = By.xpath("//XCUIElementTypeButton[@name='AI_tapAdd']");
	public static By DropDownshift = MobileBy.AccessibilityId("AI_selectShift");
	public static By btnOverTime2 = MobileBy.AccessibilityId("AI_tapOvertime2");
	public static By btnOverTime1 = MobileBy.AccessibilityId("AI_tapOvertime1");
	public static By btnRegular = MobileBy.AccessibilityId("AI_tapRegular");
	public static By btnRegularEntry = MobileBy.AccessibilityId("AI_regularEntry");

    public static By txtNightShift = By.xpath("//XCUIElementTypeStaticText[@name='Night']");
    public static By txtRollingShift = By.xpath("//XCUIElementTypeStaticText[@name='ROLLING']");
    public static By txtDayShift = By.xpath("//XCUIElementTypeStaticText[@name='DAY']");

    //public static By txtNightShift = By.xpath("(//XCUIElementTypeOther[@name='AI_selectShift']/following::XCUIElementTypeStaticText)[2]");
	public static By btnselectTask = MobileBy.AccessibilityId("AI_selectTask");
	public static By btnAddWorkerHours = MobileBy.AccessibilityId("Add Worker Hours");
	public static By txtHoursTitle = MobileBy.AccessibilityId("AI_hoursTab");
	public static By txtWorkerName = MobileBy.AccessibilityId("AI_workerName");
	   public static By btnOvertime1InHourPad = By.xpath("//XCUIElementTypeOther[@name='AI_tapOverTime1']");
	   public static By btnOvertime2InHourPad = By.xpath("//XCUIElementTypeOther[@name='AI_tapOverTime2']");

   public static By btnRegularInHourPad = By.xpath("//XCUIElementTypeOther[@name='AI_tapRegular']");
    public static By searchBarInHours = By.xpath("(//XCUIElementTypeStaticText[@name='All Projects']/following::XCUIElementTypeOther)[4]");


public static By btnSearchBar = By.xpath("");
public static By btnProjectId = By.xpath("");
public static By btnProjectName = MobileBy.AccessibilityId("AI_selectProject");
public static By txtSelectTaskTitle = MobileBy.AccessibilityId("All Task");
public static By txtProjectTasksSubttile = MobileBy.AccessibilityId("Project Tasks");
public static By txtAddWorkerHoursTitle = By.xpath("//XCUIElementTypeStaticText[@name='Add Worker Hours']");
public static By txtTaskDescHeader = MobileBy.AccessibilityId("Description");
public static By txtTaskIdHeader = MobileBy.AccessibilityId("Task ID");
public static By txtSearchTaskPlaceHolder = By.xpath("");
public static By btnBackSelectTask = MobileBy.AccessibilityId("Add Worker Hours");

public static By dropDownJobClassfication = MobileBy.AccessibilityId("AI_selectJob");
public static By dropDownSpecialPay = MobileBy.AccessibilityId("AI_selectSpecialPay");
public static By taskSearchBar = By.xpath("(//XCUIElementTypeButton[@name='']/following::XCUIElementTypeOther)[2]");




public static By btnClear = By.xpath("//XCUIElementTypeButton[@name='AI_deleteButton']");
public static By inputRegular = By.xpath("");
public static By txtOverTime2 = By.xpath("((//XCUIElementTypeStaticText[@name='Overtime 2'])[2]/following::XCUIElementTypeStaticText)[1]");
public static By txtTotalHoursInHourPad = By.xpath("((//XCUIElementTypeStaticText[@name='Total Hours'])[2]/following::XCUIElementTypeStaticText)[1]");
public static By txtOverTime1 = By.xpath("((//XCUIElementTypeStaticText[@name='Overtime 1'])[2]/following::XCUIElementTypeStaticText)[1]");
public static By txtRegular = By.xpath("((//XCUIElementTypeStaticText[@name='Regular'])[2]/following::XCUIElementTypeStaticText)[1]");
public static By txtHoursTitleInHourPad = MobileBy.AccessibilityId("Hours");

public static By txtRegHours = By.xpath("//XCUIElementTypeStaticText[@name='AI_tapRegular']");
//XCUIElementTypeStaticText[@name="AI_tapRegular"]




public static void clickClearButton() throws Throwable{

try {
			click(btnClear);
			Reporter.addStepLog("Clicked on clear");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
		public static void clickRegularOnHourPad() throws Throwable{

try {
			click(inputRegular);
			Reporter.addStepLog("Clicked on regular on hourpad");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
		
			public static String captureRegularHours()throws Throwable {
		String text = "";
		try {
			text = getText(txtRegHours);
			Reporter.addStepLog("Captured regular hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
			public static String captureRegularHoursInHourPad()throws Throwable {
				String text = "";
				try {
					text = getText(txtRegular);
					Reporter.addStepLog("Captured regular hours text");

				} catch (Exception e) {
					e.printStackTrace();
				}
				return text;
			}
			public static String captureOvertime1HoursInHourPad()throws Throwable {
				String text = "";
				try {
					text = getText(txtOverTime1);
					Reporter.addStepLog("Captured overtime1 hours text");

				} catch (Exception e) {
					e.printStackTrace();
				}
				return text;
			}
			public static String captureOvertime2HoursInHourPad()throws Throwable {
				String text = "";
				try {
					text = getText(txtOverTime2);
					Reporter.addStepLog("Captured overtime2 hours text");

				} catch (Exception e) {
					e.printStackTrace();
				}
				return text;
			}
			
	public static String captureTotalHoursInHourPad()throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalHoursInHourPad);
			Reporter.addStepLog("Captured total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static String captureOvertime1()throws Throwable {
		String text = "";
		try {
			text = getText(btnOverTime1);
			Reporter.addStepLog("Captured overtime1 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static boolean projectNamePresence(String arg)  throws Throwable {

		boolean isProjectPresent = false;
		try {
			isProjectPresent = isElementDisplayed(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured project Name In Sign Hours"+isProjectPresent);

		} catch (Exception e) {
			sa.assertFalse(true,"able to identify the element");

			e.printStackTrace();
		}
		return isProjectPresent;
	}
	
	public static String captureOvertime2()throws Throwable {
		String text = "";
		try {
			text = getText(btnOverTime2);
			Reporter.addStepLog("Captured overtime2 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureHoursTitleInHourPad()throws Throwable {
		String text = "";
		try {
			text = getText(txtHoursTitleInHourPad);
			Reporter.addStepLog("Captured hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	


public static void clickjobClassification() throws Throwable{

try {
			click(dropDownJobClassfication);
			Reporter.addStepLog("Clicked on dropdown job classification");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
		public static void clickSpecialPay() throws Throwable{

try {
			click(dropDownSpecialPay);
			Reporter.addStepLog("Clicked on special pay  dropdown");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
			public static void selectJobClassification(String arg) throws Throwable{

try {
			click(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("selected job classfication");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to select");

			e.printStackTrace();
		}
		}
		
			public static void selectspecialPay(String arg) throws Throwable{

try {
	
	
	
	click(By.xpath("//XCUIElementTypeStaticText[@name='"+arg+"']"));
	
	
	Reporter.addStepLog("selected  special pay");

} catch (Exception e) {
	sa.assertTrue(false,"Unable to select");


	e.printStackTrace();
}
			}



public static void clickSearchBar() throws Throwable{

try {
			click(btnSearchBar);
			Reporter.addStepLog("Clicked on searchbar  button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
		public static void clickProjectId() throws Throwable{

try {
			click(btnProjectName);
			Reporter.addStepLog("Clicked on project id  button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		 public static void enterSearchText(String arg) throws Throwable{
			    try {
			    	
			    	  
					driver.findElement(searchBarInHours).click();

			    			enterText(searchBarInHours,arg);
			    			driver.hideKeyboard();
			    			
			    			Reporter.addStepLog("entered text");

			    		} catch (Exception e) {
			    			sa.assertTrue(false,"Unable to enter the text");

			    			e.printStackTrace();
			    		}
			    		}

public static String captureSelectTaskTitle() throws Throwable{
String text = "";
		try {
			text = getText(txtSelectTaskTitle);
			Reporter.addStepLog("Captured select task title text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}
		
		public static String captureSubtitle() throws Throwable{
String text = "";
		try {
			text = getText(txtProjectTasksSubttile);
			Reporter.addStepLog("Captured project task subtitle text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureSearchTaskPlaceHolder() throws Throwable{
String text = "";
		try {
			text = getText(txtSearchTaskPlaceHolder);
			Reporter.addStepLog("Captured search task placeholder text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureTaskIdHeader() throws Throwable{
String text = "";
		try {
			text = getText(txtTaskIdHeader);
			Reporter.addStepLog("Captured task id header text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}




public static void clickSelectTaskSearchBar() throws Throwable {
	try {
		click(taskSearchBar);
		Reporter.addStepLog("Clicked on select task search bar");

	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public static void enterTask(String arg) throws Throwable {
	String text = arg;
	try {
		enterText(taskSearchBar,arg);
		Reporter.addStepLog("entered task id in select task search bar");

	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public static String captureTaskDescriptionHeader() throws Throwable{
String text = "";
		try {
			text = getText(txtTaskDescHeader);
			Reporter.addStepLog("Captured task description header text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}



public static String captureAddWorkerHoursTitle() throws Throwable{
String text = "";
		try {
			
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			//text = wait.until(ExpectedConditions.visibilityOfElementLocated(txtAddWorkerHoursTitle)).getText();
			text = getText(txtAddWorkerHoursTitle);
			Reporter.addStepLog("Captured addworker hours title text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}



	public static void selectTask(String arg) throws Throwable {
		try {
			click(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Clicked on select task checkbox");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clickBackButtonInSelectTask() throws Throwable {
		try {
			click(btnBackSelectTask);
			Reporter.addStepLog("Clicked on select button");

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
	
	public static String captureWorkerName() throws Throwable {

		String text = "";
		try {
			text = getText(txtWorkerName);
			Reporter.addStepLog("Captured Worker Name "+text);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return text;
	}
	public static void selectHours(String arg) throws Throwable {
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
			click(btnHours);
			Reporter.addStepLog("selected value");

		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	
	public static void clickCancelButtonInHourPad() throws Throwable{
		try {
					click(btnCancelInHourPad);
					Reporter.addStepLog("Clicked on cancel button");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to click");

					e.printStackTrace();
				}
				}
		

	public static void clickDoneButton() throws Throwable {
		try {
			click(btnDone);
			Reporter.addStepLog("Clicked on Done button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	
}

	public static void selectShift(String arg)throws Throwable {
		try {
			
			
			
			click(By.xpath("//XCUIElementTypeStaticText[@name='"+arg+"']"));
			
			
			Reporter.addStepLog("selected  shift");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void selectJob(String arg)throws Throwable {
		try {
			
			
			
			click(By.xpath("//XCUIElementTypeStaticText[@name='"+arg+"']"));
			
			
			Reporter.addStepLog("selected  job classification");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static String captureTotalHours()throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalHours);
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureTotalHoursInAddWorkerHours()throws Throwable {
		String text = "";
		try {
			text = getText(txtTotalHoursInAddWorkerHours);
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureTotalHoursInMainScreen()throws Throwable {
		String text = "";
		try {
			text = getText(txtHours);
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureHoursTitle() throws Throwable{
		String text = "";
		try {
			text = getText(txtHoursTitle);
			Reporter.addStepLog("Captured  hours title text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureRegularHoursInCrew()throws Throwable {
		String text = "";
		try {
			text = getText(btnRegularEntry);
			Reporter.addStepLog("Captured regular hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
		
	}
	
	public static String captureRegular()throws Throwable {
		String text = "";
		try {
			text = getText(btnRegular);
			Reporter.addStepLog("Captured regular hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
		
	}
	public static String captureOvertime1Hours()throws Throwable {
		String text = "";
		try {
			text = getText(txtOverTime1Hours);
			Reporter.addStepLog("Captured Overtime1 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureOvertime2Hours()throws Throwable {
		String text = "";
		try {
			text = getText(txtOverTime2Hours);
			Reporter.addStepLog("Captured OverTime2 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureTaskCode()throws Throwable {
		String text = "";
		try {
			text = getText(txtTaskCode);
			Reporter.addStepLog("Captured Task Code text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureProjectName()throws Throwable {
		String text = "";
		try {
			text = getText(txtProjectName);
			Reporter.addStepLog("Captured Project  name text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureSelectedShift()throws Throwable {
		String text = "";
		try {
			text = getText(txtSelectedShift);
			Reporter.addStepLog("Captured shift text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureTaskDesc()throws Throwable {
		String text = "";
		try {
			text = getText(txtTaskDescription);
			Reporter.addStepLog("Captured task description text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureProjectDesc()throws Throwable {
		String text = "";
		try {
			text = getText(txtProjectDescription);
			Reporter.addStepLog("Captured project description text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static boolean isRecordEmpty()throws Throwable {
		boolean recordPresence = true;
		try {
			
			recordPresence = isElementDisplayed(emptyRecord);
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return recordPresence;
	}
	public static String captureHours()throws Throwable {
		String text = "";
		try {
			text = getText(txtHours);
			Reporter.addStepLog("Captured Hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static void clickOnAddButton()throws Throwable {
		try {
			click(btnAdd);
			Reporter.addStepLog("Clicked on Add button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void clickOnShift()throws Throwable {
		try {
			click(DropDownshift);
			Reporter.addStepLog("Clicked on shift button");
Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickOverTime2()throws Throwable {
		try {
			click(btnOverTime2);
			Reporter.addStepLog("Clicked on OverTime2 button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickOverTime1()throws Throwable {
		try {
			click(btnOverTime1);
			Reporter.addStepLog("Clicked on Overtime1 button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickOverTime1InHourPad()throws Throwable {
		try {
			click(btnOvertime1InHourPad);
			Reporter.addStepLog("Clicked on Overtime1 button on hour pad");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickOverTime2InHourPad()throws Throwable {
		try {
			click(btnOvertime2InHourPad);
			Reporter.addStepLog("Clicked on Overtime2 button on hour pad");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickRegularInHourPad()throws Throwable {
		try {
			click(btnRegularInHourPad);
			Reporter.addStepLog("Clicked on regular button on hour pad");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ClickRegular()throws Throwable {
		try {
			click(btnRegular);
			Reporter.addStepLog("Clicked on Regular button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickHoursButton() throws Throwable{
		
		try {
			click(btnHours);
			Reporter.addStepLog("Clicked on Hours button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void selectTaskCode()throws Throwable {
		try {
			click(btnselectTask);
			Reporter.addStepLog("Clicked on select task code");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickAddWorkerHours()throws Throwable {
		try {
			click(btnAddWorkerHours);
			Reporter.addStepLog("Clicked on add worker hours button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
