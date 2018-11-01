package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTable {

	public static void main(String[] args)throws Exception
	{
		// 
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='identifier']")));
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("jai.jaiviru.choudhary101@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("9579594531");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@role='navigation'])[2]/a[2]")));
		driver.findElement(By.xpath("(//*[@role='navigation'])[2]/a[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Inbox']")));
		
		//pagenation
		int norm=0;//number of required mail
		while(2>1)
		{
			List<WebElement>rowmail=driver.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr"));
			int noam=rowmail.size();//number of all mail
			System.out.println(noam);
			for(int i=1;i<=noam;i++)
			{
				List<WebElement>rl=driver.findElements(By.tagName("td"));
		//		String x=driver.findElement(By)
				
				if(x.equalsIgnoreCase("Bajaj Capital"))
				{
					//norm=norm+1;
					
				}
			}//for loop closing
			//go to next page
			try
			{
				if(driver.findElement(By.xpath("//*[@aria-label='Older']")).getAttribute("aria-disabled").equals("true"))
						{
				        	break;
					
						}
			}
			catch(Exception ex)
			{
			 driver.findElement(By.xpath("//*[@aria-label='Older']")).click();
			 Thread.sleep(5000);
			}
		}
		System.out.println(norm);
		//logout
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}


	


