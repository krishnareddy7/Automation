package datadriven;

import org.openqa.selenium.By;

public class ValidLoginTest  extends BaseTest{
	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
	String un = flib.getCellData("./data/inputData.xlsx", "TestData", 1, 0);
	String pwd=flib.getCellData("./data/inputData.xlsx","TestData", 1, 1);
		
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath(".//div[text()='Login ']")).click();
	
	Thread.sleep(10000);
	bt.closeBrowser();
	}

}
