package angularjs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static void main(String[] args) throws IOException
	{
		// get input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String str=sc.nextLine();
		//create result file using extent report
		ExtentReports exr=new ExtentReports("google result.html",false);
		ExtentTest ext=exr.startTest("google title test");
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		//search word
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	    driver.findElement(By.name("q")).sendKeys(str,Keys.ENTER);
	    //check title
	    String y=driver.getTitle();
	    if(y.contains(str))
	    {
	    	File src=driver.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("pass.png");
	    	FileUtils.copyFile(src, dest);
	    	ext.log(LogStatus.PASS,"Title test passed");
	    	ext.log(LogStatus.PASS,ext.addScreenCapture("pass.png"));
	    }
	    else
	    {
	    	File src=driver.getScreenshotAs(OutputType.FILE);
	    	File dest=new File("fail.png");
	    	FileUtils.copyFile(src, dest);
	    	ext.log(LogStatus.FAIL,"title test fail");
	    	ext.log(LogStatus.FAIL,ext.addScreenCapture("fail.png"));
	    }
		//close site
	    driver.close();
	    exr.endTest(ext);
	    exr.flush();

	}

}
