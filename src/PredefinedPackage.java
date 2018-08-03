/**
 * Created by WrajendraG on 3/5/2017.
 */
import java.awt.*;
import java.awt.event.*;

public class PredefinedPackage
{
    void m1()
    {
        Button b1=new Button("SAVE");
        System.out.print(b1);
    }

    public static void main(String args[])
    {

     PredefinedPackage o1   =   new PredefinedPackage();
     o1.m1();

    }
}
