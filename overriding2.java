// runtime polymorphism
class figure  /// figure parrent class   // we can not use final keyword if wee are inheriting the class
{
    double dim1;
    double dim2;

    figure(double a, double b) // constructor
    {
        dim1=a;
        dim2=b;
    }
     // we can not use final keyword if we are  overriring the ,method
    double area() // method 
    {
        System.out.println("area method for figure \n");
        return 0;
    }
}

class rectangle extends figure    ///rectangle sub class of figure
{
    rectangle(double a, double b)
    {
        super (a,b);
    }
    
    double area() // overriging area method
    {
        System.out.println("area method for rectangle  **");
        return dim1*dim2;
    }
}

class trangle extends figure  // trangle sub class of figure
{
    trangle(double a, double b)
    {
        super (a,b);
    }
    
    double area() // overriging area method
    {
        System.out.println("area method for trangle ");
        return (dim1*dim2)/2;
    }
}


public class overriding2 {

    public static void main(String[] args)
    {
        figure f = new figure(20,20);
        rectangle r =new rectangle(10,30);
        trangle t = new trangle(10,40);
        System.out.println("\n area for figure " + f.area());
        System.out.println("\n area for rectangle " + r.area());
        System.out.println("\n area for trangle " + t.a 

    }
    
}
