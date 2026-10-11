public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "BMW";
        car2.brand = "Mercedes";
        car3.brand = "Audi";

        car1.color = "Black";
        car2.color = "White";
        car3.color = "Blue";

        car1.drive();
        car2.drive();
        car3.drive();
        
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

