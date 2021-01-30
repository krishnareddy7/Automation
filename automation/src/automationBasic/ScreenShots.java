package automationBasic;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShots
{
	
private static final WebDriver RemoteWebDriver = null;

public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.get("http://www.google.com/");
	
	//taking screen shot on hole page
	TakesScreenshot ts = (TakesScreenshot)driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	Thread.sleep(2000);
	File dest = new File("G:\\krishna\\selenium\\automation\\screenshots\\exmples//google.jpg"); 
	Files.copy(scr, dest);
	
	// trying with the RemoveWebDriver
	
	driver.get("https://www.youtube.com/");
	RemoteWebDriver rwt = (RemoteWebDriver) driver;
	File sour = rwt.getScreenshotAs(OutputType.FILE);
	File dedst = new File("G:\\krishna\\selenium\\automation\\screenshots\\exmples\\youtube.jpg");
	Files.copy(sour, dedst);
	
	//trying with webElement
	driver.get("https://www.britannica.com/");
//	WebElement we=new 
	 WebElement add = driver.findElement(By.xpath("//a[@class='mx-20 d-block']/descendant::img[@loading='lazy']"));
       File add1 = add.getScreenshotAs(OutputType.FILE);
File photo = new File("G:\\\\krishna\\\\selenium\\\\automation\\\\screenshots\\\\exmples\\\\britanica.jpg");
       Files.copy(add1, photo);
       
}
}
