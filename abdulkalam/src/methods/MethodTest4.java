package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class MethodTest4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.name("identifier")).sendKeys("jai.jaiviruchoudhary101@gmail.com");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("9579594531");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@aria-label='Mail']")).click();
	int c=driver.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr")).size();
	System.out.println(c);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[4]/td[2]/div")).click();
	driver.findElement(By.xpath("(//*[@role='button'])[8]/child::span")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Sign out")).click();
	Thread.sleep(2000);
	driver.close();
	}

}
