package angularjs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAnjularjs {

	public static void main(String[] args) {
		// Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
		//launch website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://angularjs.org/");
		WebDriverWait wb=new WebDriverWait(driver,10);
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='AngularJS'])[1]")));
		driver.manage().window().maximize();
		//fill angularjs element
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		String y=driver.findElement(By.xpath("//*[@ng-model='yourName']/following-sibling::*[2]")).getText();
		if(y.contains(x))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test fail");
		}
	}

}
