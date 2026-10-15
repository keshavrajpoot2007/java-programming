// Question: Write a program to calculate area of circle, square, rectangle, and triangle (using return type function)
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class AreaCalculator {

    double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    

    double calculateSquareArea(double side) {
        return side * side;
    }
    

    double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    

    double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}

public class Keshav_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + calc.calculateCircleArea(radius));
                break;
            case 2:
                System.out.print("Enter side of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of square: " + calc.calculateSquareArea(side));
                break;
            case 3:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of rectangle: " + calc.calculateRectangleArea(length, width));
                break;
            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + calc.calculateTriangleArea(base, height));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
    }
}