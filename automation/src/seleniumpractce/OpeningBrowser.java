package seleniumpractce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {
	
	public static void main(String[] args) {
		
     
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.nakuri.com");
//		driver.close();
		driver.quit();
		
		
	}		
		
	}
	
   

