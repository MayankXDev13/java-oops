package users;

public class UserService {
    public void printRole() {
        User user = new  User();
        System.out.println("Role: " + user.role);
    }

    public static void main(String[] args) {
        new UserService().printRole();
    }
}
