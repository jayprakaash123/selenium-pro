package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CacheWithoutjavascript {

	public static void main(String[] args) throws InterruptedException {
		//Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("kalam");
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		int c=0;
		while(2>1)
		{
			String x=driver.findElement(By.name("q")).getAttribute("value");
			Thread.sleep(3000);
			if(x.equals("kalamandir"))
			{
				act.sendKeys(Keys.ENTER).build().perform();
				break;
			}
			else
			{
				act.sendKeys(Keys.DOWN).build().perform();
				c=c+1;
				if(c>10)
				{
					act.sendKeys(Keys.ESCAPE).build().perform();
					break;
					
				}
			}
		}

	}

}
