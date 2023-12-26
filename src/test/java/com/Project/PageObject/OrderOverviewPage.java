package com.Project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOverviewPage {
	//Create object of WebDriver element
	WebDriver ldriver;	// ldriver referenced to local driver

	// create constructor for Login class
	public OrderOverviewPage(WebDriver rdriver) 	// rdriver referenced to remote driver
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);	
	}
	
	//Identify elements on Login Page using page factory annotations and create methods for it .
	
	@FindBy(id = "finish")
	WebElement proceedToCheckout;
	
	@FindBy(id = "cancel")
	WebElement backToCheckout;
	
	
	// set actions on identified Web elements by creating methods
	
	
	public void finalCheckout()
	{
		proceedToCheckout.click();
	}

	public void goBackToCheckout()
	{
		backToCheckout.click();
	}
}
