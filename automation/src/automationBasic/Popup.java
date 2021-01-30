package automationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
  
   driver.get("file:///G:/krishna/selenium/automation/html/css%20and%20html%20text/popup.html");
   Thread.sleep(2000);
  WebElement login = driver.findElement(By.xpath("//button[text()='login']"));
  Thread.sleep(2000);
  login.click();
  Thread.sleep(3000);
//   driver.switchTo().alert().accept();
 
}
}
