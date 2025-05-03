package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HomePageTestCase extends BaseClass
{
	
  @Test(priority=1)
  public void testAppUrl() 
  {
	  
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail! Url Not Matched");
	  System.out.println("Test Pass : Url Matched!");
  }
  
  @Test(priority=2)
  public void testAppTitle() 
  {
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail : Title not matched!"); 
	  System.out.println("Test Pass : Title Matched!");
	  }
  
  @Test(priority=3)
  public void testSignInLink() 
  {
	  String nextPage = hp.getStatusOfLink();
	  Assert.assertTrue(nextPage.contains("login"),"Test Fail: Login Page not Open!");
	  System.out.println("Test Pass: Application navigating to Login Page!");
	  
  }
}
