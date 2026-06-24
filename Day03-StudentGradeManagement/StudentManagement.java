public class StudentManagement {

    public static void main(String[] args) {

        Student[] students = {
                new Student(101, "Badri", 90, 85, 95),
                new Student(102, "Ravi", 70, 75, 80),
                new Student(103, "Arun", 55, 60, 50),
                new Student(104, "Kumar", 95, 98, 97)
        };

        double classTotal = 0;

        Student topper = students[0];

        System.out.println("\nSTUDENT REPORT\n");

        for (Student s : students) {

            s.display();

            classTotal += s.getAverage();

            if (s.getAverage() > topper.getAverage()) {
                topper = s;
            }
        }

        double classAverage = classTotal / students.length;

        System.out.println("\n===== BONUS REPORT =====");

        System.out.println("Topper Name    : " + topper.name);
        System.out.printf("Topper Average : %.2f%n", topper.getAverage());

        System.out.printf("Class Average  : %.2f%n", classAverage);
    }
}