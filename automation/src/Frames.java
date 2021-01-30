import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.nakuri.com");
		String win = driver.getWindowHandle();
		System.out.println(win);
//		driver.findElement(By.id("un")).sendKeys("krishna");
//		WebElement page = driver.findElement(By.id("pwd"));
//		
//	 driver.switchTo().frame("frna");
//       driver.findElement(By.id("pwd")).sendKeys("rama");
////	page.sendKeys("reddy");
	
	
	
	String s=new String();
	
	
	}

}
