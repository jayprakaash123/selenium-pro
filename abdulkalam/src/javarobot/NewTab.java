package javarobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class NewTab {

	public static void main(String[] args) throws AWTException, FindFailed, InterruptedException {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.freejobalert.com/");
		driver.manage().window().maximize();
		Robot ro=new Robot();
		Actions act=new Actions(driver);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_T);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
	
		Screen sc=new Screen();
	    
	    sc.type("googletextbox.png,facebook");
	    act.sendKeys(Keys.DOWN).build().perform();
	    act.sendKeys(Keys.ENTER).build().perform();
		
		
		


	}

}
