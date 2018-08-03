package InnerClass;

class HelpInnerCreating
{

    void m1()
    {
        System.out.print("\nI am Inner Helper ");
    }
}

class Outer3 extends HelpInnerCreating
{
    int a=10;
            void m2()
            {
                System.out.print("\n Hello");
            }
//-----------------------------------------------------------------
    HelpInnerCreating inner = new HelpInnerCreating()
{
      public void m1()  // Anonymous must be Overridden Method used.
        {
            System.out.print("\nI am Inner "+a);
        }
    };

//----------------------------------------------------------------

}

public class AnonymousClass
{
    public static void main(String args[])
    {
        Outer3 obj1 = new Outer3();
        obj1.inner.m1();

    }
}


// I am Inner 10