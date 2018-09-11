package package1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class WriteAndReadExcel {
		
			static XSSFWorkbook book;
			static XSSFSheet sheet;
			public static void main(String[] args) throws IOException {
				
				//File location
				File file = new File("E:\\TestData2.xlsx");
				
				//File Output Stream
				
				
				
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(file);
				
				//workbook
				book = new XSSFWorkbook();
				sheet = book.createSheet("Details");
				
				WriteAndReadExcel ewe = new WriteAndReadExcel();
				ewe.writeExcel(2, "lakshman", 101, "Ameerpet");
				ewe.writeExcel(3, "ramu", 102, "Ameerpet1");
				
				fis.close();
				
				//before this, you are aading all the data to FOS
				book.write(fos);
				fos.close();
				

			}

			public void writeExcel(int rowno,String col1,int col2,String col3)
			{
				XSSFRow row=sheet.createRow(rowno);
				XSSFCell cell=row.createCell(0);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(col1);
				cell=row.createCell(1);
				cell.setCellType(Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue(col2);
				cell=row.createCell(2);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(col3);
				    

			}
			
		}
