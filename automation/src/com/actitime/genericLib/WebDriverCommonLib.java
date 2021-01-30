package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

import datadriven.BaseTest;

/**
 * This generic class contains all the reusable components of the WebDriver
 * 
 * @author krishna
 *
 */
public class WebDriverCommonLib extends BaseTest {
//public void waitForPageTile(String title)
//{
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//			wait.until(ExpectedConditions.titleContains(title));
//}
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void verify(String actual, String expected, String title) {
		Assert.assertEquals(actual, expected);
		Reporter.log(title + "is displayed", true);
	}

	public void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element);

	}

	public void swithToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void swithToFrame(String attribute) {
		driver.switchTo().frame(attribute);
	}

	public void swithToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void selectOption(WebElement element, int index) {

		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectOption(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectOption(String text, WebElement element) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}

	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void takePageScreenshot(String name) throws Throwable {
		Date d = new Date();
		String mydate = new SimpleDateFormat("yyyyMMddhhmmss").format(d);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"E:\\krishna\\krishna\\selenium\\seleniumwork\\automation\\screenshot\\" + name + mydate + ".png");
		Files.copy(src, dest);

	}
}
