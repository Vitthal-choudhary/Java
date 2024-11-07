package Threads;

/*
    Java JVM, while running threads, it gets a ready queue.
    that queue has all the threads, which are ready to run.

    Ready Queue: {t1,t2,t3,t4,t5}
    Scheduler: picks a thread from ready queue and runs it.

    Life Cycle:
        1. New
        2. Runnable
        3. Running
        4. Blocked/ waiting
        5. Timed Waiting
        6. Terminated

    Priorities ->
        1 -> Min_Priority
        5 -> Norm_Priority
        10 -> Max_Priority

    Thread priority -> We can't rely totally on priorities.

*/

class Thr1 extends Thread {
    public Thr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true)
        {
            System.out.println(this.getName() + " is running");
        }
    }
}
public class Thread4 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1("Vitthal thread 1");
        Thr1 t2 = new Thr1("Vitthal thread 2");
        Thr1 t3 = new Thr1("Vitthal thread 3");
        Thr1 t4 = new Thr1("Vitthal thread 4");
        Thr1 t5 = new Thr1("Vitthal thread 5  very important thread");
        t5.setPriority(Thread.MAX_PRIORITY);        // It will get the highest priority, so it will be executed more number of times, compared to others.

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
