import java.io.*;
import java.util.Scanner;
import java.util.*;  
class factorial
{
    static int fact(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * fact(n-1));    
       }
    public static void main(String[] args)
    {
        int f;
        System.out.print("Enter number to find factorial - ");
        Scanner sc= new Scanner(System.in); 
        int n= sc.nextInt();  
        factorial f1 =new factorial();
        f = f1.fact(n);
        System.out.print("Factorial si  - "+f);
    }

}