package Interface;

/**
 * Created by raju on 19/1/17.
 */
interface I1F1
{
    void disp(); // Functional Interface Because Only one Interface in Program.
}
public class Interface_Using_Functional_Interface_calling_Anonames
{
    public static void main (String args [])
    {
        System.out.print("\n===================== 1 =========================");
        I1F1 o = new I1F1()
        {
            @Override
            public void disp()
            {
                System.out.print("\n Hello java ! ");
            }
        };
        o.disp(); // Anoonames Method call

        // Hello java !

    }
}
