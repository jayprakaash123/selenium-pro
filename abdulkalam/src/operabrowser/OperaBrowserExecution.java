package operabrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaBrowserExecution {

	private static final String OperaOption = null;
	private static Object Operaoption;

	public static void main(String[] args) throws InterruptedException {
		OperaOptions o =new OperaOptions();
		o.setBinary("C:\\Program Files\\Opera\\52.0.2871.99\\opera.exe");
	System.setProperty("webdriver.opera.driver","D:\\selenium2018\\operadriver.exe");
	OperaDriver driver=new OperaDriver(o);
     driver.get("https://www.facebook.com");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.close();
	}

}
