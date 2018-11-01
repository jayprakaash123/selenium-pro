package methods;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) throws InterruptedException {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='android-button']/a")).click();
		Thread.sleep(2000);
	
		ArrayList<String>ar=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("window handle are:\n");
		Thread.sleep(2000);
		for(int i=0;i<ar.size();i++)
		{
		
	System.out.println(ar.get(i)+"\n");
	}
		driver.switchTo().window(ar.get(2));
		Thread.sleep(2000);
		driver.switchTo().window(ar.get(1));
		}
}
