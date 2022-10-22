class temp
{
    public void display()
    {
        System.out.println("\ndisplay from temp class\n");
    }
}


class temp1 extends temp
{
    public void display()
    {
        System.out.println("\ndisplay from temp1 class\n");
    }
}


class temp2 extends temp1
{
    public void display()
    {
        System.out.println("\ndisplay from temp2 class\n");
    }
}


public class overriding1 
{
    public static void main (String[]args)
    {
        temp t= new temp();
        temp1 t1= new temp1();
        temp2 t2= new temp2();

        temp tt; 
        //this is same as -  temp tt= new temp

        tt=t;
        tt.display();

        tt=t1;
        tt.display();

        tt=t2;
        tt.display();

        // or use this

        t.display();
        t1.display();
        t2.display();
    }
    
}
