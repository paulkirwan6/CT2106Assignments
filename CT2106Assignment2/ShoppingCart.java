/**
 * Shopping cart handles the customer's items
 *
 * @author Paul Kirwan
 * @version 15/10/18
 */
import java.util.ArrayList;
public class ShoppingCart
{
    //instance variables - replace the example below with your own
    private final long cartID;
    private ArrayList<Item> items;
    private Customer customer;
    private boolean closed;

    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart(Customer customer) {
        this.cartID = makeItemID();
        this.customer = customer;
        items = new ArrayList<>();
    }

    //accessor and mutators for all the above fields.
    public long getCartID(){
        return cartID;
    }

    private long makeItemID() {
        return (long) (Math.random() * 99999999999999L);
    }

    public int getTotal(){
        return items.size();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    //Method to add items
    public void add(Item item) {
        if (!closed) {
            System.out.println(item.getName()+ " has been added to the cart.");
            items.add(item);
        }
        else System.out.println("Sorry The Shopping Cart is closed");
    }

    //Method to remove items
    public void remove(int itemPosition) {
        if (!closed) {
            System.out.println(items.get(itemPosition).getName()+" has been removed from the cart.");
            items.remove(itemPosition);
        }
        else System.out.println("Sorry The Shopping Cart is closed\n");
    }

    //Method to display the total number of items in the cart
    public void displayTotal(){
        System.out.println("Total number of items: " + getTotal());
    }

    //Method to display the items in the cart
    public void printItems(){
        System.out.println("The cart " + getCartID() +" contains: ");
        for (int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
        System.out.println("");
    }

    //Don't allow user to add more items
    public void close(){
        closed = true;
    }

    //Method to clear the items in the cart
    public void clear (){
        items.clear();
    }
}