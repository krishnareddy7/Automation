package automationBasic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbDropDown 
{
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//wait.until(ExpectedConditions.visibilityOf(day));//
	    //driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		 driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
     	WebElement day = driver.findElement(By.id("day"));
         Select s=new Select(day);
         s.selectByVisibleText("10");
         
//         WebDriverWait wait =new WebDriverWait(driver,10);
//         wait.until(ExpectedConditions.visibilityOf(day));
 	   
	  
	       WebElement month = driver.findElement(By.id("month"));
	       Select s1=new Select(month);
		     s1.selectByVisibleText("Nov");
		     WebElement year = driver.findElement(By.id("year"));
		     Select s2=new Select(year);
		     s2.selectByVisibleText("1993");
	     
	
	
	}
	
}
