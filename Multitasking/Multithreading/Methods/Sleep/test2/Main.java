class MyThread extends Thread{

    public void run() throws Exception{

        for(int i = 0; i < 10; ++i){
    
            System.out.println("child thread");
    
            Thread.sleep(5000);
    
        }

    }

} 


public class Main {

    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.start();

        System.out.println("TCS");
        Thread.sleep(5000);

        System.out.println("Wipro");
        Thread.sleep(4000);

        System.out.println("Infosys");
        // Thread.sleep(5000);
    }

    
}

