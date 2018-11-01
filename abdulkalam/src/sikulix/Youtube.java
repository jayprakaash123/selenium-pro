package sikulix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Youtube {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	// Launch site
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("Tajmahal");
	WebDriverWait wd=new WebDriverWait(driver,10);
	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search-icon-legacy']/child::*[1]")));
	driver.findElement(By.xpath("//*[@id='search-icon-legacy']/child::*[1]")).click();
    driver.findElement(By.xpath("//*[contains(@title,'India Agra Taj Mahal')]")).click();
    //video icon automation(Sikulix)
    Screen sc=new Screen();
    if(sc.exists("skipadd.png")!=null)
    {
    	sc.click("skipadd.png");
    }
     //move mouse pointer on video body & automate icon
    Location l=new Location(250,250);
    sc.wheel(l,Button.LEFT,0);
    sc.click("pause1.png");
    Thread.sleep(2000);
    sc.wheel(l,Button.LEFT,0);
    sc.click("play1.png");
    Thread.sleep(2000);
    sc.wheel(l, Button.LEFT,0);
    sc.click("setting1.png");
    Thread.sleep(2000);
    sc.wheel(l, Button.LEFT,0);
    sc.click("setting1.png");
    sc.wheel(l, Button.LEFT, 0);
    sc.click("fullscreen1");
    Thread.sleep(5000);
    sc.wheel(l, Button.LEFT, 0);
    sc.click("exitfullscreen");
    Thread.sleep(3000);
    sc.wheel(l, Button.LEFT, 0);
    sc.click("Like1.png");
    Thread.sleep(3000);
    sc.wheel(l, Button.LEFT, 0);
    sc.mouseMove("volume.png");
    Thread.sleep(3000);
    Match ma=sc.find("volumebubble.png");
    int x=ma.getX();
    int y=ma.getY();
    Location l1=new Location(x-20,y);
    sc.dragDrop(ma,l1);
    Thread.sleep(2000);
    Location l2=new Location(x+20,y);
    sc.dragDrop(ma,l2);
    Thread.sleep(3000);
    //sc.wheel(l, Button.LEFT, 0);
    sc.click("close.png");
	}

}
