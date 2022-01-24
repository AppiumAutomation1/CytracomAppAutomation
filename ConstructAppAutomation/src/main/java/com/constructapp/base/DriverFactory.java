package com.constructapp.base;

import java.io.IOException;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentTest;
import com.constructapp.utilities.DriverUtilities;
//import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	
	

	@SuppressWarnings("rawtypes")
	public static AppiumDriver <?> driver;
	public static ExtentTest test;
	public static DriverUtilities utils = new DriverUtilities();
	public static String platform, appMainActivity, appPackage, deviceName, automationName, bundleid, platformVersion,
			udid, host, port, waitTime,app;

	@BeforeSuite
	
	@SuppressWarnings("rawtypes")
	public void launchApp() throws MalformedURLException, IOException {
		
		
		platform = utils.readProperty("platform");
        host = utils.readProperty("host");
        port=utils.readProperty("port");
		if (platform.equalsIgnoreCase("ios")) {
			System.out.println(platform);
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), setDeviceCapabilities());
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.installApp("/Users/admin/Downloads/C365Fields_16June/ConstructMobile.iOS");


		} else if (platform.equalsIgnoreCase("Android")) {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), setDeviceCapabilities());

		}

		driver.manage().timeouts().implicitlyWait(Integer.parseInt(waitTime), TimeUnit.SECONDS);
	}
	
	
	

	public static DesiredCapabilities setDeviceCapabilities() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		platform = utils.readProperty("platform");
		
		if(System.getProperty("device").equals("ipadair")) {
			
			System.out.println("Launching the app in ipadair");
		deviceName = utils.readProperty("ipadairdevice");
		udid = utils.readProperty("ipadairudid");

		}else if(System.getProperty("device").equals("ipadpro")) {
			System.out.println("Launching the app in ipadpro");

		deviceName = utils.readProperty("ipadpro");
		udid = utils.readProperty("ipadproudid");

		}else if(System.getProperty("device").equals("ipad")) {
			System.out.println("Launching the app in ipad");

		deviceName = utils.readProperty("ipad");
		udid = utils.readProperty("ipadudid");

		}else if(System.getProperty("device").equals("iPadPro9.7inch")) {
			System.out.println("Launching the app in iPadPro9.7inch");

		deviceName = utils.readProperty("iPadPro9.7inch");
		udid = utils.readProperty("iPadPro9.7inchudid");

		}
		
		else if(System.getProperty("device").equals("iphone")) {
			System.out.println("Launching the app in iphone");

		deviceName = utils.readProperty("iphonedevice");
		udid = utils.readProperty("iphoneudid");

		}else if(System.getProperty("device").equals("pixel")) {
			System.out.println("Launching the app in pixel");

		deviceName = utils.readProperty("androiddevice");
		udid = utils.readProperty("pixeludid");

		}
		
		if(platform.equals("ios")) {
		automationName = utils.readProperty("automationname");
		bundleid = utils.readProperty("bundleid");
		platformVersion = utils.readProperty("platformversion");
		}else {
			automationName = utils.readProperty("androidautomationname");
			app = utils.readProperty("app");
			platformVersion = utils.readProperty("androidplatformversion");
		}
		host = utils.readProperty("host");
		port = utils.readProperty("port");
		waitTime = utils.readProperty("waittime");


		if(platform.equals("ios")) {
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.UDID, udid);
		
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, bundleid);
		}else {
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			capabilities.setCapability(MobileCapabilityType.UDID, udid);
			
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
			capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, app);
		}
		
		//capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
		
		//capabilities.setCapability(MobileCapabilityType.FULL_RESET,false);

		return capabilities;
	}

}
