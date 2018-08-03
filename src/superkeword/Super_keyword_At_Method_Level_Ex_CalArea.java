package superkeword;

class Circle
{
    int r=30,Cir_area;
    void area()
    {
        System.out.println("\n=========================================");
        System.out.println("\n I am Base Class Area() Method ");
        Cir_area = r *  r;
        System.out.println("\n superkeword.Circle Area = "+Cir_area);
        System.out.println("\n=========================================");

    }
}
class Rectangle extends Circle
{
    int Base=30,Length=40,Rec_area;
    void area()
    {
        super.area();
        System.out.println("\n=========================================");
        System.out.println("\n I am Intermediate Class  area() Method  ");
        Rec_area = Base * Length;
        System.out.println("\n superkeword.Rectangle Area = "+Rec_area);
        System.out.println("\n=========================================");

    }


}
class Square extends Rectangle
{
    int Side = 25,Sq_area;
    void area()
    {
        super.area();
        System.out.println("\n=========================================");
        System.out.println("\n I am Derived Class  area() Method ");

        Sq_area = Side * Side;
        System.out.println("\n superkeword.Square Area = "+Sq_area);
        System.out.println("\n=========================================");

    }



}

public class Super_keyword_At_Method_Level_Ex_CalArea
{
    public static void main(String[] args)
    {
        Square o = new Square();
        o.area();




    }

}
/*
 =========================================

 I am Base Class Overloading.Area() Method

 superkeword.Circle Overloading.Area = 900

=========================================

=========================================

 I am Intermediate Class  area() Method  

 superkeword.Rectangle Overloading.Area = 1200

=========================================

=========================================

 I am Derived Class  area() Method 

 superkeword.Square Overloading.Area = 625

=========================================

 */