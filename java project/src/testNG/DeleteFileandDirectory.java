package testNG;

import java.io.File;

import org.testng.annotations.Test;

public class DeleteFileandDirectory {

	@Test
	public void deleteFile()
	{
		File file=new File("E:\\lakshman\\lakshman.xlsx");
		file.delete();
		
	}
	
	@Test
	public void deleteFileDirectory()
	{
		File file=new File("E:\\TestData");
		if(file.isDirectory())
		{
			for(File file1:file.listFiles())
			{
				file1.delete();
			}
		}
		
	}
}
