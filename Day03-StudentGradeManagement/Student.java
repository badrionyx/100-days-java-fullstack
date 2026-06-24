public class Student {

    int id;
    String name;
    int mark1;
    int mark2;
    int mark3;

    public Student(int id, String name, int mark1, int mark2, int mark3) {
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getTotal() {
        return mark1 + mark2 + mark3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {

        double avg = getAverage();

        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void display() {

        System.out.println("========================");
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Total      : " + getTotal());
        System.out.printf("Average    : %.2f%n", getAverage());
        System.out.println("Grade      : " + getGrade());
        System.out.println("========================");
    }
}