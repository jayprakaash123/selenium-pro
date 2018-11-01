package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DivDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		//Launch WebSite
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//*[@class='search'])[1]"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.click(e1).build().perform();
		
		Thread.sleep(3000);
		
		//collect all Iteam in DropDown
		List<WebElement> l=driver.findElements(By.xpath("//*[@class='menu transition visible']/div"));
		Thread.sleep(5000);
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			String str=l.get(i).getAttribute("data-value");
			System.out.println(str);
		
		}
}
}