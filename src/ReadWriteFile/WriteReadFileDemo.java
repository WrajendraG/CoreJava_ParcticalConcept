/**
 * Created by WrajendraG on 3/12/2017.
 */

package ReadWriteFile;

import java.io.*;

public class WriteReadFileDemo
{

        private static boolean createFile(String filePath)
        {
                String data =" I am Writing data on File Using Java Program";
                FileWriter fileWriter= null;
                BufferedWriter bufferedWriter=null;
                try
                {

                        fileWriter = new FileWriter(filePath);
                         bufferedWriter =new BufferedWriter(fileWriter);

                        bufferedWriter.write(data);

                        return true;
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                        return false;
                }
                finally
                {
                        try {
                                bufferedWriter.close();
                                fileWriter.close();
                        }
                        catch (IOException e)
                        {
                                e.printStackTrace();
                        }
                }
        }

        private static String readFile(String filepath)
        {
                String data = "";
                String line;

                FileReader fileReader = null;
                BufferedReader bufferedReader= null;

                try
                {
                        fileReader = new FileReader(filepath);
                         bufferedReader = new BufferedReader(fileReader);
                        try {
                                        while ( (line = bufferedReader.readLine() )  != null )
                                        {
                                                data =data+line;
                                                return data;
                                        }
                                }
                                catch (IOException e)
                                {

                                e.printStackTrace();
                                 }
                }
                catch (FileNotFoundException e)
                {
                        e.printStackTrace();
                }
                finally {
                        try {
                                bufferedReader.close();
                                fileReader.close();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }

                }
                return null;
        }

        public static void main(String [] args)
        {
        String filePath ="C:\\Users\\WrajendraG\\Desktop\\javaFile\\FileCreateUsingSamePakInJava.txt";

         boolean filecreated = createFile(filePath);
        String fileData = "";

        if(filecreated)                 // Use flag Check weather file is create of not read or not read
            fileData = readFile(filePath);
        System.out.println(fileData);
        }

}
