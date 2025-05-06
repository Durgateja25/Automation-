package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Screenshot_Utility;

public class LoginPage 
{
	
	
	private WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//data member(locator)
	By email = By.id("email-id");
	By pwd = By.id("password");
	By btn = By.name("submit-name");
	
	//method(functionality to test)
	public String doLogin(String em,String psw)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(psw);
		driver.findElement(btn).click();
		Screenshot_Utility.getScreenshot(driver);
		return driver.getCurrentUrl();
	}
	
	

}
