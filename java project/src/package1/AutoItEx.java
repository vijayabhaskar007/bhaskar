package package1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItEx {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://files.fm/");
		
		//Maximize
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//Click on upload file link
		driver.findElement(By.id("uploadifive-file_upload")).click();

		Thread.sleep(4000);
		
		//Executing my autoit exe
		Runtime.getRuntime().exec("C:\\Users\\Sairam\\Desktop\\AutoIT1.exe C:\\Users\\Sairam\\Desktop\\kishor.txt");
		//Runtime.getRuntime().exec("E:\\lakshman\\auto.exe");
		System.out.println("programcomplete");

	}
	
	}

