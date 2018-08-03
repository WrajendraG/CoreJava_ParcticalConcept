package Thread;

/**
 * Created by WrajendraG on 3/2/2017.
 */
public class ThreadMethodDemo
{
        private static int count=0;

        private static synchronized void ProperOutput()
        {
            count++;
// this synchronized is using LOCK it can Access Only One Thread At time .is until its done . then other Thread will be Executed.
// Its use Proper Output Generation Or Proper Execution of Program.
        }
        public static void run()
        {
            System.out.print(" I am Form Run"+Thread.currentThread().getName());
        }

    public static void main (String args[])
    {
System.out.print("\n -------------------------------------------------------- Thread Methods (  1. Join() As will as Start()   )   ------------------------------------------------------------------\n");
        Thread t1   = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i=0; i<10000; i++)
                {
                   // count++;  // its used before synchronized method then ProperOutput() used.
                    ProperOutput();
                }
            }
        });

        Thread t2   = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i=0; i<10000; i++)
                {
                    // count++;
                    ProperOutput();
                }
            }
        });
        t1.start();
        t2.start();
      System.out.print("\nValue  :"+count);
//  op=> " Value : 0"
// =>Because of  Thread t1 & t2 Executed Immediately they cant wait to Printing Statement.
// That why Use Join Method that can  waits for this(t1.join) thread to die.
        try
        {
// In Java join Method can be used to Wait/pause the current thread until unless the specified thread is dead.
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.print("\nValue of After using join() :"+count);
//op=> Value :15364 ,  change every Execution Avoid Those to Proper output Using Synchronization method in over program.
        System.out.print("\nValue of After using join() And  synchronized void ProperOutput() method  :"+count);
// op=> Value of After using join() And  synchronized void ProperOutput() method  :20000


System.out.print("\n -------------------------------------------------------- Thread Methods (   2  Start,getName,IsAlive,getId ()    )   ------------------------------------------------------------------\n");

                                                                                                   Thread t3   =   new Thread("Thread One");
                                                                                                                t3.start();
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.println("Thread getName: "+ t3.getName());
                                            System.out.println("Thread getState : "+ t3.getState());
                                            System.out.println("Thread IsAlive : "+ t3.isAlive());
                                            System.out.println("Thread getId : "+ t3.getId());
        System.out.print("\n --------------------------------------------------------------------------------\n");



System.out.print("\n -------------------------------------------------------- Thread Methods (  3 Using Runnable start wait Sleep()     )   ------------------------------------------------------------------\n");

                                                                                                        Runnable rt4 = new Thread();
                                                                                                            Thread t4 = new Thread(rt4,"Thread Three");
                                                                                                                         //t4.start();

                                                                    System.out.println(t4);
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.println("Thread getName: "+ t4.getName());
                                            System.out.println("Thread getState : "+ t4.getState());
                                            System.out.println("Thread IsAlive : "+ t4.isAlive());
                                            System.out.println("Thread getId : "+ t4.getId());
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                                           try
                                                            {
                                                                t3.wait();
                                                            }
                                                            catch(InterruptedException ie)
                                                            {
                                                                System.err.print(ie);
                                                            }
                                                            catch(IllegalMonitorStateException imse)
                                                            {
                                                                System.out.print(imse);
                                                            }
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.println("Thread getName: "+ t4.getName());
                                            System.out.println("read getState : "+ t4.getState());
                                            System.out.println("Thread IsAlive : "+ t4.isAlive());
                                            System.out.println("Thread getId : "+ t4.getId());
        System.out.print("\n ---------------------------- ----------------------------------------------------\n");
        t4.start();
                                                                    try
                                                                    {
                                                                        t4.sleep(1000);  // Sleep Method Throws Exception Its composers Handle Exception Using Try Catch Block
                                                                    }
                                                                    catch(InterruptedException ie)
                                                                    {
                                                                        System.err.print(ie);
                                                                    }
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.println("After SleepingThread getName: "+ t4.getName());
                                            System.out.println("After SleepingThread getState : "+ t4.getState());
                                            System.out.println("After SleepingThread IsAlive : "+ t4.isAlive());
        System.out.print("\n --------------------------------------------------------------------------------\n");

System.out.print("\n -------------------------------------------------------- Thread Methods (  4 Methods Using Thread Group     )   ------------------------------------------------------------------\n");

                                                                                                            ThreadGroup tg1 =new ThreadGroup("ThreadGroup1");

                                                                                                            Thread t5t1   = new Thread(tg1,"Thread 1 In ThreadGroup1");
                                                                                                            Thread t5t2   = new Thread(tg1,"Thread 2 In ThreadGroup1");
                                                                                                            Thread t5t3   = new Thread(tg1,"Thread 3 In ThreadGroup1");
                                                                                                            Thread t5t4   = new Thread(tg1,"Thread 4 In ThreadGroup1");
                                                                                                            Thread t5t5   = new Thread(tg1,"Thread 5 In ThreadGroup1");  // Five Thread In One ThreadGroup1

                                                                                                                         t5t1.start();
                                                                                                                              t5t2.start();
                                                                                                                                    t5t3.start();
                                                                                                                                        //   t5t4.start();
                                                                                                                                                    t5t5.start();

        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.println("Thread1 getName: "+ t5t1.getName());
                                            System.out.println("Thread1 IsAlive : "+ t5t1.isAlive());
                                            System.out.println("Thread4 IsAlive : "+ t5t4.isAlive());
                                            System.out.println("Thread1 getId : "+ t5t1.getId());
                                            System.out.println("ThreadGroup1 activeCount out of Five = : "+ tg1.activeCount());

        System.out.print("\n --------------------------------------------------------------------------------\n");
                                             tg1.list();
        System.out.print("\n --------------------------------------------------------------------------------\n");

                                                                                                            ThreadGroup tg2 =new ThreadGroup("ThreadGroup2");

                                                                                                            Thread t6t1   = new Thread(tg2,"Thread 1 In ThreadGroup2");
                                                                                                            Thread t6t2   = new Thread(tg2,"Thread 2 In ThreadGroup2");
                                                                                                            Thread t6t3   = new Thread(tg2,"Thread 3 In ThreadGroup2");
                                                                                                            Thread t6t4   = new Thread(tg2,"Thread 4 In ThreadGroup2");
                                                                                                            Thread t6t5   = new Thread(tg2,"Thread 5 In ThreadGroup2");  // Again Five Thread In  ThreadGroup2

                                                                                                                                             t6t1.start();

                                                                                                                                                          t6t2.start();
                                                                                                                                                                         t6t3.start();
                                                                                                                                                                                     t6t4.start();
                                                                                                                                                                                                        t6t5.start();

                                            t6t1.setPriority(Thread.MIN_PRIORITY);
                                            t6t2.setPriority(Thread.NORM_PRIORITY); //   here Thread 3 or 4 SetDefaultPriority 5 miss NORMAL_PRIORITY.
                                            t6t5.setPriority(Thread.MAX_PRIORITY);
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.print("\n GePriorityName Thread1 = "+t6t1.getName());
                                            System.out.print("\n GePriority Thread1 = "+t6t1.getPriority());
                                            System.out.print("\n GePriorityName Thread5 = "+t6t5.getName());
                                            System.out.print("\n GePriority Thread5 = "+t6t5.getPriority());
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                            System.out.println("Thread1 getName: "+ t6t1.getName());
                                            System.out.println("Thread1 IsAlive : "+ t6t1.isAlive());
                                            System.out.println("Thread4 IsAlive : "+ t6t4.isAlive());
                                            System.out.println("Thread1 getId : "+ t6t1.getId());
                                             System.out.println("ThreadGroup1 activeCount out of 10 Both Group = : "+ tg1.activeCount());
        System.out.print("\n --------------------------------------------------------------------------------\n");
                                        tg2.list(); // problem here printing group2  and when Use Sleep ,suspend, wait,stop, resume Method
        System.out.print("\n --------------------------------------------------------------------------------\n");

    }

}


/*


 -------------------------------------------------------- Thread Methods (  1. Join() As will as Start()   )   ------------------------------------------------------------------

Value  :0
Value of After using join() :20000
Value of After using join() And  synchronized void ProperOutput() method  :20000
 -------------------------------------------------------- Thread Methods (   2  Start,getName,IsAlive,getId ()    )   ------------------------------------------------------------------

 --------------------------------------------------------------------------------
Thread getName: Thread One
Thread getState : RUNNABLE
Thread IsAlive : true
Thread getId : 12

 --------------------------------------------------------------------------------

 -------------------------------------------------------- Thread Methods (  3 Using Runnable start wait Sleep()     )   ------------------------------------------------------------------
Thread[Thread Three,5,main]

 --------------------------------------------------------------------------------
Thread getName: Thread Three
Thread getState : RUNNABLE
Thread IsAlive : true
Thread getId : 14

 --------------------------------------------------------------------------------
java.lang.IllegalMonitorStateException
 --------------------------------------------------------------------------------
Thread getName: Thread Three
read getState : RUNNABLE
Thread IsAlive : true
Thread getId : 14

 --------------------------------------------------------------------------------

 --------------------------------------------------------------------------------
After SleepingThread getName: Thread Three
After SleepingThread getState : TERMINATED
After SleepingThread IsAlive : false

 --------------------------------------------------------------------------------

 -------------------------------------------------------- Thread Methods (  4 Methods Using Thread Group     )   ------------------------------------------------------------------

 --------------------------------------------------------------------------------
Thread1 getName: Thread 1 In ThreadGroup1
Thread1 IsAlive : true
Thread4 IsAlive : false
Thread1 getId : 15
ThreadGroup1 activeCount out of Five = : 4

 --------------------------------------------------------------------------------
java.lang.ThreadGroup[name=ThreadGroup1,maxpri=10]
    Thread[Thread 1 In ThreadGroup1,5,ThreadGroup1]
    Thread[Thread 2 In ThreadGroup1,5,ThreadGroup1]
    Thread[Thread 3 In ThreadGroup1,5,ThreadGroup1]
    Thread[Thread 5 In ThreadGroup1,5,ThreadGroup1]

 --------------------------------------------------------------------------------

 --------------------------------------------------------------------------------

 GePriorityName Thread1 = Thread 1 In ThreadGroup2
 GePriority Thread1 = 1
 GePriorityName Thread5 = Thread 5 In ThreadGroup2
 GePriority Thread5 = 10
 --------------------------------------------------------------------------------
Thread1 getName: Thread 1 In ThreadGroup2
Thread1 IsAlive : true
Thread4 IsAlive : true
Thread1 getId : 20
ThreadGroup1 activeCount out of 10 Both Group = : 9

 --------------------------------------------------------------------------------
java.lang.ThreadGroup[name=ThreadGroup2,maxpri=10]

 --------------------------------------------------------------------------------
* */