package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getscreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\selenium2018\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\seleniumscreenshot.png");
		FileUtils.copyFile(src,dest);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
