interface Rectangle
{
    public void perimeter2();
    public abstract void area();
}
class impl implements Rectangle
{
    public void perimeter2()
    {
        System.out.println("Perimeter implemenatation");
    }
    public void area()
    {
        System.out.println("Area implemenatation"); 
    }
    public void myarea()
    {
        System.out.println("Myarea implemenatation");
    }
}
class implementation1 {
    public static void main(String[] args)  {
        impl i = new impl();
        i.area();
        i.perimeter2();
        i.myarea();
        Rectangle r =new impl();
        r.area();
        r.perimeter2();
        // r.myarea(); ///since my area is  a complite method which is defined in the class impll it can not bt refrebce for interface rrectangle there fore compiler will give the error

    }
    
}
//define an intiger stack interface and creat the class that impletments the fix lenth verion of intiger stack you can have push and pop method for implementation
