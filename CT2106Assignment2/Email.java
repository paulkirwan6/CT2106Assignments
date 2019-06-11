/**
 * Emails to be sent after payment
 *
 * @author Paul Kirwan
 * @version 15/10/18
 */
public class Email {
    private Order order;

    public Email(Order order) {
        this.order = order;
    }

    public void sendSuccessfulEmail(){
        System.out.println("*************************************\n"+
                "To:"+order.getCustomer().getEmailAddress() + "\n" +
                "Dear "+order.getCustomer().getFirstName() + ",\n" +
                "Your order "+order.getOrderNumber()+" has been successful.\n"+
                "Your order: ");
        order.printItems();
        System.out.println("The total price is: €"+order.getPrice() + "\n" +
                "Billing Address: "+
                "\n\t"+order.getBillingAddress().getZip()+"\n\t"+
                order.getBillingAddress().getStreet()+",\n\t"+
                order.getBillingAddress().getCity()+",\n\t"+
                order.getBillingAddress().getCountry()+".\n"+

                "Delivery Address: "+
                "\n\t"+order.getDeliveryAddress().getZip()+"\n\t"+
                order.getDeliveryAddress().getStreet()+",\n\t"+
                order.getDeliveryAddress().getCity()+",\n\t"+
                order.getDeliveryAddress().getCountry()+".\n"+

                "Thanks for shopping with us.\n"+
                "*************************************************");
    }

    public void sendUnsuccessfulEmail() {
        System.out.println("*********************************************\n" +
                "To:"+order.getCustomer().getEmailAddress() + "\n" +
                "Dear "+order.getCustomer().getFirstName() + ",\n" +
                "Customer ID: "+order.getCustomer().getCustomerId()+"\n"+
                "Your order "+order.getOrderNumber()+" has been unsuccessful due an incorrect type of payment entered.\n"+
                "Your order: ");
        order.printItems();
        System.out.println("The total price is: €"+order.getPrice() + "\n" +
                "Billing Address: "+
                "\n"+order.getBillingAddress().getZip()+","+
                order.getBillingAddress().getStreet()+","+
                order.getBillingAddress().getCity()+","+
                order.getBillingAddress().getCountry()+".\n"+

                "Delivery Address: "+
                "\n"+order.getDeliveryAddress().getZip()+","+
                order.getDeliveryAddress().getStreet()+","+
                order.getDeliveryAddress().getCity()+","+
                order.getDeliveryAddress().getCountry()+".\n"+

                "\nPlease try again later with another payment type.\n"+
                "*************************************************");
    }
}
