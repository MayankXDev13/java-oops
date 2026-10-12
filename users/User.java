package users;

public class User {
    String name = "Mayank";
    private String password = "secret1234";
    protected String role = "USER";

    void printPassword() {
        System.out.println(this.password);
    }
}

// class Main{
//     public static void main(String[] args) {
//         User user = new User();

//         System.err.println(user.name);
//     }
// }