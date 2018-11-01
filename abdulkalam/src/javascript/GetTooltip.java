package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTooltip {

	public static void main(String[] args) throws InterruptedException {
		// Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.xpath("//*[@title='Bootstrap Tutorial']"));
		String x=wb.getAttribute("title");
		System.out.println(x);
		//scroll to specific element
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement wb1=driver.findElement(By.xpath("//*[text()='Left Tooltip']"));
		//js.executeScript("arguments[0].scrollIntoView();",wb1);
		Thread.sleep(3000);
		//move mouse pointer to element for tooltip visibility
		WebElement wb2=driver.findElement(By.xpath("(//*[@class='tooltip'])[3]"));
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(wb2).clickAndHold().build().perform();
		Thread.sleep(2000);
		WebElement wb3=driver.findElement(By.xpath("(//*[@class='tooltip'])[3]/child::span"));
		String y=wb3.getText();
		System.out.println(y);
		ac.release().build().perform();
		driver.close();
		
		
	}

}
