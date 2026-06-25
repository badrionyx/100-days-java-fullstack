import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== Employee Management ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Employee ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Employee Name : ");
                    String name = sc.nextLine();

                    System.out.print("Department : ");
                    String dept = sc.nextLine();

                    System.out.print("Salary : ");
                    double salary = sc.nextDouble();

                    employees[count++] = new Employee(id, name, dept, salary);

                    System.out.println("Employee Added Successfully.");

                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Employees Found.");
                    } else {

                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].id == searchId) {

                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID : ");
                    int updateId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].id == updateId) {

                            System.out.print("New Salary : ");
                            employees[i].salary = sc.nextDouble();

                            System.out.println("Salary Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Employee ID : ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].id == deleteId) {

                            for (int j = i; j < count - 1; j++) {

                                employees[j] = employees[j + 1];

                            }

                            employees[count - 1] = null;

                            count--;

                            System.out.println("Employee Deleted Successfully.");

                            found = true;

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
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