class Book{
    public int ISBN ;
    protected String title;
    private String author ;
    Book(int ISBN , String title , String author){
        this.ISBN = ISBN;
        this.title = title;
        setauthorName(author);
    }
    // method to modify the cgpa
    public void setauthorName(String author){
        this.author = author;
    } 
    // method to access cgpa
    public String getauthorName(){
        return this.author;
    }
}
class EBook extends Book{
    EBook(int ISBN , String title , String author){
        super(ISBN, title, author);
    }


        void displayDetails(){
        System.out.println("ISBN : " + ISBN ); 
        System.out.println("Title: " + title);              
        System.out.println("Author: " + getauthorName());         
    }
}

public class BookLibrarySystem {
    public static void main(String [] args ){
        EBook book = new EBook(12324543,"the oth" ,"rajat");
        book.displayDetails();
    }
}
