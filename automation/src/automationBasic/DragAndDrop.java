package automationBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();	
	   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");              
	   WebElement source = driver.findElement(By.id("box7"));
	   WebElement target = driver.findElement(By.id("box107"));
	    Actions a=new Actions(driver);
	    Thread.sleep(3000);
	    a.dragAndDrop(source, target).perform();
	}

}
