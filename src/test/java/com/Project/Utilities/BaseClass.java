package com.Project.Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// Create object of ReadConfig Class
	Utilities config = new Utilities();

	public String url = config.getBaseUrl();
	public String browser = config.getBrowser();
	public String uname = config.getUserName();
	public String passwd = config.getPassword();
	
	public static WebDriver driver;
	public static Logger logs;

	@BeforeClass	//testNG annotation to execute browser setup method before running the baseClass
	public void browserSetup()
	{
		switch(browser.toLowerCase())
		{
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "msedge" :
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default :
			driver = null;
			break;
		}
		
		// For logging we are using log4j2.properties
		logs = LogManager.getLogger("DataDrivenFramework Logging Feature");
		

	}
	
	@AfterClass		//testNG annotation to execute browser close method after running the baseClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
		logs.info("Test Executed and browser closed successfully.");
	}
}

