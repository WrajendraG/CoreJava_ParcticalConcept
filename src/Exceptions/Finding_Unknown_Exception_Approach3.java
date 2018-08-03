package Exceptions;

/**
 * Created by WrajendraG on 2/8/2017.
 */
public class Finding_Unknown_Exception_Approach3 {

    public static void main(String args[]) {
        int t;
        try {
            t = 10 / 0;

        } catch (Exception e) {
            System.err.print(e.getMessage());          // It's valid Exception class is String  return always.
        }

    }
}
/*
/ by zero
-----------------------------------------------------------------
Details about UnknownException Approach 1
----------------------------------------------------------------

1) Nature of UnknownException

* */