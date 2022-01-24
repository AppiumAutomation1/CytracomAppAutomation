package com.constructapp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.constructapp.base.DriverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CytracomLoginPage extends DriverFactory{
	protected AppiumDriver<?> driver;
	
	public CytracomLoginPage(AppiumDriver<?> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	
	}
		
	//public static By emailIdInputBox = By.xpath("//XCUIElementTypeTextField");
	//
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField")
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.cytracom.cytracommobile:id/email_et']")
	public WebElement emailIdInputBox;
	
	//public By phoneSubmitButton  = By.xpath("//XCUIElementTypeButton[@name='Submit']");
	@iOSXCUITFindBy(xpath="//XCUIElementTypeSecureTextField")
	@AndroidFindBy(id="com.cytracom.cytracommobile:id/password_et")
	public WebElement passwordInputBox;
	
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Login']")
    @AndroidFindBy(id="com.cytracom.cytracommobile:id/login_button")
	public WebElement loginButton;
	
	//public By thanksText = By.xpath("//XCUIElementTypeStaticText[@name='Resend code']");
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Required Permissions']")
	//@AndroidFindBy(xpath="")
	public WebElement requiredPermissionText;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Login to access your account.']")
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Login to access your account.']")
	public WebElement loginText;
	
	
	public  void enterEmail(String email) {
		
		emailIdInputBox.clear();
		emailIdInputBox.sendKeys(email);		
	}
	
    public  void enterPassword(String password) {
		
    	passwordInputBox.clear();;
    	passwordInputBox.sendKeys(password);
    	
	}
	
	
	public  void clickLoginButton() {
		(loginButton).click();
	}
	
	public void clickOutside() {
		loginText.click();
	}
	
	
	public void clickContinueButton() {
		
		if(platform.equals("ios")) {
		//continueButton.click();
		}
	}
	
	public  boolean verifyRequiredPermissionMessage() {
		boolean elementPresence = false;
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(requiredPermissionText));
		
		elementPresence=true;
		}catch(Exception e) {
			elementPresence=false;
		}
		
		return elementPresence;
		
	}
}
	