import java.util.Scanner;

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========= CONTACT MANAGEMENT =========");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Phone Number");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Contact ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Phone : ");
                    String phone = sc.nextLine();

                    System.out.print("Email : ");
                    String email = sc.nextLine();

                    contacts[count++] = new Contact(id, name, phone, email);

                    System.out.println("Contact Added Successfully.");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Contacts Available.");

                    } else {

                        for (int i = 0; i < count; i++) {
                            contacts[i].display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Contact ID : ");

                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (contacts[i].id == searchId) {

                            contacts[i].display();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Contact ID : ");

                    int updateId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (contacts[i].id == updateId) {

                            sc.nextLine();

                            System.out.print("New Phone Number : ");

                            contacts[i].phone = sc.nextLine();

                            System.out.println("Phone Number Updated Successfully.");

                            found = true;

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Contact ID : ");

                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (contacts[i].id == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                contacts[j] = contacts[j + 1];
                            }

                            contacts[count - 1] = null;

                            count--;

                            System.out.println("Contact Deleted Successfully.");

                            found = true;

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }

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