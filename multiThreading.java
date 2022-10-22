//Type 1 : By Extending Thread class 

class A extends Thread {

    public void run() {
        
        for(int i =0; i<5;i++)
        {
            System.out.println("Class A ");
            try{Thread.sleep(1000);} catch(Exception e){System.out.println(e);}
        }
    }
}

class B extends Thread {
    public void run() {
        
        for(int i = 0; i<5;i++)
        {
            System.out.println("Class B ");
            try{Thread.sleep(1000);} catch(Exception e){System.out.println(e);}
        }
    }

}

public class multiThreading {
    public static void main(String args[])
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
