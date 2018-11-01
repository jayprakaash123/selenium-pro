package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	WebElement e1=driver.findElement(By.id("draggable"));
	WebElement e2=driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	Thread.sleep(5000);
	 a.contextClick(e1);//right click on element e1
	 Thread.sleep(3000);
    a.dragAndDrop(e1,e2).perform();
   
    //another way of drag and drop
	//a.clickAndHold(e1).moveToElement(e2).release(e1).build().perform();
    Thread.sleep(3000);
    driver.switchTo().defaultContent();
		driver.close();
				

	}

}
