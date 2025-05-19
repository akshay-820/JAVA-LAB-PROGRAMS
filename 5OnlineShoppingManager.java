import java.util.Vector;

public class 5OnlineShoppingManager {
    Vector<Product> list = new Vector<>();

    public void addEle(String name, int quantity, String type) {
        Product p = new Product(name, quantity, type);
        list.add(p);
    }

    public void remove(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)) {
                list.remove(i);
                break;
            }
        }
    }

    public void display() {
        System.out.println("Inventory:");
        for (Product product : list) {
            System.out.println("Name: " + product.name + " | Quantity: " + product.quantity + " | Type: " + product.type);
        }
    }

    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();
        manager.addEle("milk", 8, "dairy");
        manager.addEle("aata", 5, "grocery");
        manager.display();
        manager.remove("milk");
        manager.display();
    }

    public static class Product { // Changed Product1 to Product and made it static
        String name;
        int quantity;
        String type;

        Product(String name, int quantity, String type) {
            this.name = name;
            this.quantity = quantity;
            this.type = type;
        }
    }
}
