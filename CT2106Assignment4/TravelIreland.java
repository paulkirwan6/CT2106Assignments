/**
 * the user goes here to actually view and make bookings 
 *
 * @author Paul Kirwan
 * @version (14 November 2018)
 */

public class TravelIreland
{
    public static void main(String[] args)
    {
        //Declaring Website title for the user interface
        System.out.println("*************** TravelIreland.com ****************\n");
        
        //assign each array slot to each sub-class of BusVendor
        BusVendor[] busVendors = new BusVendor[3];
        busVendors[0] = new BusEireann(2,"Galway","Dublin","14/11/2018",1200);
        busVendors[1] = new GoBus(3,"Galway","Limerick","15/11/2018",1200);
        busVendors[2] = new CityLink(4,"Galway","Athlone","15/11/2018",1200);
        
        //Loop through each element and call the methods
        System.out.println("Getting All Available Trips:");
        for (BusVendor busVendor : busVendors) {
            busVendor.getAllAvailableTrips();
        }
        
        System.out.println("\nBooking Available Trips:");
        for (BusVendor busVendor : busVendors) {
            busVendor.bookingTrips();
        }
        
    }
}
