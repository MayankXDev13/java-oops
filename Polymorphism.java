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

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cow()
        };

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
