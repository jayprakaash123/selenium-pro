package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlightelement {

	public static void main(String[] args) throws InterruptedException {
		// Launch Website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//*[@class='overview']/li[1]"));
		Thread.sleep(1000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].style.border='5px dotted red';",wb);

	}

}
