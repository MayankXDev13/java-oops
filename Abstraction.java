abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barking...");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meowing...");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow Mooing...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
        cow.sound();
        cow.eat();
    }
}
