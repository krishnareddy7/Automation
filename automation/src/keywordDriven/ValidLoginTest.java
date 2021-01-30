package keywordDriven;

import org.openqa.selenium.By;

public class ValidLoginTest  extends BaseTest{
	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
	String un = flib.getpropKeyValue(PROP_PATH, "username");
	String pwd=flib.getpropKeyValue(PROP_PATH, "password");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys(un);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//div[text()='Login ']")).click();
	
	}

}
