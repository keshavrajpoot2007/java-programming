class Triangle{

    float height, base;

    void Tarea(){

        System.out.print("Triangle Area = ");
        System.out.println((1/2.0) * base * height);
    }
}

class Rectangle extends Triangle{

    int length, width;

    void Rarea(){

        System.out.print("Rectangle Area = ");
        System.out.println(length * width);
    }
}

class Circle extends Rectangle{

    int radius;

    void Carea(){

        System.out.print("Circle Area = ");
        System.out.println(3.14 * radius * radius);
    }
}

class multilevel{

    public static void main(String[] args) {
        
        Triangle objT = new Triangle();
        Rectangle objR = new Rectangle();
        Circle objC = new Circle();

        objT.base = 10;
        objT.height = 20;
        objT.Tarea();

        objR.base = 20;
        objR.height = 30;
        objR.Tarea();

        objR.length = 30;
        objR.width = 40;
        objR.Rarea();

        objC.base = 30;
        objC.height = 40;
        objC.Tarea();

        objC.length = 40;
        objC.width = 50;
        objC.Rarea();

        objC.radius = 50;
        objC.Carea();
    }
}