import java.io.*;
public class fileOutput1 {
    public static void main(String args[]) throws IOException
    {
        FileInputStream f = new FileInputStream("source.txt");
        FileOutputStream d = new FileOutputStream("abc.txt"); // writen mode sourec data will be copied in abc

        try{
            int ch;
            while((ch = f.read()) != -1)
            {
                // d.write(ch);
                if (Character.isUpperCase(ch)) 
                {
                    System.out.println("Character is in Uppercase! : " + ch);
                    d.write(ch);
                    
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR : " + e);
        }
        f.close();
        d.close();
    }
    
}
