package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Assignment1 {
		public WebDriver driver;
		@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://www.brainyquote.com");
		
	}
//	@FindBy(xpath = "//a[text()='Rabindranath Tagore']") private WebElement name;
//
//	public Assignment1(WebDriver driver)
//	{
//		PageFactory.initElements(driver,this);
//	}
//	
//	
//	
//	
//public WebElement getName() {
//		return name;
//	}
//
//
//
//
//public void setName(WebElement name) {
//		this.name = name;
//	}
//

public void closeBrowser()
{
	driver.close();
}
}
