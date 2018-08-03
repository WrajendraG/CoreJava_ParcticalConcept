/*
package For_Creating_Classes_Package2;
import java.sql.*;

/**
 * Created by raju on 30/1/17.
 */
/*
import java.util.*;

class BankDetails
    {
            double AccountNo;
            String AccountName;

            static double TotalAmount=0;

            Scanner s2 = new Scanner(System.in);

        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDatabase","root","root");

        BankDetails() throws SQLException
        {

        }

        public void acceptBankDetails() throws SQLException
        {
                        System.out.print("\n\t\t\t\t\t============================================");
                        PreparedStatement preparedStatement = connection.prepareStatement("insert into bankdatabase.customerinfo values(?,?,?)");

                        System.out.print("\n\t\t\t\t\t Enter Account Number = ");
                        AccountNo = Integer.parseInt(s2.nextLine());
                        preparedStatement.setDouble(1,AccountNo);

                        System.out.print("\n \t\t\t\t\tEnter Account Name = ");
                        AccountName = s2.nextLine();
                        preparedStatement.setString(2,AccountName);

                        System.out.print("\n \t\t\t\t\t How Many Amount to be Deposit First Time = ");
                        TotalAmount = Integer.parseInt(s2.nextLine());
                        preparedStatement.setDouble(3,TotalAmount);
                        preparedStatement.executeUpdate();
                        System.out.print("\n\t\t\t\t\t============================================");
                        displayBankDetails();
                }
         public void displayBankDetails() throws SQLException
         {

                        System.out.print("\n\t\t\t\t\t============================================");
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM bankdatabase.customerinfo");
             while (resultSet.next())
             {
                 System.out.print("\n\t\t\t\t\t Account Number = "+resultSet.getDouble("AccountNumber")+" "+"\n\t\t\t\t\t Account Name = "+ resultSet.getString("AccountName")+" "+"\n\t\t\t\t\t Account Balance = " +resultSet.getDouble("TotalAmount"));
                 System.out.println();

             }

         }

}



class Deposit extends BankDetails
    {

            float DepoAmount,SumAmount;

        Deposit() throws SQLException
        {
        }

        public void depositAmount() throws SQLException
                {
                    PreparedStatement preparedStatement = connection.prepareStatement("update bankdatabase.customerinfo set TotalAmount=? where AccountNumber=?");


                    System.out.print("\n\t\t\t\t\tHow many Amount to be  Deposit  = ");
                    DepoAmount = Float.parseFloat(s2.nextLine());
                    preparedStatement.setFloat(1,DepoAmount);

                    System.out.print("\n\t\t\t\t\t Which Account Number to be Deposit = ");
                    AccountNo = Integer.parseInt(s2.nextLine());
                    preparedStatement.setDouble(2,AccountNo);


                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("Select TotalAmount from bankdatabase.customerinfo where AccountNumber=?");


                        SumAmount  = (resultSet + DepoAmount);



                        showBalance();

                }
           public void showBalance()
                {

                        System.out.print("\n\t\t\t\t\t============================================");

                        System.out.print("\n\t\t\t\t\t Account Balance = "+BankDetails.TotalAmount);

                        System.out.print("\n\t\t\t\t\t============================================");

                }

    }


public class Withdraw extends Deposit
    {
           double WithAmount;

          public void withdrawAmount()
                {

                        System.out.print("\n\t\t\t\t\t Enter Withdraw Amount = ");
                        WithAmount = Double.parseDouble(s2.nextLine());
                       // if(BankDetails.TotalAmount<=1000)
                            if(WithAmount<=1000)
                                {
                                    System.out.print(" \n\t\t\t\t\t Your Can't Withdraw.. Balance is Less Than 1000 ");

                                }
                                else
                                    if(WithAmount>TotalAmount)
                                            {
                                                System.out.print(" \n\t\t\t\t\t Your Can't Withdraw.. Balance is Less Than current balance ");
                                            }
                                             else
                                            {
                                                BankDetails.TotalAmount = (BankDetails.TotalAmount - WithAmount);
                                            }



                        showBalance();
                }
    }

    */