// Question: Write a program of method overloading
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;


class Calculator {
   
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

public class Keshav_09 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        Calculator calc = new Calculator();
   
        System.out.println("Enter two integers to add:");
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        int sum1 = calc.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum1);
        
        System.out.println("\nEnter three integers to add:");
        System.out.print("First number: ");
        int num3 = scanner.nextInt();
        System.out.print("Second number: ");
        int num4 = scanner.nextInt();
        System.out.print("Third number: ");
        int num5 = scanner.nextInt();
        int sum2 = calc.add(num3, num4, num5);
        System.out.println("Sum of " + num3 + ", " + num4 + ", and " + num5 + " = " + sum2);
        

        System.out.println("\nEnter two decimal numbers to add:");
        System.out.print("First number: ");
        double num6 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num7 = scanner.nextDouble();
        double sum3 = calc.add(num6, num7);
        System.out.println("Sum of " + num6 + " and " + num7 + " = " + sum3);
        
    }
}