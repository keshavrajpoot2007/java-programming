class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; ++i){
            Thread.yield();
            System.out.println("MyThread");
        }
    }
}

public class Main {
    public static  void main(String[] args){
        // Thread.currentThread().setPriority(7);   g
        System.out.println(Thread.currentThread().getPriority());
        MyThread ob = new MyThread();

        ob.start();
        System.out.println(ob.getPriority());
        for(int i = 0; i < 10; ++i){
            System.out.println("Main Thread");
        }

    }
}