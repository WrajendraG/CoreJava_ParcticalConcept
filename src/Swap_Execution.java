import java.util.Scanner;
class Swap
{
    int a,b;
    void swap(int num1, int num2)
    {
        a=num1;
        b=num2;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.print("\n=====================AFTER=========================");
        System.out.print("\nYou are Enter value of After Swaping a is = : "+a);
        System.out.print("\nyou are Enter value of After Swaping b is = : "+b);
        System.out.print("\n===================================================\n");
    }


}

public class Swap_Execution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.print("\n==================================================");
        System.out.print("\nUser Enter Two value");
        System.out.print("\n==================================================");
        System.out.print("\nEnter Number One A := ");
        int num1 = s.nextInt();
        //int num1 = Integer.parseInt(s.nextLine());
        System.out.print("\nEnter number Two B := ");
        int num2 = s.nextInt();
        System.out.print("\n====================BEFOER=========================");
        System.out.print("\nBefore Swaping number a is := "+num1);
        System.out.print("\nBefore Swaping number b is := "+num2);
        System.out.print("\n===================================================");

        Swap o = new Swap();
        o.swap(num1,num2);
        s.close();

    }
}

/*
raju@Notbookpc:~/Desktop/HomeWork-Java/2016December/221216Thursday$ javac SwapDemo.java
raju@Notbookpc:~/Desktop/HomeWork-Java/2016December/221216Thursday$ java SwapDemo

==================================================
User Enter Two value
==================================================
Enter Number one := 21

Enter number two := 51

====================BEFOER=========================
Before Swaping number a is := 21
Before Swaping number b is := 51
===================================================
=====================AFTER=========================
You are Enter value of After Swaping a is = : 51
you are Enter value of After Swaping b is = : 21
===================================================
raju@Notbookpc:~/Desktop/HomeWork-Java/2016December/221216Thursday$ 


*/