package sikulix;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test1 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	    Screen sc=new Screen();
        Thread.sleep(2000);
        sc.click("window.png");
        Thread.sleep(1000);
        sc.click("search.png");
        sc.type("desktop");
        sc.click("desktop.png");
        sc.doubleClick("computer1.png");
        sc.click("close.png");
	}

}
