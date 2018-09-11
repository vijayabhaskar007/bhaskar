package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropEx {

	
	
	


	public static WebDriver driver;
			
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
				
				driver=new ChromeDriver();
				driver.get("http://jqueryui.com/droppable/");
				
				//Maximize
				driver.manage().window().maximize();
				
				//Switch to frame
				driver.switchTo().frame(0);
				
				//Finding the two elements
				WebElement eletodrag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
				WebElement wheretoDrop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

				//Actions Class
				Actions a =new Actions(driver);
				a.dragAndDrop(eletodrag, wheretoDrop).build().perform();
				
				Thread.sleep(3000);
				//Navigate to slider page
				driver.navigate().to("http://jqueryui.com/slider/");
				
				Thread.sleep(5000);
				
				driver.switchTo().frame(0);
				
				//Slider the bar
				WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
				
				//Slide
				a.dragAndDropBy(slider, 300, 0).build().perform();
		}

	}
