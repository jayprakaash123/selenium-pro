package appium;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class HorizontalSlide {

	public static void main(String[] args) throws IOException
	{
		// detail of APP and ARD
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","LVVCBEGM6TW4NRFU");
		dc.setCapability("platformName","android");
		dc.setCapability("plateformVersion","6.0");
		dc.setCapability("appPackage"," com.cricbuzz.android");
		dc.setCapability("appActivity","com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");
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
	    		driver.context("NATIVE_APP");
	    		driver .findElementById("com.cricbuzz.android:id/main_content").click();
	    		int w=driver.manage().window().getSize().getWidth();
	    		int h=driver.manage().window().getSize().getHeight();
	    		TouchAction ta=new TouchAction(driver);
	    		//slide from right to left
	    		int x1=(int)(w*0.8);
	    		int y1=(int)(h/2);
	    		int x2=(int)(w*0.3);
	    		int y2=y1;
	    		for(int i=1;i<=3;i++)
	    		{
	    			Duration d=Duration.of(10,ChronoUnit.SECONDS);
	    			ta.press(x1, y1).moveTo(x2, y2).waitAction(d).release().perform();
	    		}
	    			
	    	}
	    	catch(Exception ex)
	    	{
	    		System.out.println(ex.getMessage());
	    	}
	    	

	}

}
