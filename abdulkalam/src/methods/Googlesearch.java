package methods;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='sbib_b']/div/input[1]")).sendKeys("india");
		List<WebElement>li=driver.findElements(By.xpath("//*[@role='presentation']/div/div[2]"));
		System.out.println("no of items===="+li.size());
		for(int i=0;i<li.size();i++) 
		{
			System.out.println(li.get(i).getText());
			Thread.sleep(2000);
			//get screenshot
			//File src=driver.getScreenshotAs(OutputType.FILE);
			//File dest=new File("D:\\seleniumscreenshot.png");
			//FileUtils.copyFile(src, dest);
			
			if(li.get(i).getText().contains("indian bank")) 
			{
			li.get(i).click();
			break;
			}

	}

}
}