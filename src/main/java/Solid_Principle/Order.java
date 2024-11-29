package Solid_Principle;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalAmount;

    public Order() {
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addProduct(Product product, int quantity) {
        if (product.checkStock(quantity)) {
            products.add(product);
            totalAmount += product.getPrice() * quantity;
            product.updateStock(quantity);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        return totalAmount;
    }
}
