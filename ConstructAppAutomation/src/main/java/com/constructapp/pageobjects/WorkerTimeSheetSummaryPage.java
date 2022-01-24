package com.constructapp.pageobjects;

import static com.constructapp.pageobjects.WorkerTimeSheetSummaryPage.sa;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.constructapp.utilities.DriverUtilities;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class WorkerTimeSheetSummaryPage extends DriverUtilities {

	public static By btnWorkerTimeSheet = By.xpath("//XCUIElementTypeStaticText[@name='Worker Timesheet']");
	public static By txtWkorkerTimeSheet = By.xpath("//XCUIElementTypeNavigationBar[@name='Worker Timesheet']");
	public static By txtName = MobileBy.AccessibilityId("AI_fullName");
	public static By txtWorker = By.xpath("(//XCUIElementTypeStaticText[@name='AI_hourSummaryExpander Expander']/following::XCUIElementTypeStaticText)[2]");
	public static By txtWorkerNameInSignHours = MobileBy.AccessibilityId("searchworker Input Field");
	public static By btnHamburger = By.xpath("//XCUIElementTypeButton[@name='OK']");
    public static By btnLogout = By.xpath("//XCUIElementTypeStaticText[@name='Logout']");
    public static By  txtJobClassification = By.xpath(""); 
   public static By txtHours = By.xpath("(//XCUIElementTypeStaticText[@name='Hours']/following::XCUIElementTypeStaticText)[1]");
    public static By txtDate(String date) {
    	By txtDate= MobileBy.AccessibilityId(date);
        return txtDate;
    }
    
    public static By txtRegular = By.xpath("(//XCUIElementTypeStaticText[@name='Not Signed'])[1]/following::XCUIElementTypeStaticText)[3]");
    public static By txtOvertime1 = By.xpath("(//XCUIElementTypeStaticText[@name='Not Signed'])[1]/following::XCUIElementTypeStaticText)[4]");
    public static By txtOvertime2= By.xpath("(//XCUIElementTypeStaticText[@name='Not Signed'])[1]/following::XCUIElementTypeStaticText)[5]");
public static By searchBarInChangeWorker = By.xpath("(//XCUIElementTypeButton[@name='Sync']/following::XCUIElementTypeOther)[2]");
    public static By btnClosePicture = By.xpath("//XCUIElementTypeButton[@name='AI_closeImagePreViewPopup']");
    public static By imgdeletContainer = By.xpath("//XCUIElementTypeStaticText[@name='AI_deleteAttachmentsListItem']");
    public static By txtChangeWorker = MobileBy.AccessibilityId("AI_tapWorker");
    public static By changeworkertext = MobileBy.AccessibilityId("Change Worker");
    public static By searchBar = MobileBy.AccessibilityId("AI_serachEntry");
    public static By btnCancelInHourPad = By.xpath("(//XCUIElementTypeOther[@name='AI_tapCancel'])[2]");

    public static By btnCancel = By.xpath("//XCUIElementTypeButton[@name='AI_tapCancel']");
    public static By btnBack = MobileBy.AccessibilityId("Back");
    public static By txtSearchWorkers = MobileBy.AccessibilityId("Search Workers");
    public static By txtWorkerNameLabel = MobileBy.AccessibilityId("Worker Name");
    public static By txtPersonnelNumberLabel = MobileBy.AccessibilityId("Personnel Number");
    public static By txtSearchResult = By.xpath("");
    public static By CheckBoxWorkerName = By.xpath("");
    public static	By txtWorkerPersonnelNum= MobileBy.AccessibilityId("AI_personnelNumber");
        public static By searchBarInSelectProject = By.xpath("(//XCUIElementTypeStaticText[@name='']/following::XCUIElementTypeOther)[2]");
        public static By searchBarInHours = By.xpath("(//XCUIElementTypeStaticText[@name='All Projects']/following::XCUIElementTypeOther)[4]");
    public static By btnAllowOnce = MobileBy.AccessibilityId("Allow Once");
    public static By linkPleaseSelectAProject= MobileBy.AccessibilityId("Select a Project");
    public static By linkProject= By.xpath("(//XCUIElementTypeOther[@name='AI_selectProjectListItem'])[1]/XCUIElementTypeOther[2]");
    public static By btnSubmit= By.xpath("//XCUIElementTypeButton[@name='Submit']");
    public static By txtSelectedProject= By.xpath("(//XCUIElementTypeStaticText[@name='Project Id :']/following::XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
    public static By txtProjectDescription= By.xpath("(//XCUIElementTypeStaticText[@name='Description:']/following::XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
    public static By txtWorkerSignaturePendingStatus= MobileBy.AccessibilityId("Pending");
    public static By txtCustomerSignatureNotSignedStatus= MobileBy.AccessibilityId("Not Signed");
    public static By btnSelect = By.xpath("//XCUIElementTypeButton[@name='AI_tapSelect']");
    static SoftAssert sa = new SoftAssert();
    
    
    public static By txtLocationRange = MobileBy.AccessibilityId("Location Range");
   
    public static By txtAllProjects = By.xpath("(//XCUIElementTypeStaticText[@name='All Project'])[1]");
    public static By txtSelectProject = By.xpath("(//XCUIElementTypeStaticText[@name='Select Project'])[2]");
    public static By btnToday = By.xpath("//XCUIElementTypeButton[@name='AI_tapToday']");
    public static By btnCalendar = MobileBy.AccessibilityId("AI_tapCalender");
    public static By btnSync = MobileBy.AccessibilityId("AI_tapSync");
    

    


public static By btnFileExpand = MobileBy.AccessibilityId("AI_tapAttachmenteExpander");
public static By btnPicture = By.xpath("//XCUIElementTypeOther[@name='AI_tapGallery']");
public static By btnAttchedFile = By.xpath("//XCUIElementTypeStaticText[@name='AI_showAttachmentsListItem']");
public static By imgPicture = MobileBy.AccessibilityId("/Users/admin/Library/Developer/CoreSimulator/Devices/A5C64752-C14E-43EA-963E-CE03F17A3AE7/data/Containers/Data/Application/0DB1D2A4-9A22-452F-B5D9-13E18042C42B/Documents/TmpMedia/637636932195048770.JPEG");
public static By btnCollapse = MobileBy.AccessibilityId("attachmentexpander Expander");
public static By txtFileAttached = MobileBy.AccessibilityId("AI_showAttachmentsListItem");
public static By btnRemove = imgdeletContainer;
public static By btnClear = MobileBy.AccessibilityId("AI_clearNotesEntry_Container");
public static By btnImage = By.xpath("");
public static By txtNotesPlaceHolder= MobileBy.AccessibilityId("Enter your notes here");





public static By btnTapToSign = MobileBy.AccessibilityId("AI_tapSignature");
public static By btnExpandIcon = MobileBy.AccessibilityId("AI_expander Expander");
//AI_hourSummaryExpander_Container
public static By btnClose = By.xpath("//XCUIElementTypeButton[@name='AI_tapCancel']");

public static By closepopup = MobileBy.AccessibilityId("AI_closePopup");
public static By btnForeman = MobileBy.AccessibilityId("AI_tapForemanSignatures");
public static By txtHoursSummary = MobileBy.AccessibilityId("Hours Summary");
public static By txtWorkerName = MobileBy.AccessibilityId("AI_fullNameEntry");
public static By txtDisclaimer = MobileBy.AccessibilityId("I verify and agree that the hours given are accurate");
public static By txtSignHoursTitle = By.xpath("//XCUIElementTypeStaticText[@name='Sign Hours']");
public static By btnSummary = MobileBy.AccessibilityId("AI_summaryTab");
public static By txtSignHours = By.xpath("//XCUIElementTypeStaticText[@name='Sign Hours']");
public static By txtWorkerTitle = By.xpath("//XCUIElementTypeStaticText[@name='Worker']");
public static By txtForeManTitle = MobileBy.AccessibilityId("Foreman / Supervisor / Manager");
public static By txtWorkerSignedStatus = By.xpath("(//XCUIElementTypeButton[@name='Not Signed'])[1]");
public static By txtForemanSignedStatus = By.xpath("(//XCUIElementTypeStaticText[@name='Foreman / Supervisor / Manager']/following::XCUIElementTypeStaticText)[1]");
public static By txtCustomerSignStatus = By.xpath("(//XCUIElementTypeButton[@name='Not Signed'])[2]");
//searchworker Input Field

public static By txtCustomerTitle = MobileBy.AccessibilityId("Customer Signature");
public static void clickSummaryTab() throws Throwable{

try {
			click(btnSummary);
			Reporter.addStepLog("Clicked on summary  button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}




		public static String captureWorkerTab() throws Throwable{
String text = "";
		try {
			text = getText(txtWorkerTitle);
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
			text = getText(txtForeManTitle);
			Reporter.addStepLog("Captured foreman text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureWorkerSignedStatus() throws Throwable{
String text = "";
		try {
			text = getText(txtWorkerSignedStatus);
			Reporter.addStepLog("Captured worker signed status text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureForemanSignedStatus() throws Throwable{
String text = "";
		try {
			text = getText(txtForemanSignedStatus);
			Reporter.addStepLog("Captured foreman signed status text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureCustomerStatus() throws Throwable{
String text = "";
		try {
			text = getText(txtCustomerTitle);
			Reporter.addStepLog("Captured customer sign status text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}





public static void clickTapToSign() throws Throwable{

try {
			click(btnTapToSign);
			Reporter.addStepLog("Clicked on tap to sign button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}

public static void clickExpandIcon() throws Throwable{
try {
			click(btnExpandIcon);
			Reporter.addStepLog("Clicked on expand icon");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
public static void clickCloseButton() throws Throwable{
try {
			click(btnClose);
			Reporter.addStepLog("Clicked on close button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}

public static void clickClosepopup() throws Throwable{
try {
			click(closepopup);
			Reporter.addStepLog("Clicked on close popup");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
public static void clickOnForeman() throws Throwable{

		try {
			click(btnForeman);
			Reporter.addStepLog("Clicked on foreman button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}

public static void clickCustomerSignature() throws Throwable{

	try {
		click(txtCustomerTitle);
		Reporter.addStepLog("Clicked on customer signature");

	} catch (Exception e) {
		sa.assertTrue(false,"Unable to click");

		e.printStackTrace();
	}
	}



public static String captureRegularHours() throws Throwable{
String text = "";
		try {
			text = getText(txtRegular);
			Reporter.addStepLog("Captured regular hours text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureOverTime1Hours() throws Throwable{
String text = "";
		try {
			text = getText(txtOvertime1);
			Reporter.addStepLog("Captured overtime1 hours text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureOverTime2Hours() throws Throwable{
String text = "";
		try {
			text = getText(txtOvertime2);
			Reporter.addStepLog("Captured overtime 2 hours text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureHoursSummaryTitle() throws Throwable{
String text = "";
		try {
			text = getText(txtHoursSummary);
			Reporter.addStepLog("Captured hours summary text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}
		
		public static String captureWorkerName1() throws Throwable{
String text = "";
		try {
			text = getText(txtWorkerName);
			Reporter.addStepLog("Captured notes place holder text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureDisclaimerText() throws Throwable{
String text = "";
		try {
			text = getText(txtDisclaimer);
			Reporter.addStepLog("Captured disclaimer text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}

public static String captureWorkerNameText() throws Throwable{
String text = "";
		try {
			text = getText(txtWorkerName);
			Reporter.addStepLog("Captured workername text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}


public static void enterWorkerNametext(String arg) throws Throwable {
	try {
		 enterText(txtWorkerName,arg);
		Reporter.addStepLog("entered workername text");

	} catch (Exception e) {
		sa.assertTrue(false,"Unable to enter the text");

		e.printStackTrace();
	}
	
}
public static String captureSignHoursTitle() throws Throwable{
	String text = "";
			try {
				text = getText(txtSignHoursTitle);
				Reporter.addStepLog("Captured signhours text");

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to capture the text");

				e.printStackTrace();
			}
			return text;
			}


public static void expandFileAttachment() throws Throwable{

try {
			click(btnFileExpand);
			Reporter.addStepLog("Clicked on file expand button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}

public static void clickAttachedFile() throws Throwable{
try {
			click(btnAttchedFile);
			Reporter.addStepLog("Clicked on attached file");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
public static void clickOnPicture() throws Throwable{
try {
			click(btnPicture);
			Reporter.addStepLog("Clicked on picture");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}

public static void closePicture() throws Throwable{
try {
			click(btnClosePicture);
			Reporter.addStepLog("Clicked on close picture");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
public static void collapseFileAttachment() throws Throwable{

		try {
			click(btnCollapse);
			Reporter.addStepLog("Clicked on collapse button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
public static String captureFileAttachedText() throws Throwable{
String text = "";
		try {
			text = getText(txtFileAttached);
			Reporter.addStepLog("Captured file  attached text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}
		
		public static String captureNotesPlaceHolderText() throws Throwable{
String text = "";
		try {
			text = getText(txtNotesPlaceHolder);
			Reporter.addStepLog("Captured notes place holder text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		}



public static void clickRemoveButton() throws Throwable{
try {
			click(btnRemove);
			Reporter.addStepLog("Clicked on remove");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}

public static void clickClear() throws Throwable{
try {
			click(btnClear);
			Reporter.addStepLog("Clicked on clear button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
		public static void clickOnImage(String arg) throws Throwable{
try {
			click(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Clicked on image button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		}
		
		
    public static void clickSyncButton() throws Throwable{

    try {
    			click(btnSync);
    			Reporter.addStepLog("Clicked on sync button");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to click");

    			e.printStackTrace();
    		}
    		}

    public static void clickCalendar() throws Throwable{
    try {
    			click(btnCalendar);
    			Reporter.addStepLog("Clicked on calendar");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to click");

    			e.printStackTrace();
    		}
    		}
    public static void clickToday() throws Throwable{
    try {
    			click(btnToday);
    			click(btnToday);
    			Reporter.addStepLog("Clicked on today button");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to click");

    			e.printStackTrace();
    		}
    		}
    public static String captureSelectProjectLabel() throws Throwable{
    String text = "";
    		try {
    			text = getText(txtSelectProject);
    			Reporter.addStepLog("Captured selected project label");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to capture the text");

    			e.printStackTrace();
    		}
    		return text;
    		}
    
    public static String captureAllProjectsLabel() throws Throwable{
    String text = "";
    		try {
    			text = getText(txtAllProjects);
    			Reporter.addStepLog("Captured all  projects label");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to capture the text");

    			e.printStackTrace();
    		}
    		return text;
    		}
    
    public static String captureSearchResults(String arg) throws Throwable{

    String text = "";
    		try {
    			Thread.sleep(2000);
    			text = getText(MobileBy.AccessibilityId(arg));
    			Reporter.addStepLog("Captured search results text");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to capture the text");

    			e.printStackTrace();
    		}
    		return text;
    		
    		}
   
    public static String captureLocationRange() throws Throwable{
    String text = "";
    		try {
    			text = getText(txtLocationRange);
    			Reporter.addStepLog("Captured location range text");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to capture the text");

    			e.printStackTrace();
    		}
    		return text;
    		}
    
    
    public static void clickDay(String arg) throws Throwable{
    try {
    	
    	System.out.println(getText(MobileBy.AccessibilityId(arg)));
    			click(MobileBy.AccessibilityId(arg));
    			Reporter.addStepLog("Clicked on day");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to click");

    			e.printStackTrace();
    		}
    		}
    
    public static void enterSearchText(String arg) throws Throwable{
    try {
    			enterText(searchBarInSelectProject,arg);
    			Reporter.addStepLog("entered text");

    		} catch (Exception e) {
    			sa.assertTrue(false,"Unable to enter the text");

    			e.printStackTrace();
    		}
    		}
    





	public static void clickWorkerTimeSheetButton() throws Throwable {

		try {
			click(btnWorkerTimeSheet);
			Reporter.addStepLog("Clicked on worker timesheet button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");
			e.printStackTrace();
		}
	}

	public static void clickHamBurger() throws Throwable {

		try {
			click(btnHamburger);
			Reporter.addStepLog("Clicked on hamburger menu");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
	}
	
	
	
	public static void clickLogOutButton() throws Throwable {

		try {
			click(btnLogout);
			Reporter.addStepLog("Clicked on logout button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
	}


	public static String captureWorkerTimeSheetText() throws Throwable {
		String text = "Worker Timesheet";
		try {
			text = "Worker Timesheet";
			Reporter.addStepLog("Captured worker timesheet text");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}

	public static String captureWorkerName() throws Throwable {

		String text = "";
		try {
			text = getText(txtName);
			Reporter.addStepLog("Captured Worker Name "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureWorkerNameInSignHours(String arg) throws Throwable {

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
	
	public static String captureWorkerPersonnelInSignHours(String arg) throws Throwable {

		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
			Reporter.addStepLog("Captured Worker personnel number In Sign Hours"+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	
	
	public static String captureWorkerNameInForeman() throws Throwable {

		String text = "";
		try {
			text = getText(txtWorkerNameInSignHours);
			Reporter.addStepLog("Captured Worker Name "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureWorkerNameInSummaryExpander() throws Throwable {

		String text = "";
		try {
			text = getText(txtWorker);
			Reporter.addStepLog("Captured Worker Name "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	public static String captureHours() throws Throwable {

		String text = "";
		try {
			text = getText(txtHours);
			Reporter.addStepLog("Captured hours  "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the hours");

			e.printStackTrace();
		}
		return text;
	}
	
	
	public static String captureWorkerPersonnelNum() throws Throwable {
		
		String text = "";
		try {
			text = getText(txtWorkerPersonnelNum);
			Reporter.addStepLog("Captured Worker PerseonnelNum "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
		
	}
	public static String captureJobClassification() throws Throwable {
		String text = "";
		try {
			text = getText(txtJobClassification);
			Reporter.addStepLog("Captured Job Classfication "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	public static String captureDate(String arg) throws Throwable {
		System.out.println("arg is "+arg);
		String text = "";
		try {
			text = driver.findElement(MobileBy.AccessibilityId(arg)).getText();
			Reporter.addStepLog("Captured Date "+text);

		} catch (Exception e) {
			
			Reporter.addStepLog("Unable to capture the text "+text);

			e.printStackTrace();
			
		}
		return text;
	}
	
	public static String captureDateInHoursScreen() throws Throwable {
		String text = "";
		try {
			Thread.sleep(2000);
			text = getText(MobileBy.AccessibilityId("AI_date"));
			Reporter.addStepLog("Captured Date "+text);

		} catch (Exception e) {
			
			Reporter.addStepLog("Unable to capture the text "+text);

			e.printStackTrace();
			
		}
		return text;
	}
	public static void clickPleaseSelectAProject() throws Throwable {
		
		try {
			click(linkPleaseSelectAProject);
			Reporter.addStepLog("Clicked on select a project link");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
		
	}
	
	public static void clickAllowOnce() throws Throwable {
		try {
			click(btnAllowOnce);
			Reporter.addStepLog("Clicked on allow once button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
	}
	
	
	public static void selectAnyProject(String arg1) throws Throwable {
		try {
			
			click(MobileBy.AccessibilityId(arg1));
			Reporter.addStepLog("Clicked on project checkbox");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
	}
	public static void clickSelectButton() throws Throwable {
		try {
			click(btnSelect);
			Reporter.addStepLog("Clicked on select button");

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to click");

			e.printStackTrace();
		}
	}
	public static String captureSelectedProject() throws Throwable {
		String text = "";
		try {
			text = getText(txtSelectedProject);
			Reporter.addStepLog("Captured selected Project text "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	public static String captureSelectedProjectDescription() throws Throwable{
		String text = "";
		try {
			text = getText(txtProjectDescription);
			Reporter.addStepLog("Captured selected project description "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

}
		return text;
	}
	public static String captureWorkerSignatureStatus() throws Throwable {
		String text = "";
		try {
			text = getText(txtWorkerSignaturePendingStatus);
			Reporter.addStepLog("Captured Worker Signature status "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	public static String captureCustomerSignatureStatus() throws Throwable {
		
		String text = "";
		try {
			text = getText(txtCustomerSignatureNotSignedStatus);
			Reporter.addStepLog("Captured Customer Signature Status "+text);

		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the text");

			e.printStackTrace();
		}
		return text;
	}
	
	public static void clickChangeWorkerName() throws Throwable{

		try {
					click(txtChangeWorker);
					Reporter.addStepLog("Clicked on change worker label");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to click");

					e.printStackTrace();
				}
				}

		public static void clickSearchBar() throws Throwable{
		try {
					click(searchBar);
					Reporter.addStepLog("Clicked on search bar");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to click");

					e.printStackTrace();
				}
				}
		
		public static void clickSearchBarInChangeWorker() throws Throwable{
			try {
						click(searchBarInChangeWorker);
						Reporter.addStepLog("Clicked on search bar");

					} catch (Exception e) {
						sa.assertTrue(false,"Unable to click");

						e.printStackTrace();
					}
					}
		
		public static void clickSearchBarInSelectProject() throws Throwable{
			try {
						click(searchBarInSelectProject);
						Reporter.addStepLog("Clicked on search bar");

					} catch (Exception e) {
						sa.assertTrue(false,"Unable to click");

						e.printStackTrace();
					}
					}
		public static void clickSearchBarInHours() throws Throwable{
			try {
						click(searchBarInHours);
						Reporter.addStepLog("Clicked on search bar");

					} catch (Exception e) {
						sa.assertTrue(false,"Unable to click");

						e.printStackTrace();
					}
					}
		
		
		
		public static void clickCancelButton() throws Throwable{
		try {
			driver.hideKeyboard();
					click(btnCancel);
					Reporter.addStepLog("Clicked on cancel button");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to click");

					e.printStackTrace();
				}
				}
		
		public static void clickBackButton() throws Throwable{
			try {
				click(btnBack);
				
				Reporter.addStepLog("Clicked on cancel button");

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to click");

				e.printStackTrace();
			}
		}
		
		public static void clickWorkerNotsignedStatus() throws Throwable{
			try {
				click(txtWorkerSignedStatus);
				
				Reporter.addStepLog("Clicked on worker not signed button");

			} catch (Exception e) {
				sa.assertTrue(false,"Unable to click");

				e.printStackTrace();
			}
		}
		
		
		public static String captureSearchWorkerLabel() throws Throwable{
		String text = "";
				try {
					text = getText(txtSearchWorkers);
					Reporter.addStepLog("Captured search workers label");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
				}
				return text;
				}
		public static String captureWorkerNameLabel() throws Throwable{
		String text = "";
				try {
					text = getText(txtWorkerNameLabel);
					Reporter.addStepLog("Captured worker name label");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
				}
				return text;
				}
		public static String captureSearchResult(String arg) throws Throwable{

		String text = "";
				try {
					text = getText(txtSearchResult);
					Reporter.addStepLog("Captured search results text");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
				}
				return text;
				
				}
		
		public static String capturePersonnelNumberText() throws Throwable{

			String text = "";
					try {
						text = getText(txtPersonnelNumberLabel);
						Reporter.addStepLog("Captured personnel number label text");

					} catch (Exception e) {
						sa.assertTrue(false,"Unable to capture the text");

						e.printStackTrace();
					}
					return text;
					
					}
		
		public static boolean isSearchResultsPresent(String arg) throws Throwable{

		boolean result = true;

		try{

		  result = isElementDisplayed(MobileBy.AccessibilityId(arg));
		}catch(Exception e){

		sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
					}
					
					return result;
					}
		
		public static boolean isPictureOpened() throws Throwable{

			boolean result = true;

			try{

			  result = isElementDisplayed(imgPicture);
			}catch(Exception e){

			sa.assertTrue(false,"Unable to capture the image");

						e.printStackTrace();
						}
						
						return result;
						}
		
		public static boolean attachedFilePresence() throws Throwable{

			boolean result = false;

			try{

			  result = isElementDisplayed(txtFileAttached);
			}catch(Exception e){

			

						e.printStackTrace();
						}
						
						return result;
						}

					public static String captureChangeWorkerLabel() throws Throwable{
		String text = "";
				try {
					text = getText(changeworkertext);
					Reporter.addStepLog("Captured change worker text");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to capture the text");

					e.printStackTrace();
				}
				return text;
				}
					
					public static int captureFilesAttachedCount() throws Throwable{
						int count = 0;
								try {
									count = getElements(imgdeletContainer);
									Reporter.addStepLog("Captured file count text");

								} catch (Exception e) {
									sa.assertTrue(false,"Unable to capture the text");

									e.printStackTrace();
								}
								return count;
								}
		public static void clickWorkerName(String arg) throws Throwable{
		try {
					click(MobileBy.AccessibilityId(arg));
					Reporter.addStepLog("Clicked on cancel button");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to click");

					e.printStackTrace();
				}
				}
		public static void enterTexSearchText(String arg) throws Throwable{
		try {
					enterText(searchBarInChangeWorker,arg);
					Reporter.addStepLog("entered text");

				} catch (Exception e) {
					sa.assertTrue(false,"Unable to enter the text");

					e.printStackTrace();
				}
				}
		}



