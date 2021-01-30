package objclass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Some {
	
	
		
	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
//		driver.navigate().to("http://www.flipkart.com/");
		URL ur=new URL("http://www.flipkart.com/");
		Navigation nav;
		
		System.out.println(ur);
	
	}

}
