package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingTheWindow {

	public static void main(String[] args) throws InterruptedException {
System.out.println("welcome to selenium");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://telangana.gov.in/");
		
		System.out.println("my title is"+driver.getTitle());

		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.manage().window().maximize();
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
		
		
		//get the text in alert box
		System.out.println("text in alert" +driver.switchTo().alert().getText());
		
		//open alert popbox
		driver.switchTo().alert().accept();


	}

}
