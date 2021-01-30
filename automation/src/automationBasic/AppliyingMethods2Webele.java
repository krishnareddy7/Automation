package automationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppliyingMethods2Webele 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///G:/krishna/selenium/html/css%20and%20html%20text/Lion.jpg");
	
	WebElement ele=driver.findElement(By.tagName("a"));
	Thread.sleep(2000);
	ele.click(); 
//	driver.navigate();
	new FirefoxDriver();

	
}
}