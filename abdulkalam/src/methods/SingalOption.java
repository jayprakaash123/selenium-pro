package methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingalOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium2018\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.mercurytravels.co.in/");
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//WebElement e=driver.findElement(By.name("nights"));
		WebElement e= driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select s=new Select(e);
		List<WebElement>l=s.getOptions();
		System.out.println("no of items in drop down"+l.size());
		for(int i = 0;i<l.size();i++)
		{
         System.out.println(l.get(i).getText());
	}
		driver.close();

	}

}