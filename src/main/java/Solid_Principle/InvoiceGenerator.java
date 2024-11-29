package Solid_Principle;

public class InvoiceGenerator {
    public String generateInvoice(Order order) {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice for Order: \n");
        for (Product product : order.getProducts()) {
            invoice.append(product.getDetails()).append("\n");
        }
        invoice.append("Total Amount: " + order.calculateTotal() + "\n");
        return invoice.toString();
    }
}

