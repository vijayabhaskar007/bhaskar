package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
			
			d.manage().window().maximize();
			d.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=693abd71b0148e281a4899a70c90bc21");
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) d;
					
	       String DomainName = js.executeScript("return document.domain;").toString();			
	       System.out.println("Domain name of the site = "+DomainName);


	       //Return the title of a page
	       String title = js.executeScript("return document.title;").toString();			
	       System.out.println("Title name of the site = "+title);

	      js.executeScript("window.scrollBy(0,600)");

			Thread.sleep(3000);

			WebElement ele = (WebElement) js.executeScript("return document.getElementsByName('firstName')[0];");
			ele.sendKeys("Krishna");

			//Get the form and fill
			d.navigate().to("http://newtours.demoaut.com/mercurysignon.php");

			WebElement ele2 = (WebElement) js.executeScript("return document.forms['register'].elements['userName'];");
			ele2.sendKeys("Krishna");

			d.navigate().to("http://jqueryui.com/autocomplete/");

			Thread.sleep(3000);

			d.switchTo().frame(0);

			WebElement ele1 = (WebElement) js.executeScript("return document.getElementById('tags');");
			ele1.sendKeys("Krishna");


	}

}
