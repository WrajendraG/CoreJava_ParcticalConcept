package Exceptions;

/**
 * Created by WrajendraG on 2/7/2017.
 */
public class Throw_keyword_Case1_Test1
        {
            static ArithmeticException e =new ArithmeticException("Divide by zero");
            public static void main(String  args[])
            {
                throw  e;
            }
        }
/**
 Exception in thread "main" java.lang.ArithmeticException: Divide by zero
 at Exceptions.Throw_keyword_Case1_Test1.<clinit>(Throw_keyword_Case1_Test1.java:8)
 at java.lang.Class.forName0(Native Method)
 at java.lang.Class.forName(Class.java:264)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:123)

 *
 */
