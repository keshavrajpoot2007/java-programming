// Question: Write a program to add 4 numbers, subtract 2 numbers, and multiply 3 numbers (using separate classes)
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Add{
    
    double num1, num2, num3, num4;

    void add(){

        System.out.print("Addition = ");
        System.out.println(num1 + num2 + num3 + num4);
    }
}

class Sub{

    double num1, num2;

    void sub(){

        System.out.print("Subtraction = ");
        System.out.println(num1 - num2);
    }
}

class Multi{

    double num1, num2, num3;

    void multi(){

        System.out.print("Multiplication = ");
        System.out.println(num1 * num2 * num3);
    }
}

class Keshav_05{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char again;

        do{

            System.out.println("Choose number for calculation :-");
            System.out.println("1 = Addition");
            System.out.println("2 = Substraction");
            System.out.println("3 = Multiplication");
        
            System.out.print("Enter your Choice (in number) = ");
            int choice = sc.nextInt();
    
            if(choice == 1){
    
                Add myAdd = new Add();
    
                System.out.print("Enter 1st number = ");
                myAdd.num1 = sc.nextInt();
    
                System.out.print("Enter 2nd number = ");
                myAdd.num2 = sc.nextInt();
    
                System.out.print("Enter 3rd number = ");
                myAdd.num3 = sc.nextInt();
    
                myAdd.add();

                System.out.print("Are you want to continue (y/n).. ");
                again = sc.next().charAt(0);
            }
    
            else if(choice == 2){
    
                Sub mySub = new Sub();
    
                System.out.print("Enter 1st number = ");
                mySub.num1 = sc.nextInt();
    
                System.out.print("Enter 2nd number = ");
                mySub.num2 = sc.nextInt();
    
                mySub.sub();

                System.out.print("Are you want to continue (y/n).. ");
                again = sc.next().charAt(0);
            }
    
            else if(choice == 3){
    
                Multi myMulti = new Multi();
    
                System.out.print("Enter 1st number = ");
                myMulti.num1 = sc.nextInt();
    
                System.out.print("Enter 2nd number = ");
                myMulti.num2 = sc.nextInt();
    
                System.out.print("Enter 3rd number = ");
                myMulti.num3 = sc.nextInt();
    
                myMulti.multi();

                System.out.print("Are you want to continue (y/n).. ");
                again = sc.next().charAt(0);
            }
    
            else{
    
                System.err.println("You Enter Invalid Choice");
                System.out.println("Please Renter Choice");

                again = 'y';
            }
        }while(again == 'y');
    }

}