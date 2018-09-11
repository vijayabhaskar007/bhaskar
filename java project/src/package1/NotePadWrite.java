package package1;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotePadWrite {

	
	

		public static void main(String[] args) throws IOException, AWTException, InterruptedException {
			
			//open notepad
			Runtime.getRuntime().exec("notepad.exe");
			
			Thread.sleep(2000);
			
			//COpy data into clipboard
			StringSelection strsel = new StringSelection("welcome to notepad");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel, null);

			Thread.sleep(2000);
			
			//Paste my data
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			Thread.sleep(2000);
			
			//COpy data into clipboard
			StringSelection strsel1 = new StringSelection("E:\\lakshman.txt");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel1, null);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_S);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_S);
			
			Thread.sleep(3000);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_F4);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_F4);
		}

	}
