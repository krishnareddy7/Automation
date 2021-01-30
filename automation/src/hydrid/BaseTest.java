package hydrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import keywordDriven.IAutoConsts;

public class BaseTest implements IAutoConsts
{   
	public static WebDriver driver;
	@Test
	public void openBrowser()
	{
		if (Browser.equals("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else if (Browser.equals("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	//	String appural=flib.getpropkeyValue()
				
		
		
		
driver.get("https://www.google.com");
	}

public void Close()
{
	driver.close();
}

	
}
