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

    public Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice) {
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

        if (itemQuantity < 0) {
            throw new IllegalArgumentException("Item quantity must be positive.");
        } else {
            this.itemQuantity = itemQuantity;
        }
        if (itemPrice < 0) {
            throw new IllegalArgumentException("Item price must be positive.");
        } else {
            this.itemPrice = itemPrice;
        }
    }

    public double getInvoiceAmount() {
        /**
         * getInvoiceAmount
         * <p>Multiplies itemQuantity by itemPrice and returns the result as a double.</p>
         *
         * @return invoiceAmount
         */
        if (itemQuantity < 0) {
            itemQuantity = 0;
        }
        if (itemPrice < 0) {
            itemPrice = 0;
        }
        return (double) (itemQuantity * itemPrice);
    }

    public String getPartNumber() {
        /**
         * getPartNumber
         * @return partNumber
         */
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        /**
         * setPartNumber
         * @param partNumber
         */
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        /**
         * getPartDescription
         * @return partDescription
         */
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        /**
         * setPartDescription
         * @param partDescription
         */
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {
        /**
         * getItemQuantity
         * @return itemQuantity
         */
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        /**
         * setItemQuantity
         * @param itemQuantity
         */
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        /**
         * getItemPrice
         * @return itemPrice
         */
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        /**
         * setItemPrice
         * @param itemPrice
         */
        this.itemPrice = itemPrice;
    }
}
