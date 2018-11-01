package methods;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://istqbexamcertification.com");
	Thread.sleep(2000);
	ArrayList<String>a=new ArrayList<String>();
	driver.switchTo().window(a.get(2));
	
	}

}
