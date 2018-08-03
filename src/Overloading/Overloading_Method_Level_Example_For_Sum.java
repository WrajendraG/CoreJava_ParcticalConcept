package Overloading;

/**
 * Created by raju on 5/1/17.
 */



class Class_For_Test_Method_overloading
{

    void sum()
    {
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

        System.out.print("\n                                 I am Empty parametrized Method ");

        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");
    }

    void sum(int a, int b)
    {
            int c;
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

                                                                       c=(a+b);

        System.out.print("\n                                Addition Of Two Integer Value = "+c);
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

    }

    void sum(float a,float b)
    {
            float c;
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");
                                                                        c = (a+b);

        System.out.print("\n                                Addition Of Two Float Value = "+c);
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");


    }

    void sum(double x, double y)
    {
            double z;
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

                                                                      z = (x+y );

        System.out.print("\n                                 Addition Of Two Double Value = "+z);
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

    }

    void sum(int m,double n)
    {
            double o;
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

                                                                            o = (m+n);

        System.out.print("\n                        Addition Of One Integer and One Double Value = "+o);
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");


    }

    void sum(double p, int q)
    {
        double r;
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

                                                                        r =(p+q);

        System.out.print("\n                            Addition Of One Double and One Integer Value = "+r);
        System.out.print("\n                    ============================================================ ");
        System.out.print("\n ");

    }


}

public class Overloading_Method_Level_Example_For_Sum
{
    public static void main(String args [])
    {

        Class_For_Test_Method_overloading o = new Class_For_Test_Method_overloading();

        o.sum();
        o.sum(10,20);
        o.sum(30.30f,30.20f);
        o.sum(20.30,30.20);
        o.sum(20,20.50);
        o.sum(40.20,50);

    }

}
