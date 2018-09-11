package package1;

/*import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileEx {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://files.fm/");
			
		Thread.sleep(5000);

		System.out.println("my title is "+ driver.getTitle());
		
		driver.manage().window().maximize();
		
		//click on the file link
		
		driver.findElement(By.id("uploadifive-file_upload")).click();
		
		//select the file path
		
		File file=new File("E:\\lakshman\\ramu.txt");
		System.out.println("path is "+file.getAbsolutePath());
		
		StringSelection str=new StringSelection(file.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		//paste the path
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//press enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
driver.close();

	}

}*/



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileEx {

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
		
		/*//File Path
		File file = new File("E:\\TestData\\lakshman.txt");
		
		System.out.println("Path is "+ file.getAbsolutePath());
		
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
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		Runtime.getRuntime().exec("C:\\Users\\Sairam\\Desktop\\daya.exe");
	}

}

