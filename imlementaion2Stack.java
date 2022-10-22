//stack using interface 
import java.io.*;
import java.util.Scanner;


interface stack{
    void push();
    void pop();

}
class stackimpl implements stack{
    
    Scanner sc= new Scanner(System.in);   
    int MAX =5;
    int arr[] = new int[MAX];
    int top=-1;
    int poped;
    int ele;
    public void push(){
        if(top<MAX-1)
        {
            System.out.println("Push element is  :");
            int ele= sc.nextInt();  
            top++;arr[top]=ele;

        }
        else
        {
            System.out.println("Stack is full");
        }
        
    }
    public void pop(){
        if(top<0){
            System.out.println("Stack is Empty");
        }
        poped=arr[top];
        top--;
         System.out.println("Poped element is  :"+poped);
    }
}

public class imlementaion2Stack {
    public static void main(String[] args)
    {
        stack i = new stackimpl();
        Scanner sc= new Scanner(System.in);
        int in=0;
        

    while (in<10)
    {
        System.out.println("\nEnter | 1 - Push | 2 - Pop  | stack using interface");
        System.out.println("\nEnter your choice - ");
        int ca= sc.nextInt();
        switch (ca)
        {
        case 1:
            i.push();
            break;
        
        case 2:
            i.pop();
            break;

        default: System.out.println("Invalid input");
            break;
        }
        in++;
    }
    }
    
}
///HW stack
//queue
//call constructor