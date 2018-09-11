package package1;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		/*//delete a file
		File file=new File("E:\\TestData\\lakshman.txt");
		
		System.out.println("my path is"+file.getAbsolutePath());
		
		file.delete();*/
		
		
		//delete file directory
		File file=new File("E:\\TestData3.xlsx");
		
			for(File deleteMe:file.listFiles())
			{
				deleteMe.delete();
			}

		

}
}

