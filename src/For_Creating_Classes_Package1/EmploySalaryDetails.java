/**
 * Created by WrajendraG on 2/9/2017.
 */

package For_Creating_Classes_Package1;
import  Exceptions.NegativeSalaryException;

public class EmploySalaryDetails
{
        int sal;

    public void DecideSalary  (String s) throws NegativeSalaryException
    {
        sal= Integer.parseInt(s);
            if(sal<=0)
            {

             throw new NegativeSalaryException("\n\t\t\t  Enter valid Amount ");

            }
            else
            {
                System.out.print("\n\t\t\tGood Salary .....Try For Best ");

            }
    }
}
