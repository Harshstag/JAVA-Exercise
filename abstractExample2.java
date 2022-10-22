abstract class rectangle
{
    public static void perimeter()
    {
        System.out.println("abstract class Peremeter method ");
    }
    abstract void area();
}

class trangle extends rectangle
{
    public static void perimeter()
    {
        System.out.println("Peremeter method from Trangle class ");
    }

    @Override
    void area() {
        // TODO Auto-generated method stub
        
    }
}

class impl extends trangle
{
    public void area() //abstract area in abstract class rectangle class 
    {
        System.out.println("Area Method in impl class area implememntaion");
    }
    public void myarea()
    {
        System.out.println("MyArea Method in impl class MyArea implememntaion");
    }
}


public class abstractExample2
{
    public static void main(String args[])
    {
        impl i = new impl();
        i.area();
        i.myarea();
        i.perimeter();


        trangle t = new impl(); // obj reference for trangle 
        t.area();
        t.perimeter();

        rectangle r= new impl(); // obj is the refrence
        r.area();
        r.perimeter();// here the obj r is creaetd for impl classs 
        //first it will chect methods in impl class 
        //it seld then it will going to check 
        //the it will chech the class extended here comman methed perimeter 
        //so wthe obj refrence  rectangle is called and gthe ouput is 
        //taken from the rectangle class


        // run the code you will get
    }

}