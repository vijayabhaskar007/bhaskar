package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {
	public static WebDriver driver;

	public static void main(String[] args) {
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
		

		Actions a= new Actions(driver);
		
		WebElement elect=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
		
		WebElement dslr=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[4]/ul/li[10]/a"));
		
		a.moveToElement(elect).pause(2000).moveToElement(dslr).pause(2000).click().build().perform();

		
		
		
		/*//display all links
		List<WebElement> li=driver.findElements(By.xpath("//a[@class=\"_31qSD5\"]"));
		for(int i=1; i<li.size(); i++)
		{
System.out.println("all links "+li.get(i).getText());
	}*/
		
//List<WebElement> li=driver.findElements(By.xpath("//a[@class='_2Xp0TH']"));
		
		//System.out.println("all links "+li.size());

//a[@class=\"_31qSD5\"]
		
//List<WebElement> li=driver.findElements(By.xpath("//a"));
		
		
		//System.out.println("all links "+li.size());
		
		//display all links
		List<WebElement> li=driver.findElements(By.xpath("//a[@class='_2Xp0TH']"));
		for(int i=1; i<li.size(); i++)
		{
System.out.println("all links "+li.get(i).getText());
	}


	}

}
