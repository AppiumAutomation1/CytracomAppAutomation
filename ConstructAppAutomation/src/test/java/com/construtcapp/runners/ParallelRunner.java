package com.construtcapp.runners;

import java.io.File;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentTest;
import com.constructapp.base.DriverFactory;
import com.constructapp.utilities.DriverUtilities;
import com.constructapp.utilities.ThreadLocalDriver;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.CucumberOptions;
//import io.cucumber.java.After;
import cucumber.api.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
//import io.cucumber.java.Scenario;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@CucumberOptions(features="src/test/java/ConstructAppLogin.feature"
,glue={"com.constructapp.stepdefinitions"}
,plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
 tags ={"@smoke"}, 
 monochrome = true
)

public class ParallelRunner extends AbstractTestNGCucumberTests{
	
	
	
	
	
	@SuppressWarnings("rawtypes")
	public static AppiumDriver driver;
	
	//private static ThreadLocal<IOSDriver> driver = new ThreadLocal<>();
	public static ExtentTest test;
	public static DriverUtilities utils = new DriverUtilities();
	public static String platform, appMainActivity, appPackage, deviceName, automationName, bundleid, platformVersion,
			udid, host, port, waitTime;
	
	@SuppressWarnings("rawtypes")
	@BeforeTest
	@Parameters({ "deviceName_","UDID_","platformVersion_", "URL_" })
	public void launchApp(String deviceName,String UDID, String platformVersion, String URL) throws MalformedURLException, IOException {
		System.out.println("Went into before suite");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        bundleid = utils.readProperty("bundleid");
        System.out.println(deviceName);
        System.out.println(UDID);
        System.out.println(platformVersion);
        System.out.println(URL);

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.UDID, UDID);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, bundleid);
		
			
		//ThreadLocalDriver.setTLDriver(new IOSDriver (new URL("http://"+URL),capabilities));
		driver = new IOSDriver(new URL("http://"+URL), capabilities);

			//driver = new IOSDriver(new URL("http://" + host + ":" + port + "/wd/hub"), setDeviceCapabilities());

		
		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(waitTime), TimeUnit.SECONDS);
	}
    
	@AfterClass
	public static void setup()
	{
		
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Prashanthi");
	Reporter.setSystemInfo("Application Name", "COnstructTime App ");
	Reporter.setSystemInfo("Environment", "QA");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
	
	DriverFactory factory = new DriverFactory();
	
	public static byte[] getByteScreenshot() throws IOException 
	{
	    File src = ((TakesScreenshot) DriverFactory.driver).getScreenshotAs(OutputType.FILE);
	    byte[] fileContent = FileUtils.readFileToByteArray(src);
	    return fileContent;
	}
	
	//@AfterStep
	public void as(Scenario scenario) throws IOException, InterruptedException
	{
		
	    scenario.embed(getByteScreenshot(), "image/png");		
	}
	
	 //@AfterMethod
	    public synchronized void teardown(){
	        ThreadLocalDriver.getTLDriver().quit();
	    }
	
	    
	//@After
	 public void addScreenshot(Scenario scenario){
	 
		System.out.println("scenario is "+scenario.isFailed());
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				TakesScreenshot screenshot = (TakesScreenshot) DriverFactory.driver;
				
				File sourcePath = screenshot.getScreenshotAs(OutputType.FILE);
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir")  + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				//Files.copy(destinationPath, destinationPath)o
				Files.copy(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	 }
}


