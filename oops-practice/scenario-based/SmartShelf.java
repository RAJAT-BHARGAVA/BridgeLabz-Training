import java.util.Scanner;

// book class
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

// main class
public class SmartShelf {

    static Book[] shelf = new Book[50];
    static int count = 0;

    // insertion sort when new book is added
    static void insertBook(Book b) {
        shelf[count] = b;
        int i = count - 1;

        // shift books to right
        while (i >= 0 && shelf[i].title.compareToIgnoreCase(b.title) > 0) {
            shelf[i + 1] = shelf[i];
            i--;
        }

        shelf[i + 1] = b;
        count++;

        System.out.println("Book added and shelf sorted");
    }

    static void showShelf() {
        if (count == 0) {
            System.out.println("Shelf is empty");
            return;
        }

        System.out.println("Books on SmartShelf:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + shelf[i].title);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1 Add Book");
            System.out.println("2 View Shelf");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();
                insertBook(new Book(title));
            }

            else if (choice == 2) {
                showShelf();
            }

        } while (choice != 0);

        sc.close();
    }
}
