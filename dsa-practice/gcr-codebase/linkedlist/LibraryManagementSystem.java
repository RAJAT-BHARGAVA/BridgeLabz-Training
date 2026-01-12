class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;

    BookNode prev;
    BookNode next;

    BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

class LibraryDoublyLinkedList {
    private BookNode head;
    private BookNode tail;
    private int count = 0;

    // Add at beginning
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }

    // Add at end
    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (pos <= 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            count++;
        }
    }

    // Remove by Book ID
    public void removeByBookId(int bookId) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                count--;
                System.out.println("Book removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Search by title
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    // Search by author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // Update availability status
    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability status updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    public int countBooks() {
        return count;
    }

    private void displayBook(BookNode book) {
        System.out.println("ID: " + book.bookId +
                ", Title: " + book.title +
                ", Author: " + book.author +
                ", Genre: " + book.genre +
                ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning("Java Basics", "James Gosling", "Programming", 101, true);
        library.addAtEnd("Clean Code", "Robert Martin", "Software", 102, true);
        library.addAtPosition(2, "Data Structures", "Mark Weiss", "CS", 103, false);

        System.out.println("Library Books (Forward):");
        library.displayForward();

        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Robert Martin");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);

        System.out.println("\nRemove Book:");
        library.removeByBookId(101);

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
