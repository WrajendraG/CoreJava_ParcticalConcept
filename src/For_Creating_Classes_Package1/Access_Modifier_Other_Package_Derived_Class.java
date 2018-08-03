package For_Creating_Classes_Package1;

import For_Creating_Classes_Package2.Access_Modifier_Same_package_Derived_Class;

public class Access_Modifier_Other_Package_Derived_Class extends Access_Modifier_Same_package_Derived_Class
{
   public void display_Derived_Importing_Extends()
    {
        System.out.print("\n-------------------------------------------------------------------");
//----------------------------------------------------------------------------------------
        //  System.out.print("\n I am private Form Derived_Importing_Extends class n1 = "+n1);
        //private n1 from base class can't access in OTHER PACKAGE derived class because it's private.
//-----------------------------------------------------------------------------------------
        System.out.print("\n------------------------------------------------------------------");
//-----------------------------------------------------------------------------------------
        //System.out.print("\n I am default Form Derived_Importing_Extends class n2 = "+n2);
        //Default n2 Form base Class can't access in OTHER PACKAGE Derived class because it't Default.
//-----------------------------------------------------------------------------------------------------
        System.out.print("\n-------------------------------------------------------------------");

        System.out.print("\n I am protected Form Derived_Importing_Extends class n3 = "+n3);
        System.out.print("\n-------------------------------------------------------------------");
        System.out.print("\n I am public Form Derived_Importing_Extends class n4 = "+n4);
        System.out.print("\n-------------------------------------------------------------------");
    }
}
