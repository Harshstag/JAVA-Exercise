abstract class rectangle
{
    public static void perimeter()
    {
        System.out.println("abstract class Peremeter method ");

    }
    abstract void area();
}
class rect extends rectangle
{
    public void area()
    {
        System.out.println("Area Method in rect class implememntaion");
    }

}
public class abstractExample1
{
    public static void main(String args[])
    {
        // rectangle r = new rectangle(); // This will not execute
        // // since abstract is incomple we cannot creat object
        // r.area();
        // r.perimeter();

        rectangle r1 = new rect();// object refrence
        
        // since rectangle is ans sbstract class the objj acn't be created but
        // obj refrence can be made for the abstract class rectangle
        //
        
        r1.area();
        r1.perimeter();
    }

}