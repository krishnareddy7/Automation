package clearTrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Filelib
{
	
public WebDriver driver;

@FindBy(id="RoundTrip")	private WebElement trip;
@FindBy(id="FromTag") private WebElement fromLocation;
@FindBy(id="ToTag") private WebElement toLocation;
@FindBy(xpath="(//i[@class=\"icon ir datePicker\"])[1]") private WebElement  fromCalender;
@FindBy(xpath="(//i[@class=\"icon ir datePicker\"])[2]") private WebElement  tocalender;
@FindBy(xpath="//a[contains(@class,'highlight')]/../../following-sibling::tr[1]/td[1]") private WebElement fromDate;
@FindBy(xpath="//td[contains(@class,'selected')]/following-sibling::td[1]") private WebElement toDate;
//@FindBy(xpath="//a[contains(@class,'highlight')]/../../following-sibling::tr[1]/td[1]") private WebElement toDate;
@FindBy(id="SearchBtn") private WebElement search;
@FindBy(xpath="//div[@data-test-attrib='onward-view']/div/div[2]") private WebElement departure;
@FindBy(xpath="//div[@data-test-attrib='return-view']/div/div[3]") private WebElement arrival;
@FindBy(xpath="//button[contains(@class,'bg-primary')]") private WebElement book;
@FindBy(xpath="//div[@class='flex flex-middle']/div/following-sibling::div/h2[text()='Review your itinerary']") private  WebElement review;
Filelib flib=new Filelib();

public Elements(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getTrip() {
	return trip;
}

public void setTrip() {
	trip.click();
}

public WebElement getFromLocation() {
	return fromLocation;
}

public void setFromLocation(String filePath,String sheet,int row,int cell) throws Throwable {
	
	fromLocation.sendKeys(flib.travelData(filePath, sheet, row, cell));
}

public WebElement getToLocation() {
	return toLocation;
}

public void setToLocation(String filePath,String sheet,int row,int cell) throws Throwable {
	toLocation.sendKeys(flib.travelData(filePath, sheet, row, cell));
}

public WebElement getFromCalender() {
	return fromCalender;
}

public void setFromCalender() {
	fromCalender.click();
}

public WebElement getTocalender() {
	return tocalender;
}

public void setTocalender() {
     tocalender.click();
}
public WebElement getFromDate() {
	return fromDate;
}
public void setFromDate() {
	fromDate.click();
}
public WebElement getToDate() {
	return toDate;
}
public void setToDate() {
	toDate.click();
}
public WebElement getSearch() {
	return search;
}
public void setSearch() {
	search.click();
}
public WebElement getDeparture() {
	return departure;
}
public void setDeparture() {
	departure.click();
}
public WebElement getArrival() {
	return arrival;
}
public void setArrival() {
	arrival.click();
}
public WebElement getBook() {
	return book;
}
public void setBook() {
	book.click();
	}
public WebElement getReview() {
	return review;
}



	
	


}