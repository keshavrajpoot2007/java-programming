class Test_b extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Test_b C = new Test_b();
        // Thread t = new Thread(C);
        C.start();
        // t.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread");
        }
    }
}