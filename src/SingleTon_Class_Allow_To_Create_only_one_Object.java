/**
 * Created by raju on 23/1/17.
 */
class Test_SingleTon
{
    private static Test_SingleTon t = null;
   private   Test_SingleTon()
    {

    }
    public static Test_SingleTon getTest()
    {
        if (t == null )
        {
            t = new Test_SingleTon();
        }
        return t;
    }
    public  void disp()
    {
        System.out.print("\n Hello Test SingleTon");

    }
}
class TestSimple
{
    void disp1()
    {
        System.out.print("\n Simple class ");
    }

}
public class SingleTon_Class_Allow_To_Create_only_one_Object
{
        public static void main (String arg [ ])
        {
            Test_SingleTon obj1 = Test_SingleTon.getTest();
            obj1.disp();
            Test_SingleTon obj2 =  Test_SingleTon.getTest();
            obj2.disp();
        // This class can't create Multiple Object.
        // -----------------------------------------------------
            TestSimple o3 = new TestSimple();
            o3.disp1();
        // You Should create Multiple obj.
        }
}
/*

 Hello Test SingleTon
 Hello Test SingleTon
 Simple class

**/