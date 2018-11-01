package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

	public static void main(String[] args) {
		// Launch website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//*[@class='searchJob']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//highlight the element at left corner
		//js.executeScript("arguments[0].setAttribute('style','background: yellow;border-left: 5px solid red;');",wb);
		//highlight the element
		js.executeScript("arguments[0].setAttribute('style','background: yellow;border: 5px red solid ;');",wb);

	}

}
