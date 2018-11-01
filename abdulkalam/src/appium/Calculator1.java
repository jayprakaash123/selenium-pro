package appium;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator1 {

	public static void main(String[] args) throws IOException {
		// provide device and App details
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","LVVCBEGM6TW4NRFU");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","6.0");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		// Start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL ("http://0.0.0.0:4723/wd/hub");
		//create driver object to launch app in device
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
		//locate element and operate
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='2']")).click();
		driver.findElement(By.xpath("//*[@text='6']")).click();
		driver.findElement(By.xpath("//*[@text='9']")).click();
		driver.findElement(By.xpath("//*[@text='8']")).click();
		driver.findElement(By.xpath("//*[@text='+']")).click();
		driver.findElement(By.xpath("//*[@text='7']")).click();
		driver.findElement(By.xpath("//*[@text='9']")).click();
		driver.findElement(By.xpath("//*[@text='5']")).click();
		driver.findElement(By.xpath("//*[@text='8']")).click();
		driver.findElement(By.xpath("//*[@text='=']")).click();
		//get result
		String x=driver.findElement(By.xpath("//*[@resource-id='com.android.calculator2:id/formula']")).getText();
		System.out.println(x);
		driver.closeApp();
			
		//stop appium server
		//Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		//Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");


	}

}
