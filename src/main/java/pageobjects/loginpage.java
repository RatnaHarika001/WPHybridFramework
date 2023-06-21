package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Email = By.xpath("//input[@type='email']");
	By Password = By.xpath("//input[@type='password']");
	By Login = By.xpath("//input[@type='submit']");
	
	public void logintoapplication()
	{
		driver.findElement(Email).sendKeys("ratna.peesapati+25@wishpond.com");
		driver.findElement(Password).sendKeys("test123");
		driver.findElement(Login).click();
	}

}
