package Interface;
/**
 * Created by raju on 17/1/17*/
import java.util.*;

interface IP
{
    public void accept();

}
interface IQ extends IP
{
    public void sum();

}
interface IS extends IQ
{
    public void disp();

}
class IR implements IS
{
    int a,b,t;
    Scanner s = new Scanner(System.in);

    public void accept()
    {
        System.out.print("\n Enter Value in Interface IP2 ");
        System.out.print("\nEnter 1st value = ");
        a =Integer.parseInt(s.nextLine());
        System.out.print("\nEnter 2nd Value = ");
        b = Integer.parseInt(s.nextLine());

    }
    public void sum()
    {  // int t;

        t = a+b;
    }
    public void disp()
    {
        System.out.print("\n a is Display In Interface IQ2 Using (Defining in IR2 )IR2 =" +t);

    }


}
public class Interface_Multilevel_Concept
{

    public static void main(String args [])
    {
        IR obj = new IR();
        obj.accept();
        obj.sum();
        obj.disp();

    }

}
