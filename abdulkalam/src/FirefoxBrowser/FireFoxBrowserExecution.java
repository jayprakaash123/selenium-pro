package FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class FireFoxBrowserExecution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("koi faryad");
        Thread.sleep(3000);
       WebElement e1= driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
       e1.click();
        

	}

}
