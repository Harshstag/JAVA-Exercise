import java.text.ParseException;

public class linearseachinjava
{
    
    public static void main(String args[])
    {
    int i;
    
    for (i=1;i<10;i++)
    {
        System.out.println(" Your first argument " +args[i]);
    }
    // System.out.println(" Enter the  number you want to srearch  " +args[0]);
    int num;
    num =Integer.Parseint(args[]);
    for(i=0;i<10;i++) // for loop
    {
        
        if (args[0]==args[i]) // if the element is present in arr 
        {
            System.out.println("\nThe Number is present at position : %d / %dth Index \n\n",+i+1,+i);
            found = 1;
            break;

        }
    }
        if(! found) 
        {
            // if element does not found in arr 
            System.out.println("\nElement not found \n\n");
        }
    }
    
}

// there may be occausions when we may like our program to ack in a perticuar way depending on inpuut provided at the time of execution
//  this is acchived in java programs
// by command line argumnets in thay are parameters that are suppplied  to the application program at the time of invoing it for execution
// recol the signature of main method public static voidmain (string "args[]") where args a isdeclared a an array of strings 
// any augumnets aprovided in command line (at the time of execution )
//  are passed to the args as its ellemnts we and acces the as args[0]..... args[n]