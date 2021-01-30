package methodDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import automationBasic.Browser;
import keywordDriven.IAutoConsts;

public class BaseTest implements IAutoConsts
{   
	public static WebDriver driver;
	@Test
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser = flib.getpropKeyValue(PROP_PATH,"Browser");
		if (browser.equals("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver=new FirefoxDriver();
		}
         driver.manage().window().maximize();
         String appUrl=flib.getpropKeyValue(PROP_PATH, "url");
	     driver.get(appUrl);
	}

public void CloseBrowser()
{
	driver.quit();
}
	
}
