package clearTrips;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClearTrip extends BrowserClas
{
@Test
	public void login() throws Throwable 
	{
	   openBrowser();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     Elements ele=new Elements(driver);
     Driverlib dl=new Driverlib();
       ele.setTrip();
//       dl.waitMethod();
       ele.setFromLocation(EXCEL_PATH, "Sheet1", 1, 0);
//       dl.waitMethod();
       ele.setToLocation(EXCEL_PATH, "Sheet1",1 ,1);
//       dl.waitMethod();
       ele.setFromCalender();
//       dl.waitMethod();
     ele.setFromDate();
     Thread.sleep(3000);
       ele.setTocalender();
       Thread.sleep(3000);
      ele.setToDate();
      Thread.sleep(3000);
     ele.setSearch();
     Thread.sleep(3000);
		ele.setDeparture();
		Thread.sleep(3000);
		ele.setArrival();
		Thread.sleep(3000);
		ele.setBook();
		Thread.sleep(5000);
		WebElement textel = ele.getReview();
		String text = textel.getText();
		
if(text.equals("Review your itinerary"))
   {
	System.out.println("the reviewed text is:"+text);
   }
else{
	System.out.println("the given text is wrong");
}
	
	}
}
