class MyThread extends Thread{

    public void run(){

        for(int i = 1; i <= 10; i++)
            System.out.println("MyThread");
    }
}

/**
 * Thread_Priority
 */
class Thread_Priority {

    public static  void  main(String[]args){

        MyThread mt = new MyThread();
        mt.start();
        System.out.println("MyThread Priority: "+ mt.getPriority());
        mt.setPriority(MyThread.MIN_PRIORITY);
        System.out.println("MyThread Priority: "+ mt.getPriority());
        for(int i = 0; i < 10; i++){
            System.out.println("MainThread");
        }

        System.out.println("Main Priority: "+Thread.currentThread().getPriority());
    }

    
}