package clearTrips;

public class FlightsData {
	
public static void main(String[] args) {
	
Flightdestination fd = new FlightbookingData("07/01/2021",1,"economic","single");
Flightdestination fd1 = new FlightbookingData("10/01/2021",3,"business","round");
Flightdestination fd2 = new FlightbookingData("04/01/2021",5,"economic","multiple");

fd.bookingFlight();
System.out.println("------------------------");
fd1.bookingFlight("12/01/2021");
System.out.println("------------------------");
fd2.bookingFlight();


}

	}
	
			
		
	
	
	
			


