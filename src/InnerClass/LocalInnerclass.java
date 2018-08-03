package InnerClass;

/**
 * Created by WrajendraG on 3/11/2017.
 */
class  A
{
    void m1()
    {

        System.out.print("\nI am Outer In Inner class and Method ");
        class B
        {
            void m2()
            {
                System.out.print("\n I am Local class In Method ");
            }
        }

        B obj1 = new B();// Object Should be create here
        obj1.m2();
    }

}

public class LocalInnerclass
{
    public static void main(String args[])
    {
            A obj2 = new A();
            obj2.m1();
    }

}

/*
I am Outer In Inner class and Method
 I am Local class In Method
 */

