package Threads;

// Constructors in Thread Class

class Thr extends Thread{
    // String name, gives name to a thread, which can be later used, to refer the tread.
    public Thr(String name){
        super(name);
    }
    /*
    Other constructors are
    1. Thread(Runnable r, String name)
    2. Thread(Runnable r)           ->  already did, while using runnable interface
     */
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thread is running");
        }
    }
}

public class Thread3
{
    public static void main(String[] args){
        Thr t1 = new Thr("Vitthal thread");
        t1.start();
        Thr t2 = new Thr("Other's thread");
        t2.start();
        System.out.println("Id of thread: "+t1.getId());
        System.out.println("Id of thread: "+t1.getName());
        System.out.println("Id of thread: "+t2.getId());
        System.out.println("Id of thread: "+t2.getName());
    }
}
