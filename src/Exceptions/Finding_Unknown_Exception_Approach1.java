package Exceptions;

/**
 * Created by WrajendraG on 2/8/2017.
 */
public class Finding_Unknown_Exception_Approach1
{
    public static void main(String args [ ])
    {
        int t;
        try
        {
            t = 10/0;

        }
        catch (Exception   e)
        {
        System.err.print(e);    // Approach 1

        }
    }
}
/**
 java.lang.ArithmeticException: / by zero

 ----------------------------------------------------------------
 Details about UnknownException Approach 1
 ----------------------------------------------------------------
        1) Name of UnknownException
        2) Nature of UnknownException
 *
 */
