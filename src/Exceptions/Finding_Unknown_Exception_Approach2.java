package Exceptions;

/**
 * Created by WrajendraG on 2/8/2017.
 */
public class Finding_Unknown_Exception_Approach2
{
    public static void main(String args [ ])
    {
        int t;
        try {
            t = 10 / 0;

        } catch (Exception e) {
            // System.err.print( e.printStackTrace()); It's not valid Exception class is not return any thing its void

            e.printStackTrace(); // Approach 2
        }

    }
}
/*
                                                Most Use This Method To Find Exception.

* java.lang.ArithmeticException: / by zero
	at Exceptions.Finding_Unknown_Exception_Approach2.main(Finding_Unknown_Exception_Approach2.java:12)

-----------------------------------------------------------------
Details about UnknownException Approach 2
----------------------------------------------------------------
    1) Name of UnknownException
     2) Nature of UnknownException
     3) Line number Where Exception Occur

* */