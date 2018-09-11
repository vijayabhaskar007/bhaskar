package package1;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.oracle.tools.packager.Platform;

public class CrossBroswer {

	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		//CrossBroswer browser1=new CrossBroswer();
		//browser1.UpperCase();
	String browser1="chrome";
	
		if(browser1.toUpperCase().contains("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

			driver=new ChromeDriver();

		}
		else if(browser1.toUpperCase().contains("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sairam\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");	
		
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("marionette", false);
			WebDriver webDriver = new FirefoxDriver(options);

		}
		
		else if(browser1.toUpperCase().contains("IRE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sairam\\Downloads\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");	
		
			driver=new InternetExplorerDriver();
		}
		
		driver.get("http://wwww.telangana.gov.in/");
		Thread.sleep(5000);

	}


	//private String UpperCase() {
		//System.out.println("displays uppercase");
		//return null;
	//}


	

}*/



/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBroswer {

	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		CrossBroswer browser1=new CrossBroswer();
		browser1.UpperCase();
		
		if(( browser1).UpperCase().contains("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

			driver=new ChromeDriver();

		}
		else if(( browser1).UpperCase().contains("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sairam\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");	
		
			driver=new FirefoxDriver();
		}
		
		else if(browser1.UpperCase().contains("IRE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sairam\\Downloads\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");	
		
			driver=new InternetExplorerDriver();
		}
		
		driver.get("http://wwww.telangana.gov.in/");
		Thread.sleep(5000);

	}


	private String UpperCase() {
		System.out.println("displays uppercase");
		return null;
	}


	

}*/



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBroswer {
	 //public static WebDriver driver ;
	//public static WebDriver driver1 ;
	public static void main(String[] args) throws InterruptedException {
		//chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demoaut.com");
			
		Thread.sleep(5000);
		//firefox
		
		System.setProperty("webdriver.gecko.driver", "D:\\softwares\\eclipse\\geckodriver.exe");
		 
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver1 = new FirefoxDriver(options);
	

		driver1.get("https://infinity.icicibank.com/corp/Login.jsp");
		

		
		Thread.sleep(5000);
		//internet explore
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/login/show.do");


		
		
		

	}

}
