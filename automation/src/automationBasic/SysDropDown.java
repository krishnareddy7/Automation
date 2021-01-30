package automationBasic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SysDropDown 
{
	
	public static void main(String[] args) throws InterruptedException
	{  
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();		
	driver.manage().window().maximize();
    driver.get("file:///G:/krishna/selenium/automation/html/css%20and%20html%20text/test.html");
			Thread.sleep(3000);
			WebElement addr=driver.findElement(By.tagName("select"));
			addr.click();
}
}