package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.freejobalert.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		// get text of an element
		String s=driver.findElement(By.xpath("(//*[@class='BlockHeader-text'])[2]")).getText();
		System.out.println(s);
		// get title of active browser
		String x=driver.getTitle();
		System.out.println(x);
		//get source code of active page
		String a=driver.getPageSource();
		System.out.println(a);
		// get style property of an element
		String b=driver.findElement(By.xpath("//*[@alt='FreeJobAlert Logo']")).getCssValue("text-align");
		System.out.println(b);
		
		
				

	}

}
