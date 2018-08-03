package CollectionFarmwork;

/**
 * Created by WrajendraG on 3/11/2017.
 */
 class  GenericTest
{

    public static <E> void PrintArray(E[] a)
    {
        for (E element: a)
        {
            System.out.print("\n Element  : "+element);
        }
    }
}
public class GenericDemo
{
    public static void main(String args[])
    {
        Integer[] i={1,2,3,4,5};
        Character [] c = {'r','a','j'};

GenericTest t1 = new GenericTest();
     t1.PrintArray(i);
    t1. PrintArray(c);
    }

}
