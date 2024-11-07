package Threads;

// Using extends Thread
class test1 extends Thread{
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("Thread 1 is running");
            System.out.println("I am happy to be a thread");
            i++;
        }
    }
}
class test2 extends Thread{
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("Thread 2 is running");
            System.out.println("I am sad to be a thread");
            i++;
        }
    }
}

public class Thread1 {

    public static void main(String[] args) {
        test1 t1 = new test1();
        test2 t2 = new test2();
        t1.start();
        t2.start();
    }
}
