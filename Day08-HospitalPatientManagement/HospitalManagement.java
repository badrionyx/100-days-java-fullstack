import java.util.Scanner;

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient[] patients = new Patient[100];

        int count = 0;

        int choice;

        do {

            System.out.println("\n========== HOSPITAL MANAGEMENT ==========");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Disease");
            System.out.println("5. Discharge Patient");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Patient ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Patient Name : ");
                    String name = sc.nextLine();

                    System.out.print("Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Disease : ");
                    String disease = sc.nextLine();

                    patients[count++] = new Patient(id, name, age, disease);

                    System.out.println("Patient Added Successfully.");

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Patients Available.");

                    } else {

                        for (int i = 0; i < count; i++) {

                            patients[i].display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Patient ID : ");

                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (patients[i].patientId == searchId) {

                            patients[i].display();

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Patient Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Patient ID : ");

                    int updateId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (patients[i].patientId == updateId) {

                            sc.nextLine();

                            System.out.print("New Disease : ");

                            patients[i].disease = sc.nextLine();

                            System.out.println("Disease Updated Successfully.");

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Patient Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Patient ID : ");

                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (patients[i].patientId == deleteId) {

                            for (int j = i; j < count - 1; j++) {

                                patients[j] = patients[j + 1];
                            }

                            patients[count - 1] = null;

                            count--;

                            System.out.println("Patient Discharged Successfully.");

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Patient Not Found.");
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