package com.Project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmedPage {
	//Create object of WebDriver element
	WebDriver ldriver;	// ldriver referenced to local driver

	// create constructor for Login class
	public OrderConfirmedPage(WebDriver rdriver) 	// rdriver referenced to remote driver
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);	
	}
	
	//Identify elements on Login Page using page factory annotations and create methods for it .
	
	@FindBy(id = "back-to-products")
	WebElement backToHome;
	
	
	// set actions on identified Web elements by creating methods
	
	
	public void backToProductListing()
	{
		backToHome.click();
	}

}
