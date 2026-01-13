import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

// fine calculator interface
interface FineCalculator {
    double calculateFine(int daysLate);
}

// base user class
class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// member class
class Member extends User {
    ArrayList<Book> issuedBooks = new ArrayList<>();

    Member(int id, String name) {
        super(id, name);
    }
}

// student member (polymorphism)
class StudentMember extends Member implements FineCalculator {

    StudentMember(int id, String name) {
        super(id, name);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 2;   // low fine
    }
}

// staff member (polymorphism)
class StaffMember extends Member implements FineCalculator {

    StaffMember(int id, String name) {
        super(id, name);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 5;   // higher fine
    }
}

// book class
class Book {
    int bookId;
    String title;
    boolean available = true;

    Book(int id, String title) {
        this.bookId = id;
        this.title = title;
    }

    void showBook() {
        System.out.println(bookId + "  " + title +
                "  Available: " + available);
    }
}

// transaction class
class Transaction {
    Book book;
    Member member;
    int daysLate;

    Transaction(Book book, Member member, int daysLate) {
        this.book = book;
        this.member = member;
        this.daysLate = daysLate;
    }
}

// main system
public class LibraryManagementSystem_ {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Member> members = new ArrayList<>();
    static ArrayList<Transaction> transactions = new ArrayList<>();

    static Book findBook(int id) {
        for (Book b : books)
            if (b.bookId == id)
                return b;
        return null;
    }

    static Member findMember(int id) {
        for (Member m : members)
            if (m.id == id)
                return m;
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        books.add(new Book(1, "Java Programming"));
        books.add(new Book(2, "Data Structures"));
        books.add(new Book(3, "Operating Systems"));

        members.add(new StudentMember(101, "Rajat"));
        members.add(new StaffMember(102, "Amit"));

        int choice;

        do {
            System.out.println("\n1 View Books");
            System.out.println("2 Register Member");
            System.out.println("3 Issue Book");
            System.out.println("4 Return Book");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    for (Book b : books)
                        b.showBook();
                }

                else if (choice == 2) {
                    System.out.print("1 Student  2 Staff: ");
                    int type = sc.nextInt();
                    System.out.print("Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    if (type == 1)
                        members.add(new StudentMember(id, name));
                    else
                        members.add(new StaffMember(id, name));

                    System.out.println("Member registered");
                }

                else if (choice == 3) {
                    System.out.print("Book id: ");
                    int bid = sc.nextInt();
                    System.out.print("Member id: ");
                    int mid = sc.nextInt();

                    Book book = findBook(bid);
                    Member member = findMember(mid);

                    if (book == null || member == null) {
                        System.out.println("Invalid details");
                        continue;
                    }

                    if (!book.available) {
                        throw new BookNotAvailableException("Book not available");
                    }

                    book.available = false;
                    member.issuedBooks.add(book);
                    transactions.add(new Transaction(book, member, 0));

                    System.out.println("Book issued");
                }

                else if (choice == 4) {
                    System.out.print("Book id: ");
                    int bid = sc.nextInt();
                    System.out.print("Member id: ");
                    int mid = sc.nextInt();
                    System.out.print("Days late: ");
                    int days = sc.nextInt();

                    Book book = findBook(bid);
                    Member member = findMember(mid);

                    if (book == null || member == null) {
                        System.out.println("Invalid details");
                        continue;
                    }

                    book.available = true;
                    member.issuedBooks.remove(book);

                    double fine = 0;
                    if (member instanceof FineCalculator) {
                        fine = ((FineCalculator) member).calculateFine(days);
                    }

                    System.out.println("Book returned");
                    System.out.println("Fine = Rs. " + fine);
                }

            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
