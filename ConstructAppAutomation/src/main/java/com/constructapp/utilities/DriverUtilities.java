package com.constructapp.utilities;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.constructapp.base.DriverFactory;
import com.constructapp.stepdefinitions.Hooks;
import com.cucumber.listener.Reporter;

import io.appium.java_client.MobileBy;

public class DriverUtilities extends DriverFactory {

	public static Properties config;
	public static FileInputStream fis;
	public static File file;
	public static String value;
	public static SoftAssert sa = new SoftAssert();
	public static Hooks hook = new Hooks();
	public String readProperty(String key) throws IOException {
		config = new Properties();
		fis = new FileInputStream("/Users/pratik/Downloads/IpadAppAutomation (2)/ConstructAppAutomation/GlobalSettings.properties");
		config.load(fis);
		value = config.getProperty(key);
		return value;

	}
	
	 public void clickUsingAccessibilityId(String arg) throws Throwable {
			
	    	try {
	    	click(MobileBy.AccessibilityId(arg));
	    	Reporter.addStepLog("Clicked on "+ arg+" button");
	    	}catch(Exception e) {
	    		sa.assertTrue(false,"Unable to click");
	    	}
			
		}
	    
	
	@SuppressWarnings("unused")
	public static String captureTextByAccessibilityId(String arg) throws Throwable {
		String text = "";
		try {
			text = getText(MobileBy.AccessibilityId(arg));
		} catch (Exception e) {
			sa.assertTrue(false,"Unable to capture the completed text");

			e.printStackTrace();
		}
		return text;
	}

	
	public static String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11 ) {
            month = months[num-1];
        }
        return month;
    }

	public static void click(By locator) throws Throwable {

		try {
			driver.findElement(locator).click();

		} catch (Exception e) {
			sa.assertTrue(false, "Unable to click button");

			
			
			
		}
	}

	public static void enterText(By locator, String text) throws Throwable {

		try {
			//driver.getKeyboard();
			driver.findElement(locator).click();
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(text);
            
		} catch (Exception e) {
			sa.assertTrue(false, "Unable to enter text");
            sa.assertAll();
			
		}
	}
	
	public static String getText(By locator) throws Throwable {

		
		String text = "";
		try {
			text = driver.findElement(locator).getText();

		} catch (Exception e) {

			sa.assertTrue(false, "Unable to get text");

		}
		
		return text;
	}
	
public static int getElements(By locator) throws Throwable {

		
		int count = 0;
		try {
			count = driver.findElements(locator).size();

		} catch (Exception e) {

			sa.assertTrue(false, "Unable to get text");

		}
		
		return count;
	}

	public static void ExplicitWaitOnElementToBeclickable(By locator) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Throwable e) {

			sa.assertTrue(false, "Unable to wait for element");

			hook.addScreenshot();
			sa.assertAll();
		}
	}
	//static WebElement element;
	public static void ExplicitWaitOnElementToBeVisible(By locator) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Throwable e) {

			//sa.assertTrue(false, "Unable to wait text");

			hook.addScreenshot();
			//sa.assertAll();
		}
		
		//return element;
	}

	public static boolean isElementDisplayed(By locator) throws Throwable {

		boolean presenceOfElement = false;
		try {
			presenceOfElement = driver.findElement(locator).isDisplayed();
			System.out.println(presenceOfElement);

		} catch (Exception e) {
			presenceOfElement = false;
			sa.assertTrue(false, "Unable to verify the element");

			
		}
		
		return presenceOfElement;
	}
	
	
}
