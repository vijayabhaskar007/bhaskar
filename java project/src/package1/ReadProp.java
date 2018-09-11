package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		
		
		File file=new File("./src/Ev.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties p=new Properties();
		p.load(fis);
		
		//Read the file
				String strURL = p.getProperty("URL");
				System.out.println("My URL is "+ strURL);

				WebDriver driver=new ChromeDriver();
				driver.get(strURL);

				
				
		//Maximize
		//driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


	}

}
