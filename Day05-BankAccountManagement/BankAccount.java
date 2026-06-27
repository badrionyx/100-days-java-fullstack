public class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;

        System.out.println("₹" + amount + " Deposited Successfully.");
    }

    public void withdraw(double amount) {

        if (amount > balance) {

            System.out.println("Insufficient Balance.");

        } else {

            balance -= amount;

            System.out.println("₹" + amount + " +\n Withdrawn Successfully..");
        }
    }

    public void display() {

        System.out.println("--------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }
}