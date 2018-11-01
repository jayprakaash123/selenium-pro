package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Image {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium2018\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.researchgate.net/profile/Natalia_Gomes2/publication/267391712_Step_by_step_building_an_e-learning_project/links/56ebcf4c08aeb65d759458e6/Step-by-step-building-an-e-learning-project.pdf?origin=publication_detail");
		Thread.sleep(8000);
		boolean x=driver.findElement(By.xpath("//*[contains(style,'text-align')]/following-sibling::*/div/img")).isDisplayed();
		System.out.println(x);
		driver.close();

	}

}
