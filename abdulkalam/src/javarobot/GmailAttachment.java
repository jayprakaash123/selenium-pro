package javarobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailAttachment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Launch website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("jai.jaiviru.choudhary101@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/child::content")).click();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("9579594531");
		//Thread.sleep(3000);
        WebDriverWait wd=new WebDriverWait(driver,10);
        //wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='CwaK9']")));
        //wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='CwaK9']")));
        wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='CwaK9']")));  
		driver.findElement(By.xpath("//*[@id='passwordNext']/descendant::content")).click();
        //click on compose
		Thread.sleep(3000);
		//wd.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@style,'user-select')])[3]")));
        driver.findElement(By.xpath("(//*[contains(@style,'user-select')])[3]")).click();
        //click on to
        driver.findElement(By.xpath("//*[@name='to']")).sendKeys("jayprakash.choudhary@ymail.com");
      //click on subject
        driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("gmail test");
        //Type message in message area 
        driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hello jay,\n how are u,\n this is test mssg");
        //click on attach icon
        wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-label='Attach files']/descendant::div[3]")));
		driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::div[3]")).click();
		//Attach file(java robot)
		StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\lighthouse.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot ro=new Robot();
		//paste data from clipboard to attach file
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=':pa']")));
		driver.findElement(By.xpath("//*[@id=':pa']")).click();
		Thread.sleep(2000);
		String y=driver.findElement(By.xpath("//*[@class='aT']/child::span")).getText();
		System.out.println(y);
		
		

	}

}
