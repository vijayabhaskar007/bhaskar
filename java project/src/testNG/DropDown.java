package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {

	public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
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

	@Test(priority=1)
	public void registerclick()
	{
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		boolean status=driver.findElement(By.xpath("//select[@name='country']")).isDisplayed();
		Assert.assertEquals(true, status);
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		sel.selectByVisibleText("INDIA");
	}
	
	
	@Test(priority=2)
	public void allitems()
	{
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		List<WebElement> allitems=sel.getOptions();
		System.out.println("allitems count "+allitems.size());
		for(int i=1; i<allitems.size();i++)
		{
			System.out.println("allitems display"+allitems.get(i).getText());
		}
		
	}
	
	
	
	
	
	
	
}
