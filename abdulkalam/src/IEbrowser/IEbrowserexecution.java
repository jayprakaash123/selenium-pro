package IEbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowserexecution {

	public static void main(String[] args) {
		System.getProperty("webdriver.ie.driver","D:\\ie\\iedriverServer.exe");
       InternetExplorerDriver driver=new InternetExplorerDriver();
        driver.get("http://www.facebook.com");
        

	}

}
