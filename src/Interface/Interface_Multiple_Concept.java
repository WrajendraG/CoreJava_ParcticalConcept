package Interface; /**
 * Created by raju on 17/1/17.
 */
import java.util.*;
interface IP1
{
    public void accept();

}
interface IQ1
{
    public void disp();

}
interface IS1
{
    public static final int p=2;
}
class IR1 implements IS1,IP1,IQ1
{
    int a;
    Scanner s = new Scanner(System.in);


    public void accept()
    {
        System.out.print("\n Enter Value in Interface IP2 = ");
        a =Integer.parseInt(s.nextLine());
    }
    public void disp()
    {
        System.out.print("\n a is Display In Interface IQ2 Using (Defining in IR2 )IR2 = " +a);
        System.out.print("\n p valu from Interface 3 = " +p);
    }


}
public class Interface_Multiple_Concept
{
    public static void main(String args [])
    {
        IR1 obj = new IR1();
        obj.accept();
        obj.disp();

        /*
        /-----------------------------------
        Interface.IP1 obj1  = new Interface.IR1();
        obj1.accept();
        // obj1.disp(); You only call Accept Methods can't call  Display Methods Because References Of Interfaces is Limited that.
        //-----------------------------------

        Interface.IQ1 obj3 = new Interface.IR1();
        obj3.disp();
        // obj3.accept(); You only call  Display Methods can't call Accept Methods Because References Of Interfaces is Another.
        */

    }

}
