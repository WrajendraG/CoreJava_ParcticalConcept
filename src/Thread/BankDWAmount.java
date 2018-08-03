package Thread;
import java.lang.Thread;

class Deposit2 extends Thread
{

           static int bal=0;

           synchronized void deposit2( int q)
           {
                    System.out.print("\n\t\t\t\t\tDeposit Amount.  " + q);
                   bal = bal + q;
                   System.out.print("\n\t\t\t\tTotal Amount.   is =  " + bal);

                   notify();

           }

}

class Withdraw2 extends Deposit2 //implements Runnable
{

  synchronized   void withdraw2(int w)
    {
                try
                {
                        if (bal<=1000)
                        {
                            System.out.print(" \n Your Can't Withdraw.. Balance is Less Than 1000 ");
                            System.out.print("\n\t\t\t\tWaiting For Deposit ........................... ");
                            wait();
                        }
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.print("\n\t\t\t\t\tWithdraw Amount  "+w) ;
                bal= bal-w;
                System.out.print("\n\t\t\t\t Total  amount is = "+bal);

                   // notify();  not here
    }

}

public class BankDWAmount
{
    public static void main(String args[])
    {
        Withdraw2 obj =    new Withdraw2();

                new Thread()
                {
                    public void  run()
                    {
                       obj.withdraw2(1000);

                    }
                }.start();

                new Thread(){
                    public void run()
                    {
                       obj.deposit2(3000);

                    }
                }.start();
    }
}
/*
*
 Your Can't Withdraw.. Balance is Less Than 1000
				Waiting For Deposit ...........................
					Deposit Amount.  3000
				Total Amount.   is =  3000
					Withdraw Amount  1000
				 Total  amount is = 2000
* */