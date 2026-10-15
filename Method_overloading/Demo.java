public class Demo {

    // Main() method overloading

    public static void main(String sarg){
        System.out.println("String arg:"+ sarg);
    }
    public static void main(int iarg){
        System.out.println("Int arg:"+ iarg);
    }
    public static void main(float farg){
        System.out.println("flot arg:"+ farg);
    }

    public static void main(String[] args){
        Demo d1 = new Demo();

        d1.main("SRGOC");
        d1.main(10);
        d1.main(10.0f);
        
    }
}
