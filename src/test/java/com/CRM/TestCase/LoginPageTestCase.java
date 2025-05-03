package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		hp.getStatusOfLink();
	}
  @Test
  public void validateLogin() throws InterruptedException 
  {
	  
	  String url = lp.doLogin("test@gmail.com","test123");
	  Thread.sleep(4000);
	  Assert.assertTrue(url.contains("customers"),"Test Fail : Login Fail!");
	  System.out.println("Test Pass: Login completed!");
	  
  }
}
