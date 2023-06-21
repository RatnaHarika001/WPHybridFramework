package testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({listeners.MyListener.class})
public class DemoTest {
	
	
	@Test
	public void test1()
	{
		System.out.println("TC Executed");
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue("Selenium".contains("Harika"));
	}

}
