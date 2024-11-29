package Solid_Principle;





public class Product implements IStockManager {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean checkStock(int quantity) {
        return this.stock >= quantity;
    }

    @Override
    public void updateStock(int quantity) {
        if (checkStock(quantity)) {
            this.stock -= quantity;
        }
    }

    public String getDetails() {
        return "Product: " + name + ", Price: " + price + ", Stock: " + stock;
    }
}


interface IStockManager {
    boolean checkStock(int quantity);
    void updateStock(int quantity);
}

