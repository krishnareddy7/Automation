package hydrid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import datadriven.BaseTest;

public class WebDriverCommonLib extends BaseTest
{
public void waitForPageTile(String title)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains(title));
}
public String getPageTitle()
{
	String pageTitle = driver.getTitle();
	return pageTitle;	
}
public void verify( String actual,String expected, String title)
{
	Assert.assertEquals(actual, expected);
	Reporter.log(title+"is displayed",true);
}

public void mouseHover(WebElement element)
{
	Actions a= new Actions(driver);
			a.moveToElement(element).perform();
}

public void rightClick(WebElement element)
{
	Actions a=new Actions(driver);
	a.contextClick(element);
			
}
public void swithToFrame(int index)
{
	driver.switchTo().frame(index);
}
public void selectOption(WebElement element,int index)
{

Select sel=new Select(element);
sel.selectByIndex(index);
}
public void selectOption(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void selectOption(String text,WebElement element)
{
	Select sel=new Select(element);
		sel.deselectByVisibleText(text);	
}

}
