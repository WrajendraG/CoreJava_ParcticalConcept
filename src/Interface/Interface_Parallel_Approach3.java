package Interface;

/**
 * Created by raju on 18/1/17.
 */
interface I1A3
{
    public abstract void m1();
}
interface I2A3
{
    public abstract void m2();

}
interface I3A3
{
    public abstract void m3();
}
abstract class C1A3
{
    abstract void m4();
}
class C2A3 extends C1A3 implements I1A3, I2A3, I3A3
{
   public void m1()
    {
        System.out.print("\n I ");
    }
    public void m2()
    {
        System.out.print("\n AM ");
    }
    public void m3()
    {
        System.out.print("\n USING");
    }
    public void m4()
    {
        System.out.print("\n Java Approach 3");
    }

}
public class Interface_Parallel_Approach3
{
    public static void main (String args [])
    {
        C2A3 o = new C2A3();
        o.m1();
        o.m2();
        o.m3();
        o.m4();

    }

}
