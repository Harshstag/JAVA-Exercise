class calc
{
    double radius;
    double radius2;
    double circumference;
    double area;
    
    calc(float r)
    {
      
        radius=r;
        circumference = 2*3.14*radius;
        System.out.println("circumference of circle is "+circumference);
        area = 3.14*radius*radius;
        System.out.println("area of circle is "+area);
    }
    
    calc(double r)
    {
        radius2=r;
        circumference = 2*3.14*radius2;
        System.out.println("circumference of circle is "+circumference);
        area = 3.14*radius2*radius2;
        System.out.println("area of circle is "+area);
    }   
}
public class calculator
{
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		calc obj1 = new calc(4);
		calc obj2 = new calc(6.8);
	
	}
}
