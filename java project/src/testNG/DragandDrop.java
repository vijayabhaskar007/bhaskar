package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {

public WebDriver driver;
	
	@BeforeMethod
	public void LaunchApp()
	{
		//Launch application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
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
	@Test
	public void draganddrop() throws InterruptedException
	{
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Finding the two elements
		WebElement eletodrag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement wheretoDrop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		//Actions Class
		Actions a =new Actions(driver);
		a.dragAndDrop(eletodrag, wheretoDrop).build().perform();
		
		Thread.sleep(3000);
		/*//Navigate to slider page
		driver.navigate().to("http://jqueryui.com/slider/");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		//Slider the bar
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		//Slide
		a.dragAndDropBy(slider, 300, 0).build().perform();
*/
	}

}
