package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 {
    @Test
	public void runchrome3()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
	}
}
