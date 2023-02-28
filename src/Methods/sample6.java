package Methods;

public class sample6 

{
	
	//static regular method call from same class
	
	public static void main(String[] args) 
	
	{
	   
		System.out.println("Shri Narendra Modi is the Prime Minister of India");
		
		M();   ///method call-->methodname();
	    N();
	    O();
	    P();
	}
	
	public static void M()    //static regular method in same class
	{
		System.out.println("Shri Rajnath Singh is the Defence Minister of India");
	}
	
	public static void N()    //user defined method
	{
		System.out.println("Smt. Nirmala Sitharaman is the Finance Minister of India");
	}
	
	public static void O()
	{
		System.out.println("Shri Jyotiraditya Scindia is the Civil Aviation Minister of India");
	}
	
	public static void P()
	{
		System.out.println("Shri Anurag Thakur is the Minister of Information and Broadcasting Ministry");
	}


}
