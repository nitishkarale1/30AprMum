package Methods;

public class sample4 

{

	//static regular method from same class
	
	public static void main(String[] args)   //pre-defined method
	
	{
		System.out.println("pune is 200 km away from aurangabad");
		
		B();  //method call-->methodname();
		C();
		
		
		
		System.out.println("mumbai is 150 km away from pune");
	}
	
	
	//static regular method
	public static void B()   //user defined method 
	{
		System.out.println("nagpur is 715 km away from pune ");
		System.out.println("pune 120 km away from ahmednagar");
	}
	
	public static void C()    //user defined method
	{
		System.out.println("sangli is 232 km away from pune");
	}
}
