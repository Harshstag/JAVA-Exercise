class calc2
{
    int num1;
    int num2;
    int large;
  
    calc2(int a,int b)
    {
      num1=a;
      num2=b;
        
    }
    
    
    void largest()
    {
        if (num1>=num2){
            System.out.println("\n \n "+ num1+"\n");
            
        } 
        else{
            System.out.println("\n \n "+ num2 +"\n");
        }
    }
    
    void display()
    {
        System.out.println("is the largesst number");
        
    }
    
}
public class largestnumber
{
    
	public static void main(String[] args) {
		
		
		calc2 obj1 = new calc2(4,12);
		obj1.largest();
		obj1.display();
	
	}
}
