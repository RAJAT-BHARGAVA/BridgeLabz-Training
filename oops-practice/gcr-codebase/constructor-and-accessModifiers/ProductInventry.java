class Product{
    // instance varuable
    String productName;
    int price;
    // class variable
    static int totalProducts = 100;
    Product(){
        this.productName = "BMW";
        this.price = 100000000 ;
    }

    Product(String productName , int price){
        this.productName = productName;
        this.price = price ;
    }
    // method to display details 
    void displayProductDetails(){
        System.out.println("Product Name :  "+productName);
        System.out.println("Product price :  "+price);
    }
    //class method to display total product
    static void displayTotalProducts(){
        System.out.println("The total Product : "+totalProducts);
    }
}
public class ProductInventry {
    public static void main (String []args){
        Product product = new Product();
        product.displayProductDetails();
        Product.displayTotalProducts();
    }
}
