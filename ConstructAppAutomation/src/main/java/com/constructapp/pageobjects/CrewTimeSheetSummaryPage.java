package com.constructapp.pageobjects;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class CrewTimeSheetSummaryPage extends DriverUtilities {

	public static By btnPleaseSelectACrew = MobileBy.AccessibilityId("AI_tapCrew");
	public static By txtSelectedProject = By.xpath("");
	public static By txtCrewSignatureStatus = By.xpath("");
	public static By btnSelect = By.xpath("//XCUIElementTypeOther[@name='AI_tapSelect']");
	public static By txtCrewId = By.xpath("");
	public static By txtCrewDescription = By.xpath("");
	public static By btnExpenses = By.xpath("");
	public static By btnSelectAllCrew = By.xpath("(//XCUIElementTypeOther[@name='AI_crewSegment_'])[2]");
	public static By btnTemplateTimesheet = MobileBy.AccessibilityId("Template Timesheet");
	public static By btnSelectACrew = By.xpath("");
	public static By btnCrewTimeSheet = By.xpath("//XCUIElementTypeStaticText[@name='Crew Timesheet']");
	public static By  notesExpander = MobileBy.AccessibilityId("AI_tapNotesExpander");
	public static By  enterNotes= MobileBy.AccessibilityId("Enter your notes here");
	public static By txtPleaseSelectACrew= MobileBy.AccessibilityId("Select a Crew");
	public static By txtCrewMemberTitle = MobileBy.AccessibilityId("Crew Members");
	public static By txtCrewForeManTitle = MobileBy.AccessibilityId("Crew Foreman");
	public static By btnCollapseFileAttachment = MobileBy.AccessibilityId("fileexpander Expander");
	public static By btnCrewForeMan = By.xpath("//XCUIElementTypeButton[@name='AI_tapForemanSignatures']");	
	public static By txtCrewSignedStatus = By.xpath("(//XCUIElementTypeButton[@name='Not Signed'])[1]");
	public static By txtCrewForemanSignedStatus = By.xpath("((//XCUIElementTypeOther[@name='AI_tapForemanSignatures'])[2]/following::XCUIElementTypeStaticText)[1]");
	public static By txtSelectCrewTitle = By.xpath("(//XCUIElementTypeStaticText[@name='Select Crew'])[1]");
	public static By txtCrewDescTitle  = MobileBy.AccessibilityId("Crew Description");
	public static By txtCrewIDTitle  = MobileBy.AccessibilityId("Crew ID");
	public static By txtSearchCrew  = MobileBy.AccessibilityId("Search Crew");
	public static By searchBar  = By.xpath("(//XCUIElementTypeImage[@name='Crew.png']/following::XCUIElementTypeOther)[2]");
	public static By btnAllCrews  = MobileBy.AccessibilityId("All Crews");
	public static By crewMembersText = MobileBy.AccessibilityId("Crew Members");
	
	
	public static By crewForeManText = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Prashanthi')]");
	
	
	 public void enterSearchText(String arg) throws Throwable {
		try {
			enterText(searchBar, arg);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	 public static String captureRegularHoursInCrew(String arg) throws Throwable{
		 String text = "";
		 		try {
		 			text = getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[1]"));
		 			Reporter.addStepLog("Captured regular hours text");

		 		} catch (Exception e) {
		 			sa.assertTrue(false,"Unable to capture the text");

		 			e.printStackTrace();
		 		}
		 		return text;
		 		}

		 public static String captureOverTime1HoursInCrew(String arg) throws Throwable{
		 String text = "";
		 		try {
		 			text = getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[2]"));

		 			Reporter.addStepLog("Captured overtime1 hours text");

		 		} catch (Exception e) {
		 			sa.assertTrue(false,"Unable to capture the text");

		 			e.printStackTrace();
		 		}
		 		return text;
		 		}

		 public static String captureOverTime2HoursInCrew(String arg) throws Throwable{
		 String text = "";
		 		try {
		 			text = getText(By.xpath("(//XCUIElementTypeStaticText[@name='"+arg+"']/following::XCUIElementTypeStaticText)[3]"));

		 			Reporter.addStepLog("Captured overtime 2 hours text");

		 		} catch (Exception e) {
		 			sa.assertTrue(false,"Unable to capture the text");

		 			e.printStackTrace();
		 		}
		 		return text;
		 		}
	
			
		
	public String captureSelectCrewTitle() throws Throwable {
			
		 String text = "";
	  		try {
	  			Thread.sleep(2000);
	  			text = getText(txtSelectCrewTitle);
	  			Reporter.addStepLog("Captured select crew title text");

	  		} catch (Exception e) {
	  			sa.assertTrue(false,"Unable to capture the text");

	  			e.printStackTrace();
	  		}
	  		return text;
	  		}
	 public String captureCrewDescTitle() throws Throwable{
			
		 String text = "";
	  		try {
	  			text = getText(txtCrewDescTitle);
	  			Reporter.addStepLog("Captured crew decription title text");

	  		} catch (Exception e) {
	  			sa.assertTrue(false,"Unable to capture the text");

	  			e.printStackTrace();
	  		}
	  		return text;
	  		}

	 public String captureCrewIdTitle()throws Throwable {
		 String text = "";
	  		try {
	  			text = getText(txtCrewIDTitle);
	  			Reporter.addStepLog("Captured crew Id title text");

	  		} catch (Exception e) {
	  			sa.assertTrue(false,"Unable to capture the text");

	  			e.printStackTrace();
	  		}
	  		return text;
	  		}
		 public String captureSearchCrwText() throws Throwable{
			 String text = "";
		  		try {
		  			text = getText(txtSearchCrew);
		  			Reporter.addStepLog("Captured search crew text");

		  		} catch (Exception e) {
		  			sa.assertTrue(false,"Unable to capture the text");

		  			e.printStackTrace();
		  		}
		  		return text;
		  		}
		 public void clickSearchBar() throws Throwable{
			 try {
				click(searchBar);
	  			Reporter.addStepLog("clicked search bar");

			 }catch (Exception e) {
		  			sa.assertTrue(false,"Unable to click the searchbar");

		  			e.printStackTrace();
		  		}
		  		
		  		
			}
		 public void clickAllCrews() throws Throwable{
			 try {
					click(btnAllCrews);
		  			Reporter.addStepLog("clicked All Crews");

				 }catch (Exception e) {
			  			sa.assertTrue(false,"Unable to click the all crews button");

			  			e.printStackTrace();
			  		}
			  		
				
			}
		 
		 
		 public String captureCrewMembersText() throws Throwable{
			 String text = "";
		  		try {
		  			text = getText(crewMembersText);
		  			Reporter.addStepLog("Captured Crew members title");

		  		} catch (Exception e) {
		  			sa.assertTrue(false,"Unable to capture the text");

		  			e.printStackTrace();
		  		}
		  		return text;
			}
		 public String captureCrewForemanName(String arg) throws Throwable {
			 String text = "";
		  		try {
		  			text = getText(By.xpath("//XCUIElementTypeStaticText[contains(@name,'"+arg+"')]"));
		  			Reporter.addStepLog("Captured Crew foreman");

		  		} catch (Exception e) {
		  			sa.assertTrue(false,"Unable to capture the text");

		  			e.printStackTrace();
		  		}
		  		return text;
			}
		 

		 public String captureWorkerPerssonelNum(String arg) throws Throwable {
				
			 String text = "";
		  		try {
		  			text = getText(MobileBy.AccessibilityId(arg));
		  			Reporter.addStepLog("Captured worker personnel number");

		  		} catch (Exception e) {
		  			sa.assertTrue(false,"Unable to capture the text");

		  			e.printStackTrace();
		  		}
		  		return text;
		  		}

		
		 public String captureWorker(String arg) throws Throwable {
				
			 String text = "";
		  		try {
		  			text = getText(MobileBy.AccessibilityId(arg));
		  			Reporter.addStepLog("Captured crew worker name");

		  		} catch (Exception e) {
		  			sa.assertTrue(false,"Unable to capture the text");

		  			e.printStackTrace();
		  		}
		  		return text;
		  		}

		


	public static String captureCrewForemanSignedStatus() throws Throwable{
		  String text = "";
		  		try {
		  			text = getText(txtCrewForemanSignedStatus);
		  			Reporter.addStepLog("Captured crew foreman signed status text");

		  		} catch (Exception e) {
		  			sa.assertTrue(false,"Unable to capture the text");

		  			e.printStackTrace();
		  		}
		  		return text;
		  		}
	public static void clickPleaseSelectACrew() throws Throwable {
		try {
			click(btnPleaseSelectACrew);
			Reporter.addStepLog("Selected A Crew");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String captureSelectedProject() throws Throwable {
		String text = "";
		try {
			text = getText(txtSelectedProject);
			Reporter.addStepLog("Captured selected project text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public static String captureCrewSignatureStatus() throws Throwable {
		String text = "";
		try {
			text = getText(txtCrewSignatureStatus);
			Reporter.addStepLog("Captured crew signature status");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static void clickNotes() throws Throwable{
		try {
			click(notesExpander);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static String captureCrewMemberTab() throws Throwable{
		String text = "";
				try {
					text = getText(txtCrewMemberTitle);
					Reporter.addStepLog("Captured worker title text");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
				}
				return text;
				}

		public static String captureForemanStatus() throws Throwable{
		String text = "";
				try {
					text = getText(txtCrewForeManTitle);
					Reporter.addStepLog("Captured foreman text");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
				}
				return text;
				}
		
		public static void collapseFileAttachment() throws Throwable{

			try {
				click(btnCollapseFileAttachment);
				Reporter.addStepLog("Clicked on collapse button");

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to click");

				e.printStackTrace();
			}
			}
		
		public static void clickOnCrewForeman() throws Throwable{

			try {
				click(btnCrewForeMan);
				Reporter.addStepLog("Clicked on foreman button");

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to click");

				e.printStackTrace();
			}
			}
		
		public static void clickCrewWorkerNotsignedStatus(String arg) throws Throwable{
			try {
				click(MobileBy.AccessibilityId(arg));
				
				Reporter.addStepLog("Clicked on crew worker not signed button");

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to click");

				e.printStackTrace();
			}
		}
	
		public static String captureCrewNameInSignHours(String arg) throws Throwable {

			String text = "";
			try {
				text = getText(MobileBy.AccessibilityId(arg));
				Reporter.addStepLog("Captured Worker Name In Sign Hours"+text);

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to capture the text");

				e.printStackTrace();
			}
			return text;
		}
	 public String capturePleaseSelectCrewText() {
		 String text = "";
			try {
				try {
					text = getText(txtPleaseSelectACrew);
				} catch (Throwable e) {
					e.printStackTrace();
				}
				Reporter.addStepLog("Captured please select crew text");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
	
	public static void enterNotes(String arg) throws Throwable{
		
		try {
			enterText(enterNotes, arg);
		}catch (Exception e) {
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

	public static String captureCrewId(String arg) throws Throwable {
		String text = "";
		try {
			Thread.sleep(2000);
			text = getText(MobileBy.AccessibilityId("AI_crewId"));
			Reporter.addStepLog("Captured crew id text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureCrewIdName(String arg) throws Throwable {
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
			text = getText(MobileBy.AccessibilityId("AI_crewDescription"));
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureCrewDescName(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureCrewIdInHours(String arg) throws Throwable {
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

	public static String captureCrewDescInHours(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Total hours text");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}


	public static void clickCrewTimeSheet() throws Throwable {
		try {
			click(btnCrewTimeSheet);
			Reporter.addStepLog("Clicked on crew timesheet button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 public void clickTemplateTimeSheet() throws Throwable {
		 try {
				click(btnTemplateTimesheet);
				Reporter.addStepLog("Clicked on crew timesheet button");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		
	public static void clickSelectAllCrew() throws Throwable {
		try {
			click(btnSelectAllCrew);
			Reporter.addStepLog("Clicked on select all crew button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectACrew(String arg) throws Throwable {
		try {
			click(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Clicked on select a crew button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
