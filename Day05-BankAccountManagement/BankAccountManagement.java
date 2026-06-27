import java.util.Scanner;

public class BankAccountManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[100];

        int count = 0;

        int choice;

        do {

            System.out.println("\n========== BANK MANAGEMENT ==========");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Account Number : ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Account Holder : ");
                    String holder = sc.nextLine();

                    System.out.print("Opening Balance : ");
                    double balance = sc.nextDouble();

                    accounts[count++] = new BankAccount(accNo, holder, balance);

                    System.out.println("Account Created Successfully.");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Accounts Available.");

                    } else {

                        for (int i = 0; i < count; i++) {

                            accounts[i].display();                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number : ");
                    int depositAcc = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (accounts[i].accountNumber == depositAcc) {

                            System.out.print("Enter Deposit Amount : ");

                            double amount = sc.nextDouble();

                            accounts[i].deposit(amount);

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Account Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Account Number : ");
                    int withdrawAcc = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (accounts[i].accountNumber == withdrawAcc) {

                            System.out.print("Enter Withdraw Amount : ");

                            double amount = sc.nextDouble();

                            accounts[i].withdraw(amount);

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Account Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Account Number : ");

                    int searchAcc = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (accounts[i].accountNumber == searchAcc) {

                            accounts[i].display();

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Account Not Found.");
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