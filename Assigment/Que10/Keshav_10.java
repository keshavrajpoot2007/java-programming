// Question: Write a program of constructor overloading
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Car {
    String brand;
    double price;

    Car() {
        brand = "Unknown";
        price = 0.0;
    }
    
    Car(String carBrand) {
        brand = carBrand;
        price = 100000.0; 
    }
    
    Car(String carBrand, double carPrice) {
        brand = carBrand;
        price = carPrice;
    }
    
    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);
    }
}

public class Keshav_10 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        Car car1 = new Car();
        System.out.println("Car 1 Details (No parameters):");
        car1.display();
        
        System.out.println("\nEnter details for Car 2:");
        System.out.print("Enter car brand: ");
        String brand2 = scanner.nextLine();
        Car car2 = new Car(brand2);
        System.out.println("Car 2 Details (Brand only):");
        car2.display();
        
        System.out.println("\nEnter details for Car 3:");
        System.out.print("Enter car brand: ");
        String brand3 = scanner.nextLine();
        System.out.print("Enter car price: ");
        double price3 = scanner.nextDouble();
        Car car3 = new Car(brand3, price3);
        System.out.println("Car 3 Details (Brand and Price):");
        car3.display();
        
    }
}