package Interface; /**
 * Created by raju on 19/1/17.
 */
import java.util.*;
interface I1E1
{
    interface I2E1
    {

        void  add();
    }
    interface I3E1
    {
        void  sub();

        interface  I4E1
        {
            void mul();

            interface I5E1
            {

                void div();
            }
        }

    }
}
class C1E1 implements I1E1.I2E1 , I1E1.I3E1.I4E1
{
    Scanner s = new Scanner(System.in);
    public void add()
    {
        int a,b,t;
        System.out.print("\n Enter 1st Number = ");
        a = Integer.parseInt(s.nextLine());
        System.out.print("\n Enter 2nd Number = ");
        b = Integer.parseInt(s.nextLine());

        t = a + b;
        System.out.print("\n==========================================");
        System.out.print("\n Sum of Two Number is = "+t);
        System.out.print("\n==========================================");

    }
     public void mul()
    {

        int a,b,t;
        System.out.print("\n Enter 1st Number = ");
        a = Integer.parseInt(s.nextLine());
        System.out.print("\n Enter 2nd Number = ");
        b = Integer.parseInt(s.nextLine());

        t = a * b;
        System.out.print("\n==========================================");
        System.out.print("\n Mul.. of Two Number is = "+t);
        System.out.print("\n==========================================");

    }

}
public class Interface_Using_Nested_Avoid_AbstractRule
{
        public static void main(String args [])
        {
            System.out.print("\n===================== 1 =====================");
            C1E1 o = new C1E1();
            o.add();
            o.mul();
/*
===================== 1 =====================
 Enter 1st Number = 4

 Enter 2nd Number = 5

==========================================
 Sum of Two Number is = 9
==========================================
 Enter 1st Number = 6

 Enter 2nd Number = 7

==========================================
 Mul.. of Two Number is = 42
==========================================
*/
            System.out.print("\n======================= 2 ===================");

            I1E1.I2E1 o1 = new C1E1();

            o1.add(); // call only add

/*
======================= 2 ===================
 Enter 1st Number = 2

 Enter 2nd Number = 8

==========================================
 Sum of Two Number is = 10
==========================================
 */
            System.out.print("\n========================= 3 =================");

            I1E1.I3E1.I4E1 o3 = new C1E1();

            o3.mul(); // call only add

            System.out.print("\n========================= end =================");
/*
 ========================= 3 =================
 Enter 1st Number = 8

 Enter 2nd Number = 9

==========================================
 Mul.. of Two Number is = 72
==========================================
========================= end =================
*/

        }


}
