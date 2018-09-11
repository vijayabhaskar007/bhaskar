package package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"WebPartWPQ4\"]/div[1]/div/a[9]")).click();
		
		//Get the alert text
		String alertext = driver.switchTo().alert().getText();
		
		System.out.println("ALert text is "+ alertext);
		
		//ok button
		driver.switchTo().alert().accept();
		
		//windows
		String mainWindow = driver.getWindowHandle();
		System.out.println("Parent window handle is "+ mainWindow);
		List<String> Allwindows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("All windows size is "+ Allwindows.size());
	
		
		//Switch to window and display the title
		for(int i=0;i<Allwindows.size();i++)
		{
			driver.switchTo().window(Allwindows.get(i));
			Thread.sleep(2000);
			String title = driver.getTitle();
			if(title.equalsIgnoreCase("@Gov.in"))
			{
				enterData();
			}
	
		}

	

	
	}

	private static void enterData() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("lakshman");
		
	}

}
