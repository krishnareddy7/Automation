package testNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
    @Test
	public void runchrome2()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	new ChromeDriver();
	}
}
