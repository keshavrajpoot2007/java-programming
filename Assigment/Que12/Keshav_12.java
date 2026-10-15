// Question: Write a program of multi-level inheritance
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

class Employee extends Person {
    String employeeId;
    
    Employee(String empName, int empAge, String empId) {
        super(empName, empAge); 
        employeeId = empId;
    }
    
    void displayEmployee() {
        displayPerson(); 
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;
    
    Manager(String mgrName, int mgrAge, String mgrId, String mgrDept) {
        super(mgrName, mgrAge, mgrId); // Call parent constructor
        department = mgrDept;
    }
    
    void displayManager() {
        displayEmployee(); 
        System.out.println("Department: " + department);
    }
}

public class Keshav_12 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter manager name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter manager age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Enter manager employee ID: ");
        String empId = scanner.nextLine();
        
        System.out.println("Enter manager department: ");
        String department = scanner.nextLine();
        
        Manager manager = new Manager(name, age, empId, department);
        
        System.out.println("\nManager Details:");
        manager.displayManager();
        
    }
}