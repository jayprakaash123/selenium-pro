package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facrbook.com");
		System.out.println(driver.getTitle());

	}

}
