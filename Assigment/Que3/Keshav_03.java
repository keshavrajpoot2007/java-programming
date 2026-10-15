// Question: Write a program to print even and odd numbers between 1 to 100
// Name: Keshav Rajpoot
// Roll No: 22017C04031

public class Keshav_03 {
    public static void main(String[] args) {

        System.out.println("Even numbers between 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        
        System.out.println("Odd numbers between 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}