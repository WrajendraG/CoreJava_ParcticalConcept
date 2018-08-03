package Overriding;

/**
 * Created by raju on 11/1/17.
 */

class P6
{
    public static void m6() //overridden
    {
        System.out.print("\nParent");

    }

}
class Q6 extends P6
{

   // public void m6() //overriding
    {
        /**
         *
  Error:(18, 17) java: m6() in Overriding.Q6 cannot override m6() in Overriding.P6
  overridden method is static
        *
        * */

    }

}
public class Overriding_On_Static_Method_Rule6
{
    public static void main (String args[])
    {

        Q6 call = new Q6();
        call.m6(); //parent

        P6 call2 =new Q6();
        call2.m6(); // Parent
    }

}
/*
Similarly We can't overridden Non static method as static.
But one think Remember  Both are static are working but It's Method Hiding not Overriding.
*/