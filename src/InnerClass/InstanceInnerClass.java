package InnerClass;

class Outer1
{
    int a=10;

    void m1()
    {
        System.out.print("\nI am Outer ");
    }

      class Inner1
    {
        void m2()
        {
            System.out.print("\nI am Inner "+a);
        }
    }
}
public class InstanceInnerClass
{

        public static void main(String args[])
        {
            // Both instance That why first Creat Outer object then using that object you call inner class.
                    Outer1 obj = new Outer1();
                    obj.m1();
            // but access Inner then create  object using  Outer.inner referance & Inner object.
            Outer1.Inner1 obj2 = obj.new Inner1();
            obj2.m2();

            // Second way to creat inner obj
            Outer1.Inner1 obj3 = new Outer1().new Inner1();
            obj3.m2();
        }
}
/*
I am Outer
I am Inner 10
I am Inner 10

 */