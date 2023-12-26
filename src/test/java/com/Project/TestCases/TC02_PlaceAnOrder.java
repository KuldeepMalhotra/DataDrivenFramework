// This test case to verify that user is logged into website with valid credentials and select an placed an order successfully.

package com.Project.TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.Project.PageObject.*;
import com.Project.Utilities.BaseClass;

public class TC02_PlaceAnOrder extends BaseClass {

	@Test(priority=0)
	public void loginFlowTest()
	{
		logs.info("\nTest Case executing - TC02_PlaceAnOrder");
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

		String pageUrl = driver.getCurrentUrl();
		Assert.assertEquals(pageUrl,"https://www.saucedemo.com/inventory.html");
		logs.info("Page URL is - " +pageUrl);	
	}

	@Test(priority=2)
	public void productCheckout()
	{
		ProductListingPage plist = new ProductListingPage(driver);

		plist.sortOrder("Price (low to high)");
		logs.info("Products are sorted low-to-high successfully.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		plist.selectProduct();
		logs.info("Product selected successfully.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		plist.gotoCart();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CartPage cp = new CartPage(driver);
		cp.checkoutcart();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		logs.info("Product added to cart successfully.");
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.checkoutFName("Kuldeep");
		cop.checkoutLName("Kumar");
		cop.checkoutPostalCode("12345");
		cop.continueToCheckout();
		logs.info("Product delivery details filled successfully.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		OrderOverviewPage overview = new OrderOverviewPage(driver);
		overview.finalCheckout();
		logs.info("Product is confirmed for delivery.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		OrderConfirmedPage confirm = new OrderConfirmedPage(driver);
		confirm.backToProductListing();
		logs.info("Thank you for placing an order. Visit again!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	}

}




