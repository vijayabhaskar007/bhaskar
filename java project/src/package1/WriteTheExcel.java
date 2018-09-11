package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTheExcel {
	public static XSSFSheet sheet;
	
	public static XSSFWorkbook book;
	public static FileOutputStream fos;
	
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\TestData3.xlsx");
		
		fos=new FileOutputStream(file);
	book =new XSSFWorkbook();
		sheet = book.createSheet("Details");
		
		WriteTheExcel wte=new WriteTheExcel();
		
			wte.writedata(0, "lakshman", 28, "gty");
			wte.writedata(1, "ramu", 29, "atp");
			wte.writedata(2, "bhaskar", 27, "gtl");
			wte.writedata(3, "kishor", 26, "tdp");
			wte.writedata(4, "sreekumar", 25, "pune");
			
			book.write(fos);
			fos.close();
	

	}
	public void  writedata(int rowno,String col1,int col2,String col3)
	{
		XSSFRow row=sheet.createRow(rowno);
		XSSFCell col=row.createCell(0);
		col.setCellType(col.CELL_TYPE_STRING);
		col.setCellValue(col1);
		col=row.createCell(1);
		col.setCellType(col.CELL_TYPE_NUMERIC);
		col.setCellValue(col2);
		col=row.createCell(2);
		col.setCellType(col.CELL_TYPE_STRING);
		col.setCellValue(col3);
	}
	

}
