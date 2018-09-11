package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {

public WebDriver driver;
	
	/*@BeforeMethod
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
  */
	@Test(priority=1)
	@Parameters({"browser","url"})
	public void parameter(String browser, String url)
	{
		
		System.out.println("running browser is"+browser);
		if(browser.equals("chrome"))
		{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
	//	driver.get("https://login.yahoo.com/");
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\geckodriver-v0.21.0-arm7hf\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\geckodriver-v0.21.0-arm7hf\\geckodriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);

	}
	
	@Test(priority=2)
	@Parameters({"username","password"})
	public void login(String username,String password) throws InterruptedException
	{
		System.out.println("username:" +username+ "and password" +password);
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("username");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("password");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
