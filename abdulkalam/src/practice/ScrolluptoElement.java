package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolluptoElement {

	public static void main(String[] args) throws InterruptedException {
		// Launch the website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.freejobalert.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread .sleep(2000);
		WebElement wb=driver.findElement(By.xpath("//*[text()='ADMIT CARDS']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",wb);
		Thread.sleep(2000);
		System.out.println(wb.getText());
		Thread.sleep(3000);
		WebElement wb2=driver.findElement(By.xpath("//*[text()='ONLINE APPLICATION FORMS']"));
		js.executeScript("arguments[0].scrollIntoView(true);",wb2);
		System.out.println(wb2.getText());
		driver.close();
		

	}

}
