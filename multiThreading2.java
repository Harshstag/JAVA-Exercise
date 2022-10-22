//Type 2 : By Extending runnable interface

class A implements Runnable {

    public void run() {
        
        for(int i =0; i<5;i++)
        {
            System.out.println("Class A ");
            try{Thread.sleep(1000);} catch(Exception e){System.out.println(e);}
        }
    }
}

class B implements Runnable {
    public void run() {
        
        for(int i = 0; i<5;i++)
        {
            System.out.println("Class B ");
            try{Thread.sleep(1000);} catch(Exception e){System.out.println(e);}
        }
    }

}

public class multiThreading2 {
    public static void main(String args[])
    {
        Runnable obj1 = new A(); /// creating refrance
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
