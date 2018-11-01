package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander1 {

	public static void main(String[] args) throws InterruptedException {
		// Launch Site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("window.my");
		co.addArguments("--disable-popup-blocking");
	    ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Onward Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='rb-monthTable first last'])[2]/tbody/tr[5]/td[5]")).click();
		
	

	}

}
