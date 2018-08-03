package Interface;

interface I1A2
{
    public abstract void m1();
}
interface I2A2
{
    public abstract void m2();
}
interface I3A2
{

    public  abstract void m3();
}
interface I4A2 extends I1A2, I2A2, I3A2
{
    public abstract void m4();

}
class C1A2 implements I4A2
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
        System.out.print("\n USING ");
    }
    public void m4()
    {
        System.out.print("\n JAVA Approach 2 ! ");
    }

}

public class Interface_Inheritance_Approach2
{
    public static void main (String args [])
    {
        C1A2 o = new C1A2();
        o.m1();
        o.m2();
        o.m3();
        o.m4();
    }
}
