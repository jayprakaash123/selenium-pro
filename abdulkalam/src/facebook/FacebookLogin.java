package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("8983382763");
		driver.findElement(By.id("pass")).sendKeys("jay1990@2017");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("findFriendsNav")).click();
		driver.findElement(By.className("linkWrap noCount")).click();
		driver.findElement(By.className("linkWrap noCount")).click();
	}

}
