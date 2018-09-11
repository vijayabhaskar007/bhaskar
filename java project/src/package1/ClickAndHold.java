package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		System.out.println("my title is" +driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
driver.switchTo().frame(0);
		
		WebElement item = driver.findElement(By.className("ui-selectable"));
		
		//All the list items
		List<WebElement> allitems = item.findElements(By.tagName("li"));
		
		Thread.sleep(5000);
		
		Actions a =new Actions(driver);
		a.clickAndHold(allitems.get(0)).moveToElement(allitems.get(6)).release().build().perform();
		
	
driver.quit();

	}

}
