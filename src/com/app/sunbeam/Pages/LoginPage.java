package com.app.sunbeam.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.sunbeam.Driver.DriverManager;
import com.app.sunbeam.Reports.ExtentManager;
import com.app.sunbeam.Reports.ExtentManagerLogger;

//Encapsulation usage added here
public class LoginPage {
	
	private By userName = By.xpath("//input[@type='email']");
	private By nextBtn = By.xpath("//span[text()='Next']/ancestor::div[1]");
	By password = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//button[text()=' Login ']");
	
	
	public WebElement getUserName() {
		return DriverManager.getDriver().findElement(userName);
	}
	
	public WebElement getNextBtn() {
		return DriverManager.getDriver().findElement(nextBtn);
	}
	
	public WebElement getPassword() {
		return DriverManager.getDriver().findElement(password);
	}
	
	public WebElement getLoginBtn() {
		return DriverManager.getDriver().findElement(loginBtn);
	}
	
	public void LoginWithUserNameAndPassword(String userName,String password) {
		ExtentManagerLogger.info("Entering user name as "+userName);
		getUserName().sendKeys(userName);
		//getPassword().sendKeys(password);
		ExtentManagerLogger.info("Clicking on next button");
		getNextBtn().click();
	}

	
	
//	public void EnterUserName(String uname) {
//		ExtentManagerLogger.info("Entering userName as "+uname);
//		DriverManager.getDriver().findElement(userName).sendKeys(uname);
//	}
//	
//	public void ClickOnNextButton() {
//		ExtentManagerLogger.info("Clicking on next button");
//		DriverManager.getDriver().findElement(nextBtn).click();
//	}
//	
//	public void EnterPassword(String userPassword) {
//		ExtentManagerLogger.info("Entering password as "+userPassword);
//		DriverManager.getDriver().findElement(password).sendKeys(userPassword);
//	}
//	
//	public void ClickOnSignInBtn() {
//		ExtentManagerLogger.info("Clicking on sign in button ");
//		DriverManager.getDriver().findElement(loginBtn).click();
//	}
	
	//Adding commit 2
}
