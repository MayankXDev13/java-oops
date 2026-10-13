class Animal {
   void sound() {
    System.out.println("Animal sound...");
   }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barking...");
    }
   
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
