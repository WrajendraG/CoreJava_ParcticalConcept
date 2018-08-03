package ReadWriteFile;

import java.io.*;
public class ReadAlreadyExistFileDemo
{
    private static String readFile(String filePath)
    {
            try
            {
                            String data = "";
                            FileReader fileReader =new FileReader(filePath);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);



                int line;
                while((line = bufferedReader.read()) != -1)
                {
                    //   data = data + (char)line;
                    System.out.print((char) line);
                    //      System.out.println("Just check data Come to  Buffer or not  "+line)
                }
/*
                String line2;
                            while((line2 = bufferedReader.readLine()) != null)
                            {
                             //   data = data + (char)line;

                                System.out.print((String) line);
                            //      System.out.println("Just check data Come to  Buffer or not  "+line)
      }
*/
                        bufferedReader.close();
              }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                return null;
    }

            public static void main(String[] args)
            {
                String filePath = "C:\\Users\\WrajendraG\\Desktop\\JavaFile2\\raj1.txt";  // Docx File problem readng

                System.out.print(ReadAlreadyExistFileDemo.readFile(filePath));
            }
}