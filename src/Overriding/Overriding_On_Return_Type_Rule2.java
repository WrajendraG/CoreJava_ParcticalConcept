package Overriding;

/**
 * Created by raju on 11/1/17.
 */

class P2
{

    Object m2()
    {
        return null;
    }
}
class Q2 extends P2
{

    String m2()
    {
        return  null;
    }

}
public class Overriding_On_Return_Type_Rule2
{
    public static void main(String args[])
    {

       Q2 call = new Q2();
       call.m2();

    }

}
/*
* Note : covariant return type concept only for Object type but not primitive type.
* Parent class|    Object   |      Number    |     String   |  double
*                           |                |              |
*                           |                |              |
*                           |                |              |
*Child class   |   Object   |       Number   |   Object     |    int
*                  String   |       Integer  |
*                  StringBuffer
*
* call do or Not =    do    |           do   |    not        | not
*
* */
