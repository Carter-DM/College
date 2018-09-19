package JavaCP2280.Assignment1;
/**
 * Invoice class
 *
 * @author Carter Daly-MacPhail
 */
public class Invoice {

    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double itemPrice;

    public Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice){
        /**
         * Constructor
         *
         * @param partNumber
         * @param partDescription
         * @param itemQuantity
         * @param itemPrice
         */
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public double getInvoiceAmount(){
        /**
         * getInvoiceAmount
         * <p>Multiplies itemQuantity by itemPrice and returns the result as a double.</p>
         *
         * @return invoiceAmount
         */
        if(itemQuantity < 0){
            itemQuantity = 0;
        }
        if(itemPrice < 0){
            itemPrice = 0;
        }
        return (double)(itemQuantity * itemPrice);
    }
}
