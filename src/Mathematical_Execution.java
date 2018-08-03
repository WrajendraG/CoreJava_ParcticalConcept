import java.util.*;
class Sc
{
    int a,b,addSum,addSub,addMul,addDiv;
    void add(int a,int b)
    {
        addSum=a+b;
        System.out.print("\nAddition = "+addSum);
    }
    void sub(int a,int b)
    {
        addSub=a-b;
        System.out.print("\nSubtraction = "+addSub);
    }
    void mul(int a,int b)
    {
        addMul=a*b;
        System.out.print("\nAddition = "+addMul);
    }
    void div(int a,int b)
    {
        addDiv=a/b;
        System.out.print("\nAddition = "+addDiv);

    }


}
public class Mathematical_Execution
{
    public static void main(String args[])
    {

        String Again_Return;
        Sc o1= new Sc();
        Scanner s1 = new Scanner(System.in);
        do
            {
            int ch;


            System.out.print("\n ================== Enter Two Value A and B ================");

            System.out.print("\n First Number = ");
            int a = Integer.parseInt(s1.nextLine());
            System.out.print("\n Second Number = ");
            int b = Integer.parseInt(s1.nextLine());

            System.out.print("\n=========== Enter your choice = ============");
            System.out.print("\n 1) Addition ");
            System.out.print("\n 2) Subtraction ");
            System.out.print("\n 3) Multiplication ");
            System.out.print("\n 4) Division ");
            System.out.print("\n============================================");
            System.out.print("\n \t\t Enter your choice = ");
            ch = Integer.parseInt(s1.nextLine());
            switch (ch) {
                case 1:
                    o1.add(a, b);
                    break;
                case 2:
                    o1.sub(a, b);
                    break;
                case 3:
                    o1.mul(a, b);
                    break;
                case 4:
                    o1.div(a, b);
                    break;

                default:
                    System.out.print("\nEnter Valid Input");
                    break;
            }

            System.out.print("\n============================================");
            System.out.print("\n \t\t\t\t Do you Want Continue Yes or No =  ");
            Again_Return =s1.next();
        }while(Again_Return == "Yes" || Again_Return == "yes");
    }
}