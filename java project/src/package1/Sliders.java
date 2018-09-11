package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sliders {

	public static void main(String[] args) throws InterruptedException {
System.out.println("welcome to selenium");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		System.out.println("my title is"+driver.getTitle());

		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("watches");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys(Keys.ENTER);
		
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
