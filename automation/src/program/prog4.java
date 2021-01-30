package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prog4 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
	driver.navigate().to("http://www.flipkart.com");
	String title = driver.getTitle();
	System.out.println(title);
	 driver.navigate().back();
	 System.out.println(driver.getTitle());
	
	
}
}
