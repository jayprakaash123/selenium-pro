package cookies;

import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesLoad {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://en.wikipedia.org/wiki/Pop-up_ad");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	if(driver.manage().getCookies().size()!=0)
	{
		System.out.println("cookies were load");
	}
	else
	{
		System.out.println("cookies not load");
	}
	driver.close();
	}

	}


