package package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("welcome to selenium");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		
		System.out.println("my title is"+driver.getTitle());

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		//first enter the frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//enter the text field
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("lakshman");
		
		//close the frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		
		//screenshot of jquery
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".//src//jquerypic.png"));
		
		
	}

}
