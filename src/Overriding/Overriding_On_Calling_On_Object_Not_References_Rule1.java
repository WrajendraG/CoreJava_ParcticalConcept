package Overriding;

/**
 * Created by raju on 11/1/17.
 */
class P1
{
    void Property()
    {
        System.out.print("\nGold,Land,Cash");
    }
    void Marry() //Overridden Method
    {
        System.out.print("\nShilpa");
    }
}
class C1 extends P1
{
    void Marry() //Overriding Method
    {
        System.out.print("\nDeepali");
    }

}
public class Overriding_On_Calling_On_Object_Not_References_Rule1
{
    public static void main (String args[])
    {
        C1 call = new C1();
        call.Marry(); //Deepali

        P1 callp = new P1();
        callp.Marry(); //Shilpa

        P1 callc = new C1();
        callc.Marry(); //Deepali

        // In Overriding Give Object Priority to child c1() forget References Overriding.P1().

        // In Method Overloading In this Situation Call Overriding.P1() References O/p Shilpa.

    }
}
