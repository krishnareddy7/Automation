package automationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
WebDriver driver=new FirefoxDriver();
driver.get("https://www.flipkart.com/");
WebElement xvalue=driver.findElement(By.xpath("//button[text()='✕']"));
if(xvalue.isDisplayed())
	{
	xvalue.click();
	}

WebElement phone = driver.findElement(By.xpath("//img[@class='_1rLkVb']"));
Actions a=new Actions(driver);
a.contextClick(phone).perform();
}
}
