class Book{
    String title;
    String author ;
    double price;
    String availability ;
    // default constructor 
    Book(){
        this.title = "Maths";
        this.author = "R.S Agrawal";
        this.price = 1000;
        this.availability = "Available";
    }
    // parametarized constructor 
    Book(String title , String author , double price,String availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    // method to check avilablity
    public void borrowBook() {
        if (availability.equalsIgnoreCase("Available")) {
            availability = "Not Available";
            System.out.println(title + " has been borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // display method
    public void display(){
        System.out.println("the title of book is :  "+ title);
        System.out.println("the author of book is :  "+ author);
        System.out.println("the price of book is :  "+ price);
        System.out.println("the availability of book is :  "+availability);
    }

    
} 


public class LibraryBookSystem {
    public static void main(String [] args ){
        Book b1 = new Book();
        b1.display();

        Book b2 = new Book("Java Programming", "James Gosling", 800, "Available");
        b2.display();

        b2.borrowBook();
        b2.display();
    }


}
