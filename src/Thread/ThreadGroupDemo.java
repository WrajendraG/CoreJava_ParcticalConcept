package Thread;

import java.lang.ThreadGroup;

public class ThreadGroupDemo implements Runnable
{
    public void run()
    {
        System.out.println("----------------------------- Start -----------------------------------");
        System.out.println(Thread.currentThread().getName());
        System.out.println("-----------------------------  END -----------------------------------");
    }
    public static void main (String args[])
    {
        ThreadGroupDemo runnable = new ThreadGroupDemo();  // runnable Traget

        ThreadGroup tg1 =   new ThreadGroup("ThreadGroup1");


        Thread t1  =new Thread(tg1,runnable,"Thread One");
        t1.start();
        t1.setName("Rajendra");
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2  =new Thread(tg1,runnable,"Thread Two");
        t2.start();

        Thread t3 = new Thread(tg1,runnable,"Thread Three");
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Group name = "+ tg1.getName());

        System.out.println("----------------------------------------------------------------");
        System.out.println("Thread 3 = "+t3.getName());
        System.out.println(t3.isAlive());

        System.out.println("----------------------------------------------------------------");
        tg1.list();
        System.out.println("----------------------------------------------------------------");

    }
}
/*
----------------------------------------------------------------
Group name = ThreadGroup1
----------------------------------------------------------------
Thread 3 = Thread Three
true
----------------------------------------------------------------
java.lang.ThreadGroup[name=ThreadGroup1,maxpri=10]
    Thread[Rajendra,1,ThreadGroup1]
    Thread[Thread Two,5,ThreadGroup1]
    Thread[Thread Three,10,ThreadGroup1]
----------------------------------------------------------------
Thread Three
Thread Two
Rajendra
* */