package appiumframework;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Naukri
{
	public AndroidDriver driver;
	@Test(priority=0)
	public void launchapp() throws Exception
	{
		//Details of ARD and app 
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","LVVCBEGM6TW4NRFU");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","6.0");
		dc.setCapability("appPackage","naukriApp.appModules.login");
		dc.setCapability("appActivity","com.naukri.dashboard.view.NaukriSplashScreen");
		
		//stsrt appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \" appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		
		//create driver object to launch app
		AndroidDriver driver;
		while(true)
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
			
	}
	@Test(priority=1)
	public void loginapp()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOGIN']")));
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@text='LOGIN']")).click();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	@Test(priority=2)
	public void closeserver() throws Exception
	{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}
	
	
		
	}


