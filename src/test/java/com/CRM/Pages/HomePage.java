package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Screenshot_Utility;

public class HomePage {

	//Encapsulation : Wrapping of data and function together into single unit
	//encapsulation = private data + public method
	private WebDriver driver;
	
	//initialize driver
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//data member(locator)
	
	private By link = By.linkText("Sign In");
	
	//method(functionality to test)
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getStatusOfLink()
	{
		Screenshot_Utility.getScreenshot(driver);
		 driver.findElement(link).click();
		 Screenshot_Utility.getScreenshot(driver);
		 return driver.getCurrentUrl();
		 
	}
	
}
