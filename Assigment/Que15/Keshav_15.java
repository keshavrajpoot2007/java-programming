// Question: Write a program of abstract
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

abstract class Shape {
    
    abstract double calculateArea();
    
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double r) {
        radius = r;
    }
    
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    double calculateArea() {
        return length * width;
    }
}

public class Keshav_15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        
        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        
        System.out.println("\nShape Details:");
        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());
        
        System.out.println();
        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        

    }
}