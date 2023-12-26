package com.Project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	//Create object of WebDriver element
			WebDriver ldriver;	// ldriver referenced to local driver

			// create constructor for Login class
			public CartPage(WebDriver rdriver) 	// rdriver referenced to remote driver
			{
				ldriver = rdriver;

				PageFactory.initElements(rdriver, this);	
			}
			
			//Identify elements on Login Page using page factory annotations and create methods for it .
			
			@FindBy(id = "remove-sauce-labs-backpack")
			 WebElement removeItem;
			
			@FindBy(id = "continue-shopping")
			WebElement contShopping;
			
			@FindBy(id = "checkout")
			WebElement checkout;
			
			// set actions on identified Web elements by creating methods
			
			public void removeProduct()
			{
				removeItem.click();
			}
			
			public void continueProductShopping()
			{
				contShopping.click();
			}
			
			public void checkoutcart()
			{
				checkout.click();
			}
}
