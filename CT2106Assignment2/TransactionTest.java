/**
 * TransactionTest is a class that does one thing only
 * It provides methods for testing out different test scenarios
 * for our Shopping Cart Transaction classes
 * @author Paul Kirwan
 * @version 04/10/18
 */
public class TransactionTest {
    /**
     * main method to execute the TransactionTest methods
     */
    public static void main(String[] args)
    {
        TransactionTest test = new TransactionTest();
        test.transaction1(); // calls the method with our test scenario
        test.transaction2(); // calls test scenario 2, which is unsuccessful
    }

    public void transaction1(){
        System.out.println("########################################\nTransaction 1:\n");

        //1. Create New Customer
        Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");

        //Create Shopping Cart object for the Customer
        ShoppingCart cart = new ShoppingCart(customer);

        //Add 3 items with known cost to cart
        Item item1 = new Item("Milk",43);
        Item item2 = new Item("Coffee",54);
        Item item3 = new Item("Bread",67);

        item1.setPrice(1);
        item2.setPrice(4);
        item3.setPrice(2);

        cart.add(item1);
        cart.add(item2);
        cart.add(item3);
        cart.close();

        cart.printItems();
        cart.displayTotal();

        //Add a delivery address for the order
        Address billingAddress = new Address(9098,"Shop St.","Galway","Ireland");
        Address deliveryAddress = new Address(6764,"Grafton St.","Dublin","Ireland");

        //Finalise the cart and create an order
        Order order = new Order(customer,cart,cart.getItems(),billingAddress,deliveryAddress);
        cart.clear();

        //Add a payment type
        Payment payment = new Payment(order,"Visa",1234567812345678L,"15/10/18");

        //Validate the payment
         payment.validate();

        //If successful, email the customer with a success email and the cost of the purchased items
        Email email = new Email(order);
        if (payment.isValid()) {
            email.sendSuccessfulEmail();
        }
        else email.sendUnsuccessfulEmail();

        System.out.println("######################################\n");
    }

    public void transaction2() {

        System.out.println("######################################\nTransaction 2:\n");

        //the user adds three items
        Customer customer = new Customer("Jaden", "Smith", "js123@zmail.com");
        ShoppingCart cart = new ShoppingCart(customer);

        Item item1 = new Item("Shrek",3);
        Item item2 = new Item("Shrek 2",4);
        Item item3 = new Item("Shrek The Third",6);

        item1.setPrice(6);
        item2.setPrice(8);
        item3.setPrice(9);

        cart.add(item1);
        cart.add(item2);
        cart.add(item3);
        //requests a display of the shopping cart items and total
        cart.printItems();
        cart.displayTotal();

        //removes one item
        cart.remove(2);
        cart.printItems();
        cart.displayTotal();

        //confirms the cart and makes an order
        cart.close();
        Address billingAddress = new Address(3345,"College Rd.","Galway","Ireland");
        Address deliveryAddress = new Address(5555,"Red Ave.","Swansea","Wales");
        Order order = new Order(customer,cart,cart.getItems(),billingAddress,deliveryAddress);

        //the user submits a payment
        Payment payment = new Payment(order,"_____",12345678,"15/10/18");

        //However, the payment is not valid
        payment.validate();
        //The user is sent a regret email notifying them that the order was unsuccessful
        Email email = new Email(order);
        if (payment.isValid()) {
            email.sendSuccessfulEmail();
        }
        else email.sendUnsuccessfulEmail();

        System.out.println("######################################");
    }
}