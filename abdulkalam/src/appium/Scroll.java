package appium;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Scroll {

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
	    	//Scroll the Element
	    	try
	    	{
	    		WebDriverWait wait=new WebDriverWait(driver,20);
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
	        	driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Vertical swiping']")));
	        	driver.findElement(By.xpath("//*[@text='Vertical swiping']")).click();
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=' Javascript']")));
	        	driver.context("NATIVE_APP");
	        	driver.findElementByAndroidUIAutomator("new Scrollable(new UiSelector()).scrollIntoView(text(\"Appium\"));");
	    	}
	    	catch(Exception ex)
	    	{
            System.out.println(ex.getMessage());
	    	}

	}

}
