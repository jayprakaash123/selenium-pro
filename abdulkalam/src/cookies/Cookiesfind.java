package cookies;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiesfind {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	int x=driver.manage().getCookies().size();
	System.out.println(x);
	driver.get("https://en.wikipedia.org/wiki/Pop-up_ad");                                                                                                              
	Thread.sleep(2000);
	int y=driver.manage().getCookies().size();
	System.out.println(y);
	Thread.sleep(2000);
	driver.close();
	
	

	}

}
