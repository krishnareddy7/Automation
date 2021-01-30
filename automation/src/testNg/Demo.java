package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	public WebDriver driver;
	
	
	public void Browser()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 driver = new FirefoxDriver();	
	driver.get("https://www.brainyquote.com/topics/binary-quotes");
	
	}
	
	public void Browclose()
	{
		driver.close();
	}
	
	}


