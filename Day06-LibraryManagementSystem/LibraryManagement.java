import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== LIBRARY MANAGEMENT ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Book ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Book Title : ");
                    String title = sc.nextLine();

                    System.out.print("Author : ");
                    String author = sc.nextLine();

                    books[count++] = new Book(id, title, author);

                    System.out.println("Book Added Successfully.");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Books Found.");

                    } else {

                        for (int i = 0; i < count; i++) {

                            books[i].display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (books[i].bookId == searchId) {

                            books[i].display();

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Book ID : ");
                    int issueId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (books[i].bookId == issueId) {

                            books[i].issueBook();

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Book ID : ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (books[i].bookId == returnId) {

                            books[i].returnBook();

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");

                    break;

                case 6:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}