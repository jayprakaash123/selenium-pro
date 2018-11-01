package javascript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CacheWithJava {

	public static void main(String[] args) throws InterruptedException {
		//launch website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("india");
		//get option visible in cache
		List<WebElement> l=driver.findElements(By.xpath("//*[@role='option']/div[2]"));
		System.out.println(l.size());
		Thread.sleep(3000);
		/*for(int i=0;i<l.size();i++)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("var v=arguments[0].textContent;window.alert(v);",l.get(i));
			String x=driver.switchTo().alert().getText();
			Thread.sleep(1000);
			driver.switchTo().alert().dismiss();
			System.out.println(x);
			if(x.equals("taj mahal photo"))
			{
				driver.findElement(By.name("q")).clear();
				driver.findElement(By.name("q")).sendKeys(x);
			
				break;
				
			}
			
		}*/
		
		

	}

}
