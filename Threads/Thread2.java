package Threads;

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread 1 running");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread 2 running");
            i++;
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread thread1 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread thread2 = new Thread(t2);
        // Till the time, start method is not called, threads stay in new state
        thread1.start();
        thread2.start();
        // After start method is called, and before it is selected to run by scheduler, threads enter runnable state [ i.e. ready to run ]
        // running means, it has been selected to run by scheduler.
        // Non-Runnable means, thread is alive but not eligible to run.
        // Terminated means, thread is dead. run() method has exited.

    }
}
