package com.app.sunbeam.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.sunbeam.Pages.LoginPage;

public class Test1 extends BaseTest {
	//adding line from another user
	@Test(enabled = true ,priority = 1)
	public void sample() throws InterruptedException {
		Assert.assertEquals("amit", "amit");
		Thread.sleep(10000);
	}
	
	@Test(enabled = true ,priority = 2)
	public void sample1() throws InterruptedException {
		Assert.assertEquals("amol", "amol");
		Thread.sleep(10000);
	}
	
	@Test(enabled = true ,priority = 3)
	public void sample2() throws InterruptedException {
		Assert.assertEquals("kishor", "kishor");
		Thread.sleep(10000);
	}
	
	@Test(enabled=true,priority = 4)
	public void LoginTest() {
		LoginPage login = new LoginPage();
		//login.EnterUserName("amit789@gmail.com");
		login.LoginWithUserNameAndPassword("amit789@gmail.com", "");
		Assert.assertFalse(false);
		//login.ClickOnNextButton();	
	}

}
