import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

// alert interface
interface AlertService {
    void checkStock(Product p);
}

// product class
class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void showProduct() {
        System.out.println(id + "  " + name + "  Qty: " + quantity);
    }
}

// inventory class
class Inventory implements AlertService {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added");
    }

    void updateStock(int id, int qty) throws OutOfStockException {
        for (Product p : products) {
            if (p.id == id) {
                if (qty < 0 && p.quantity + qty < 0) {
                    throw new OutOfStockException("Not enough stock");
                }
                p.quantity = p.quantity + qty;
                System.out.println("Stock updated");
                return;
            }
        }
        System.out.println("Product not found");
    }

    void showInventory() {
        for (Product p : products) {
            p.showProduct();
        }
    }

    public void checkStock(Product p) {
        if (p.quantity <= 5) {
            System.out.println("ALERT: Low stock for " + p.name);
        }
    }

    void checkAllStocks() {
        for (Product p : products) {
            checkStock(p);
        }
    }
}

// main class
public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int choice;

        do {
            System.out.println("\n1 Add Product");
            System.out.println("2 Update Stock");
            System.out.println("3 View Inventory");
            System.out.println("4 Check Low Stock");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Product id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Product name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    inventory.addProduct(new Product(id, name, qty));
                }

                else if (choice == 2) {
                    System.out.print("Product id: ");
                    int id = sc.nextInt();
                    System.out.print("Quantity change (+/-): ");
                    int qty = sc.nextInt();
                    inventory.updateStock(id, qty);
                }

                else if (choice == 3) {
                    inventory.showInventory();
                }

                else if (choice == 4) {
                    inventory.checkAllStocks();
                }

            } catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
