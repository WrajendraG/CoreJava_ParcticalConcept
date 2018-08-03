package Overriding;

/**
 * Created by raju on 11/1/17.
 */

class P3
{
    private void m3()
    {

        System.out.print("\n Perent Class ");
    }

}
class Q3 extends P3
{
    private void m3()// private is not Acceptable in child in overriding
    {
        System.out.print("\nChild Class");
    }

}// both private Method are valid but not in this only Method overloading.

public class Overriding_On_Private_Rule3
{
    public static void main(String args[])
    {
        Q3 call = new Q3();

       // call.m3(); //It Not valid In Overriding

        //Error:(29, 13) java: m3() has private access in Overriding.Q3
    }


}
