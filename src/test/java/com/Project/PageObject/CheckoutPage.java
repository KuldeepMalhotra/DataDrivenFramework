package com.Project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	//Create object of WebDriver element
	WebDriver ldriver;	// ldriver referenced to local driver

	// create constructor for Login class
	public CheckoutPage(WebDriver rdriver) 	// rdriver referenced to remote driver
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);	
	}
	
	//Identify elements on Login Page using page factory annotations and create methods for it .
	
	@FindBy(id = "first-name")
	 WebElement coFName;
	
	@FindBy(id = "last-name")
	WebElement coLName;
	
	@FindBy(id = "postal-code")
	WebElement coPostalCode;
	
	@FindBy(id = "continue")
	WebElement continueToCheckout;
	
	@FindBy(id = "cancel")
	WebElement backToCart;
	
	
	// set actions on identified Web elements by creating methods
	
	public void checkoutFName(String fname)
	{
		coFName.sendKeys(fname);
	}
	
	public void checkoutLName(String lname)
	{
		coLName.sendKeys(lname);
	}
	
	public void checkoutPostalCode(String postcode)
	{
		coPostalCode.sendKeys(postcode);
	}
	
	public void continueToCheckout()
	{
		continueToCheckout.click();
	}
	
	public void backToCart()
	{
		backToCart.click();
	}
}
