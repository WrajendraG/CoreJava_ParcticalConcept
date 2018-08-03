import java.util.Scanner;
import java.lang.*;
import java.lang.Math;


class Functions
{

    Scanner s =  new Scanner(System.in);

    void square_Root()
    {
        double x,y;

        System.out.println("======================================");
        System.out.println("You want Squre Root of x ");
        System.out.println("Enter x value = ");
        x = Integer.parseInt(s.nextLine());
        System.out.println("======================================");

        y = Math.sqrt(x);
        System.out.println(" Result of rest to the power = "+y);
        System.out.println("======================================");


    }
    void maximum_Number()
    {
        int num1,num2,result;

        System.out.print("\n==================== ENTER TWO NUMBER ==========================\n");
        System.out.print("\nEnter Number 1st = ");
        Scanner ip = new Scanner(System.in);
        num1 = ip.nextInt();
        System.out.print("\nEnter Number 2nd = ");
        num2 = ip.nextInt();

        System.out.print("\n=================================================================\n");
        result = Math.max(num1,num2);
        System.out.println(" \n Maximum Value is = "+result);

    }
    void Squre_Power()
    {
        int m,n;
        double z;

        System.out.println("\n======================================");
        System.out.println("You want x^n Execution");
        System.out.println("Enter x (Base) value = ");
        m = Integer.parseInt(s.nextLine());
        System.out.println("Enter n (power) value = ");
        n = Integer.parseInt(s.nextLine());
        System.out.println("\n======================================");

        z = Math.pow(m,n);
        System.out.println("\n======================================");
        System.out.println(" Result of rest to the power = "+z);
        System.out.println("\n======================================");

    }
    void log_value()
    {
        double v,z;
        System.out.print("\n Enter value To want Log = ");
        v = Double.parseDouble(s.nextLine());
        z = Math.log(v);
        System.out.println("\n======================================");
        System.out.print("Log"+v+"  = "+z);
        System.out.println("\n======================================");

    }
    void ceil_value()
    {
        double v,z;
        System.out.print("\n Enter Float value  = ");
        v = Double.parseDouble(s.nextLine());
        z = Math.ceil(v);
        System.out.println("\n======================================");
        System.out.print("Original Value ="+v+" Ceil Value is = "+z);
        System.out.println("\n======================================");

    }
    void floor_value()
    {
        double v,z;
        System.out.print("\n Enter Float value  = ");
        v = Double.parseDouble(s.nextLine());
        z = Math.floor(v);
        System.out.println("\n======================================");
        System.out.print("Original Value ="+v+" Floor Value is = "+z);
        System.out.println("\n======================================");

    }
    void round_value()
    {
        double v,z;
        System.out.print("\n Enter Float value  = ");
        v = Double.parseDouble(s.nextLine());
        z = Math.round(v);
        System.out.println("\n======================================");
        System.out.print("Original Value ="+v+" Round Value is = "+z);
        System.out.println("\n======================================");

    }
    void random_value()
    {


        double z = Math.random();
        System.out.println("\n======================================");
        System.out.print("\n Random value is "+z);
        System.out.println("\n======================================");

    }

    void abs_value()
    {
        int v,t;
        System.out.print("\n Enter Negative Integer Value = ");
        v = Integer.parseInt(s.nextLine());
        t = Math.abs(v);
        System.out.println("\n======================================");
        System.out.print("\n Abs Value is = "+t);
        System.out.println("\n======================================");
    }
    void Max_Using_If_Else()
    {

        int num1,num2,num3;

        Scanner input = new Scanner(System.in);
        System.out.print("\n==================== ENTER THREE NUMBER ==========================\n");
        System.out.print("\nEnter Number 1st = ");
        num1 = input.nextInt();
        System.out.print("\nEnter Number 2nd = ");
        num2 = input.nextInt();
        System.out.print("\nEnter Number 3rd = ");
        num3 = input.nextInt();
        System.out.print("\n=================================================================\n");

        if(num1>=num2 && num1>=num3 )
        {
            System.out.print("\n 1st Number is Largest Number = "+num1);
        }
        if(num2>=num1 && num2>=num3 )
        {
            System.out.print("\n 2nd Number is Largest Number = "+num2);

        }
        if(num3>=num1 && num3>=num2 )
        {

            System.out.print("\n 3rd Number is Largest Number = "+num3);

        }
    }
}

public class Import_Java_lang_Math_Functions_execution
{

    public static void main(String[] args)
    {
        int Again;
        Scanner s1 =  new Scanner(System.in);
        Functions o = new Functions();
        do {

            int ch;


            System.out.print("\n                ======== Manu =============");
            System.out.print("\n");
            System.out.print("\n                1) Squre Root ");
            System.out.print("\n                2) Squre Power ");
            System.out.print("\n                3) Maximum Number ");
            System.out.print("\n                4) Log ");
            System.out.print("\n                5) Ceil (Flouting Point Value Up To Nearest Integer) ");
            System.out.print("\n                6) Floor (Flouting Point Value Down To Nearest Integer) ");
            System.out.print("\n                7) Round (Flouting Point Value Either Up and Down To Nearest Integer) ");
            System.out.print("\n                8) Random (If we Need Integer Value Random Return Float value ) ");
            System.out.print("\n                9) abs (convert Negative Valu to Positive value ) ");
            System.out.print("\n                10) Maximum Number (But using If else Not Using Math Function ) ");
            System.out.print("\n                99) Exit ");

            System.out.print("\n                ============================ ");

            System.out.print("\n                Enter Your Choice =  ");
            ch = Integer.parseInt(s1.nextLine());

            switch (ch)
            {

                case 1: o.square_Root();
                    break;
                case 2: o.Squre_Power();
                    break;
                case 3: o.maximum_Number();
                    break;
                case 4: o.log_value();
                    break;
                case 5: o.ceil_value();
                    break;
                case 6: o.floor_value();
                    break;
                case 7:o.round_value();
                    break;
                case 8:o.random_value();
                    break;
                case 9: o.abs_value();
                    break;
                case 10:o.Max_Using_If_Else();
                    break;

                case  99:
                    System.exit(99);
                default:
                    System.out.print("\n Enter Valid Choice = ");


            }
            System.out.print("\n Do you Want Continue =  "+" |< PRESS 0 >| = ");
            Again = Integer.parseInt(s1.nextLine());

        }while (Again == 0);
    }

}