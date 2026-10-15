class BoxA{ 

    int l, w, h;

    void area(){
        System.out.print("Area = ");
        System.out.println(l+w+h);
    }
}
class BoxB extends BoxA{

    int length, width, height, test;

    void perimeter(){

        test = length + width + height;
        System.out.print("Perimeter = ");
        System.out.println(2*test);
    }
    
}

class Inheritance{

    public static void main(String[] args) {
        
        BoxA objA = new BoxA();
        BoxB objB = new BoxB();

        objA.l = 10;
        objA.w = 20;
        objA.h = 30;
        objA.area();

        objB.length = 40;
        objB.width = 50;
        objB.height = 60;

        objB.perimeter();

        objB.l = 100;
        objB.w = 200;
        objB.h = 300;

        objB.area();
    }
}