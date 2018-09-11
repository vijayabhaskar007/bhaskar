package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheExcel {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\TestData1.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheetAt(0);
		
		int rowcnt=sheet.getLastRowNum();
		System.out.println("total no of rows"+rowcnt);
		
		int colcnt=sheet.getRow(1).getLastCellNum();
		System.out.println("total no of columns"+colcnt);
		
		for(int i=0; i<=rowcnt;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colcnt;j++)
			{
				System.out.println("row no::"+i+" and column no::"+j+" and celldatais"+row.getCell(j).toString());
			}
		}
			

	}

}
