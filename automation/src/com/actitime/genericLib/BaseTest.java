package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hydrid.WebDriverCommonLib;
import keywordDriven.IAutoConsts;
/**
 *  This generic common class contains repeated actions
 * @author krishna
 *
 */
public abstract class BaseTest implements IAutoConsts
{   
	public static WebDriver driver;
	@Test
	/**
	 * This generic reusable method is used to open browser,Enter URl and verify
	 * @throws Throwable
	 */
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser = flib.getpropKeyValue(PROP_PATH,"Browser");

		if (browser.equals("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver=new FirefoxDriver();
		
		}
         driver.manage().window().maximize();
         String appUrl=flib.getpropKeyValue(PROP_PATH, "url");
	     driver.get(appUrl);
	     WebDriverCommonLib wlib=new WebDriverCommonLib();
	     wlib.verify(wlib.getPageTitle(),flib.getpropKeyValue(PROP_PATH, "loginTitle"),"Login page");
	}
	/**
	 * This generic reusable method is used to close all the browser
	 * @throws InterruptedException
	 */
@AfterClass
public void CloseBrowser() throws InterruptedException
{
	Thread.sleep(10000);
	driver.quit();
}
	
}
