package automationBasic;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimeBrowsers 
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the browser.");
	   String br=scan.next();
	   if(br.equals("chrome"))
	   {
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         new ChromeDriver();
	   }
	   else if(br.equals("firefox")) {
         System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
         new FirefoxDriver();
	   }
	   else
		   System.out.println("enter thye proper browser");
      
}
}