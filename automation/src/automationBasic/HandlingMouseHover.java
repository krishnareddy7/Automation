package automationBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

  public class HandlingMouseHover
   {
  public static void main(String[] args) throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();	
   driver.get("https://www.flipkart.com/");
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
//	WebElement search = driver.findElement(By.xpath("//input[@type='text']"))

//performing mouse hover
Actions a=new Actions(driver);
Thread.sleep(3000);
  WebElement mouse = driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[1]"));
  a.moveToElement(mouse).perform();
  
  }
}
