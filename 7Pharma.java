import java.util.ArrayList;



// Class to manage pharmacy operations
public class 7Pharma {
    ArrayList<Product> list = new ArrayList<>();

    // Add a new product
    public void add(int uid, String name, int quantity, int price) {
        Product p = new Product(uid, name, quantity, price);
        list.add(p);
        System.out.println("Product added: " + name);
    }

    // Update the quantity of a product
    public void update(int uid, int quantity) {
        boolean found = false;
        for (Product p : list) {
            if (p.uid == uid) {
                p.quantity += quantity;
                System.out.println("Product updated: " + p.name + " (+" + quantity + ")");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    // Delete a product by UID (simpler version)
    public void del(int uid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).uid == uid) {
                System.out.println("Product deleted: " + list.get(i).name);
                list.remove(i);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Search and display a product by UID
    public void search(int uid) {
        for (Product p : list) {
            if (p.uid == uid) {
                p.display();
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Display all products in the inventory
    public void display() {
        if (list.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Product p : list) {
                p.display();
            }
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Pharma inventory = new Pharma();

        inventory.add(101, "Paracetamol", 50, 5);
        inventory.add(102, "Ibuprofen", 100, 10);
        inventory.add(103, "Amoxicillin", 75, 15);

        inventory.display();

        System.out.println("\n-- Updating Quantity --");
        inventory.update(102, 25);

        System.out.println("\n-- Searching for Product UID 101 --");
        inventory.search(101);

        System.out.println("\n-- Deleting Product UID 103 --");
        inventory.del(103);

        System.out.println("\n-- Final Inventory --");
        inventory.display();
    }
}

// Class to represent a product in the pharmacy
class Product {
    int uid;
    String name;
    int quantity;
    int price;

    Product(int uid, String name, int quantity, int price) {
        this.uid = uid;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("UID: " + uid + ", Name: " + name +
                           ", Quantity: " + quantity + ", Price: " + price);
    }
}
