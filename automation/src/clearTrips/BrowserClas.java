package clearTrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClas implements Constants
{
	public WebDriver driver;
	
public void openBrowser() throws Throwable 
	{
	
      System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
         driver = new FirefoxDriver(); 
         driver.get(URL);
}
public void closeBrowser() {
		driver.close();
	}
}
