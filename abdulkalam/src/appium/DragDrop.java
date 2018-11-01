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

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragDrop {

	public static void main(String[] args) throws IOException {
		//Details of ARD and App
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
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Native View']")));
			driver.findElement(By.xpath("//*[@text='Drag & Drop']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Drop here.']")));
			WebElement we1 = driver.findElement(By.xpath("//*[@text='Drag me!']"));
			WebElement we2 = driver.findElement(By.xpath("//*[@text='Drop here.']"));
			TouchAction ta=new TouchAction(driver);
			Duration d=Duration.of(10,ChronoUnit.SECONDS);
			ta.press(we1).waitAction(d).moveTo(we2).release().perform();
			try
			{
				if(driver.findElement(By.xpath("//*[@text='Circle dropped']")).isDisplayed())
				{
					System.out.println("operation is sucessful");
				}
				else
				{
					System.out.println("operation is unsucessful");
				}
			}
			catch(Exception exc)
			{
				System.out.println(exc.getMessage());
			}
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
