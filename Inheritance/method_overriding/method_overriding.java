class multilevelA{
    void display(){
        System.out.println("This is class A");
    }
}

class multilevelB extends multilevelA{
    void display(){
        System.out.println("This is class B");
    }
}

class multilevelC extends multilevelA{
    void display(){
        System.out.println("This is class C");
    }
}

class method_overriding{

    public static void main(String[] args) {
        
        multilevelA objA = new multilevelA();
        multilevelB objB = new multilevelB();
        multilevelC objC = new multilevelC();

        objA.display();
        objB.display();
        objC.display();
    }
}