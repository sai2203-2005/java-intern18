import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.printf(
            "%-10d %-20s %-12.2f %-10d%n",
            id, name, price, quantity
        );
    }
}

public class Practise {
    static ArrayList<Product> inventory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    displayProducts();
                    break;
                case 6:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }

    static Product findProduct(int id) {
        for (Product p : inventory) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    static void addProduct() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        if (findProduct(id) != null) {
            System.out.println("Product ID already exists!");
            return;
        }

        sc.nextLine(); // Consume newline

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Price and quantity cannot be negative.");
            return;
        }

        inventory.add(new Product(id, name, price, quantity));
        System.out.println("Product added successfully!");
    }

    static void removeProduct() {
        System.out.print("Enter product ID to remove: ");
        int id = sc.nextInt();

        Product p = findProduct(id);

        if (p != null) {
            inventory.remove(p);
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    static void searchProduct() {
        System.out.print("Enter product ID to search: ");
        int id = sc.nextInt();

        Product p = findProduct(id);

        if (p != null) {
            System.out.println("\nProduct found:");
            System.out.printf(
                "%-10s %-20s %-12s %-10s%n",
                "ID", "Name", "Price", "Quantity"
            );
            p.display();
        } else {
            System.out.println("Product not found!");
        }
    }

    static void updateProduct() {
        System.out.print("Enter product ID to update: ");
        int id = sc.nextInt();

        Product p = findProduct(id);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter new product name: ");
        String name = sc.nextLine();

        System.out.print("Enter new price: ");
        double price = sc.nextDouble();

        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Price and quantity cannot be negative.");
            return;
        }

        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);

        System.out.println("Product updated successfully!");
    }

    static void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.printf(
            "%-10s %-20s %-12s %-10s%n",
            "ID", "Name", "Price", "Quantity"
        );

        System.out.println("----------------------------------------------------");

        for (Product p : inventory) {
            p.display();
        }
    }
}
