package For_Importing_Execution_Logic_Package1_Package2;

import For_Creating_Classes_Package1.Display;
import  For_Creating_Classes_Package2.CalculateOfArea_Simple_Using_Interface2;
/**
 * Created by raju on 27/1/17.
 */
class CalculateOfArea_Simple_Using_Interface
{
    public static void main (String arg[])
    {
        Display o1 = new Display();
        o1.dispMySelf1();
        //-----------------------------------------

        CalculateOfArea_Simple_Using_Interface2 o2 =    new CalculateOfArea_Simple_Using_Interface2();
            o2.areaOfCircle2();
            o2.areaOfSquare2();
            o2.areaOfRectangle2();
    //---------------------------------------------------
        o1.dispMySelf2();


    }
}
