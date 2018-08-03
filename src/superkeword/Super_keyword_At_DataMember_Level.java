package superkeword;

class BaseClass
{

    int a;

}
class DerivedClass extends BaseClass
{
    int a,c;
    void set(int x,int y)
    {
        this.a = x;
        super.a = y;

    }
    void add()
    {
        c = this.a  + super.a;

    }
    void disp()
    {

        System.out.println("\nValue base class 'a ' = "+this.a);
        System.out.println("\nValue Derived Class ' a '= "+super.a);
        System.out.println("\n sum = "+c);

    }

}
public class Super_keyword_At_DataMember_Level
{
    public static void main(String[] args)
    {
        DerivedClass o1 = new DerivedClass();
        o1.set(20, 30);
        o1.add();
        o1.disp();

    }

}

/*
 * not using supper and this keyword output is this=
 * ambiguity is occur.
Value base class 'a ' = 20

Value Derived Class ' a '= 20

 sum = 40
-----------------------------------------------------------
 * using super and this keyword
 * this is always point to the current class object(Reference)
 * super is point to the Other class object (In Inheritance)

Value base class 'a ' = 20

Value Derived Class ' a '= 30

 sum = 50
------------------------------------------------------------
 *
 */

