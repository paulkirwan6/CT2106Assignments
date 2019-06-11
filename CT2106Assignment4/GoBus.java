
/**
 * Child class of BusVendor for this specific bus company.
 *
 * @author (Paul Kirwan)
 * @version (11 November 2018)
 */
public class GoBus extends BusVendor
{
    public GoBus(int noOfPassengers, String startingLocation, String destination,String dateOfDeparture, int timeOfDeparture)
    {
       super();
       this.noOfPassengers = noOfPassengers;
       this.startingLocation = startingLocation;
       this.destination = destination;
       this.dateOfDeparture = dateOfDeparture;
       this.timeOfDeparture = timeOfDeparture;
       this.dateOfArrival = dateOfDeparture;
       this.timeOfArrival = timeOfDeparture+200;
       this.fare = 18;
    }

    @Override
    public void getAllAvailableTrips()
    {
        //Preset timetable in place for a Go Bus internal mechanism
        System.out.println("getting trips from Go Bus:");
        System.out.println("Galway 1200 - Dublin 1400");
        System.out.println("Galway 1200 - Athlone 1300");
        System.out.println("Galway 1200 - Limerick 1300\n");
    }
    
    @Override
    public void bookingTrips()
    {
        //Generate trip based on user entered information and internally stored Go Bus information
        System.out.println("booking trips from Go Bus");
        System.out.println("Passengers: "+noOfPassengers+"\tFare: "+fare);
        System.out.println("From: "+startingLocation+"\tTo: "+destination);
        System.out.println("Departing on "+dateOfDeparture+" at "+timeOfDeparture);
        System.out.println("Arriving on "+dateOfArrival+" at "+timeOfArrival);
        System.out.println("Total cost: "+noOfPassengers*fare+"\n");
    }
}