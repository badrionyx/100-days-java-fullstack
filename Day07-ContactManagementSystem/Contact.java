public class Contact {

    int id;
    String name;
    String phone;
    String email;

    public Contact(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Contact ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Phone      : " + phone);
        System.out.println("Email      : " + email);
    }
}