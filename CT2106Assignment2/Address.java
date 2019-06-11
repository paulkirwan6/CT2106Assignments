/**
 * Creates billing and delivery address
 *
 * @author Paul Kirwan
 * @version 15/10/18
 */
public class Address {

    private int zip;
    private String street;
    private String city;
    private String country;

    public Address(int zip, String street, String city, String country) {
        this.zip = zip;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
