package Single_level_Inheritance;

public class son extends father
{
	public void Car()
	{
		System.out.println("Car:honda");
	}
	
	 public void Money()
	   {
		   System.out.println("Money:15L");
	   }
	
	public void Home()
	{
		System.out.println("Home:4BHK");
	}
	
	
    public void Mobile()
    {
    	System.out.println("Mobile:Samsung");
    }
    
    public static void main(String[] args) 
    {
    	
    	son A=new son();
    	A.Money();
    	A.Home();
    	A.Mobile();
    	A.Car();
    	
	}
}
