package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ChechTheLinks {
	

		public WebDriver driver;
		
		@BeforeMethod
		public void LaunchApp()
		{
			//Launch application
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
		}
		
		@AfterMethod
		public void CloseApp()
		{
			//Close my application
			driver.quit();
		}
@Test
public void bustickets()
{
	//checking bustickets
	boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[1]/a")).isDisplayed();
	Assert.assertEquals(true, status);
}
		
@Test
public void hotels()
{
	//checking hotels
	boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[2]/a")).isDisplayed();
	Assert.assertEquals(true, status);
}

@Test
public void bushire()
{
	//checking bustickets
	boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[3]/a")).isDisplayed();
	Assert.assertEquals(true, status);
}

@Test
public void pilgrimage()
{
	//checking bustickets
	boolean status=driver.findElement(By.xpath("//*[@id=\"page_main_header\"]/nav/ul/li[4]/a")).isDisplayed();
	Assert.assertEquals(true, status);
}

}
