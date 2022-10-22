import java.io.*;
public class filess3 {
    public static void main(String args[]) throws IOException
    {
        FileInputStream f1 = new FileInputStream("source.txt");
        FileInputStream f2 = new FileInputStream("source2.txt");
        SequenceInputStream sis = new SequenceInputStream(f1,f2); // writen mode sourec data will be copied in abc

        try{
            int ch;
            while( (ch = sis.read()) != -1 )
            {
                // d.write(ch);
                if (Character.isUpperCase(ch)) 
                {
                    System.out.println("Character is in Uppercase! : " + ch);
                    sis.write(ch);
                }

            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR : " + e);
        }
        f1.close();
        f2.close();
    }
    
}
