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

    /**
     * Constructor
     *
     * @param partNumber
     * @param partDescription
     * @param itemQuantity
     * @param itemPrice
     */
    public Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (itemQuantity < 0) {
            this.itemQuantity = 0;
        } else {
            this.itemQuantity = itemQuantity;
        }
        if (itemPrice < 0) {
            this.itemPrice = 0;
        } else {
            this.itemPrice = itemPrice;
        }
    }

    /**
     * getInvoiceAmount
     * <p>Multiplies itemQuantity by itemPrice and returns the result as a double.</p>
     *
     * @return invoiceAmount
     */
    public double getInvoiceAmount() {

        return (double) (itemQuantity * itemPrice);
    }

    /**
     * getPartNumber
     *
     * @return partNumber
     */
    public String getPartNumber() {

        return partNumber;
    }

    /**
     * setPartNumber
     *
     * @param partNumber
     */
    public void setPartNumber(String partNumber) {

        this.partNumber = partNumber;
    }

    /**
     * getPartDescription
     *
     * @return partDescription
     */
    public String getPartDescription() {

        return partDescription;
    }

    /**
     * setPartDescription
     *
     * @param partDescription
     */
    public void setPartDescription(String partDescription) {

        this.partDescription = partDescription;
    }

    /**
     * getItemQuantity
     *
     * @return itemQuantity
     */
    public int getItemQuantity() {

        return itemQuantity;
    }

    /**
     * setItemQuantity
     *
     * @param itemQuantity
     */
    public void setItemQuantity(int itemQuantity) {

        this.itemQuantity = itemQuantity;
    }

    /**
     * getItemPrice
     *
     * @return itemPrice
     */
    public double getItemPrice() {

        return itemPrice;
    }

    /**
     * setItemPrice
     *
     * @param itemPrice
     */
    public void setItemPrice(double itemPrice) {

        this.itemPrice = itemPrice;
    }
}
