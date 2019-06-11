public class Customer {
    private String firstName;
    private String surName;
    private String emailAddress;
    private final long customerId;

    public Customer(String firstName, String surName, String emailAddress){
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId  = makeCustomerId();
    }

    public long getCustomerId() {
        return customerId;
    }

    public long getId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private long makeCustomerId() {
        return (long) (Math.random() * 99999999999999L);
    }
}