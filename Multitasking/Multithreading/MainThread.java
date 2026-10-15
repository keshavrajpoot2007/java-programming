class ChildThread implements Runnable{

    public void run(){

        for(int i = 0; i<10; ++i){

            System.out.println("Child Thread");
        }
    }
    
}

class MainThread{

    public static void main(String[] args) {
        
        ChildThread ch = new ChildThread();

        Thread t = new Thread(ch);

        t.start();
        // ch.run();
        for(int i=0; i<10; ++i){
            System.out.println("Main Thread");
        }
    }
}
