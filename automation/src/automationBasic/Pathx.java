package automationBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pathx 
{

public static void main(String[] args) {
	
   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();	
    driver.get("file:///G:/krishna/selenium/automation/html/css%20and%20html%20text/test.html");
  String s=driver.getTitle();
System.out.println(s);
//Point p=new Point(200, 100);
WebElement d = driver.findElement(By.cssSelector("a[href='https://www.google.com/'"));
System.out.println(d);
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//	System.out.println(driver.manage().window().getPosition().getX());
//	  driver.findElement(By.tagName("a")).click();
	
}

}
