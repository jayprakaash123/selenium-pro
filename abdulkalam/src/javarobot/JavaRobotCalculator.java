package javarobot;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class JavaRobotCalculator {

public static void main(String[] args) throws IOException, InterruptedException, AWTException, HeadlessException, UnsupportedFlavorException {
		// launch calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(2000);  //visibility purpose
		
		//enter first input
		StringSelection x=new StringSelection("654");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		//click +
		ro.keyPress(KeyEvent.VK_ADD);
		ro.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(2000);
		
		//enter second input
		StringSelection y=new StringSelection("987");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		//click =
		ro.keyPress(KeyEvent.VK_EQUALS);
		ro.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(2000);
		//get output
		ro.keyPress(KeyEvent.VK_CONTEXT_MENU);//right click
		ro.keyRelease(KeyEvent.VK_CONTEXT_MENU);//
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_DOWN);//goto copy bar for copy the result
		ro.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_ENTER);//click the copy bar
		ro.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(z);
		
		//close calculator
		ro.keyPress(KeyEvent.VK_ALT);
		ro.keyPress(KeyEvent.VK_F4);
		ro.keyRelease(KeyEvent.VK_F4);
		ro.keyRelease(KeyEvent.VK_ALT);
		
		
		
		
		
		

	}

}
