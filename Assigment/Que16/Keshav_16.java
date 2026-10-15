// Question: Write a program of multiple inheritance
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

interface Singer {
    void sing();
}

interface Dancer {
    void dance();
}

class Performer implements Singer, Dancer {
    String name;
    
    Performer(String performerName) {
        name = performerName;
    }
    
    public void sing() {
        System.out.println(name + " is singing a song.");
    }
    
    public void dance() {
        System.out.println(name + " is performing a dance.");
    }
}

public class Keshav_16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter performer's name: ");
        String name = scanner.nextLine();
        
        Performer performer = new Performer(name);
        
        System.out.println("\nPerformer Actions:");
        performer.sing();
        performer.dance();
        
   
    }
}