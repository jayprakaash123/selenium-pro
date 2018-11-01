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

public class VerticalSwip2 {

	public static void main(String[] args) throws IOException {
		// Details of App and ARD
		 DesiredCapabilities dc=new DesiredCapabilities();
	       dc.setCapability(CapabilityType.BROWSER_NAME,"");
	       dc.setCapability("deviceName","LVVCBEGM6TW4NRFU");
	       dc.setCapability("platformName","android");
	       dc.setCapability("platformVersion","6.0");
	       dc.setCapability("appPackage","com.vodqareactnative");
	       dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
	       //Start Appium server
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
	    	//start automation
	    	try
	    	{
	    		WebDriverWait wait=new WebDriverWait(driver,20);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
	        	driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
	        	while(2>1)
	        	{
	        		try
	        		{
	        			driver.findElement(By.xpath("//*[@text='Web View']")).click();
	        			break;
	        		}
	        		catch(Exception e)
	        		{
	        		TouchAction ta=new TouchAction(driver);
	        		driver.context("NATIVE_APP");
	        		int h=driver.manage().window().getSize().getHeight();
	        		int w=driver.manage().window().getSize().getWidth();
	        		int x1=(int)(w/2);
	        		int x2=(int)(w/2);
	        		int y1=(int)(h*(0.8));
	        		int y2=(int)(h*(0.2));
	        		Duration d=Duration.of(10,ChronoUnit.SECONDS);
	        		ta.press(x1, x2).waitAction(d).moveTo(x2, y2).release().perform();
	        		}
	        	} 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='False Advertising for College Is Pretty Much the Norm']")));
	       String x=driver.findElement(By.xpath("//*[@content-desc='5.']")).getText();
	       System.out.println(x);
	        	
	    	}
	    	catch(Exception ex) 
	    	{
	    		System.out.println(ex.getMessage());
	    	}
	    	
	    	

	}

}
