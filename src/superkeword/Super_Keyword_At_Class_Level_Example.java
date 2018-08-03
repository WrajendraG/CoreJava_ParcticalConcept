package superkeword;

/**
 * Created by raju on 9/1/17.
 */

class P
{
    int a ;

    void accept()
    {
        a = 20;
        System.out.print("\n =============================================");
        System.out.print("\n superkeword.P = "+this.a);
        System.out.print("\n =============================================");
    }

}
class Q extends P
{
    int a,temp ;

    void accept()
    {
        super.accept();

            a = 40;
        temp = super.a;
        System.out.print("\n superkeword.Q = "+this.a);
        System.out.print("\n =============================================");

    }

}
class R extends Q
 {
        int a;

        void sum()
        {
            this.a = super.a + temp;
            System.out.print("\n =============================================");
            System.out.print("\n Sum of A's Class superkeword.P & superkeword.Q In superkeword.R  = "+this.a);
            System.out.print("\n =============================================");
        }

 }


public class Super_Keyword_At_Class_Level_Example
{
    public static void main(String args [])
    {

         R o = new R();
         o.accept();
         o.sum();


    }

}
/*
=============================================
 superkeword.P = 20
 =============================================
 superkeword.Q = 40
 =============================================
 =============================================
 Sum of A's Class superkeword.P & superkeword.Q In superkeword.R  = 60
 =============================================
 */
