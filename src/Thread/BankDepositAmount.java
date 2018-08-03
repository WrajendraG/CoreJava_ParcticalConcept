package Thread;

class Deposit extends Thread
{
            public static int bal=0;
            public static int depositbal;
            void deposit( )
            {
                bal = bal+ depositbal;
            }

            void  display()
            {

                System.out.print("\n\t\t\t\tDeposit Amount : " +depositbal);
                System.out.print("\n\t\t\t\tTotal  Amount : " +bal);

            }

         public void run()
            {
                deposit();
                display();
            }

}

public class BankDepositAmount
{
            public  static void main ( String args[])
            {

                        Deposit o1= new Deposit();
                        Thread a[]  =   new Thread[10];

                                    for (int i=1; i<10;i++)
                                    {
                                        a[i]=new Thread(o1);

                                    }
                                    for (int i=1; i<10;i++)
                                    {
                                        a[i].start();
                                    }

            }

}
