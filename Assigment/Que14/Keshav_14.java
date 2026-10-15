// Question: Write a program of method overriding
// Name: Keshav Rajpoot
// Roll No: 22017C04031

// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Overriding the makeSound method
    void makeSound() {
        System.out.println("Dog says: Woof");
    }
}

public class Keshav_14 {
    public static void main(String[] args) {
        // Create Animal object
        Animal animal = new Animal();
        System.out.println("Calling makeSound for Animal:");
        animal.makeSound();
        
        // Create Dog object
        Dog dog = new Dog();
        System.out.println("\nCalling makeSound for Dog:");
        dog.makeSound();
    }
}