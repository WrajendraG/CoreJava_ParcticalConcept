package Overriding;

/**
 * Created by raju on 12/1/17.
 */

class P8
{
    int a=888;

}
class Q8 extends P8
{
    int a=999;

}


public class Overriding_On_With_Respective_Variable_Rule8
{
    public static void main(String args [])
    {
                Q8 call = new Q8();

        System.out.println(call.a); // 999

                P8 call1 = new P8();

        System.out.println(call1.a); //888

        P8 call2 = new Q8();
        System.out.println(call2.a);//888 call parent not child.

        // Overriding concept applicable Only for Method But not For Variable (Dosen't matter Static or Non_static)

    }

}
