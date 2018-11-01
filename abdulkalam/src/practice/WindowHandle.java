package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) {
		// Launch website
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("window.my");
		co.addArguments("--disable-popup-blocking");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//String parentwindow=driver.getWindowHandle();
		//System.out.println("parent window id:"+driver.getWindowHandle());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Set<String> childwindows=driver.getWindowHandles();
		System.out.println("childwindow id:"+childwindows);
		
        driver.findElement(By.xpath("//*[text()='Jobs']")).click();
		
		
		

	}

}
