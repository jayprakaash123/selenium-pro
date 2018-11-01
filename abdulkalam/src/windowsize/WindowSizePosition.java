package windowsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizePosition {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	// get size
	int w=driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	System.out.println(w+" "+h);
	
	///set size
	Dimension d=new Dimension(200,300);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	
	//get position
	int x=driver.manage().window().getPosition().getX();
	int y=driver.manage().window().getPosition().getY();
	System.out.println(x+" "+y);
	
	////set position
	Point p=new Point(100,250);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	driver.close();
	
	
	
	

	}

}
