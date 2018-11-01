package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchElementInGoogle {

	public static void main(String[] args) throws InterruptedException {
		// Launch Site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("india");
		Actions act=new Actions(driver);
		for(int i=0;i<10;i++)
		{
			act.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

	}

}
