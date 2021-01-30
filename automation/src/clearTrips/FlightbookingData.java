package clearTrips;

public class FlightbookingData implements Flightdestination
{
	
private String date;

private int passengers;
private String classes;
private String trip;

 FlightbookingData(String date,int passengers,String classes,String trip)
 {
	 this.date=date;
	 this.passengers=passengers;
	 this.classes=classes;
	 this.trip=trip;
}
 
public String getDate() {
	return date;
}
public int getPassengers() {
	return passengers;
}
public void setPassengers(int passengers) {
       this.passengers=passengers;
}

public String getClasses()
{
	return classes;
}

public String getTrip()
{
	return classes;
	
}



public void deccanFlight() {
	System.out.println("Date of travel "+getDate());
	System.out.println("number of passengers "+getPassengers());
}

	public void indigoFlight()
	{	
	System.out.println("Date of travel :"+getDate());
	System.out.println("number of passengers :"+getPassengers());
}
public void airindiaFlight() {
	System.out.println("Date of travel :"+getDate());
	System.out.println("number of passengers :"+getPassengers());
}
@Override
public void bookingFlight() {

	System.out.println("Destination palce :"+Destination);
	System.out.println("Arrival palce :"+Arrival);
                    deccanFlight();
	
	System.out.println("type of class: "+classes);
	System.out.println("type of trip :"+trip);
	
}

@Override
public void bookingFlight(String date) {
	System.out.println("Destination palce :"+Destination);
	System.out.println("Arrival palce :"+Arrival);
                    deccanFlight();
	System.out.println("date of return :"+date);
	System.out.println("type of class :"+classes);
	System.out.println("type of trip :"+trip);
	
}

}