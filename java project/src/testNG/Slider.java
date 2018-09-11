package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slider {
public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
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
public void slider() throws InterruptedException 
{
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("watches");

	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys(Keys.ENTER);
	
	for(int i=0; i<=20; i++)

	{
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)","");
		Thread.sleep(3000);
	}
	
	for(int i=0; i<=20; i++)

	{
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,-200)","");
		Thread.sleep(3000);
	}

}

}
