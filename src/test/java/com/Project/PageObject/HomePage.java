package com.Project.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Create object of WebDriver element
	WebDriver ldriver;	// ldriver referenced to local driver

	// create constructor for Login class
	public HomePage(WebDriver rdriver) 	// rdriver referenced to remote driver
	{
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);	
	}
	
	//Identify elements on Login Page using page factory annotations and create methods for it .
	
	@FindBy(id = "user-name")
	 WebElement uname;
	
	@FindBy (id = "password")
	WebElement passwd;
	
	@FindBy (id = "login-button")
	WebElement loginbtn;
	
	
	// set actions on identified Web elements by creating methods
	
	public void inputUserName(String username)
	{
		uname.sendKeys(username);
	}
	
	public void inputPassword(String password)
	{
		passwd.sendKeys(password);
	}
	
	public void clickToLoginBtn()
	{
		loginbtn.click();
	}
}
