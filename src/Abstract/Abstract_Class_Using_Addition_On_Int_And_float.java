package Abstract;
/**
 * Created by raju on 14/1/17.
 */
import java.util.*;
abstract class Operation
{
    Scanner s = new Scanner(System.in);
    void disp()
    {
        System.out.println("Happy Makarsankrant..!");
    }
    abstract void sum();
}

class Integer_Sum extends Operation
{
    int i,j,k;
    void sum()
    {
        System.out.print("\nEnter Two Integer = ");
        System.out.print("\nEnter 1 st Number = ");
        i = Integer.parseInt(s.nextLine());
        System.out.print("\n Enter 2nd Number = ");
        j = Integer.parseInt(s.nextLine());

        k=(i+j);

        System.out.print("\n==============================");
        System.out.print("\nAdition of Interger = "+k);
        System.out.print("\n===============================");

    }
}
class Float_Sum extends Operation
{
    float i,j,k;
    void  sum()
    {
        System.out.print("\nEnter Two Float Value ");
        System.out.print("\nEnter 1st Number = ");
        i = Float.parseFloat(s.nextLine());
        System.out.print("\nEnter 2nd Number = ");
        j = Float.parseFloat(s.nextLine());
        k=(i+j);
        System.out.print("\n================================");
        System.out.print("\nAdition of Float is = "+k);
        System.out.print("\n=================================");

    }
}
public class Abstract_Class_Using_Addition_On_Int_And_float
{
    public static void main (String args[])
    {
        //Abstract.Operation obj = new Abstract.Operation();  // You can't create abstract object .
        Operation obj = new Integer_Sum();
        obj.disp();
        obj.sum();

        obj=new Float_Sum();
        obj.sum();

    }

}
/*
*
* Enter Two Integer =
Enter 1 st Number = 23

 Enter 2nd Number = 23

==============================
Adition of Interger = 46
===============================
Enter Two Float Value
Enter 1st Number = 23.50

Enter 2nd Number = 23.50

================================
Adition of Float is = 47.0
=================================
*/