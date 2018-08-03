package Overriding;

/**
 * Created by raju on 12/1/17.
 */
class P7
{
    void m7(int... x)
    {
        System.out.print("\nParent");

    }

}
class Q7 extends P7
{
    void m7(int x)
    {
        System.out.print("\nChild");


    }


}
public class Overriding_On_Var_Arg_Rule7
{
    public static void  main(String args[])
    {

        P7 call = new P7();

              call.m7(10 ,20); //Parent

        Q7 call2 = new Q7();

              call2.m7(10); //Child



        P7 call3 = new Q7();
            call3.m7(10);// In Overloading Call parent and Overriding call child(Because its Run time Object Correction)


             // Both method and Parameters also Same is call overriding.
    }



}
