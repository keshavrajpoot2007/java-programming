// Question: Write a program of hierarchical inheritance
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Animal {
    String name;
    
    Animal(String animalName) {
        name = animalName;
    }
    
    void displayAnimal() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    String breed;
    
    Dog(String dogName, String dogBreed) {
        super(dogName); 
        breed = dogBreed;
    }
    
    void displayDog() {
        displayAnimal(); 
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    String color;
    
    Cat(String catName, String catColor) {
        super(catName); 
        color = catColor;
    }
    
    void displayCat() {
        displayAnimal(); // Call parent method
        System.out.println("Color: " + color);
    }
}

public class Keshav_13 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for Dog:");
        System.out.print("Enter dog name: ");
        String dogName = scanner.nextLine();
        System.out.print("Enter dog breed: ");
        String dogBreed = scanner.nextLine();
        
        Dog dog = new Dog(dogName, dogBreed);
        
        System.out.println("\nEnter details for Cat:");
        System.out.print("Enter cat name: ");
        String catName = scanner.nextLine();
        System.out.print("Enter cat color: ");
        String catColor = scanner.nextLine();
        
        Cat cat = new Cat(catName, catColor);
        
        System.out.println("\nDog Details:");
        dog.displayDog();
        
        System.out.println("\nCat Details:");
        cat.displayCat();
        
    }
}