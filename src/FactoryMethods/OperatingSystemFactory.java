package FactoryMethods;

import FactoryMethods.InFactory.Android;
import FactoryMethods.InFactory.Ios;
import FactoryMethods.InFactory.Windows;


public class OperatingSystemFactory
{
    public Os getInstance(String str)         // Return type is class or Interface name
    {
        if (str.equals("UseFull"))
        {
            return new Android();
        }
        else if (str.equals("Secure"))
        {
            return new Ios();
        }
        else
        {
            return new Windows();
        }

    }
}
