import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price +
               " | Rating: " + rating +
               " | Discount: " + discount + "%";
    }
}

public class ProductSort {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Phone", 20000, 4.5, 10),
            new Product("Laptop", 60000, 4.8, 15),
            new Product("Headphones", 3000, 4.1, 25)
        );

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        products.sort((p1, p2) -> p2.discount - p1.discount);
        products.forEach(System.out::println);
    }
}