// Question: Write a program of hybrid inheritance
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

interface Skill {
    void displaySkill();
}

class Person {
    String name;
    
    Person(String personName) {
        name = personName;
    }
    
    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person implements Skill {
    String rollNo;
    
    Student(String studentName, String studentRollNo) {
        super(studentName); 
        rollNo = studentRollNo;
    }
    
    void displayStudent() {
        displayPerson(); // Call parent method
        System.out.println("Roll No: " + rollNo);
    }
    
    public void displaySkill() {
        System.out.println("Skill: Academic excellence");
    }
}

class Employee extends Person {
    String employeeId;
    
    Employee(String empName, String empId) {
        super(empName); 
        employeeId = empId;
    }
    void displayEmployee() {
        displayPerson(); 
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Keshav_17 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for Student:");
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        String rollNo = scanner.nextLine();
        
        Student student = new Student(studentName, rollNo);
        
        System.out.println("\nEnter details for Employee:");
        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String empId = scanner.nextLine();
        
        // Create Employee object
        Employee employee = new Employee(empName, empId);
        
        System.out.println("\nStudent Details:");
        student.displayStudent();
        student.displaySkill(); 
        
        System.out.println("\nEmployee Details:");
        employee.displayEmployee();
        
    
    }
}