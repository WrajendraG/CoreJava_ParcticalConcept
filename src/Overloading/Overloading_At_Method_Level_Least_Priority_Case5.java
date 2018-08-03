package Overloading;

/**
 * Created by raju on 6/1/17.
 */


class TestCase5
{
    void m5(int i)
    {
        System.out.print("\nGeneral Method "+i);
    }
    void m5(int... x)
    {
        System.out.print("\nVar_Arg Method ");
        for(int y:x)
        {
            System.out.print("\nVar_Arg"+y);

        }

    }


}
public class Overloading_At_Method_Level_Least_Priority_Case5
{
    public static void main(String args[])

    {
        TestCase5 c = new TestCase5();
        c.m5();
        c.m5(10,20 );
        c.m5(10);//General Method call Because Int least priority then Var_arg



    }

}
/*
*
*
* Var_Arg Method
Var_Arg Method
Var_Arg10
Var_Arg20
General Method 10
*/
