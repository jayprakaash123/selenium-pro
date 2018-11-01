package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/descendant::span"));
     Actions a=new Actions(driver);
     Thread.sleep(5000);
    /* int x=e1.getLocation().getX();
     int y=e1.getLocation().getY();
     Thread.sleep(5000);
     // move left to right
     a.dragAndDropBy(e1,x+250,y).build().perform();
     //move right to left
     Thread.sleep(2000);
     a.dragAndDropBy(e1, x-100,y).build().perform();
     driver.switchTo().defaultContent();
     //click on vertical
     driver.findElement(By.xpath("//*[text()='Vertical slider']")).click();
     Thread.sleep(3000);
     driver.switchTo().frame(0);
     WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/descendant::span"));
     int p=e2.getLocation().getX();
     int q=e2.getLocation().getY();
     Thread.sleep(5000);
     a.dragAndDropBy(e2,p,q+100).build().perform();
     Thread.sleep(5000);
     a.dragAndDropBy(e2, p, q-100).build().perform();
     Thread.sleep(3000);
     driver.switchTo().defaultContent();
   driver.close();*/
     
     
     //another way of slider
    a.clickAndHold(e1).moveByOffset(50, 0).release(e1).build().perform();
    Thread.sleep(3000);
    a.clickAndHold(e1).moveByOffset(-20,0).release(e1).build().perform();
    driver.switchTo().defaultContent();
     Thread.sleep(3000);
     //vertical slider
     driver.findElement(By.xpath("//*[text()='Vertical slider']")).click();
     Thread.sleep(3000);
     driver.switchTo().frame(0);
     WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/descendant::span"));
     Thread.sleep(3000);
    a.clickAndHold(e2).moveByOffset(0,100).release(e2).build().perform();
    Thread.sleep(3000);
    a.clickAndHold(e2).moveByOffset(0,-50).release(e2).build().perform();
     driver.close();
     
     
     

	}

}
