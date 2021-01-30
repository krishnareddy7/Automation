package automationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com");
	//	driver.get("https://www.google.com");
		//driver.getTitle();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
	
	
	}
}
