package Interface;

/**
 * Created by raju on 18/1/17.
 */

interface I1A1
{

    public abstract void m1();  // This method compulsory public abstract;

}
interface I2A1
{
    public abstract void m2();
}
 abstract class C1A1 implements I2A1,I1A1
{
    public void m1()
    {

        System.out.print("\n Hello  ");
    }

}
class C2A1 extends C1A1
{

    public void m2()
    {

        System.out.print("\n Java Approach 1 ");
    }

}
public class Interface_Multilevel_Approach1
{
    public static void main (String args [])
    {
        C2A1 o = new C2A1();
        o.m1();
        o.m2();
    }

}
