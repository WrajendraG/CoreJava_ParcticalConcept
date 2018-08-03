package Exceptions;

/**
 * Created by WrajendraG on 2/7/2017.
 */
public class Throw_keyword_Case2_Test1
{
    public static void main(String  args[])
    {
        System.out.print(10/0);
        System.out.print("Hello Java");
    }
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exceptions.Throw_keyword_Case2_Test1.main(Throw_keyword_Case2_Test1.java:10)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

* */