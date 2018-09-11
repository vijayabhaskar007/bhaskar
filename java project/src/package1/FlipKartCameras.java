package package1;


	import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
	import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.interactions.Actions;


	public class FlipKartCameras {
		static WebDriver d;
		static XSSFSheet sheet;
		static XSSFWorkbook book;
		static FileOutputStream fos;
		static XSSFRow row;
		static XSSFCell cell;
		
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sairam\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			 d = new ChromeDriver();
			 d.manage().window().maximize();
			 d.get("https://www.flipkart.com/");
				Thread.sleep(2000);
				
				d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
				
				//write the data into xlsx
				File file=new File("E:\\lakshman\\laksh.xlsx");
				fos=new FileOutputStream(file);
				book=new XSSFWorkbook();
				sheet=book.createSheet("CameraDetails");
				FlipKartCameras fc=new FlipKartCameras();
				fc.writeHeaders(sheet);
				//move mouse to electronics
			 Actions a=new Actions(d);
			 WebElement Elec=d.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"));
			 WebElement dslr=d.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[4]/ul/li[10]/a"));
			 a.moveToElement(Elec).pause(2000).moveToElement(dslr).pause(3000).click().build().perform();
			 Thread.sleep(3000);
			 int counter=0;
			 int k=0;
			try {
				do {
							if(counter>0)
							{
								d.findElement(By.xpath("//span[text()='Next']")).click();
							}
					
							Thread.sleep(3000);
							List<WebElement> elements = d.findElements(By.xpath("//div[@class='_1HmYoV _35HD7C col-10-12']/div"));
						
							int size = elements.size();
							System.out.println(size);
							
							
							for(int i=2;i<size;i++)		
							{
								k=k+1;
								
									//Read the DSLR Camera Name
									String text = d.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C col-10-12']/div["+ i + "]//div//div/a/div[2]//div[@class='_3wU53n']")).getText();
									System.out.println("The item DSLR name is "+ text);
									
									//Price
									String price = d.findElement(By.xpath("//div[@class='_1HmYoV _35HD7C col-10-12']/div["+ i + "]//div//div/a/div[2]//div[@class='_6BWGkk']/div/div[1]")).getText();
									System.out.println("::Items price is "+ price);
									
									row=sheet.createRow(k);
									cell=row.createCell(0);
									cell.setCellType(cell.CELL_TYPE_STRING);
									cell.setCellValue(text);
									cell=row.createCell(1);
									cell.setCellType(cell.CELL_TYPE_STRING);
									cell.setCellValue(price);
							}	
							
							//counter++;
							counter=1;
				}while(d.findElement(By.xpath("//span[text()='Next']")).isEnabled());	
			
				}
			catch(Exception e)
			{
				//e.printStackTrace();
				System.out.println("Thanks.All the elements are completed...");
			}
			
		
			d.quit();

			book.write(fos);
			fos.close();
		}
		
		
		public void writeHeaders(XSSFSheet sheet) 
		{
			row=sheet.createRow(0);
			cell=row.createCell(0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue("text");
			
			cell=row.createCell(1);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue("price");
		
			
			
			
		}
		
		
		
		}
