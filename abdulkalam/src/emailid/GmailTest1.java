package emailid;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.yahoo.com");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("jayprakash.choudhary@ymail.com");
	driver.findElement(By.name("signin")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("9579594531jay");
	driver.findElement(By.name("verifyPassword")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[text()='Mail'])[3]")).click();
	

	}

	
}
