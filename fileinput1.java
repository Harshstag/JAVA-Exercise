import java.io.*;


// class NoMatchException extends Exception {
//     NoMatchException() {
//         System.out.println("Invalid Condition  ");
//     }
// }
// public class exceptionHandling5 {
//     public static void main(String args[]) {
//         float a, b, c;
//         a = 20;
//         b = 50;
//         c = 30;
//         float Area; 
//         try {
//             if(((a+b)>c) && ((b+c)>a) && ((c+a)>b))
//             {
//                 System.out.println("Area Of trangle : ");
//             }
//             else 
//             {
//                 throw new NoMatchException();
//             }

//         }
    
//         catch (Exception e) {
//             System.out.println("Error :" + e);
//         }
//     }
    
// }
public class fileinput1 {
    public static void main(String args[]) throws IOException{
        
        FileInputStream f = new FileInputStream("abc.txt");
        int countLines = 0;
        int countWords = 0;
        int countBytes = 0 ;
        try {
            int ch;
            while((ch=f.read()) != -1)
            {
                countBytes++;
                if (ch == '\n') {
                    countLines++;
                } else if (ch == ' ') {
                    countWords++;
                } else {
                    // System.out.print((char) ch);
                }
            }
            System.out.println("Bytes are : "+ countBytes + "\nWords are : " + countWords + "\nLines are : " + countLines);
        }
        catch (Exception e) {
            System.out.println("Error :" + e);
        }
        f.close();
    }
    
}
//Write a program to read the contect of file and display the number of bytes , no of line , no of words.
//Write a program to read the contect of file and to display the alternate line from then given files 