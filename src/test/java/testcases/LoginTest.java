package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.loginpage;

public class LoginTest extends BaseClass
{
	
	
	@Test
	public void loginToApplication() 
	{
		loginpage login = new loginpage(driver);
		 
		login.logintoapplication();
	}

	
}
