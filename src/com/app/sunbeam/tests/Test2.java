package com.app.sunbeam.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.sunbeam.Pages.LoginPage;

public class Test2 extends BaseTest {
	
	@Test(enabled = true ,priority = 1)
	public void getup() throws InterruptedException {
		Assert.assertEquals("Pune", "Pune");
		Thread.sleep(10000);
	}
	
	@Test(enabled = true ,priority = 2)
	public void getup1Test() throws InterruptedException {
		Assert.assertEquals("Mumbai", "Mumbai");
		Assert.assertFalse(false);
		Thread.sleep(10000);
	}
	
	@Test(enabled = true ,priority = 3,dependsOnMethods = "getup1Test")
	public void getup1Test2() throws InterruptedException {
		Assert.assertEquals("Mumbai", "Mumbai");
		Assert.assertFalse(false);
		Thread.sleep(10000);
	}
	
	@Test(enabled=true,priority = 4)
	public void LoginTest2() {
		LoginPage login = new LoginPage();
		//login.EnterUserName("amit789@gmail.com");
		login.LoginWithUserNameAndPassword("amitkhambad987@gmail.com", "");
		Assert.assertFalse(false);
		//login.ClickOnNextButton();	
	}

}
