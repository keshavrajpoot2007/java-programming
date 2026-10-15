// Question: Write a program to find the greatest number among three numbers (using nested if-else)
// Name: Keshav Rajpoot
// Roll No: 22017C04031

import java.util.Scanner;

class Num{

    double num1, num2, num3;

    void greatNum(){

        if(num1 > num2){
            

                if(num1 > num3){
    
                    System.out.println(num1 + " is greater than " + num2 + " and " + num3 + ".");
                }
    
                else if(num1 < num3){
    
                    System.out.println(num3 + " is greater than " + num1 + " and " + num2 + ".");
                }
    
                else{
    
                    System.out.println(num1 + " and " + num3 + " are Equal and Greater than " + num2 + ".");
                }
            
        }

        else if(num1 > num3){

            if(num1 == num2){

                System.out.println(num1 + " and " + num2 + " are Equal and Greater than " + num3 + ".");
            }

            else{

                System.out.println(num2 + " is greater than " + num1 + " and " + num3 + ".");
            }
        }

        else if(num2 > num3){

            if(num1 == num2){

                System.out.println(num1 + " and " + num2 + " are Equal and Greater than " + num3 + ".");
            }

            else{

                System.out.println(num2 + " is greater than " + num1 + " and " + num3 + ".");
            }
        }

        else if(num2 < num3){
            
            if(num1 < num3){

                System.out.println(num3 + " is greater than " + num1 + " and " + num2 + ".");
            }
            else{

                System.out.println(num1 + " and " + num3 + " are Equal and Greater than " + num2 + ".");
            }
        }
        else{

            if (num1 != num3) {
                
                System.out.println(num2 + " and " + num3 + " are Equal and Greater than " + num1 + ".");
            }

            else{

                System.out.println(num1 + ", " + num3 + " and " + num2 +" are Equal. ");
            }

        }
    }
}

class Keshav_02{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Num myNum = new Num();

        char again;

        do{

            System.out.print("Enter First Number = _");
            myNum.num1 = sc.nextInt();

            System.out.print("Enter Second Number = _");
            myNum.num2 = sc.nextInt();

            System.out.print("Enter Third Number = _");
            myNum.num3 = sc.nextInt();

            myNum.greatNum();

            System.out.println("Are you want to continue(y/n)...");
            again = sc.next().charAt(0);

        }while(again == 'y');
    }
}