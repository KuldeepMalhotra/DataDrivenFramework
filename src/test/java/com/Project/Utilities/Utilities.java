package com.Project.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Utilities {

	// Create object of properties package
	Properties properties;

	String configFilePath = "/Users/Malhotra/eclipse-workspace/DataDrivenFramework/Configuration/config.properties";

	// Create constructor of ReadConfig class
	public Utilities()
	{
		try {
			properties = new Properties();

			FileInputStream fis = new FileInputStream(configFilePath);
			properties.load(fis);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	// Creating methods for reading elements from configuration file.
	
	public String getBaseUrl()
	{
		String url = properties.getProperty("baseURL");

		// check if url value is not empty
		if (url!=null)
			return url;
		else
			throw new RuntimeException ("URL is not found as it is not specified in the configuration file.");

	}
	
	public String getBrowser()
	{
		String browser = properties.getProperty("browser");

		// check if browser value is not empty
		if (browser!=null)
			return browser;
		else
			throw new RuntimeException ("Browser is not found as it is not specified in the configuration file.");

	}

	public String getUserName()
	{
		String uname = properties.getProperty("username");

		// check if uname value is not empty
		if (uname!=null)
			return uname;
		else
			throw new RuntimeException ("User Name is not found as it is not specified in the configuration file.");

	}
	
	public String getPassword()
	{
		String pwd = properties.getProperty("password");

		// check if pwd value is not empty
		if (pwd!=null)
			return pwd;
		else
			throw new RuntimeException ("Password is not found as it is not specified in the configuration file.");

	}
	

}
