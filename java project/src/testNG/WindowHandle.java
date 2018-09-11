package testNG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle {

	
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
	public void windowHandle() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//a[text()='WEBMAIL']")).click();
		System.out.println("alertmessage is "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		//window id
		Thread.sleep(2000);
		String window=driver.getWindowHandle();
		System.out.println("window id is "+window);
		
		
		//multiple ids
		Set<String> handles=new HashSet<String>(driver.getWindowHandles());
		System.out.println("no. of windows count "+handles.size());
		
		
		
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}



}
