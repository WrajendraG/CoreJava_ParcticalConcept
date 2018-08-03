package Thread;

/**
 * Created by WrajendraG on 3/1/2017.
 */
public class ThreadDemo  implements Runnable

{
    public void run() {
        System.out.println("----------------------------- Start -----------------------------------");
        System.out.println(Thread.currentThread().getName());
        System.out.println("-----------------------------  END -----------------------------------");
    }

    public static void main(String args[]) {
        //ThreadGroupDemo runnable = new ThreadGroupDemo();  // runnable Traget

        System.out.println("----------------------------------------------------------------");
        Thread t1 = new Thread( "Thread One");
        t1.start();
        t1.setName("Rajendra");
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getName());
        System.out.print(t1.getName());

        System.out.println("----------------------------------------------------------------");
        Thread t2 = new Thread("Thread Two");
        t2.start();
        System.out.println("----------------------------------------------------------------");

        Thread t3 = new Thread("Thread Three");
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Thread two name = " + t2.getName());
        System.out.println(t2.isAlive());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Thread 3 = " + t3.getName());
        System.out.println(t3.isAlive());

        System.out.println("----------------------------------------------------------------");
    }
}