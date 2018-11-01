package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		// Launch Site
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("window.my");
		co.addArguments("--disable-popup-blocking");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window id:"+parentwindow);
		System.out.println("title of parent window"+driver.getTitle());
	 
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("all windows id:"+allwindows);
		int count=allwindows.size();
		System.out.println("Total number of windows:"+count);
		Thread.sleep(2000);
		ArrayList<String> win=new ArrayList<>(allwindows);
		driver.switchTo().window(win.get(2));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@alt='Virtusa Corporation']")).click();
		System.out.println("title of window:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(win.get(3));
		System.out.println("title of window:"+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Jobs']")).click();
		driver.findElement(By.xpath("//*[@title='Jobs in Delhi']")).click();
		
		
		
		
	}

}
