import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) {
        super(msg);
    }
}

// payment interface
interface Payment {
    void pay(double amount) throws PaymentFailedException;
}

// card payment
class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("Payment failed using Card");
        }
        System.out.println("Paid " + amount + " using Card");
    }
}

// UPI payment
class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("Payment failed using UPI");
        }
        System.out.println("Paid " + amount + " using UPI");
    }
}

// wallet payment
class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("Payment failed using Wallet");
        }
        System.out.println("Paid " + amount + " using Wallet");
    }
}

// product class
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println(id + "  " + name + "  Rs." + price);
    }
}

// customer class
class Customer {
    int customerId;
    String customerName;

    Customer(int id, String name) {
        customerId = id;
        customerName = name;
    }
}

// order class
class Order {
    int orderId;
    Product product;
    Customer customer;
    String status;

    Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "Placed";
    }

    void cancelOrder() {
        status = "Cancelled";
        System.out.println("Order cancelled");
    }

    void trackOrder() {
        System.out.println("Order Status: " + status);
    }
}

// main class
public class ECommerceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // product catalog
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mobile", 15000));
        products.add(new Product(2, "Laptop", 55000));
        products.add(new Product(3, "Headphones", 2000));

        Customer customer = new Customer(101, "Rajat");
        Order order = null;

        int choice;

        do {
            System.out.println("\n1 View Products");
            System.out.println("2 Place Order");
            System.out.println("3 Cancel Order");
            System.out.println("4 Track Order");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    for (Product p : products) {
                        p.showProduct();
                    }
                }

                else if (choice == 2) {
                    System.out.print("Enter product id: ");
                    int pid = sc.nextInt();

                    Product selected = null;
                    for (Product p : products) {
                        if (p.id == pid) {
                            selected = p;
                        }
                    }

                    if (selected == null) {
                        System.out.println("Product not found");
                        continue;
                    }

                    System.out.println("Select Payment Method");
                    System.out.println("1 Card");
                    System.out.println("2 UPI");
                    System.out.println("3 Wallet");
                    int payChoice = sc.nextInt();

                    Payment payment = null;
                    if (payChoice == 1)
                        payment = new CardPayment();
                    else if (payChoice == 2)
                        payment = new UPIPayment();
                    else if (payChoice == 3)
                        payment = new WalletPayment();

                    payment.pay(selected.price);

                    order = new Order(5001, selected, customer);
                    System.out.println("Order placed successfully");
                }

                else if (choice == 3) {
                    if (order != null) {
                        order.cancelOrder();
                    } else {
                        System.out.println("No order to cancel");
                    }
                }

                else if (choice == 4) {
                    if (order != null) {
                        order.trackOrder();
                    } else {
                        System.out.println("No order found");
                    }
                }

            } catch (PaymentFailedException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
