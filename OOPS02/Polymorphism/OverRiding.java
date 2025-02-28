package OOPS02.Polymorphism;

public class OverRiding {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();

        Animal myAnimal = new Animal();
        myAnimal.sound();
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class overriding the parent method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
