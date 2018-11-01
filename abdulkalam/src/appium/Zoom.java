package appium;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Zoom {

	public static void main(String[] args) throws IOException {
	//provide device and app detail
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","LVVCBEGM6TW4NRFU");
	dc.setCapability("platformName","android");
	dc.setCapability("platformVersion","6.0");
	dc.setCapability("appPackage","com.vodqareactnative");
	dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
	//start Appium server
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p4723\"");
	URL u=new URL("http://0.0.0.0:4723/wd/hub");
	//Create driver object
	AndroidDriver driver;
	while(2>1)
	{
		try
		{
			driver=new AndroidDriver(u,dc);
			break;
		}
		catch(Exception ex)
		{
		}
	}
	// Start Automation
      try
      {
    	WebDriverWait wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
    	driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Slider']")));
    	driver.findElement(By.xpath("//*[@text='Photo View']")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Photo Screen']")));
    	WebElement we=driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
    	
    	//zoom element
        int x=we.getLocation().getX();
    	int y=we.getLocation().getY();
    	int h=we.getSize().getHeight();
    	int w=we.getSize().getWidth();
    	System.out.println(x);
    	System.out.println(y);
    	System.out.println(h);
    	System.out.println(w);
    
    	
       TouchAction ta1=new TouchAction(driver);
        Duration dur=Duration.of(10,ChronoUnit.SECONDS);
        ta1.press((x/2)-50,(y/2)).waitAction(dur).moveTo((x/2)-250,(y/2)).release();
        TouchAction ta2=new TouchAction(driver);
        ta2.press((x/2)+50,(y/2)).waitAction(dur).moveTo((x/2)+300,(y/2)).release();
        
        MultiTouchAction ma=new MultiTouchAction(driver);
        Thread.sleep(5000);
        ma.add(ta1).add(ta2).perform();
        driver.closeApp();
    
      }
      catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
      //Stop appium server
      Runtime.getRuntime().exec("taskkill /F /IM node.exe");
      Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
