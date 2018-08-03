/**
 * Created by WrajendraG on 2/21/2017.
 */
public class Typecasting2
{

    public static void main(String args [])
    {
       Object obj = "Opulent";
        System.out.print("Value =  "+ obj);
        String s = (String)obj; // Casting  object to String  Parent to child access.
        int p = s.length(); //need Because of accessing child method to parent
        //int p = ((String) obj).length();
          System.out.print("\nResult = "+p);
    }

}
