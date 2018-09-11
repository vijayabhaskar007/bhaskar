package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable {

public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
	}
	
	@AfterMethod
	public void CloseApp()
	{
		//Close my application
		driver.quit();
	}
	
	@Test
	public void readdata()
	{
		List<WebElement> Allrows = driver.findElements(By.xpath("//table[@id='GoTProfile']/tbody/tr"));
		System.out.println("Total no of rows are "+ Allrows.size());
		
		List<WebElement> Allcols = driver.findElements(By.xpath("//table[@id='GoTProfile']/tbody/tr[1]/td"));
		System.out.println("Total no of columns are "+ Allcols.size());
		String data;
		
		//Reading the data 
		for(int i=1;i<=Allrows.size();i++)
		{
			for(int j=1;j<=Allcols.size();j++)
			{
				data=driver.findElement(By.xpath("//table[@id='GoTProfile']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Row: "+ i +" and Column: "+j+" is"+ data);
			}
		}
		


	}

}
