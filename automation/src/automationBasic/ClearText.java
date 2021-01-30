package automationBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearText 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  driver.get("https://www.pdfdrive.com/");
 WebElement search = driver.findElement(By.xpath("//input[@id='q']"));
   search.sendKeys("ayn rand");
//   Actions a= new Actions(driver);
//   a.doubleClick(search).perform(
//   a.sendKeys(Keys.BACK_SPACE);
   Thread.sleep(2000);
   search.sendKeys(Keys.CONTROL,"a");
   Thread.sleep(3000);
   search.sendKeys(Keys.DELETE);
  WebElement ele = driver.findElement(By.xpath("//i[@class='fas fa-times']"));
 Thread.sleep(2000);
   search.sendKeys("krishna");
 Thread.sleep(3000);
   search.clear();
   
search.sendKeys(Keys.CONTROL,"SHIFT");
//   search.sendKeys(Keys.BACK_SPACE);
   
   if(ele.isDisplayed())
   {
	   ele.click();
	   

   }
//   search.
   
}
}
