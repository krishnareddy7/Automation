package automationBasic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ActitimeAss {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do");
    WebElement username = driver.findElement(By.id("username"));
    Thread.sleep(2000);
    username.sendKeys("admin");
    Thread.sleep(2000);
    Actions a=new Actions(driver);
    a.doubleClick(username).perform();
    Thread.sleep(3000);
   a.contextClick(username).perform();
   Thread.sleep(3000);
  Robot r=new Robot();
 r.keyPress(KeyEvent.VK_C); 
 r.keyRelease(KeyEvent.VK_C);
// Thread.sleep(3000);
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 WebElement pass = driver.findElement(By.xpath("//input[@name='pwd']"));
 pass.click();

 a.contextClick(pass).perform();
// Thread.sleep(3000);
// pass.click();
 r.keyPress(KeyEvent.VK_P);
 r.keyRelease(KeyEvent.VK_P);
//    
	}

}
