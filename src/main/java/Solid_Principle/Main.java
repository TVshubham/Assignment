package Solid_Principle;

public class Main {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 999.99, 10);
        Product product2 = new Product("Smartphone", 699.99, 5);

        // Creating a customer
        Customer customer = new Customer("John Doe", "john.doe@example.com", "123 Elm Street");

        // Creating an order
        Order order = new Order();
        order.addProduct(product1, 2); // Adding 2 Laptops
        order.addProduct(product2, 1); // Adding 1 Smartphone

        // Creating payment processors
        IPaymentProcessor creditCardProcessor = new CreditCardProcessor();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        // Creating an order processor and processing the order
        OrderProcessor orderProcessor = new OrderProcessor(creditCardProcessor, invoiceGenerator);
        orderProcessor.processOrder(order);  // Process order with credit card payment
    }
}



