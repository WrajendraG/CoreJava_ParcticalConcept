package Overloading;

class Area
{
    float Cir_area;
    int Rec_area,Sq_area;

    Area()
    {
        // I dont Want to requred callig me for object
        System.out.println("\n=========================================");
        System.out.println("\n I am Default Not any Arguments pass me ");
        System.out.println("\n=========================================");


    }

    void area(float r)
    {
        System.out.println("\n=========================================");

        Cir_area = r *  r;
        System.out.println("\n Circle Overloading.Area = "+Cir_area);
        System.out.println("\n=========================================");

    }
    void area(int b , int l)
    {

        System.out.println("\n=========================================");

        Rec_area = b * l;
        System.out.println("\n Rectangle Overloading.Area = "+Rec_area);
        System.out.println("\n=========================================");

    }


    void area(int s)
    {

        System.out.println("\n=========================================");


        Sq_area = s * s;
        System.out.println("\n Square Overloading.Area = "+Sq_area);
        System.out.println("\n=========================================");

    }
}

public class Overloading_Method_Level
{
    public static void main(String[] args)
    {



        Area o = new Area();//Default Constructor call here (its is only one initialize in every class Number of parameterized ).
        o.area(2.0f);
        o.area(5, 5);
        o.area(10);

    }

}