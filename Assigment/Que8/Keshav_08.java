// Question: Write a program of parametrized constructor with multiple objects
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Book {
    String title;
    double price;
    
    Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
    }
    
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
    }
}

public class Keshav_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter details for Book 1:");
        System.out.print("Enter book title: ");
        String title1 = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        Book book1 = new Book(title1, price1);
        
        System.out.println("Enter details for Book 2:");
        System.out.print("Enter book title: ");
        String title2 = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        Book book2 = new Book(title2, price2);
        
        // Input and create third book
        System.out.println("Enter details for Book 3:");
        System.out.print("Enter book title: ");
        String title3 = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price3 = scanner.nextDouble();
        Book book3 = new Book(title3, price3);
        
        System.out.println("\nDetails of all Books:");
        System.out.println("Book 1:");
        book1.display();
        System.out.println("Book 2:");
        book2.display();
        System.out.println("Book 3:");
        book3.display();
        

    }
}