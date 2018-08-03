package Overriding;

/**
 * Created by raju on 11/1/17.
 */
class P4
{
    final void m4()
    {
        System.out.print("\nParent class");
    }

}
class Q4 extends P4
{
    //void m4() // CE: Error:(14, 10) java: m4() in Overriding.Q4 cannot override m4() in Overriding.P4
                 // overridden method is final.
    {
        // You can't final overried in child.
        // But  parent is non final you Should Overrided Child class Final.
    }

}
public class Overriding_On_Final_Rule4
{
    public static void main (String args[])
    {

        Q4 c = new Q4();
        c.m4();// parent class
    }


}
