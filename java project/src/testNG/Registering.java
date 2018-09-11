package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registering {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterMethod
	public void CloseApp()
	{
		//Close my application
		driver.quit();
	}
	
	
	@Test
	public void readData()
	{
		//Register
		//Click on Register button
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		//Enter Uname,Password,ConfirmPassword
		driver.findElement(By.id("email")).sendKeys("lakshman");
		driver.findElement(By.name("password")).sendKeys("lakshman");
		driver.findElement(By.name("confirmPassword")).sendKeys("lakshman");
		
		//Click on submit button
		driver.findElement(By.name("register")).click();
		
		//Verify SignOff button is displayed
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).isDisplayed(), true);
	}
	



}
