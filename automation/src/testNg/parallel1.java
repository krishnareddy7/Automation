package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel1 {
    @Test
	public void runchrome1ok()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
	}
}
