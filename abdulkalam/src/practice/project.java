package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class project {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://quickfuseapps.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='link-create']")).click();
		
		driver.findElement(By.xpath(".//*[@id='intro-dialog-cont']/div[2]/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='add-page']")).click();
		
		driver.findElement(By.xpath(".//*[@id='create-dialog']/form/p/input")).sendKeys("MyPage");
		
		driver.findElement(By.xpath("html/body/div[20]/div[3]/button[1]")).click();
		
		// 5. Click on “Messaging” group appearing on the left pane under MODULES :
		
				
		driver.findElement(By.xpath(".//*[@id='accordion']/h3[4]/a")).click();
		
		Actions drag=new Actions(driver);
		
		WebElement dragele1=driver.findElement(By.xpath(".//*[@id='accordion']/div[4]/ul/li[3]"));
	
		
		Thread.sleep(3000);
		
		drag.clickAndHold(dragele1).moveByOffset(300, 50).release().build().perform();
		
		Thread.sleep(7000);
		
		// problem yaha se hai
		
		
		WebElement dragele2=driver.findElement(By.xpath("(//*[@class='mod-rail mod-south'])[2]/div"));
		
		WebElement dragele3 =driver.findElement(By.xpath("(//*[@class='mod-rail mod-north'])[3]/div"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(dragele2, dragele3).perform();
		//  xpath of not send node
		 WebElement n1=driver.findElement(By.xpath("(//*[@class='panel-nodes-attached inner'])[1]/div[2]"));
		 WebElement n2=driver.findElement(By.xpath("(//*[@class='mod-rail mod-north'])[4]/div"));
		act.dragAndDrop(n1,n2).perform();
		//xpath of sent node
		WebElement sendemail=driver.findElement(By.xpath("(//*[contains(@class,'syn-node syn-node-attached')])[3]"));
		WebElement notsendemail=driver.findElement(By.xpath("(//*[contains(@class,'syn-node syn-node-attached')])[4]"));
		
		
		
		
		
		
	

	}

}
