
class A {
    private double fees=1000.0;

    // public void show(){
    //     System.out.println("Fees:"+fees);
    // }

    // public static void main(String[] args) {
    //     A obj = new A();
    //     // System.out.println("Fees:"+obj.fees);
    //     obj.show();
    // }
}

class B{
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println("fees"+obj.fees);
        // System.out.println("Fees:"+obj.fees);
        // obj.show();
    }
}
