package Thread;

public class ThreadWaitingSecond extends Thread
{
    public void run()
    {

        for (int i=1 ;i<=10;i++)
        {
            System.out.print("\n Numbers is After Waiting 1Se = "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
                System.out.print(ie);
            }
            catch (IllegalMonitorStateException ime)
            {
                System.out.print(ime);
            }

        }
    }
    public static void main(String args[])
    {

        ThreadWaitingSecond t1 = new ThreadWaitingSecond();
        t1.start();



    }
}
