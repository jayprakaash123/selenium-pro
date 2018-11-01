package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebpage {

	public static void main(String[] args) throws InterruptedException {
		//Launch website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//scroll top to bottom
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		//scroll bottom to top
		js.executeAsyncScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//scroll to specific item
		WebElement ele=driver.findElement(By.xpath("(//*[contains(@class,'dropdown selection multiple')])[1]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",ele);
		

	}

}
