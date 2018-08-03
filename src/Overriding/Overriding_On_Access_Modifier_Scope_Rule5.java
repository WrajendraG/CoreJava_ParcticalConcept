package Overriding;

/**
 * Created by raju on 11/1/17.
 */

class P5
{
    public void m5()
    {
        System.out.print("\n Parent ");
    }
}
class Q5 extends P5
{
   // void m5()
    {
        //Error:(14, 10) java: m5() in Overriding.Q5 cannot override m5() in Overriding.P5
        //attempting to assign weaker access privileges; was public
    }

}
public class Overriding_On_Access_Modifier_Scope_Rule5
{
    public static void main(String args[])
    {
        Q5 call = new Q5();
        call.m5();


    }

}
/*
--------------------------------------------------------------------------------------------

* Order=          Privat <== Default <== Protected <== Public
* Access Level=   Low <<<<======== TO <<<<============= HIGH
*
--------------------------------------------------------------------------------------------

* parent class=       public      Protected    Default         private
*
*
*
*                      |              |            |                 |
*
*
* child class=       public         Protected    Default         It's Not
*                                   public      Protected       Applicable in
*                                               Public          Overriding
*
*=============================================================================================
* */