package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateTheWindow {

public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
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
	public void navigatethewindow() throws Exception
	{
	driver.manage().deleteAllCookies();
	
	driver.findElement(By.xpath("//*[@id=\"WebPartWPQ4\"]/div[1]/div/a[1]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id=\"WebPartWPQ4\"]/div[1]/div/a[2]")).click();
	
	Thread.sleep(3000);
	driver.navigate().forward();
	
	driver.findElement(By.xpath("//*[@id=\"GoT-sidebar\"]/a[5]")).click();
	
	driver.navigate().refresh();
	
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"WebPartWPQ4\"]/div[1]/div/a[9]")).click();

}
}

