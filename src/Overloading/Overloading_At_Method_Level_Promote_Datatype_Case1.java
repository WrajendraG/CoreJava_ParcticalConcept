package Overloading;

/**
 * Created by raju on 6/1/17.
 */
class promotion_Data_Type
{

    void m1(float f)
    {

        System.out.print("\n Float Argument "+f);

    }



}
public class Overloading_At_Method_Level_Promote_Datatype_Case1
{
        public static  void main(String a[])
        {

            promotion_Data_Type o = new promotion_Data_Type();
            o.m1(10);
            o.m1(10.35f);
            o.m1('a');//Print Assic value
            o.m1(10l);
            o.m1('A');
           // o.m(10.23);//Error Satiable method is not found.


        }

}
/*
Hint:=>
---------------------------------------------------------------------------------
  Overloading.promotion_Data_Type Order = byte -> Short -> int -> long ->`Float -> Double.
                                                                                              char ->  ^
                                   In  Byte Sequence=              1         2      4       8       4        8
----------------------------------------------------------------------------------
Int Argument 10
 Float Argument 10.35
 Int Argument 97
 Float Argument 10.0
 Int Argument 65

 */