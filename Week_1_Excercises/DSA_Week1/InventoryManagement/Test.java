import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

  
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

 class InventoryManagementSystem {
    private Map<String, Product> inventory = new HashMap<>();

   
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    
    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    
    public void deleteProduct(String productId) {
        if(inventory.get(productId)==null){
            System.out.println("The stock is empty!");
        }
        else{
        inventory.remove(productId);
        }
    }

    
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        
        Product product1 = new Product("1", "Pepsi", 20, 300);
        Product product2 = new Product("2", "Coke", 21, 1500);
        Product product3 = new Product("3", "Thumbsup", 16, 7900);

        
        System.out.println("\nAdding products");
        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);
        inventorySystem.addProduct(product3);

       
        System.out.println("\nInventory after adding products:");
        inventorySystem.displayProducts();

       
        System.out.println("\nUpdating product with ID 002...");
        inventorySystem.updateProduct("2", 20, 450);

        
        System.out.println("\nInventory after updating products:");
        inventorySystem.displayProducts();

        
        System.out.println("\nDeleting product with ID 003...");
        inventorySystem.deleteProduct("3");

       
        System.out.println("\nInventory after deleting a product:");
        inventorySystem.displayProducts();
    }
}