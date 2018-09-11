package testNG;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteTheDataInExcel {
	public File excel;
	public FileOutputStream fos;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell col;

	

	
	

	
	@Test
	public void writeData() throws IOException
	{      
		WriteExcel(int , String , String , int );
		 excel=new File("E:\\lakshman\\lakshman.xlsx");
		fos=new FileOutputStream(excel);
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("detail");
		WriteTheDataInExcel ex=new WriteTheDataInExcel();
		
		
		ex.WriteExcel(1, "lakshman", "gty", 10);
		ex.WriteExcel(2, "ramu", "gtl", 20);
		ex.WriteExcel(3, "kishor", "atp", 30);
		ex.WriteExcel(4, "bhaskar", "kdp", 40);
		
		
		wb.write(fos);
		fos.close();
		
		
		
		
		
		
		
		
	}
	
	public void WriteExcel(int rowno, String col1, String col2, int col3) {
		XSSFRow row=sheet.createRow(rowno);
		XSSFCell col=row.createCell(0);

		col.setCellType(col.CELL_TYPE_STRING);
		col.setCellValue(col1);
		col=row.createCell(1);
		col.setCellType(col.CELL_TYPE_STRING);
		col.setCellValue(col2);
		col.setCellType(col.CELL_TYPE_NUMERIC);
		col.setCellValue(col3);
	}

}
