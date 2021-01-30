package automationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBro 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		 chrome.get("https://www.google.com/");

		 chrome.findElement(By.className("gb_Uf")).click();
//		 chrome.findElement(By.className("MrEfLc")).click();
		 chrome.findElement(By.xpath("//span[text()='YouTube']")).click();
	}

}
