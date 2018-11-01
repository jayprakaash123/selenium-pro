package appium;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class VerticalSlider {

	public static void main(String[] args) throws IOException {
		// Details of App and ARD
       DesiredCapabilities dc=new DesiredCapabilities();
       dc.setCapability(CapabilityType.BROWSER_NAME,"");
       dc.setCapability("deviceName","LVVCBEGM6TW4NRFU");
       dc.setCapability("platformName","android");
       dc.setCapability("platformVersion","6.0");
       dc.setCapability("appPackage","com.vodqareactnative");
       dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
       //Start appium server
       Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p4723\"");
    	URL u=new URL("http://0.0.0.0:4723/wd/hub");
       //create Android Driver
    	AndroidDriver driver;
    	while(2>1)
    	{
    		try
    		{
    			driver=new AndroidDriver(u,dc);
    			break;
    		}
    		catch(Exception e)
    		{
    		}
    	} 
    	//Start Automation
    	try
    	{
    		WebDriverWait wait=new WebDriverWait(driver,20);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
        	driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Vertical swiping']")));
        	driver.findElement(By.xpath("//*[@text='Vertical swiping']")).click();
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=' Javascript']")));
        	driver.context("NATIVE_APP");
        	
        	int h=driver.manage().window().getSize().getHeight();
        	int w=driver.manage().window().getSize().getWidth();
        	// slide from bottom to top
        	int x1=(int)(w/2);
        	int y1=(int)(h*(0.9));
        	int x2=(int)(w/2);
        	int y2=(int)(h*(0.1));
        	TouchAction ta=new TouchAction(driver);
        	Duration d=Duration.of(10,ChronoUnit.SECONDS);
        	ta.press(x1,y1).waitAction(d).moveTo(x2,y2).release().perform();
        	Thread.sleep(1000);
        	
        	//slide from top to bottom
        	int x3=(int)(w/2);
        	int y3=(int)(h*(0.1));
        	int x4=(int)(w/2);
        	int y4=(int)(h*(0.9));
        	ta.press(x3, y3).waitAction(d).moveTo(x4, y4).release().perform();
        	//close App
        	driver.closeApp();
          }
    	catch(Exception ex)
       
    	   {
    		System.out.println(ex.getMessage());
    	   }
    	//Stop Appium Server
    	Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    	Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
    	
    	}

}
