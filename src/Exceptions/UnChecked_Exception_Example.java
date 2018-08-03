package Exceptions;

import java.io.PrintWriter;

/**
 * Created by rajendra on 3/2/17.
 */
public class UnChecked_Exception_Example
{

    public static void main(String  args[])
    {
        System.out.print("\nHello...");

        System.out.print(10/0); // here UnChecked Exception but within that divide by zero error generate in compileTime.
        //Jvm ignore this because its happen leary yhat why dose no't show anything.
    }
}
/**
 *

 Hello...

 Exception in thread "main" java.lang.ArithmeticException: / by zero
 at Exceptions.UnChecked_Exception_Example.main(UnChecked_Exception_Example.java:14)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:498)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

 *
 */
