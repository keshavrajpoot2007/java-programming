// Question: Write a program of parametrized constructor
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Student {
    String name;
    int age;
    
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Keshav_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();
        
        Student student = new Student(name, age);
        
        System.out.println("Student Details:");
        student.display();
        
        scanner.close();
    }
}