// Question: Write a program to add, multiply, subtract three numbers (using objects)
// Name: Keshav Rajpoot
// Roll No: 22017C04031

class Add{
    int num1, num2, num3;
    
    void add() {
        System.out.println(num1 + num2 + num3);
    }
}
class Mul{
    int num1, num2, num3;

    void mul() {
        System.out.println(num1 * num2 * num3);
    }
}
class Sub{
    int num1, num2, num3;
    

    void sub() {
        System.out.println(num1 - num2 - num3);
    }
}

public class Keshav_01 {
    public static void main(String[] args) {
        

        Add objA = new Add();
        Mul objM = new Mul();
        Sub objS = new Sub();
        
        objA.num1 = 23;
        objA.num2 = 45;
        objA.num3 = 67;
        System.out.print("Addition = ");
        objA.add();

        objM.num1 = 23;
        objM.num2 = 45;
        objM.num3 = 67;
        System.out.print("Multiplication = ");
        objM.mul();

        objS.num1 = 23;
        objS.num2 = 45;
        objS.num3 = 67;
        System.out.print("Subtraction = ");
        objS.sub();
        
       
    }
}