// Program for calculating the volume of a box.

class Box{
    
    double l, w, h;
    
    void vol(){

        System.out.println("Length = " + l + " Width = " + w + " Height = " + h);
        System.out.println("Volume = " + l * w * h);

    }
}
class Demo{

    public static void main (String []args){

        Box object1 = new Box();

        object1.l = 10;
        object1.w = 20;
        object1.h = 30;

        object1.vol();
    }
}