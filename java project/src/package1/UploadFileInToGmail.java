package package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileInToGmail {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		File file=new File("./src/bh.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties p=new Properties();
		p.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		String strURL = p.getProperty("url");
		System.out.println("My URL is "+ strURL);

		WebDriver driver=new ChromeDriver();
		driver.get(strURL);
		
		driver.manage().window().maximize();
		

		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String strURL1 = p.getProperty("usern");
		System.out.println("My URL is "+ strURL1);
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(strURL1);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
    
		//driver.manage().deleteAllCookies();
String strURL2 = p.getProperty("passw");
		System.out.println("My URL is "+ strURL2);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(strURL2);
		

		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\":ir\"]/div/div")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\":pu\"]")).click();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		//File Path
		File file1 = new File("E:\\TestData\\lakshman.txt");
		
		System.out.println("Path is "+ file1.getAbsolutePath());
		
		StringSelection str = new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//Paste our path
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press the enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

//Executing my autoit exe
		//Runtime.getRuntime().exec("E:\\lakshman\\AutoIt.exe C:\\Users\\Sairam\\Desktop\\kishor.txt");


Thread.sleep(3000);
	}

}
