public class Books {
    public static void main(String [] args  ){
        Book book = new Book();
        book.display();
        Book book2 = new Book("abc" , "xyz" , 123.0987);
        book2.display();
    }   

}
class Book{
    String title;
    String author ;
    double price;
    // default constructor 
    Book(){
        title = "Maths";
        author = "R.S Agrawal";
        price = 1000;
    }
    // parametarized constructor 
    Book(String title , String author , double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // display method
    void display(){
        System.out.println("the title of book is :  "+ title);
        System.out.println("the author of book is :  "+ author);
        System.out.println("the price of book is :  "+ price);
    }
} 

