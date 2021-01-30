package automationBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

      public class FlipkartAss {
	  public static void main(String[] args) throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	  search.sendKeys("laptops");
	  List<WebElement> keyword = driver.findElements(By.xpath("//li[@class='_1va75j']"));
	 System.out.println("total keywords are:"+keyword.size());
	 for(WebElement list:keyword)
	 {
		 System.out.println(list.getText());
	 }
	   search.sendKeys(Keys.DOWN);
	   Thread.sleep(3000);
	   search.sendKeys(Keys.ENTER);
	   WebElement dd = driver.findElement(By.xpath("(//div/select[@class='fPjUPw'])[2]"));
	   dd.click();
	   Select se=new Select(dd);
	   se.selectByVisibleText("₹50000");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='Core i3']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='Dell']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='Operating System']/ancestor::div[@class='_3xglSm _1iMC4O']")).click();;
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[text()='Windows 10']/preceding-sibling::div[@class='_1p7h2j']")).click();
	   Thread.sleep(3000);
//	WebElement price = driver.findElement(By.xpath(""));
//	System.out.println(price.getText());
//	  WebElement ram = driver.findElement(By.xpath("//li[text()='8 GB DDR4 RAM']"));
//	  System.out.println(ram.getText());
//	  
	  
	  
	  
	  }
}
