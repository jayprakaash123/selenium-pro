package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("jay");
		driver.findElement(By.xpath("//*[@aria-label='Surname']")).sendKeys("choudhary");
		driver.findElement(By.xpath("(//*[@aria-required='1'])[3]")).sendKeys("9579594531");
		driver.findElement(By.xpath("//*[@data-type='password']")).sendKeys("8271802023");
	    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	    
	     Select s= new Select(driver.findElement(By.id("day")));
		 s.selectByValue("6");
	
	    Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByIndex(3);
		
		Select s2=new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("(//*[@name='sex'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		//driver.close();
	}

}
