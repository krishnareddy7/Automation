package datadriven;

import org.openqa.selenium.By;

public class InValidLoginTest extends BaseTest{

	public static void main(String[] args) throws Throwable  {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		int rc=flib.getRowCout("./data/inputData.xlsx", "Invalid");
		for (int i=1;i<=rc;i++) {
			
		String un = flib.getCellData("./data/inputData.xlsx", "invalid", i, 0); 
		
		String pwd = flib.getCellData("./data/inputData.xlsx", "invalid", i, 1);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("./div[text()='Login ']")).click();
		Thread.sleep(4000);
		
		}
		Thread.sleep(1000);
		bt.closeBrowser();
		}
	
}