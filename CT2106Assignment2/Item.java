/**
 * Each Item to be added to the ShoppingCart/Order
 *
 * @author Paul Kirwan
 * @version 15/10/18
 */
public class Item {
    private String name;
    private int price;
    private long itemId;

    public Item(String itemName, long id) {
        this.name = itemName;
        this.itemId = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return  "Item Id: " + itemId + "\t" + name +"\tPrice: " + price;
    }
}
