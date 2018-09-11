package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDownAndKeysUp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("my title is" +driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebElement e=driver.findElement(By.id("lst-ib"));
		
		Actions a=new Actions(driver);
		a.sendKeys(e, "lakshman").build().perform();
		
		Thread.sleep(3000);
		
		a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("lst-ib"));
		e1.click();
		Thread.sleep(3000);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		
		

	}

}
