abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();

}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Developer is coding..." + name);
    }
}

class Tester extends Employee {
    Tester(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Tester is testing..." + name);
    }
}


public class Demov2 {
    public static void main(String[] args) {
        Employee developer = new Developer("John");
        Employee tester = new Tester("Doe");

        developer.work();
        tester.work();
    }

}
