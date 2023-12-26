// This test case is to verify that user is successfully logged in with website with valid credentials.

package com.Project.TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.*;

import com.Project.PageObject.HomePage;
import com.Project.Utilities.BaseClass;


public class TC01_LoginFlow extends BaseClass {

	@Test(priority=0)
	public void loginFlowTest()
	{
		logs.info("\nTest Case executing - TC01_LoginFlow");
		// Navigating to URL
		driver.get(url);
		driver.manage().window().maximize();
		logs.info("Redirecting to... - " + url);
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle,"Swag Labs");
		logs.info("Page Title is - " +pageTitle);

		//Apply implicit wait for 10 seconds to load web elements on the page.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}		
	@Test(priority=1)
	public void loginFlow()
	{
		HomePage home = new HomePage(driver);
		home.inputUserName(uname);
		logs.info("Username Inserted - " + uname);

		home.inputPassword(passwd);
		logs.info("Password Inserted - " + passwd);

		home.clickToLoginBtn();
		logs.info("User Logged in successfully.");
	}


}

