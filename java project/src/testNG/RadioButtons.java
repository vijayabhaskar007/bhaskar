package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtons {
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
	public void radioButton()
	{
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshman");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9985401527");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("9985401527");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		*/
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshman",Keys.TAB,"9985401527",Keys.TAB,"9985401527",Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		//select radio button
		List<WebElement> buttons=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("radiobutton counts "+buttons.size());
		buttons.get(1).click();
		
		
	}
	

}
