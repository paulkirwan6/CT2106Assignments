/**
 * Order handles the ShoppingCart, Customer, Items and Address
 *
 * @author Paul Kirwan
 * @version 15/10/18
 */
import java.util.ArrayList;

public class Order {

    private Customer customer;
    private ShoppingCart cart;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Item> items;
    private int price;

    public Order(Customer customer,ShoppingCart cart,ArrayList<Item> items, Address billingAddress, Address deliveryAddress) {
        this.customer = customer;
        this.cart = cart;
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
        this.items = new ArrayList<>(items);
    }

    //Adds up the total price of each item
    public int getPrice() {
        for (Item item : items) {
            price +=item.getPrice();
        }
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    //genreate random order number
    public long getOrderNumber() {
        return (long) (Math.random() * 999999999999L);
    }

    //Method to display the items in the cart
    public void printItems() {
        for (Item item1 : items) {
            System.out.println(item1.toString());
        }
    }
}
