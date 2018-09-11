package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsEx {
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
      public void action() throws InterruptedException
      {
	
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	

	Actions a= new Actions(driver);
	
	WebElement men=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[3]/span"));
	
	WebElement fasttrack=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[3]/ul/li/ul/li[4]/ul/li[2]/a"));
	
	a.moveToElement(men).pause(2000).moveToElement(fasttrack).pause(2000).click().build().perform();
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