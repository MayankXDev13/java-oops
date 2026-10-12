public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Car car1 = new Car();
        // Car car2 = new Car();
        // Car car3 = new Car();

        // car1.brand = "BMW";
        // car2.brand = "Mercedes";
        // car3.brand = "Audi";

        // car1.color = "Black";
        // car2.color = "White";
        // car3.color = "Blue";

        // car1.drive();
        // car2.drive();
        // car3.drive();


        Student s1 = new Student("Mayank", 22);
        s1.study();

        // Student s2 = new Student();
        // s2.name = "Ayush";
        // s2.age = 21;
        // s2.study();


        System.out.println(s1.name + " " + s1.age);
        // System.out.println(s2.name + " " + s2.age);
        
    }
}

class Car {
    // Properties
    String brand;
    String color;
    
    
    
    // Methods
    void drive() {
        System.out.println("Driving the " + this.brand + " " + this.color + " car");
    }    
}

// Car --> Car Class 
// brand and color --> properties (attributes)
// drive --> methods (functions)


// class = blueprint or template 
// object = physical instance of a class

// properties = variables 
// methods = functions 




class Student {
    // Instance Fields
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Static Fields
    static String count;

    // Final Fields
    final int id = 101;
    

    // Methods
    void study() {
        System.out.println(this.name + " is studying");
    }


    
    
}

