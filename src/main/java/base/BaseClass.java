package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import browserFactory.browserFactory1;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.out.println("LOG:INFO - Before Class Executing-Setting up Browser");
		driver=browserFactory1.startbrowser("Chrome", "https://www.wishpond.com/login");
		 
	}
	
//	@AfterClass
	public void teardown()
	{
		browserFactory1.closebrowser(driver);
		System.out.println("LOG:INFO - After Class Executing-Closing Browser");
	}

}
