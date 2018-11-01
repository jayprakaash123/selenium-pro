package way2sms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2sms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("9579594531");
		driver.findElement(By.name("password")).sendKeys("1122334455");
		driver.findElement(By.id("loginBTN")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		

	}

}
