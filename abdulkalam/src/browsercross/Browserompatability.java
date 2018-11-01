package browsercross;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Browserompatability {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String x=sc.nextLine();
		WebDriver driver=null;
		if(x.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(x.equals("FireFox")){
			System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
			 driver=new FirefoxDriver();	
		}

		else if(x.equals("Opera")){
			OperaOptions o =new OperaOptions();
			o.setBinary("C:\\Program Files\\Opera\\52.0.2871.99\\opera.exe");
		System.setProperty("webdriver.opera.driver","D:\\selenium2018\\operadriver.exe");
		 driver=new OperaDriver(o);
		}
		else {
			System.out.println("wrong browser");
			System.exit(0);
		}
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("8983382763");
		driver.findElement(By.id("pass")).sendKeys("jay1990@2017");
		driver.findElement(By.id("u_0_2")).click();
	}

}
