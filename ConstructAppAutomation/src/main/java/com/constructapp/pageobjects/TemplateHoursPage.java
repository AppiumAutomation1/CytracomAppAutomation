package com.constructapp.pageobjects;

import org.openqa.selenium.By;



import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class TemplateHoursPage extends DriverUtilities {

	
	public static By checkBoxTask = By.xpath("");
	public static By btnSelect = By.xpath("");
	public static By btnHours = By.xpath("(//XCUIElementTypeOther[@name='Production']/preceding::XCUIElementTypeOther)[11]");
	public static By btnDone = By.xpath("");
	public static By btnShift = By.xpath("");

	public static By txtTotalHours = By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[2]");
	public static By txtRegularHours = By.xpath("((//XCUIElementTypeStaticText[@name='|'])[1]/preceding::XCUIElementTypeStaticText)[15]");
	public static By txtOverTime1Hours = By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/preceding::XCUIElementTypeStaticText)[17]");
	public static By txtOverTime2Hours = By.xpath("((//XCUIElementTypeStaticText[@name='|'])[2]/following::XCUIElementTypeStaticText)[1]");
	public static By txtTaskCode = By.xpath("");
	public static By txtProjectName = By.xpath("");
	public static By txtSelectedShift = By.xpath("");

	public static By txtTaskDescription = By.xpath("");
	public static By txtProjectDescription = By.xpath("");
	public static By emptyRecord = By.xpath("");
	public static By txtHours = By.xpath("");
	public static By btnAdd = By.xpath("");
	public static By DropDownshift = By.xpath("");
	public static By btnOverTime2Hours1 = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapOvertime2'])[1]");
	public static By btnOverTime1Hours1 = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapOvertime1'])[1]");
	public static By btnRegularHours1 = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapRegular'])[1]");
	
	public static By btnOverTime2Hours2 = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapOvertime2'])[2]");
	public static By btnOverTime1Hours2 = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapOvertime1'])[2]");
	public static By btnRegularHours2 = By.xpath("(//XCUIElementTypeStaticText[@name='AI_tapRegular'])[2]");
	public static By btnBackSelectTask = MobileBy.AccessibilityId("Add Crew Hours");

	public static By CheckBoxTaskCode = By.xpath("");
	public static By btnAddWorkerHours = MobileBy.AccessibilityId("Add Worker Hours");
	public static By txtHoursTitle = By.xpath("");
	public static By txtWorkerName = By.xpath("");
	public static By btnCrewHours = MobileBy.AccessibilityId("Add Crew Hours");

	public static By btnSummary = By.xpath("(//XCUIElementTypeOther[@name='summarydetails_'])[1]");
	public static By txtAddCrewHours = By.xpath("//XCUIElementTypeNavigationBar[@name='Add Crew Hours']");
	public static By btnAddwOrker = By.xpath("//XCUIElementTypeOther[@name='AI_addWorkers']");
	public static By btnDeleteCrewHour = MobileBy.AccessibilityId("AI_deleteCrewHour");
	public static By searchWorkerBar = MobileBy.AccessibilityId("Search Worker");
	public static By searchWorker = By.xpath("(//XCUIElementTypeButton[@name='']/following::XCUIElementTypeOther)[2]");
	public static By btnDetails = MobileBy.AccessibilityId("Details");
	public static By txtSummaryTitle = MobileBy.AccessibilityId("Summary");
	public static By txtRegularHeader = MobileBy.AccessibilityId("Regular | OT1 | OT2");
	public static By txtHoursHeader = MobileBy.AccessibilityId("Hours");
	public static By txtSearchWorkers = MobileBy.AccessibilityId("Search Workers");
	public static By txtworkerNaemHeader = MobileBy.AccessibilityId("Worker Name");
	public static By txtProject = MobileBy.AccessibilityId("Project");
	public static By txtCrewMembers  = MobileBy.AccessibilityId("Crew Members");
	public static By txtDetailHeader = MobileBy.AccessibilityId("Details");
	public static By txtPersonnelNumberHeader = MobileBy.AccessibilityId("Personnel Number");
	public static By txtWorker = MobileBy.AccessibilityId("Worker");
	public static By txtTask = MobileBy.AccessibilityId("Task");
	public static By btnFirstWorker = By.xpath("(//XCUIElementTypeOther[@name='AI_tapWorkersListItem'])[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton");
	public static By btnSummaryInCrewHours = MobileBy.AccessibilityId("summarydetails");
	//
	
	
public void clickRegularHoursForWorker1() throws Throwable {
	try {
		click(btnRegularHours1);
		Reporter.addStepLog("Clicked on regular hours");

	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
	}
	public void clickOvertime1HoursForWorker1() throws Throwable {
		try {
			click(btnOverTime1Hours1);
			Reporter.addStepLog("Clicked on overtime1 hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void selectFirstWorkerInTemplateTimesheet() throws Throwable {
		try {
			click(btnFirstWorker);
			Reporter.addStepLog("Clicked on firstworker");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	public void clickOvertime2HoursForWorker1() throws Throwable {
		try {
			click(btnOverTime2Hours1);
			Reporter.addStepLog("Clicked on overtime2 hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
public String captureAddedCrewMember()throws Throwable {
		
		String text = "";
		try {
			By ele = By.xpath("((//XCUIElementTypeButton[@name='AI_crewmemberCheckBoxListItem'])[3]/following::XCUIElementTypeStaticText)[2]");
			text = getText(ele);
			Reporter.addStepLog("Captured add crew hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static void selectTask(String arg1) throws Throwable {
		try {
			click(checkBoxTask);
			Reporter.addStepLog("Clicked on task check box");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clickBackBtnInSelectTask() throws Throwable {
		try {
			click(btnBackSelectTask);
			Reporter.addStepLog("Clicked on back button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clickSummaryTabInCrewHours() throws Throwable{

		try {
					click(btnSummaryInCrewHours);
					Reporter.addStepLog("Clicked on summary  button");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to click");

					e.printStackTrace();
				}
				}
	
	public static void clickAddCrewHours()throws Throwable {
		try {
			click(btnCrewHours);
			Reporter.addStepLog("Clicked on add worker hours button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String captureAddCrewHoursText()throws Throwable {
		
		String text = "";
		try {
			text = getText(txtworkerNaemHeader);
			Reporter.addStepLog("Captured add crew hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	




	 public void clickAddWorkerButton()throws Throwable {
			
		 try {
				click(btnAddwOrker);
				Reporter.addStepLog("Clicked on add worker button");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 
	 public void clickDeleteCrewHour() throws Throwable{
		 
		 try {
			 click(btnDeleteCrewHour);
			 
			 Reporter.addStepLog("Clicked on add worker button");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 public void clickSearchWorkerBar() throws Throwable{
		 try {
				click(searchWorker);
				Reporter.addStepLog("Clicked search worker bar");

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	  public void enterSearchText(String arg1) throws Throwable{
		  try {
				enterText(searchWorker,arg1);
				Reporter.addStepLog("entered text in  search worker bar");

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	 
			
		
	  
	  public void clickDetailsTab() throws Throwable{
			
		  try {
				click(btnDetails);
				Reporter.addStepLog("Clicked details tab");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	  public String captureTotalHoursText() throws Throwable{
			
		  String text = "";
			try {
				text = getText(txtTotalHours);
				Reporter.addStepLog("Captured Total hours text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
	  public String captureDetails()throws Throwable {
		  String text = "";
			try {
				text = getText(txtDetailHeader);
				Reporter.addStepLog("Captured detail header text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}


		public String captureSummaryText()throws Throwable {
			
			String text = "";
			try {
				text = getText(txtSummaryTitle);
				Reporter.addStepLog("Captured summary title text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}



		public String captureRegularText()throws Throwable {
			
			String text = "";
			try {
				text = getText(txtRegularHeader);
				Reporter.addStepLog("Captured regular header text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}


		public String captureCrewMembersText() throws Throwable{
			
			String text = "";
			try {
				text = getText(txtCrewMembers);
				Reporter.addStepLog("Captured crew members text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}



	  public String captureHoursText() throws Throwable{
			
		  String text = "";
			try {
				text = getText(txtHoursHeader);
				Reporter.addStepLog("Captured  hours text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}


		public String captureTaskText()throws Throwable {
			
			String text = "";
			try {
				text = getText(txtTask);
				Reporter.addStepLog("Captured task text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}


		public String captureProjectText() throws Throwable{
			
			String text = "";
			try {
				text = getText(txtProject);
				Reporter.addStepLog("Captured project text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}


		public String captureWorkerText()throws Throwable {
			
			String text = "";
			try {
				text = getText(txtWorker);
				Reporter.addStepLog("Captured worker header text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}

	public String capturePersonnelNumberHeader()throws Throwable {
		
		String text = "";
		try {
			text = getText(txtPersonnelNumberHeader);
			Reporter.addStepLog("Captured personnel number text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}


	public String captureWorkerNameHeader()throws Throwable {
		
		String text = "";
		try {
			text = getText(txtworkerNaemHeader);
			Reporter.addStepLog("Captured worker name header text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public String captureSearchWorkersText()throws Throwable {
		
		String text = "";
		try {
			text = getText(txtSearchWorkers);
			Reporter.addStepLog("Captured search workers text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static boolean verifyDeselectedWorkerPresence(String arg) throws Throwable{
		boolean workerPresence = false;
		try {
			workerPresence = isElementDisplayed(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured selected worker text");

		} catch (Exception e) {
			e.printStackTrace();
			workerPresence = false;
		}
		return workerPresence;
	}
	
	
	public String captureSelectedWorker(String arg) throws Throwable{
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured selected worker text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static void clickSelectButton() throws Throwable {
		try {
			click(btnSelect);
			Reporter.addStepLog("Clicked on select button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void clickSummaryTab() throws Throwable {
		try {
			click(btnSummary);
			Reporter.addStepLog("Clicked on summary button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void selectHours(String arg1) throws Throwable {
		try {
			click(btnHours);
			Reporter.addStepLog("selected hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	public static void expandCrew(String arg) throws Throwable {
		try {
			
			Thread.sleep(2000);
			click(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Clicked on crew ");

		} catch (Exception e) {
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

	public static void selectShift(String arg1)throws Throwable {
		try {
			click(btnShift);
			Reporter.addStepLog("selected shift");

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
	
	public static String captureTotalHoursOftheWorker(String arg)throws Throwable {
		String text = "";
		try {
			text = getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[8]"));
			Reporter.addStepLog("Captured Total hours text of the worker");

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
	public static String captureRegularHours()throws Throwable {
		String text = "";
		try {
			text = getText(btnRegularHours1);
			Reporter.addStepLog("Captured regular hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
		
	}
	public static String captureOvertime1Hours()throws Throwable {
		String text = "";
		try {
			text = getText(btnOverTime1Hours1);
			Reporter.addStepLog("Captured Overtime1 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureRegularHoursInCrew()throws Throwable {
		String text = "";
		try {
			text = getText(txtRegularHours);
			Reporter.addStepLog("Captured regular hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
		
	}
	
	public String captureRegularHoursInCrewHours() throws Throwable {
		String text = "";
		try {
			text = getText(btnRegularHours1);
			Reporter.addStepLog("Captured regular hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public String captureOvertime1HoursInCrewHours() throws Throwable {
		String text = "";
		try {
			text = getText(btnOverTime1Hours1);
			Reporter.addStepLog("Captured overtime1 hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public String captureOvertime2HoursInCrewHours() throws Throwable {
		String text = "";
		try {
			text = getText(btnOverTime2Hours1);
			Reporter.addStepLog("Captured overtime2 hours");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureOvertime1HoursInCrew()throws Throwable {
		String text = "";
		try {
			text = getText(txtOverTime1Hours);
			Reporter.addStepLog("Captured Overtime1 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureOvertime2HoursInCrew()throws Throwable {
		String text = "";
		try {
			text = getText(txtOverTime2Hours);
			Reporter.addStepLog("Captured Overtime1 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureWorkerName(String arg)throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured workername text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureOvertime2Hours()throws Throwable {
		String text = "";
		try {
			text = getText(btnOverTime2Hours1);
			Reporter.addStepLog("Captured OverTime2 hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureTaskCode(String arg)throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Task Code text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	public static String captureProjectName(String arg)throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
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

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickOverTime2()throws Throwable {
		try {
			click(btnOverTime2Hours1);
			Reporter.addStepLog("Clicked on OverTime2 button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickOverTime1()throws Throwable {
		try {
			click(btnOverTime1Hours1);
			Reporter.addStepLog("Clicked on Overtime1 button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void ClickOnRegular()throws Throwable {
		try {
			click(btnRegularHours1);
			Reporter.addStepLog("Clicked on Regular button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String captureCrewId(String arg) throws Throwable {
		String text = "";
		try {
			Thread.sleep(2000);
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured crew id text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureCrewDesc(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static void clickHoursButton() throws Throwable{
		
		try {
			click(btnHours);
			Reporter.addStepLog("Clicked on Hours button");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void selectTaskCode(String arg1)throws Throwable {
		try {
			click(CheckBoxTaskCode);
			Reporter.addStepLog("Clicked on task code checkbox");

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
