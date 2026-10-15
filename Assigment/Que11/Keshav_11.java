// Question: Write a program of single level inheritance
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Person {
    String name;
    int age;
    
    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }
    
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String rollNo;
    
    Student(String studentName, int studentAge, String studentRollNo) {
        super(studentName, studentAge); 
        rollNo = studentRollNo;
    }
    
    void displayStudent() {
        displayPerson(); 
        System.out.println("Roll No: " + rollNo);
    }
}

public class Keshav_11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        System.out.println("Enter student roll number: ");
        String rollNo = scanner.nextLine();
        
        Student student = new Student(name, age, rollNo);
        
        System.out.println("\nStudent Details:");
        student.displayStudent();
        
        
    }
}