class MyThread extends Thread{

    Main mn = new Main();
    // mn.join();
    public void run(){
        mn.join();
        for(int i = 0; i < 10; ++i){
            
            System.out.println("MyThread");
        }
    }
}

// class MyThread2 implements Runnable{
//         public void run(){
//         for(int i = 0; i < 10; ++i){
            
//             System.out.println("MyThread");
//         }
//     }
// }


class Main{

    public static void main(String[] args) throws Exception{

        MyThread mt = new MyThread();
        // MyThread2 mt2 = new MyThread();
        mt.start();

        mt.join();
        // try{

        // mt.join();
        // }catch (InterruptedException e){
        //     System.out.println("Main thread interrupted while waiting for Thread-1.");
        //     Thread.currentThread().interrupt();
        // }
        for(int i = 0; i < 10; ++i){

            System.out.println("Main Thread");
        }
    }
}
