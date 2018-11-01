package methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//find multiple link in web page and click on link 3
	     List<WebElement>l=driver.findElements(By.tagName("a"));
		//a represent link in web page
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		l.get(3).click();
		String x=driver.findElement(By.xpath("(//img)[6]")).getAttribute("src");
		System.out.println(x);
		driver.close();
	}

}