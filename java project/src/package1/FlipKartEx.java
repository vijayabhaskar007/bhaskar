package package1;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class FlipKartEx {	
		public static void main(String[] args) throws InterruptedException  {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			//wait for few seconds
			Thread.sleep(3000);
			
			//Maximize browser
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			if(driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).isDisplayed())
			{
				driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
			}
			Actions a =new Actions(driver);
			//Using Actions,electrons -->DSLR
			WebElement Elec = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
			//WebElement DSLR = driver.findElement(By.xpath("//span[text()='DSLR']"));
			
			WebElement DSLR = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[4]/ul/li[10]/a"));
			
			
			
		
			a.moveToElement(Elec).pause(3000).moveToElement(DSLR).pause(2000).click().build().perform();
			int counter=0;

			Thread.sleep(3000);
			
			try
			{
			do {
						if(counter>0)
						{
							driver.findElement(By.xpath("//span[text()='Next']")).click();
						}
				
						Thread.sleep(3000);
						List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[12]/div"));
						
						//Creating a object to the class
						
						
						
						//Size of elements
						int size = elements.size();
						
						for(int i=2;i<size;i++)		
						{
							
								//Read the DSLR Camera Name
								String text = driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='_1HmYoV _35HD7C col-10-12']/div["+i+"]//div[@class='_3wU53n']")).getText();
								System.out.println("The item DSLR name is "+ text);
								
								//Price
								String price = driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='_1HmYoV _35HD7C col-10-12']/div["+i+"]//div[@class='_1vC4OE _2rQ-NK']")).getText();
								System.out.println("::Items price is "+ price);
								
								
						}	
						
						counter++;
			}while(driver.findElement(By.xpath("//span[text()='Next']")).isEnabled());	
			}
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println("Thanks.All the elements are completed...");
			}
			
			driver.quit();
			
			}
		
		

	}
