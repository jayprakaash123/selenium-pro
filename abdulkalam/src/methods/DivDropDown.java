package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DivDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*WebElement e1=driver.findElement(By.xpath("(//*[@class='ui dropdown'])[1]"));
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.click(e1).build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=3;i++)
		{
        a.sendKeys(Keys.DOWN).perform();
		//a.sendKeys(Keys.DOWN).perform();
		
		Thread.sleep(2000);
	    }
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);*/
		
		WebElement e1=driver.findElement(By.xpath("(//*[@class='ui fluid selection dropdown'])[1]"));
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.click(e1).build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=6;i++)
		{
        a.sendKeys(Keys.DOWN).perform();
		
		Thread.sleep(2000);
	    }
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
	}		
				
}













