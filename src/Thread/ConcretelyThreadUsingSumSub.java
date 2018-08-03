package Thread;

class  Sum extends Thread
{
    int a,b,t;

    public void set(int q,int y)
    {
        a = q;
        b = y;
    }
    public void run()
    {
        t = a+b;
        System.out.print("\nSum = "+t);
    }
}
class  Sub extends Thread
{
    int a,b,t;
    public void set(int q,int y)
    {
        a = q;
        b = y;
    }
    public void run()
    {
        t = a-b;
        System.out.print("\nSum = "+t);
    }
}

public class ConcretelyThreadUsingSumSub
{
        public static void main(String args[])
        {
        Sum o1 = new Sum();
        Sub o2 = new Sub();
        o1.set(20,5);
        o2.set(20,5);
        o1.start();
        o2.start();
        //    Thread t1 = new Thread(o1);  using At implement Runnable the casting is required.
        }
}
