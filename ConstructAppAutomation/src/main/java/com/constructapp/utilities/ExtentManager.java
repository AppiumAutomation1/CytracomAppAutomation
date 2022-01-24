package com.constructapp.utilities;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.constructapp.base.DriverFactory;
//import com.relevantcodes.extentreports.DisplayOrder;
//import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends DriverFactory{
	
public static ExtentReports extent;
public static String screenshotPath;
public static String screenshotName;
	
	
	public static ExtentReports getInstance() {
		
		if(extent == null) {
			
			extent = new ExtentReports();
			//extent = new ExtentReports(System.getProperty("user.dir") + "\\Test-ScreenShots\\extent.html", true, DisplayOrder.OLDEST_FIRST);
		}
		
		return extent;
	}
	
	public static void captureScreenshot() throws IOException {
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File scrFile = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(scrFile, new File(System.getProperty("user.dir") + "\\Test-ScreenShots\\" + screenshotName));
	}


}
