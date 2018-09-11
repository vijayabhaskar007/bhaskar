package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadTheExcel {

	
	@Test
	public void readExcel() throws IOException
	{
		File file=new File("E:\\lakshman\\laksh.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("CameraDetails");
		
		int rowNum=sheet.getLastRowNum();
System.out.println("total no of rows"+rowNum);
		
		int colcnt=sheet.getRow(1).getLastCellNum();
		System.out.println("total no of columns"+colcnt);
		
		for(int i=0; i<=rowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colcnt;j++)
			{
				System.out.println("row no::"+i+" and column no::"+j+" and celldatais"+row.getCell(j).toString());
			}
		}

	}

}
