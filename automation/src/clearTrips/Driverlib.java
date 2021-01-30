package clearTrips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Driverlib extends BrowserClas{
	
	public void verify(String actual,String expected,String page)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(page+"  is dsplayed ");
	}
	public void waitMethod()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	}

}
