public class Patient {

    int patientId;
    String name;
    int age;
    String disease;

    public Patient(int patientId, String name, int age, String disease) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void display() {

        System.out.println("--------------------------------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Disease    : " + disease);
    }
}