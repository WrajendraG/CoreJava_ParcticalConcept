package For_Importing_Execution_Logic_Package1_Package2;

// Import package
import For_Creating_Classes_Package1.Display;
import For_Creating_Classes_Package1.AreaOfCircleImportPakDemo2;
import For_Creating_Classes_Package1.AreaOfSquareImportPakDemo;
import For_Creating_Classes_Package1.AreaOfRectangleImportPakDemo2;



public class Execution_of_Area_Using_Import_Pakage
{
    public static void main(String args [])
    {
            Display o0 = new Display();
            o0.dispMySelf1();

        AreaOfCircleImportPakDemo2 o1 = new AreaOfCircleImportPakDemo2();

                    o1.areaOfCircle();  //call this method From Different package.
        //-----------------------------------------------------------------

        AreaOfSquareImportPakDemo o2 = new AreaOfSquareImportPakDemo();

                    o2.areaOfSquare();  //call this method From Different package.
        //---------------------------------------------------------------------------
        AreaOfRectangleImportPakDemo2 o3 = new AreaOfRectangleImportPakDemo2();

                    o3.areaOfRectangle();   //call this method From Different package.
        //---------------------------------------------------------------------------
            o0.dispMySelf2();
    }
}
