package users;

public class Admin extends User{
    public void printRole() {
        System.out.println("Role: " + this.role);
    }

    public static void main(String[] args) {
        new Admin().printRole();
    }
}
