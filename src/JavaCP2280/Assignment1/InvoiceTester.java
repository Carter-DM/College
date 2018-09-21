package JavaCP2280.Assignment1;

/**
 * Simple tester for Invoice class
 *
 * @author Carter Daly-MacPhail
 */
public class InvoiceTester {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("10827", "30in x 2in PVC Pipe", 20, 7.50);
        System.out.printf("Part Number: %s\nPart Description: %s\nItem Quantity: %d\nItem Price: %.2f\n\n",
                invoice.getPartNumber(),
                invoice.getPartDescription(),
                invoice.getItemQuantity(),
                invoice.getItemPrice());
        System.out.printf("Total invoice amount: $%.2f",invoice.getInvoiceAmount());
    }
}
