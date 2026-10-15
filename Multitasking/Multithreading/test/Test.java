class Test implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Test C = new Test();
        Thread t = new Thread(C);
        // C.run();
        t.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread");
        }
    }
}