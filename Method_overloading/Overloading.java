public class Overloading {
        public void m1(int ival, float fval){
            System.out.println("int arg");
        }
        public void m1(float fval, int ival){
            System.out.println("float arg");
        }

        public static void main(String[] args) {
            Overloading o = new Overloading();

            o.m1(10.0f,10);
            o.m1(10,10.0f);
            // o.m1(10,10);
        }
}
