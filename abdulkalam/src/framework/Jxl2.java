 package framework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.types.resources.selectors.Type;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Jxl2 {

	public static void main(String[] args) throws BiffException, IOException, WriteException {
		// open excel file for reading
		File f=new File("D:\\jxl2.xls");
		Workbook rwb= Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nouc=rsh.getColumns();
		int nour=rsh.getRows();
		
		//open same excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f, rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//Data driven automation
		try
		{
			Date d=new Date();
			Label l1=new Label(nouc,0,"Result on"+d.toString());
			wsh.addCell(l1);
			for(int i=1;i<nour;i++)
			{
			String x=rsh.getCell(0, i).getContents();
			//launch site
			System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
			driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
			//check title
			String y=driver.getTitle();
			if(y.contains(x))
			{
				Label l2=new Label(nouc,i,"Test passed");
				wsh.addCell(l2);
			}
			else
			{
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File("fail on"+d.toString()+".png");
				FileUtils.copyFile(src, dest);
				Label l3=new Label(nouc,i,"test fail:"+dest.getAbsolutePath());
				wsh.addCell(l3);
			}
			//close site
			driver.close();
			
			}//for loop closing
			
		}//try closing
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//save and close excel file
		wwb.write();//save 
		wwb.close();
		rwb.close();
		
		

	}

}
