public class Book {

    int bookId;
    String title;
    String author;
    boolean available;

    public Book(int bookId, String title, String author) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void issueBook() {

        if (available) {

            available = false;
            System.out.println("Book Issued Successfully.");

        } else {

            System.out.println("Book is Already Issued.");
        }
    }

    public void returnBook() {

        if (!available) {

            available = true;
            System.out.println("Book Returned Successfully.");

        } else {

            System.out.println("Book is Already Available.");
        }
    }

    public void display() {

        System.out.println("--------------------------------");
        System.out.println("Book ID    : " + bookId);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Status     : " + (available ? "Available" : "Issued"));
    }
}