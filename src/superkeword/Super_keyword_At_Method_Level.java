package superkeword;

class BaseClass1
{

    void disp()
    {

        System.out.println("\n I am Base Class ");

    }

}
class DerivedClass1 extends BaseClass1
{

    void disp()
    {

        super.disp();
        System.out.println("\n I am derived Class ");
        System.out.println("\n Magic of supper keyword avoid Ambguity same mathed Name in Inheritance ");
        super.disp();


    }


}

public class Super_keyword_At_Method_Level
{
    public static void main(String [] args)
    {

        DerivedClass1 o = new DerivedClass1();

        o.disp();

    }
}