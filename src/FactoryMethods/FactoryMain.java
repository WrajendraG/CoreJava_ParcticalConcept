package FactoryMethods;
/**
 * Created by WrajendraG on 3/2/2017.
 */

import FactoryMethods.InFactory.Android;
import FactoryMethods.InFactory.Ios;
import FactoryMethods.InFactory.Windows;

public class FactoryMain
{
    public static void main(String args[ ])
    {
            /*
        Os Obj1 =new Android();
        Obj1.specification();

        Os Obj2 = new Windows();
        Obj2.specification();

        Os  Obj3  =new Ios();
        Obj3.specification();

    // Avoid creation of Multiple object  .Using FactoryMethod Just pass the requirement of user to factory .
     factory will fulfill user Requirement.

    //output
    Android is Most UseFull OS
    Windows is Limited UseFull OS
    IOS is Most Secure OS
          */

            OperatingSystemFactory osf = new OperatingSystemFactory();

            Os obj1 = osf.getInstance("Secure");    // user want to secure os
                obj1.specification();    //OP:     IOS is Most Secure OS

            Os obj2 = osf.getInstance("UseFull");
            obj2.specification();   //op:   Android is Most UseFull OS

            Os obj3 =   osf.getInstance("other");
            obj3.specification();   //op:  Windows is Limited UseFull OS

        // In Feature Developer Want to change Req. That can change only factory method.

    }
}
/*
IOS is Most Secure OS
Android is Most UseFull OS
Windows is Limited UseFull OS
* */
