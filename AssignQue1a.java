import java.io.*;
class AssignQue1a
{
    public static void main(String args[])
    {
        System.out.println("The Qrignal order is :");

        System.out.println(args[0]); 
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]); 
        

        int i,j;

        String temp;
        for(i=0;i<args.length;i++)
        {
            for(j=i+1;j<args.length;j++)
            {
                if(args[i].compareTo(args[j])>0)
                {
                    temp=args[i];
                    args[i]=args[j];
                    args[j]= temp;
                }
            }
        }

        System.out.println("The sorted order is :");

        for(i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }

    }
}
