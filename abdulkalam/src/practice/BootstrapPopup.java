package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapPopup {

	public static void main(String[] args) {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Cars']")));
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		WebElement f1=driver.findElement(By.xpath("//*[@id='authiframe']"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//*[@placeholder='Enter Mobile Number']")).sendKeys("9579594531");

	}

}
