package automationBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	     search.sendKeys("qspiders");
	  Thread.sleep(3000);
	      List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'sbtc')]"));
//	      Thread.sleep(3000);
	      System.out.println(ele.size());
	          for(WebElement prri:ele) 
	{
		System.out.println(prri.getText());
	}
	      Thread.sleep(3000);
	    driver.findElement(By.xpath("//b[text()=' reviews']")).click();
 
	    
	     Thread.sleep(3000);
//	     for(WebElement Print:eles)
//	     {
//	    	System.out.println(Print.getText());
//	     }
//	   eles.get(eles.size()-1).click();
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

	}

}
