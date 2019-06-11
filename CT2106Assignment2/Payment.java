/**
 * Payment allows the customer to make payment + checks payment is valid
 *
 * @author Paul Kirwan
 * @version 15/10/18
 */
public class Payment {
    private String cardType;
    private long cardNumber;
    private String date;
    private Order order;
    private int length;
    private boolean validated;

    public Payment(Order order, String cardType, long cardNumber ,String date) {
        this.order = order;
        this.cardType = cardType;
        this.date = date;
        this.cardNumber = cardNumber;
    }

    //check that the card is valid
    public void validate(){
        //find the amount of digits in the card number
        length = (int)(Math.log10(cardNumber)+1);
        if (length == 16 && cardType.toLowerCase().equals("visa") || cardType.toLowerCase().equals("mastercard")) {
            validated = true;
            System.out.println("Card has been validated\n");
        }
        else System.out.println("Card is invalid\n");
    }

    public boolean isValid(){
        return validated;
    }
}
