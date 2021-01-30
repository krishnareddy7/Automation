package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1  {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		   driver.get("https://www.flipkart.com");
	String title = driver.getTitle();
		System.out.println(title);
	if (title.contains("Online Shopping Site"))
	{
		System.out.println("the displayed page is flipkart");
	}
	else
		System.out.println("the given page is not displayed");
	
}
}