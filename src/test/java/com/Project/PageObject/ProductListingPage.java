package com.Project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {
	//Create object of WebDriver element
		WebDriver ldriver;	// ldriver referenced to local driver

		// create constructor for Login class
		public ProductListingPage(WebDriver rdriver) 	// rdriver referenced to remote driver
		{
			ldriver = rdriver;

			PageFactory.initElements(rdriver, this);	
		}
		
		//Identify elements on Login Page using page factory annotations and create methods for it .
		
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		 WebElement backpack;
		
		@FindBy (id = "shopping_cart_container")
		WebElement gotocart;
		
		@FindBy (className = "product_sort_container")
		WebElement sorting; 
		
		
		// set actions on identified Web elements by creating methods
		
		public void selectProduct()
		{
			backpack.click();
		}
		
		public void gotoCart()
		{
			gotocart.click();
		}
		
		public void sortOrder(String text)
		{
			Select sort = new Select(sorting);
			sort.selectByVisibleText(text);
		}
		


}
