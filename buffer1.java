import java.io.*;
public class buffer1 {
    public static void main(String args[]) throws IOException
    {
        FileReader fin = new FileReader("source.txt");
        FileWriter fout = new  FileWriter("xyz.txt"); // writen mode sourec data will be copied in abc
        BufferedReader bfi = new BufferedReader(fin);
        BufferedWriter bfo = new BufferedWriter(fout);
        try{
            int ch;
            while((ch=bfi.read())!=-1)
            {
                bfo.write(ch);
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR : " + e);
        }
        fin.close();
        fout.close();

        bfi.close();
        bfo.close();
    }
    
}
