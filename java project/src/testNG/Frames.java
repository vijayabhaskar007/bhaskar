package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {

public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CloseApp() throws InterruptedException
	{
		
		Thread.sleep(5000);
		//Close my application
		driver.quit();
	}
	@Test
	public void frame()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("lakshman");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
