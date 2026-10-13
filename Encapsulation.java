class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks > 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {
        // BankAccount account = new BankAccount();

        // account.balance = 1000;
        // account.balance = -5000; // invalid
        // System.out.println(account.balance);

        // account.deposit(1000);
        // account.withdraw(500);
        // System.out.println(account.getBalance());

        Student student = new Student();
        student.setMarks(100);
        System.out.println(student.getMarks());

    }
}