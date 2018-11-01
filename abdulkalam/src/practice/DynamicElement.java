package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicElement {

	public static void main(String[] args) {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.freejobalert.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='  Notifications ']")));
		String x=driver.findElement(By.xpath("//*[@class='Header']/a/div/marquee")).getText();
		System.out.println(x);
		driver.navigate().to("https://www.sarkariexam.com/");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Government Jobs'])[1]")));
		String y=driver.findElement(By.xpath("(//*[@behavior='alternate'])[2]/a[2]")).getText();
		System.out.println(y);
		driver.navigate().back();

	}

}
