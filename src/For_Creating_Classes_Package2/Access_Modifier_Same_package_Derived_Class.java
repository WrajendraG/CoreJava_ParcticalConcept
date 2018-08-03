package For_Creating_Classes_Package2;

/**
 * Created by raju on 30/1/17.
 */
class  Base_Class
{
    private     int n1  =   10;
                int n2  =   20;
    protected   int n3  =   30;
    public      int n4  =   40;

  public void display_Base()
    {
        System.out.print("\n-----------------------------------------------------");
        System.out.print("\n I am Private Form Base class n1 = "+n1);
        System.out.print("\n-----------------------------------------------------");
        System.out.print("\n I am Default Form Base class n2 = "+n2);
        System.out.print("\n-----------------------------------------------------");
        System.out.print("\n I am Protected Form Base class n3 = "+n3);
        System.out.print("\n----------------------------------------------------");
        System.out.print("\n I am public Form Base class n4 = "+n4);
        System.out.print("\n----------------------------------------------------");
    }

}

public class Access_Modifier_Same_package_Derived_Class extends Base_Class
{

  public void display_Derived()
    {

        System.out.print("\n-----------------------------------------------------------");
        //----------------------------------------------------------------------------------------
      //  System.out.print("\n I am private Form BSame_package_Derived class n1 = "+n1);
        // n1 from base class can't access in derived class because it's private.
        //-----------------------------------------------------------------------------------------
        System.out.print("\n-----------------------------------------------------------");
        System.out.print("\n I am default Form Same_package_Derived class n2 = "+n2);
        System.out.print("\n-----------------------------------------------------------");
        System.out.print("\n I am protected Form Same_package_Derived class n3 = "+n3);
        System.out.print("\n-----------------------------------------------------------");
        System.out.print("\n I am public Form Same_package_Derived class n4 = "+n4);
        System.out.print("\n-----------------------------------------------------------");
    }
}
