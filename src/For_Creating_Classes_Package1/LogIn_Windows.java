/*
package For_Creating_Classes_Package1;
import For_Creating_Classes_Package2.Withdraw;

import java.util.*;
import java.sql.*;

class LogIn_Windows
    {
                String logid = "admin", a;
                int password = 1234, b,r;


                Scanner s1 = new Scanner(System.in);

                Withdraw o1 = new Withdraw();

                public void login()
                    {

                        System.out.print("\n============================= Execution on Terminal =======================================");
                        System.out.print("\n-----------------------------                       ---------------------------------------");

                        System.out.print("\n\t\t\t\t\t-------------------------------");
                        System.out.print("\n\t\t\t\t\t WELCOME TO ONLINE BANK SYSTEM ");
                        System.out.print("\n\t\t\t\t\t-------------------------------");
                        System.out.print("\n");
                        System.out.print("\n\t\t\t\t\t\t\t\t\t\t--------------------------");
                            try
                                {
                                    System.out.print("\n\t\t\t\t\t\t\t\t\t\t| Bank Login  ID = ");
                                    a = s1.nextLine();
                                }
                            catch (NumberFormatException nfe)
                                {
                                    System.out.print("\n\t\t\t\t\tLogin Id  Only in Character ");
                                }

                                    if (logid.equals(a))
                                    {
                                            try {
                                                System.out.print("\n\t\t\t\t\t\t\t\t\t\t--------------------------");
                                                System.out.print("\n\t\t\t\t\t\t\t\t\t\t| Password = ");
                                                b = Integer.parseInt(s1.nextLine());
                                                System.out.print("\n\t\t\t\t\t\t\t\t\t\t--------------------------");
                                            }
                                            catch (NumberFormatException nfe)
                                            {
                                                System.out.print("\n Password Only in Integer Number ");
                                            }
                                        if (password == b) {
                                            do
                                                    {

                                                            int ch;


                                                        System.out.print("\n\t\t\t\t\t<========== Welcome  =============>");
                                                        System.out.print("\n\t\t\t\t\t ====  State Bank Of India =====");
                                                        System.out.print("\n\t\t\t\t\t___________________________________");
                                                        System.out.print("\n\t\t\t\t\t|1| Accept New Account           |");
                                                        System.out.print("\n\t\t\t\t\t|11| Accept Already Account                    |");
                                                        System.out.print("\n\t\t\t\t\t|2| Deposit                      |");
                                                        System.out.print("\n\t\t\t\t\t|3| Withdraw                     |");
                                                        System.out.print("\n\t\t\t\t\t|4| Show Balance                 |");
                                                        System.out.print("\n\t\t\t\t\t|5| Show Account Details         |");
                                                        System.out.print("\n\t\t\t\t\t|6| Exit                         |");
                                                        System.out.print("\n\t\t\t\t\t----------------------------------");

                                                        System.out.print("\n\t\t\t\t\t Enter Your Choice = ");
                                                        ch = Integer.parseInt(s1.nextLine());
                                                        switch (ch) {
                                                            case 1:
                                                           //     o1.acceptBankDetails();

                                                                break;

                                                            case 2:
                                                             //   o1.depositAmount();

                                                                break;

                                                            case 3:
                                                               // o1.withdrawAmount();

                                                                break;

                                                            case 4:
                                                                //o1.showBalance();

                                                                break;
                                                            case 5:
                                                                //o1.displayBankDetails();
                                                                break;

                                                            case 6:
                                                                System.out.print("\n-----------------------------                     ----------------------------------------");
                                                                System.out.print("\n================================= End Terminal ==========================================");

                                                                System.exit(0);
                                                                return;

                                                            default:
                                                                System.out.print("\n\t\t\t\t\t----------------------------------------------");
                                                                System.out.print("\n\t\t\t\t\t Enter Valid Choice ");
                                                                System.out.print("\n\t\t\t\t\t----------------------------------------------");


                                                        }

                                                        System.out.print("\n\t\t\t\t\t \t\t\t\t\tDO YOY WANT CONTINUE PRESS ZERO(0)...... =  ");
                                                        r = Integer.parseInt(s1.nextLine());
                                                    } while (r == 0);
                                        }
                                        else
                                            {
                                            System.out.print("\n\t\t\t\t\t----------------------------------------------");
                                            System.out.print("\n\t\t\t\t\t Enter Valid Password Try Again With Username ");
                                            System.out.print("\n\t\t\t\t\t----------------------------------------------");
                                            login();
                                            }


                                }
                                else
                                    {
                                    System.out.print("\n\t\t\t\t\t---------------------------------------");
                                    System.out.print("\n\t\t\t\t\t| Enter Valid User Name Try Again ");
                                    System.out.print("\n\t\t\t\t\t---------------------------------------");
                                    login();
                                    }
            }
    }
*/