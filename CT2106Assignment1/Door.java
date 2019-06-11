
public class Door {

    private String name;
    private int quantity;

    public Door(String drName, int drNum) {
        this.name = drName;
        this.quantity = drNum;
    }// End Constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}// End Class Door

