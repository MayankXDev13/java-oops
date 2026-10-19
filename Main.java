public class Main {
    public static void main(String[] args) {
        
        
    }
}


class Animal {
    void eat() {
        System.out.println("Animal eat...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog bark...");
    }
}








class Engine{
    void start(){
        System.out.println("Engine Start...");
    }   
}

class Car {
    Engine engine = new Engine();    
    void startCar(){
        engine.start();
    }
}


class Processor{
    void start(){
        System.out.println("Processor Start...");
    }
}

class Laptop {
    Processor processor = new Processor();
    void startLaptop(){
        processor.start();
    }
}