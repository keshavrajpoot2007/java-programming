// Question: Write a program to find volume of rectangle (using class)
// Name: Keshav Rajpoot
// Roll No: 22017C04031

class Rectangle{
    
    double l, w, h;
    
    void vol(){

        System.out.println("Length = " + l + " Width = " + w + " Height = " + h);
        System.out.println("Volume = " + l * w * h);

    }
}
class Keshav_04{

    public static void main (String []args){

        Rectangle object1 = new Rectangle();

        object1.l = 10;
        object1.w = 20;
        object1.h = 30;

        object1.vol();
    }
}