package Exceptions;

/**
 * Created by WrajendraG on 2/7/2017.
 */
public class Throw_keyword_Case3_Test2 extends RuntimeException
{
    public static void main(String  args[])
    {
        throw  new Throw_keyword_Case3_Test2();
    }

}
/*
     Exception in thread "main" Exceptions.Throw_keyword_Case3_Test2
	at Exceptions.Throw_keyword_Case3_Test2.main(Throw_keyword_Case3_Test2.java:10)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

* */
