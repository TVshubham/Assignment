package Solid_Principle;

public class OrderProcessor {
    private IPaymentProcessor paymentProcessor;
    private InvoiceGenerator invoiceGenerator;

    public OrderProcessor(IPaymentProcessor paymentProcessor, InvoiceGenerator invoiceGenerator) {
        this.paymentProcessor = paymentProcessor;
        this.invoiceGenerator = invoiceGenerator;
    }

    public void processOrder(Order order) {
        if (paymentProcessor.processPayment(order.calculateTotal())) {
            System.out.println("Payment Successful.");
            System.out.println(invoiceGenerator.generateInvoice(order));
        } else {
            System.out.println("Payment Failed.");
        }
    }
}


interface IPaymentProcessor {
    boolean processPayment(double amount);
}
class PayPalProcessor implements IPaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        // Simulate PayPal payment processing
        System.out.println("Processing PayPal Payment of $" + amount);
        return true; // assuming payment is successful
    }
}


 class CreditCardProcessor implements IPaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        // Simulate credit card payment processing
        System.out.println("Processing Credit Card Payment of $" + amount);
        return true; // assuming payment is successful
    }
}



