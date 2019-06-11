
/**
 * Parent class used so that each Bus class inherits 
 *
 * @author (Paul Kirwan)
 * @version (14 November 2018)
 */
public abstract class BusVendor
{
    //declare fields used in each child class
    int noOfPassengers;
    String startingLocation;
    String destination;
    String dateOfDeparture;
    int timeOfDeparture;
    String dateOfArrival;
    int timeOfArrival;
    double fare;
    double price;
    
    public BusVendor()
    {
       this.noOfPassengers = noOfPassengers;
       this.startingLocation = startingLocation;
       this.destination = destination;
       this.dateOfDeparture = dateOfDeparture;
       this.timeOfDeparture = timeOfDeparture;
       this.dateOfArrival = dateOfArrival;
       this.timeOfArrival = timeOfArrival;
       this.fare = fare;
       this.price = price;
    }

    
    //Declare methods to be used in each child class
    public abstract void getAllAvailableTrips();
    
    public abstract void bookingTrips();
}
