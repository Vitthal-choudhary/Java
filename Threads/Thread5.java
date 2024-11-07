package Threads;

// Thread Methods

class T extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread5 {

    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        // if we do both t1.start() and t2.start(), then they will run in parallel.
        // if we insert t1.join() in between, then they will run in sequence.
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
        t2.start();
        // this will set it to Daemon -> background thread, has the least priority.
        //t2.setDaemon(true);
        // t1.interrupt(); this interrupts the thread.
    }
}
