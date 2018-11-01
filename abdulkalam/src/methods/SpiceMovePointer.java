package methods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceMovePointer {

	public static void main(String[] args) throws InterruptedException {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		  driver.get("http://www.spicejet.com");
		  driver.manage().window().maximize();
		  Actions act=new Actions(driver);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  WebElement wb=driver.findElement(By.xpath("(//*[@id='highlight-addons'])[1]"));
		  act.moveToElement(wb).perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//*[text()='Dubai Visa Services'])[1]")).click();
	
		

	}

}
