package methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		//Launch site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@value='TripPlanner']")).click();
		driver.findElement(By.xpath("//*[text()='Ok']")).click();
		//get element in drop down
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.xpath("//*[@id='marketCityPair_1']/descendant::select[1]"));
		Select se=new Select(we);
		List<WebElement>l=se.getOptions();
		Thread.sleep(2000);
		System.out.println("no of element" +l.size());
		Thread.sleep(2000);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getAttribute("value"));
		}
		
		
		

	}

}
