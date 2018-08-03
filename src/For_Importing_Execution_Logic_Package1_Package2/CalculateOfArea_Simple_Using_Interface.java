package For_Importing_Execution_Logic_Package1_Package2;

import For_Creating_Classes_Package1.Display;
import For_Creating_Classes_Package2.CalculateOfArea_Simple_Using_Interface;


/**
 * Created by raju on 27/1/17.
 */
class CalculateOfArea_Simple_Using_Interface1
{
    public static void main (String arg [])
    {
        Display o0 = new Display();
        o0.dispMySelf1();
        //---------------------------------------------------------------------------------
        CalculateOfArea_Simple_Using_Interface o1 = new CalculateOfArea_Simple_Using_Interface();
        o1.areaOfCircle();
        o1.areaOfSquare();
        o1.areaOfRectangle();
        //----------------------------------------------------------
        o0.dispMySelf2();
    }
}
